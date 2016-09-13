package gov.sgk.sgep.base.spring.security.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.utility.UsernamePasswordInvalidException;
import gov.sgk.sgep.base.spring.security.model.DefaultUserDetails;

/**
 * 
 * @author o-mssahin
 * @since 7 Eki 2015
 *
 */
//@Service
public class DefaultUserDetailsService implements IUserDetailsService, InitializingBean {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultUserDetailsService.class);
	
	/**
	 * Eğer context'de bulunmazsa {@link IDomainUserService#DUMMY_SERVICE} atanır
	 */
	private IDomainUserService domainUserService; 
	
	public DefaultUserDetailsService () {
		this(null);
	}
	
	public DefaultUserDetailsService (IDomainUserService domainUserService) {
		super();
		this.setDomainUserService(domainUserService);
	}
	
	@Override
	public DefaultUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
        
        DomainUser domainUser = domainUserService.getDomainUserById(username);
        if (domainUser == null) {
        	throw new UsernameNotFoundException("UsernameNotFoundException");
        }
        LOGGER.info("username=[{}] domainUserService ile getirildi. DomainUser: {}" , username, domainUser);
        DefaultUserDetails result = new DefaultUserDetails(
            domainUser.getLoginName(),
            domainUser.getPassword(),
            enabled,
            accountNonExpired,
            credentialsNonExpired,
            accountNonLocked,
            getAuthorities(domainUser.getRoles())
        );		
        result.setDomainUser(domainUser);
        return result;
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities(List<? extends IRole> roles) {
        List<GrantedAuthority> authList = getGrantedAuthorities(roles);
        return authList;
    }
	
	public List<GrantedAuthority> getGrantedAuthorities(List<? extends IRole> roles) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		if (CollectionUtils.isNotEmpty(roles)) {
	        for (IRole role : roles) {
	            authorities.add(new SimpleGrantedAuthority(role.getId()));
	        }
		}
        return authorities;
    }

	public IDomainUserService getDomainUserService() {
		return domainUserService;
	}

	public void setDomainUserService(IDomainUserService domainUserService) {
		this.domainUserService = domainUserService;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		if (domainUserService == null) {
			setDomainUserService(IDomainUserService.DUMMY_SERVICE);
		}
	}

	@Override
	public DomainUser getDomainUserById(Serializable id) {
		return domainUserService.getDomainUserById(id);
	}

	@Override
	public DomainUser login(Serializable id, String password) throws UsernamePasswordInvalidException {
		return domainUserService.login(id, password);
	}

	/*
	@Override
	public List<String> getRoles(Serializable role) {
        List<String> roles = new ArrayList<String>();
        if ("1".equals(role.toString())) {
            roles.add("ROLE_MODERATOR");
            roles.add("ROLE_ADMIN");
        } else if ("2".equals(role.toString())) {
            roles.add("ROLE_MODERATOR");
        }
        return roles;
    }
    */
}
