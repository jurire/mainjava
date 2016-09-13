package gov.sgk.sgep.base.business.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.dao.IDomainSecurityDAO;
import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.model.auth.ASecModel;
import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Menu.RootAndNewTree;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.api.utility.exception.BaseError;
import gov.sgk.sgep.base.business.BaseService;
import gov.sgk.sgep.base.spring.BusinessService;
import gov.sgk.sgep.utility.Assert;

/**
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
@BusinessService
@Transactional (readOnly=true)
@Service ("domainSecurityService")
public class DomainSecurityService extends BaseService implements IDomainSecurityService {

	@Autowired
	IDomainSecurityDAO domainSecurityDAO;
	
	@Override
	public void addRole(Role role) {
		getDAO().addModel(role);
	}

	@Override
	public Role getRole(String id, String modulAdi) {
		return getDAO().getRole(id, modulAdi);
	}

	@Transactional (readOnly=false)
	@Override
	public void updateRole(Role role) {
		getDAO().updateRole(role);
	}

	@Override
	protected IDomainSecurityDAO getDAO() {
		return domainSecurityDAO;
	}

	@Override
	public Collection<Role> listRole(String modulAdi) {
		return getDAO().listRole (modulAdi);
	}

	@Override
	public Collection<Function> listFunction() {
		return getDAO().getAll(Function.class);
	}

	@Override
	public Function getFuntion(String id, String modulAdi) {
		return getDAO().getFunction(id, modulAdi);
	}

	@Override
	public Menu getMenu(String id, String modulAdi) {
		return getDAO().getMenu (id, modulAdi);
	}

	/**
	 * Modül adına göre menü listesini verir. Kökleri almak istiyorsanız bu listeden {@link DomainSecurityService#adjustMenuTree(Set)} metodun çağırmalısınız.
	 * @param roleId
	 * @param modulAdi
	 * @return
	 */
	@Override
	public Set<Menu> listMenuByRoleId(String roleId, String modulAdi) {
		return getRole(roleId, modulAdi).getMenus();
	}
	
	@Override
	public Set<Menu> listMenu(String modulAdi) {
		return getDAO().listMenu (modulAdi);
	}

	/**
	 * Veri tabanından sadece seçilmiş olanlar gelir.<br>
	 * <pre>
	 * A
	 * 	A1
	 * 	A2
	 *  		A21
	 * B
	 * 	B1
	 * </pre>
	 * Veri tabanından sadece A21 ve B1'in geldiğini düşünelim.<br>
	 * A21 ve B1 'in root'a giden bütün yolunun kümeye eklemek gerekir. Bunun sebebi, menünün çizilmesinin root'tan yapılacak olmasıdır.<br>
	 * Çocukları seçilmiş olan tree'de bütün menuTree ile gelmiş olan node'ların bütün yolu menuTree'ye eklenir<br>
	 * 
	 */
	@Transactional (propagation=Propagation.NEVER)
	@Override
	public RootAndNewTree adjustMenuTree(Set<Menu> menuTree) {
		RootAndNewTree result = new RootAndNewTree();
		Set<Menu> extraSet = new HashSet<>();
		Set<Menu> menuSetRoot = new HashSet<>();
		for (Menu menu : menuTree) {
			Menu dol = menu;
			while (!dol.isRoot()) {
				dol = dol.getParent();
				extraSet.add(dol); //ağacın bütün yolunu eklemek için
			}
			menuSetRoot.add(dol);
		}
		menuTree.addAll(extraSet);
		result.setMenuRoot(menuSetRoot);
		result.setNewTree(menuTree);
		return result;
	}

	@Transactional (propagation=Propagation.NEVER)
	@Override
	public String jsonMenuTree(RootAndNewTree rootAndNewTree) {
		JSONObject result = new JSONObject();
		result.put("id", "root");
		result.put("children", new JSONArray());
		createJson(result, rootAndNewTree.getMenuRoot(), rootAndNewTree.getNewTree());
		return result.toString();
	}
	
	/**
	 * Sonuç olarak json değiştirilmektedir. 
	 * @param json
	 * @param menuSet
	 * @param authorizedMenuSet
	 */
	private void createJson (JSONObject json, Set<Menu> menuSet, Set<Menu> authorizedMenuSet) {
    	for (Menu menu : menuSet) {
    		JSONObject newMenu;
    		if (menu.isRoot()) {
    			newMenu = createMenuObject(menu);
    			json.getJSONArray("children").put(newMenu);
    			createJson(newMenu, menu.getChildren(), authorizedMenuSet);
    		} else if (menu.hasChildren()) {
    			if (authorizedMenuSet.contains(menu)) {
        			newMenu = createMenuObject(menu);
        			json.getJSONArray("children").put(newMenu);
        			createJson(newMenu, menu.getChildren(), authorizedMenuSet);
    			}
    		} else {
    			if (authorizedMenuSet.contains(menu)) {
        			newMenu = createMenuObject(menu);
        			json.getJSONArray("children").put(newMenu);
    			}
    		}
		}
    }
	
	private JSONObject createMenuObject (Menu menu) {
		JSONObject result = new JSONObject();
		result.put("id", menu.getId());
		result.put("children", new JSONArray());
		result.put("icon", StringUtils.defaultString(menu.getIcon()));
		result.put("command", "#{" + StringUtils.defaultString(menu.getCommand()) + "}");
        result.put("ajax", menu.isAjax());
        result.put("update_id", StringUtils.defaultString(menu.getUpdateId()));
		return result;
	}

	@Transactional (readOnly=false)
	@Override
	public void updateMenu(Menu menu) {
		getDAO().updateModel(menu);
	}

	@Transactional (readOnly=false)
	@Override
	public void insertMenu(Menu menu) {
		if (getDAO().existsModel(menu)) {
			throwExistence(menu);
		}
		addModel(menu);
	}

	@Transactional (readOnly=false)
	@Override
	public void deleteMenu(Serializable id) {
		deleteModel(Menu.class, id);
	}

	@Override
	public Set<Menu> listMenuByRoleIds(String[] roleIds, String modulAdi) {
		Assert.notEmpty(roleIds, "Rol id'leri dolu olmalı");
		Set<Menu> result = new HashSet<>();
		for (String roleId : roleIds) {
			result.addAll(getRole(roleId, modulAdi).getMenus());
		}
		return result;
	}

	@Override
	public Set<Menu> listMenuByRoles(List<? extends IRole> roles, String modulAdi) {
		Assert.notEmpty(roles, "Roller dolu olmalı");
		List<String> roleIds = new ArrayList<>();
		for (IRole role : roles) {
			roleIds.add(role.getId());
		}
		return listMenuByRoleIds(roleIds.toArray(new String []{}), modulAdi);
	}

	@Transactional (readOnly=false)
	@Override
	public void deleteRole(Serializable id) {
		deleteModel(Role.class, id);
	}

	@Transactional (readOnly=false)
	@Override
	public void insertRole(Role role) {
		if (getDAO().existsModel(role)) {
			throwExistence(role);
		}
		addModel(role);
	}
	
	private void throwExistence (ASecModel model) {
		throw new BaseError(String.format("%s mevcut. İsim ve modul adını farklı giriniz.", model.toString()));
	}

	@Transactional (readOnly=false)
	@Override
	public void updateRoleMenus(Role role) {
		updateRole(role);
	}

}
