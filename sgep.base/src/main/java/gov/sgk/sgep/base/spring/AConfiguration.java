package gov.sgk.sgep.base.spring;

import java.util.concurrent.Executor;

import org.apache.commons.lang3.ArrayUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import gov.sgk.sgep.base.spring.message.FileBaseMessageSource;
import gov.sgk.sgep.base.spring.message.IMessageSource;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Bu konfigurasyonu extende edip kullanmanız gerekiyor
 * @author o-mssahin
 *
 */
@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:application.properties" })
public abstract class AConfiguration {
	
	static {
		System.setProperty("user.language", "en");
		System.setProperty("file.encoding", "UTF-8");
	}
	
	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	/**
	 * eğer classpath'de aranacaksa, örneğin; <b>classpath:messages</b> şeklinde dönmelisiniz<br>
	 * Bu dönülen değerler file tabanlı kaynaklar için gereklidir. Eğer mesajları veri tabanından ya da başka kaynaktan okuyacaksanız null dönebilirsiniz
	 * @return dosya bazlı mesajlar base name dizisi, yok ise boş ya da null dönün
	 */
	protected abstract String [] messageResourceBaseNames();
	
	/**
	 * eğer classpath'de aranacaksa, örneğin; <b>classpath:labels</b> şeklinde dönebilirsiniz<br>
	 * Bu dönülen değerler file tabanlı kaynaklar için gereklidir. Eğer label'ları veri tabanından ya da başka kaynaktan okuyacaksanız null dönebilirsiniz 
	 * @return dosya bazlı mesajlar base name dizisi, yok ise boş ya da null dönün
	 */
	protected abstract String [] labelResourceBaseNames();

	@Bean (name="systemPropertiesWrapper")
	public SystemPropertiesWrapper getSystemPropertiesWrapper() {
		return new SystemPropertiesWrapper();
	}
	
	@Bean(name=SgepConstants.BEAN_NAME_SPRING_CONTEXT_PROVIDER)
	public SpringContextProvider getSpringContextProvider() {
		return new SpringContextProvider();
	}
	
	/**
	 * Eğer mesaj kaynaklarını file dışında başka bir kaynaktan almak istiyorsanız bu metodu override etmelisiniz.
	 * @return {@link FileBaseMessageSource}
	 */
	@Bean(name = SgepConstants.BEAN_NAME_MESSAGE_SOURCE)
	public IMessageSource messageSource() {
		FileBaseMessageSource messageSource = new FileBaseMessageSource();
		String[] baseNames = messageResourceBaseNames();
		if (ArrayUtils.isNotEmpty(baseNames)) {
			messageSource.setBasenames(baseNames);
		}
		return messageSource;
	}
	
	/**
	 * Eğer label kaynaklarını file dışında başka bir kaynaktan almak istiyorsanız bu metodu override etmelisiniz.
	 * @return {@link FileBaseMessageSource}
	 */
	@Bean(name = SgepConstants.BEAN_NAME_LABEL_SOURCE)
	public IMessageSource labelSource() {
		FileBaseMessageSource messageSource = new FileBaseMessageSource();
		String[] baseNames = labelResourceBaseNames();
		if (ArrayUtils.isNotEmpty(baseNames)) {
			messageSource.setBasenames(baseNames);
		}
		return messageSource;
	}
	
	/**
	 * Log servislerinde yapılan işlemin loglanmasını ele alan task executor<br>
	 * varsayılan değerler<br>
	 * corePoolSize: 5<br>
	 * maxPoolSize: 20<br>
	 * waitForTasksToCompleteOnShutdown: true
	 * @return
	 */
	@Bean (name=SgepConstants.BEAN_NAME_LOG_SERVICE_TASK_EXECUTOR)
	public Executor logServiceTaskExecutor () {
		ThreadPoolTaskExecutor result = new SgepThreadPoolTaskExecutor();
		result.setCorePoolSize(5);
		result.setMaxPoolSize(20);
		result.setWaitForTasksToCompleteOnShutdown(true);
		return result;
	}
	
}
