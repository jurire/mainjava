package gov.sgk.sgep.base.spring.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.utility.UsernamePasswordInvalidException;
import gov.sgk.sgep.utility.Assert;

/**
 * Domain'e göre provider oluşturur. Bu provider
 * 
 * @author o-mssahin
 * @since 7 Eki 2015
 *
 */
public class DefaultAuthenticationProvider extends AAuthenticationProvider {

	/**
	 * Eğer context'de bulunmazsa {@link IDomainUserService#DUMMY_SERVICE} atanır
	 */
	private IDomainUserService domainUserService;
	
	public DefaultAuthenticationProvider() {
		super();
	}
	
	/**
	 * {@link IDomainUserService} dışarıdan atanabilir.
	 * @param domainUserService
	 */
	public DefaultAuthenticationProvider(IDomainUserService domainUserService) {
		super();
		this.setDomainUserService(domainUserService);
	}

	
	@Override
	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

	@Override
	protected DomainUser doAuthentication(Authentication authentication) throws BadCredentialsException {
		Assert.notNull(authentication, "authentication null olmamalı");
		//Assert.notNull(authentication.getCredentials(), "authentication.Credentials boş olmamalı");
		String username = authentication.getName();
		String password = authentication.getCredentials() != null ? authentication.getCredentials().toString() : null;
		DomainUser result;
		try {
			result = getDomainUserService().login(username, password);
		} catch (UsernamePasswordInvalidException e) {
			throw new BadCredentialsException("Giriş Başarısız", e);
		}
		return result;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		super.afterPropertiesSet();
		if (getDomainUserService() == null) {
			setDomainUserService(IDomainUserService.DUMMY_SERVICE);
		}
	}

	public IDomainUserService getDomainUserService() {
		return domainUserService;
	}

	public void setDomainUserService(IDomainUserService domainUserService) {
		this.domainUserService = domainUserService;
	}

}
