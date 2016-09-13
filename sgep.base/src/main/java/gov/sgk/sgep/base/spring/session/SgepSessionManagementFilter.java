package gov.sgk.sgep.base.spring.session;

import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.security.web.session.SessionManagementFilter;
import org.springframework.stereotype.Component;

/**
 * 
 * @author o-mssahin
 * @since 2 Kas 2015
 * 
 */
@Component ("sessionManagementFilter")
public class SgepSessionManagementFilter extends SessionManagementFilter {

	public SgepSessionManagementFilter () {
		super(new HttpSessionSecurityContextRepository());
	}
	
	public SgepSessionManagementFilter(SecurityContextRepository securityContextRepository,
			SessionAuthenticationStrategy sessionStrategy) {
		super(securityContextRepository, sessionStrategy);
		this.setInvalidSessionStrategy(new SgepInvalidSessionStrategy());
	}

}
