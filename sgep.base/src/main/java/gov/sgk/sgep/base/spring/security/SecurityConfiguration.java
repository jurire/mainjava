package gov.sgk.sgep.base.spring.security;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;

import gov.sgk.sgep.base.api.business.ISecurityDeterminer;
import gov.sgk.sgep.base.spring.security.service.DefaultSecurityDeterminer;
import gov.sgk.sgep.base.spring.security.service.DefaultUserDetailsService;
import gov.sgk.sgep.base.spring.security.service.IUserDetailsService;

/**
 * authenticationProvider ve authenticationManager bean'lerini düzenliyor<br>
 * Ya bu bean'ler için bu sınıfı import etmelisiniz aşağıdaki gibi
 * <pre> 
 * {@literal @}Import ({SecurityConfiguration.class})
 * </pre>
 * ya da {@link AuthenticationProvider} ve {@link AuthenticationManager}'dan yaratılan bean'leri kendiniz düzenlemelisiniz.
 * @author o-mssahin
 *
 */

@ComponentScan ({
	"gov.sgk.sgep.base.spring.session" //sessionmanagementfilter için
})
@Configuration
@ImportResource(value="classpath:security-config.xml")
public abstract class SecurityConfiguration implements InitializingBean {
	
	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
//	@Override
//	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticator());
//		super.configure(auth);
//	}
//
	
	/**
	 * security için bu sınıfın olması gerekir
	 * @return
	 */
	@Bean
	public IUserDetailsService getUserDetailsService () {
		return new DefaultUserDetailsService();
	}
	
	@Bean
	public ISecurityDeterminer getSecurityDeterminer () {
		return new DefaultSecurityDeterminer();
	}
	
	@Bean(name = "authenticationProvider")
	public AuthenticationProvider authenticationProvider() {
		return new DefaultAuthenticationProvider();
	}
	
//	@Bean(name = "meyesAuthenticationProvider")
//	public AuthenticationProvider meyesAuthenticationProvider() {
//		return new MeyesAuthenticationProvider();
//	}
	
	@Bean(name = "authenticationManager")
	public AuthenticationManager authenticationManagerBean() throws Exception {
		AuthenticationProvider authenticationProvider = authenticationProvider();
		AuthenticationProvider [] providers = new AuthenticationProvider []{authenticationProvider};
		AuthenticationProvider [] providersFromChild = authenticationProviders();
		if (ArrayUtils.isNotEmpty(providersFromChild)) {
			providers = ArrayUtils.addAll(providers, providersFromChild);
		}
		return new ProviderManager(Arrays.asList(providers));
	}
	
	/**
	 * {@link SecurityConfiguration#authenticationProvider()} ile beraber başka bir provider ekleyecekseniz bu metotda o provider'ları dönün
	 * @return null dönebilirsiniz
	 */
	public AuthenticationProvider [] authenticationProviders() {
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("Inited");
	}
	
}