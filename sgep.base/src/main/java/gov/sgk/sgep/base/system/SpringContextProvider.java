package gov.sgk.sgep.base.system;

import java.util.concurrent.Executor;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.spring.AConfiguration;
import gov.sgk.sgep.base.spring.message.IMessageSource;
import gov.sgk.sgep.base.webservice.consumer.emekli4a.Emekli4aClient;
import gov.sgk.sgep.base.webservice.consumer.emekli4b.Emekli4bClient;
import gov.sgk.sgep.base.webservice.consumer.emekli4c.Emekli4cClient;
import gov.sgk.sgep.base.webservice.consumer.mernis.MernisClient;
import gov.sgk.sgep.base.webservice.consumer.meyes.MeyesClient;
import gov.sgk.sgep.base.webservice.consumer.spas.SpasClient;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Bu sınıf ile spring context'e static olarak erişebilirsiniz. Bu bean {@link AConfiguration}'da method Bean olarak context'e eklenmektedir.
 * @author o-mssahin
 * @since 26 Eki 2015
 *
 */
public class SpringContextProvider implements  ApplicationContextAware {
	
    private static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	/**
	 * 
	 * @return Static olarak erişebilen {@link ApplicationContext}
	 */
	public static ApplicationContext getContext() {
		return context;
	}
	
	public static IMessageSource getLabelSource () {
		return context.getBean("labelSource", IMessageSource.class);
	}
	
	public static IMessageSource getMessageSource () {
		return context.getBean("messageSource", IMessageSource.class);
	}
	
	public static SystemPropertiesWrapper getSystemPropertiesWrapper (){
		return context.getBean(SystemPropertiesWrapper.class);
	}
	
	/**
	 * 
	 * @return Asenkron log servisi çalıştıran task pool bean'i
	 */
	public static Executor getLogServiceTaskExecutor () {
		return (Executor) context.getBean(SgepConstants.BEAN_NAME_LOG_SERVICE_TASK_EXECUTOR);		
	}
	
	public static ILogService getLogService () {
		return context.getBean(SgepConstants.BEAN_NAME_LOG_SERVICE, ILogService.class);
	}


	public static ILogService getLogServiceAsync () {
		return context.getBean(SgepConstants.BEAN_NAME_LOG_SERVICE_ASYNC, ILogService.class);
	}
	
	
	public static MeyesClient getMeyesClient () {
		return context.getBean(SgepConstants.BEAN_NAME_MEYES_CLIENT, MeyesClient.class);
	}
	
	public static SpasClient getSpasClient () {
		return context.getBean(SgepConstants.BEAN_NAME_SPAS_CLIENT, SpasClient.class);
	}
	
	public static MernisClient getMernisClient(){
		return context.getBean(SgepConstants.BEAN_NAME_MERNIS_CLIENT, MernisClient.class);
	}

	public static Emekli4aClient getEmekli4aClient(){
		return context.getBean(SgepConstants.BEAN_NAME_EMEKLI4A_CLIENT, Emekli4aClient.class);
	}
	
	public static Emekli4bClient getEmekli4bClient(){
		return context.getBean(SgepConstants.BEAN_NAME_EMEKLI4B_CLIENT, Emekli4bClient.class);
	}
	
	public static Emekli4cClient getEmekli4cClient(){
		return context.getBean(SgepConstants.BEAN_NAME_EMEKLI4C_CLIENT, Emekli4cClient.class);
	}

}
