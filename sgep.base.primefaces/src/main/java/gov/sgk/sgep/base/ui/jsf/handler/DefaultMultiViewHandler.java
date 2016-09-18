package gov.sgk.sgep.base.ui.jsf.handler;

import java.util.Locale;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.sun.faces.application.view.MultiViewHandler;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
public class DefaultMultiViewHandler extends MultiViewHandler {

	public Locale calculateLocale(FacesContext context) {
		HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
		Locale locale = null;
		if (session != null) {
			// Return the locale saved by the managed bean earlier
			locale = (Locale) session.getAttribute("locale");
			if (locale == null) {
				locale = SgepConstants.LOCALE_TURKISH;
			}
		} else {
			locale = super.calculateLocale(context);
		}
		return locale;
	}

}
