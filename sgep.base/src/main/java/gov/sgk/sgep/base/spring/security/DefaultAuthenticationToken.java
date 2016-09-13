package gov.sgk.sgep.base.spring.security;
import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import gov.sgk.sgep.base.api.domain.DomainUser;

/**
 * 
 * @author o-mssahin
 * @since 8 Eki 2015
 *
 */
public class DefaultAuthenticationToken extends UsernamePasswordAuthenticationToken {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DomainUser domainUser;

	public DefaultAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}

	public DefaultAuthenticationToken(DomainUser domainUser, Collection<? extends GrantedAuthority> authorities) {
		super (domainUser.getLoginName(), domainUser.getPassword(), authorities);
		this.setDomainUser(domainUser);
	}

	public DomainUser getDomainUser() {
		return domainUser;
	}

	public void setDomainUser(DomainUser domainUser) {
		this.domainUser = domainUser;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public boolean isAdmin () {
		boolean result = false;
		for (GrantedAuthority auth : getAuthorities()) {
			if ("ROLE_ADMIN".equals(auth.getAuthority())) {
				result = true;
				break;
			}
		}
		return result;
	}
	

}
