package gov.sgk.sgep.base.web;

import gov.sgk.sgep.base.api.web.ISessionProvider;
import gov.sgk.sgep.base.utility.BaseUtility;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Spring security ile sisteme giren kullanıcıyı işler
 * 
 * @author o-mssahin
 *
 */
public class DefaultSessionProvider implements ISessionProvider {

	@Override
	public String sessionUsername() {
		return BaseUtility.getAuthentication() == null ? SgepConstants.UNKNOWN : BaseUtility.getAuthentication().getName();
	}
	
}
