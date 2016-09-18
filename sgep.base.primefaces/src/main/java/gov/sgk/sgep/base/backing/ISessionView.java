package gov.sgk.sgep.base.backing;

import java.util.Locale;

import gov.sgk.sgep.base.api.domain.DomainUser;

/**
 * Jsf bean'i bu arayüzü gerçekleştiriyorsa, sessionscope olması beklenir ve aşağıdaki metotları sağlaması gerekir
 * @author o-mssahin
 *
 */
public interface ISessionView {

	DomainUser getDomainUser ();
	
	Locale getLocale ();
}
