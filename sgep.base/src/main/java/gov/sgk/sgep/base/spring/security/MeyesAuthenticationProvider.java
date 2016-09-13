package gov.sgk.sgep.base.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.utility.UsernamePasswordInvalidException;
import gov.sgk.sgep.utility.Assert;

/**
 * 
 * @author o-mssahin
 * @since 20 Kas 2015
 *
 */
public class MeyesAuthenticationProvider extends AAuthenticationProvider {
	
	@Autowired @Qualifier("meyesDomainUserService")
	IDomainUserService domainUserService;

	@Override
	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

	@Override
	protected DomainUser doAuthentication(Authentication authentication) throws BadCredentialsException {
		Assert.notNull(authentication, "authentication null olmamalı");
		String username = authentication.getName();
		DomainUser result;
		try {
			result = domainUserService.login(username, null);
			if (result == null) {
				throw new UsernamePasswordInvalidException();
			}
		} catch (UsernamePasswordInvalidException e) {
			throw new BadCredentialsException("Giriş Başarısız", e);
		}
		return result;
	}

}
