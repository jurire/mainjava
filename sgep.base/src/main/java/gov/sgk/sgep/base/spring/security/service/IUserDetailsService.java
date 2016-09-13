package gov.sgk.sgep.base.spring.security.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.domain.IRole;

/**
 * 
 * @author o-mssahin
 * @since 7 Eki 2015
 *
 */
public interface IUserDetailsService extends UserDetailsService, IDomainUserService {
	
	Collection<? extends GrantedAuthority> getAuthorities(List<? extends IRole> roles);
	
	List<GrantedAuthority> getGrantedAuthorities(List<? extends IRole> roles);
}
