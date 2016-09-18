package gov.sgk.sgep.base.ui.primefaces.component;

import org.primefaces.model.menu.DefaultMenuItem;

/**
 * 
 * @author o-mssahin
 * @since 10 Ara 2015
 *
 */
public class SgepDefaultMenuItem extends DefaultMenuItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SgepDefaultMenuItem() {
		super();
		_setStyleClass();
	}

	public SgepDefaultMenuItem(Object value, String icon, String url) {
		super(value, icon, url);
		_setStyleClass();
	}

	public SgepDefaultMenuItem(Object value, String icon) {
		super(value, icon);
		_setStyleClass();
	}

	public SgepDefaultMenuItem(Object value) {
		super(value);
		_setStyleClass();
	}
	
	private void _setStyleClass () {
		this.setStyleClass("page-sidebar-wrapper");
	}

}
