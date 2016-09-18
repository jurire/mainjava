package gov.sgk.sgep.base.ui;

import java.util.Collection;
import java.util.Set;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Menu.RootAndNewTree;

/**
 * 
 * @author o-mssahin
 * @since 10 Ara 2015
 *
 */
public abstract class PFUtility {
	
	/**
	 * expanded false olarak kabul edilir
	 * @param menuList
	 * @return
	 */
	public static TreeNode createMenus (Collection<Menu> menuList) {
		return createMenus(menuList, false);
	}
	
	public static TreeNode createMenus (Collection<Menu> menuList, boolean expanded) {
		TreeNode root = new DefaultTreeNode(Menu.ROOT);
		root.setExpanded(expanded);
		for (Menu menu : menuList) {
			addCreateMenus(root, menu, expanded);
		}
		return root;
	}
	
	/**
	 * modul'e göre menü ağacı yüklenir ve Root ekleyerek expanded parametresine göre açık ya da kapalı jsf ağacı döner
	 * @param secService
	 * @param modul
	 * @param expanded
	 * @return
	 */
	public static TreeNode createTreeNode (IDomainSecurityService secService, String modul, boolean expanded) {
		TreeNode result;
		Set<Menu> menuSet = secService.listMenu(modul);
		RootAndNewTree rootAndNewTree = secService.adjustMenuTree(menuSet);
		TreeNode rootMenuNode = PFUtility.createMenus(rootAndNewTree.getMenuRoot(), expanded);
		result = new DefaultTreeNode(Menu.ROOT);
		result.setExpanded(expanded);
		DefaultTreeNode rootMain = new DefaultTreeNode(Menu.ROOT, result);
		rootMain.setExpanded(expanded);
		rootMain.setChildren(rootMenuNode.getChildren());
		return result;
	}
	
	
	/**
	 * parent'a menu'yü ekler, çocukları var tekrar bu metot çağrılır.
	 * @param parent
	 * @param menu
	 */
	private static void addCreateMenus (TreeNode parent, Menu menu, boolean expanded) {
		if (parent == null || menu == null) {
			return;
		}
		parent.setExpanded(expanded);
		DefaultTreeNode newParent = new DefaultTreeNode(menu, parent);
		if (menu.hasChildren()) {
			for (Menu cMenu: menu.getChildren()) {
				addCreateMenus(newParent, cMenu, expanded);
			}
		}
	}
	
	/**
	 * Bütün ağacı expanded özelliğine göre daraltır ya da açar
	 * 
	 * @param node
	 * @param expanded
	 */
	public void stateOfExpansion (TreeNode node, boolean expanded) {
		if (node != null) {
			node.setExpanded(expanded);
		}
		if (node.getChildCount() > 0) {
			for (TreeNode child : node.getChildren()) {
				stateOfExpansion(child, expanded);
			}
		}
	}
}
