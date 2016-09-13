package gov.sgk.sqep.test.base.web;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;

import gov.sgk.sgep.base.spring.security.DefaultAuthenticationProvider;
import gov.sgk.sgep.base.spring.security.SecurityConfiguration;

public class BaseTestSecurityConfiguration extends SecurityConfiguration {
	
	@Bean(name = "authenticationProvider")
	public AuthenticationProvider authenticationProvider() {
		return new DefaultAuthenticationProvider();
	}
	
	@Override
	@Bean(name = "authenticationManager")
	public AuthenticationManager authenticationManagerBean() throws Exception {
		AuthenticationProvider authenticationProvider = authenticationProvider();
		return new ProviderManager(Arrays.asList(authenticationProvider));
	}
	
	public AuthenticationProvider meyesAuthenticationProvider() {
		return null;
	}
}
