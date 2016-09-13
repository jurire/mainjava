package gov.sgk.sgep.base.api.business;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Menu.RootAndNewTree;
import gov.sgk.sgep.base.api.model.auth.Role;

/**
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
public interface IDomainSecurityService {

	void addRole (Role role);
	
	Role getRole (String id, String modulAdi);
	
	Function getFuntion (String id, String modulAdi);
	
	Collection<Role> listRole (String modulAdi);
	
	Collection<Function> listFunction ();
	
	void updateRole (Role role);
	
	Menu getMenu (String id, String modulAdi);
	
	void updateMenu (Menu menu);
	
	void insertMenu (Menu menu);
	
	void deleteMenu (Serializable id);
	
	Set<Menu> listMenuByRoleId (String roleId, String modulAdi);
	
	Set<Menu> listMenuByRoles (List<? extends IRole> roles, String modulAdi);
	
	Set<Menu> listMenuByRoleIds (String [] roleIds, String modulAdi);

	/**
	 * 
	 * @param menuTree
	 * @return
	 */
	RootAndNewTree adjustMenuTree (Set<Menu> menuTree);
	
	String jsonMenuTree (RootAndNewTree rootAndNewTree);

	Set<Menu> listMenu(String modulAdi);

	void deleteRole(Serializable id);

	void insertRole(Role role);

	void updateRoleMenus(Role roleWillBeUpdated);
	
}
