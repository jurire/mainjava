package gov.sgk.sgep.base.spring.security.conf;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import gov.sgk.sgep.base.spring.security.DefaultAuthenticationProvider;

//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@Deprecated
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests().antMatchers("/**").access("permitAll").and().formLogin()
		.usernameParameter("username") // default is username
		.passwordParameter("password") // default is password
		.loginPage("/login.xhtml");
//		http
//		.csrf().disable()
//		.authorizeRequests()
////		.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
////		.antMatchers("/dba/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_DBA')")
////		.antMatchers("/test/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_TEST')")
////		.antMatchers("/pages/unsecure/**").access("permitAll")
//		.antMatchers("/**").access("permitAll")
//		.and().formLogin().loginPage("/login.xhtml");
		
		//varsayılan /logout
		//http.logout().logoutSuccessUrl("/login.xhtml");
	}
	
	
//	@Override
//	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticator());
//		super.configure(auth);
//	}
//
	@Bean(name = "authenticationProvider")
	public AuthenticationProvider authenticationProvider() {
		return new DefaultAuthenticationProvider();
	}
	
	@Bean(name = "authenticationManager")
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		//new AuthenticationManagerBuilder(null);
		return new ProviderManager(Arrays.asList(authenticationProvider()));
	}
}