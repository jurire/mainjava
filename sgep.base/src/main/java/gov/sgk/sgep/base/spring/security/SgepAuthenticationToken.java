package gov.sgk.sgep.base.spring.security;

import java.util.Collection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import gov.sgk.sgep.base.spring.security.model.DefaultUserDetails;

/**
 * 
 * @author o-mssahin
 * @since 8 Eki 2015
 *
 */
public class SgepAuthenticationToken extends UsernamePasswordAuthenticationToken {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DefaultUserDetails defaultUserDetails;

	public SgepAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}

	public SgepAuthenticationToken(Object principal, Object credentials) {
		super(principal, credentials);
	}
	
	public SgepAuthenticationToken(DefaultUserDetails defaultUserDetails) {
		this(defaultUserDetails.getUsername(), 
				StringUtils.isBlank(defaultUserDetails.getPassword()) ? defaultUserDetails.getUsername()  + "-pass" : defaultUserDetails.getPassword(), 
				defaultUserDetails.getAuthorities());
		setDefaultUserDetails(defaultUserDetails);
	}

	public DefaultUserDetails getDefaultUserDetails() {
		return defaultUserDetails;
	}

	private void setDefaultUserDetails(DefaultUserDetails defaultUserDetails) {
		this.defaultUserDetails = defaultUserDetails;
	}
	

}
