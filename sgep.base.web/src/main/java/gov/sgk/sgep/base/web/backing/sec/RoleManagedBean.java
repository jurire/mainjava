package gov.sgk.sgep.base.web.backing.sec;

import java.util.Collection;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.TreeNode;

import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.ui.PFUtility;
import gov.sgk.sgep.base.web.backing.ABaseManagedBean;
import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 * @since 10 Ara 2015
 *
 */
@ManagedBean (name="secRoleMB")
@ViewScoped
public class RoleManagedBean extends ABaseManagedBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final boolean MENU_TREE_EXPANDED = true;
	
	private Collection<Role> roles;
	private Role selectedRole;
	private String processType;
	private String modul;
	private TreeNode roleSelectedMenuTreeNode;

	
	/**
	 * rol'ün menü ağacında seçilen node'lar 
	 */
    private TreeNode[] selectedMenuNodes;


	@Override
	protected void init() {
		roles = getDomainSecurityService().listRole(getModul());
	}

	public void actionProcessRole () {
		Assert.notNull(selectedRole, "Rol null olmamalı. Rolü Seçiniz ya da yeni rol oluşturunuz");
		IDomainSecurityService secService = getDomainSecurityService();
		String mesaj = null;
		if (this.isUpdate()) {
			secService.updateRole(selectedRole);
			mesaj = String.format("[%s] Rol Güncellendi", selectedRole.getId());
		} else if (this.isNew()) {
			selectedRole.setAktifMi(true);
			secService.insertRole(selectedRole);
			mesaj = String.format("[%s] Yeni Rol Eklendi", selectedRole.getId());
			init();
		} else {
			addErrorMessage(null, "İşlem bilinmiyor. ProcessType boş.");
			return;
		}
		addInfoMessage(mesaj);
	}

	public void actionDelete (Role role) {
		getDomainSecurityService().deleteRole(role.getId());
		String mesaj = String.format("[%s] Rol Silindi", role.toString());
		addInfoMessage(mesaj);
		init();
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Role getSelectedRole() {
		return selectedRole;
	}

	public void setSelectedRole(Role selectedRole) {
		this.selectedRole = selectedRole;
	}
	
	public boolean isNew () {
		return StringUtils.equalsIgnoreCase(SgepConstants.PROCESS_TYPE_NEW, processType); 
	}
	
	public boolean isUpdate () {
		return StringUtils.equalsIgnoreCase(SgepConstants.PROCESS_TYPE_UPDATE, processType); 
	}
	
	public void actionArrange (String type) {
		processType = type;
		if (this.isNew()) {
			selectedRole = new Role();
		} else if (this.isMenu()) {
			setSelectedMenuNodes(null);
			setRoleSelectedMenuTreeNode(null);
		}
	}

	
	/**
	 * role ait menüler mi açılacak
	 * @return
	 */
	private boolean isMenu() {
		return StringUtils.equalsIgnoreCase("menu", processType); 
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}
	
	public TreeNode getRoleSelectedMenuTreeNode () {
		if (roleSelectedMenuTreeNode == null) {
			Assert.notNull(selectedRole, "Rol seçmelisiniz. Rol null olamaz.");
			roleSelectedMenuTreeNode = PFUtility.createTreeNode(getDomainSecurityService(), selectedRole.getModulAdi(), MENU_TREE_EXPANDED);
		}
		
		//Seçilen rolle ilgili menu kümesini vt'den getir
		Set<Menu> registeredMenuSet = getDomainSecurityService().listMenuByRoleId(selectedRole.getId(), selectedRole.getModulAdi());
		checkMenuTreeByUserRegisteredMenus(roleSelectedMenuTreeNode, registeredMenuSet);
		return roleSelectedMenuTreeNode;
	}
	
	/**
	 * root'da registeredMenuSet'deki menüleri checked yapar
	 * @param root
	 * @param registeredMenuSet
	 */
	private void checkMenuTreeByUserRegisteredMenus (TreeNode root, Set<Menu> registeredMenuSet ) {
		if (root == null) {
			return;
		}
		root.setSelected(registeredMenuSet.contains((Menu) root.getData()));
		if (CollectionUtils.isNotEmpty(root.getChildren())) {
			for (TreeNode node: root.getChildren()) {
				checkMenuTreeByUserRegisteredMenus(node, registeredMenuSet);
			}
		}
	}

	public void setRoleSelectedMenuTreeNode(TreeNode roleSelectedMenuTreeNode) {
		this.roleSelectedMenuTreeNode = roleSelectedMenuTreeNode;
	}

	/**
	 * Role atanmış menüleri günceller
	 */
	public void actionUpdateRoleMenu () {
		Role roleWillBeUpdated = selectedRole;
		getDomainSecurityService().updateRoleMenus(roleWillBeUpdated);
		int leafMenuCount = 0;
		if (ArrayUtils.isNotEmpty(selectedMenuNodes)) {
			roleWillBeUpdated.getMenus().clear();
			for (TreeNode node : selectedMenuNodes) {
				Menu menu = (Menu) node.getData();
				if (menu.isLeaf()) {
					leafMenuCount++;
					roleWillBeUpdated.getMenus().add(menu);
				}
			}
		}
		getDomainSecurityService().updateRoleMenus(roleWillBeUpdated);
		if (leafMenuCount > 0) {
			addInfoMessage(String.format("%s atanan menüler güncellendi. Eklenen yaprak menü sayısı: %d", roleWillBeUpdated.toString(), leafMenuCount));
		} else {
			addInfoMessage(String.format("%s atanan menüler silindi.", roleWillBeUpdated.toString()));
		}
		setSelectedMenuNodes(null);
	}

	public TreeNode[] getSelectedMenuNodes() {
		return selectedMenuNodes;
	}

	public void setSelectedMenuNodes(TreeNode[] selectedMenuNodes) {
		this.selectedMenuNodes = selectedMenuNodes;
	}
	
}

