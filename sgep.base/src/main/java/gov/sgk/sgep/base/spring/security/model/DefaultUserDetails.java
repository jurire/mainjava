package gov.sgk.sgep.base.spring.security.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import gov.sgk.sgep.base.api.domain.DomainUser;

/**
 * Uygulamaya özgü özellikler bu sınıfa eklenebilir
 * 
 * @author o-mssahin
 * @since 7 Eki 2015
 *
 */
public class DefaultUserDetails extends org.springframework.security.core.userdetails.User {

	/**
	 * Uygulamaya özgü özellikleri barındırır
	 */
	private DomainUser domainUser;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DefaultUserDetails(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}
	
	public DefaultUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}
	
	public DefaultUserDetails (DomainUser domainUser, Collection<? extends GrantedAuthority> authorities) {
		this(domainUser.getLoginName(), domainUser.getPassword(), authorities);
		this.domainUser = domainUser;
	}

	public DomainUser getDomainUser() {
		return domainUser;
	}

	public void setDomainUser(DomainUser domainUser) {
		this.domainUser = domainUser;
	}

}
