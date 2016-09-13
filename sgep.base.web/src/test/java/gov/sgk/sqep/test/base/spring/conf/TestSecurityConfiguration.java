package gov.sgk.sqep.test.base.spring.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;

import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.spring.security.DefaultAuthenticationProvider;
import gov.sgk.sgep.base.spring.security.SecurityConfiguration;

@Configuration
public class TestSecurityConfiguration extends SecurityConfiguration {

	@Autowired @Qualifier("domainUserServiceTest")
	private IDomainUserService domainUserService;
	
	@Bean(name = "authenticationProvider")
	public AuthenticationProvider authenticationProvider() {
		return new DefaultAuthenticationProvider(domainUserService);
	}
	
	
}
