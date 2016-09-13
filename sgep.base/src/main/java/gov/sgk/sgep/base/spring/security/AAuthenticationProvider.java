package gov.sgk.sgep.base.spring.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.spring.security.model.DefaultUserDetails;
import gov.sgk.sgep.base.spring.security.service.IUserDetailsService;

/**
 * 
 * @author o-mssahin
 * @since 20 Kas 2015
 *
 */
public abstract class AAuthenticationProvider implements AuthenticationProvider, InitializingBean {

	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired (required=false)
	private IUserDetailsService userDetailsService;

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info(this.getClass().getSimpleName() + " bean yaratıldı");
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		if (authentication.isAuthenticated()) {
        	return authentication;
        }
		LOGGER.info("Kullanici: [{}] doğrulanmaya çalışılıyor", authentication.getName());
        DomainUser domainUser = doAuthentication (authentication);
        if (domainUser != null) {
    		LOGGER.info("Kullanici: [{}] OK", authentication.getName());
            DefaultUserDetails details = new DefaultUserDetails(domainUser, getUserDetailsService().getAuthorities(domainUser.getRoles()));
            SgepAuthenticationToken token = new SgepAuthenticationToken(details);
            LOGGER.debug("SgepAuthenticationToken [{}] oluşturuldu", token);
    		return token;	
        }
        return null;
	}

	/**
	 * Sisteme girişini yaparak {@link DomainUser} nesnesi dönülmeli.
	 * @param authentication
	 * @return null dönerse {@link UsernameNotFoundException} hatası atılır
	 */
	protected abstract DomainUser doAuthentication(Authentication authentication) throws BadCredentialsException;

	public IUserDetailsService getUserDetailsService() {
		return userDetailsService;
	}

	public void setUserDetailsService(IUserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}


}
