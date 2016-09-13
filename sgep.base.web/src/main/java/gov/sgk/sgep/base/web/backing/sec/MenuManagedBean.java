package gov.sgk.sgep.base.web.backing.sec;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.system.SpringContextProvider;
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
@ManagedBean (name="secMenuMB")
@ViewScoped
public class MenuManagedBean extends ABaseManagedBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final boolean MENU_TREE_EXPANDED = true;

	private TreeNode root;
	private Menu selectedMenu;
	private String processType;
	private String modul;
	
	/**
	 * Yeni yaratılan menü'nün babası
	 */
	private Menu newMenuParent;
	private DefaultTreeNode selectedRow;
	
	@Override
	protected void init() {
		initMenuRoot ();
	}

	private void initMenuRoot() {
		root = PFUtility.createTreeNode(getDomainSecurityService(), modul, MENU_TREE_EXPANDED);
	}
	
	public TreeNode getRoot() {
        return root;
    }

	public Menu getSelectedMenu() {
		return selectedMenu;
	}

	public void setSelectedMenu(Menu selectedMenu) {
		this.selectedMenu = selectedMenu;
	}
	
	public void actionProcessMenu () {
		Assert.notNull(selectedMenu, "Menü null olmamalı. Menü Seçiniz ya da yeni menü oluşturunuz");
		IDomainSecurityService secService = SpringContextProvider.getContext().getBean(IDomainSecurityService.class);
		String mesaj = null;
		if (this.isUpdate()) {
			secService.updateMenu(selectedMenu);
			mesaj = String.format("Id: [%s] Menü Güncellendi", selectedMenu.getId());
		} else if (this.isNew()) {
			selectedMenu.setAktifMi(true);
			selectedMenu.setSira(1);
			selectedMenu.setAjax(false);
			selectedMenu.setParent(newMenuParent);
			secService.insertMenu(selectedMenu);
			mesaj = String.format("Id: [%s] Yeni Menü Eklendi", selectedMenu.getId());
			init();
		} else {
			addErrorMessage(null, "İşlem bilinmiyor. ProcessType boş.");
			return;
		}
		addInfoMessage(mesaj);
	}

	public Menu getNewMenuParent() {
		return newMenuParent;
	}

	public void setNewMenuParent(Menu newMenuParent) {
		this.newMenuParent = newMenuParent;
	}
 
	public boolean showMenuDialog () {
		return selectedMenu != null;
	}
	
	public void actionArrange (String type) {
		processType = type;
		if (this.isNew()) {
			selectedMenu = new Menu();
			Assert.notNull(newMenuParent, "Eklenecek menü'nün üst menüsü null olamaz");
			selectedMenu.setModulAdi(newMenuParent.getModulAdi());
		}
	}
	
	public void actionDelete (Menu menu) {
		IDomainSecurityService secService = SpringContextProvider.getContext().getBean(IDomainSecurityService.class);
		secService.deleteMenu(menu.getId());
		String mesaj = String.format("Id: [%s] Menü Silindi", menu.getId());
		addInfoMessage(mesaj);
		initMenuRoot();
	}
	
	public boolean isNew () {
		return StringUtils.equalsIgnoreCase(SgepConstants.PROCESS_TYPE_NEW, processType); 
	}
	
	public boolean isUpdate () {
		return StringUtils.equalsIgnoreCase(SgepConstants.PROCESS_TYPE_UPDATE, processType); 
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public DefaultTreeNode getSelectedRow() {
		return selectedRow;
	}

	public void setSelectedRow(DefaultTreeNode selectedRow) {
		this.selectedRow = selectedRow;
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}
	
	/**
	 * modül adı, {@link #getModulAdi()} özelliğinde bulunaktadır. Bilgi modul adından alınarak initMenuRoot çağrılır
	 */
	public void filterByModulAdi () {
		initMenuRoot();
	}
	
	
}

