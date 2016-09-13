package gov.sgk.sgep.base.system;

import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;

import gov.sgk.sgep.base.api.utility.ApplicationDefaultValues;
import gov.sgk.sgep.base.api.utility.ApplicationMode;
import gov.sgk.sgep.base.api.utility.ApplicationPropertyName;
import gov.sgk.sgep.base.spring.AConfiguration;
import gov.sgk.sgep.utility.Utility;

/**
 * Spring'de girilen özellikleri de içine alır<br>
 * Bu bean {@link AConfiguration} da bean olarak tanımlanmıştır.<br>
 * 
 * @author o-mssahin
 * @since 8 Eki 2015
 *
 */
public class SystemPropertiesWrapper implements ApplicationContextAware {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SystemPropertiesWrapper.class);
	
	@Autowired
    private Environment environment;
	
    private static ApplicationContext context;
    
    private Locale defaultLocale = null;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
		LOGGER.info(context.getDisplayName() + " application context set");
	}

	public String getProperty (String propertyName) {
		String propValue = environment.getProperty(propertyName);
		return propValue;
	}
	
	public ApplicationMode getApplicationMode () {
		String propKey = ApplicationPropertyName.PROP_NAME_APPLICATION_MODE.getJvmParamName();
		String propValue = getPropertyValueFromSystemOrDefault(propKey, environment.getProperty(propKey));
		return ApplicationMode.valueOf(StringUtils.upperCase(propValue));
	}
	
	/**
	 * 
	 * @param propKey
	 * @param propValue eğer boş ise  System.getProperty'den, o da boş ise {@link ApplicationDefaultValues}'den alır
	 * @return
	 */
	public static String getPropertyValueFromSystemOrDefault (String propKey, String propValue) {
		if (StringUtils.isBlank(propValue)) {
			propValue = getPropertyValueFromSystem(propKey);
		}
		return propValue;
	}
	
	public static String getPropertyValueFromSystem (String propKey) {
		String propValue = System.getProperty(propKey);
		if (StringUtils.isBlank(propValue)) {
			propValue = ApplicationDefaultValues.getProperty(propKey);	
			LOGGER.debug("PropKey: {} reading by default value (neither enviroment nor system has this key)", propKey);
		}
			
		return propValue;
	}
	
	public boolean isApplicationInProduction () {
		return ApplicationMode.PROD.equals(getApplicationMode());
	}
	
	public boolean isApplicationInTest () {
		return ApplicationMode.TEST.equals(getApplicationMode());
	}

	public boolean isApplicationInDevelopment () {
		return ApplicationMode.DEV.equals(getApplicationMode());
	}
	
	public boolean isApplicationInDemo () {
		return ApplicationMode.DEV.equals(getApplicationMode());
	}
	
	/**
	 * Modul Adı olarak kullanılıyor
	 * @return
	 */
	public String getApplicationId () {
		String propKey = ApplicationPropertyName.PROP_NAME_APPLICATION_ID.getJvmParamName();
		String propValue = getPropertyValueFromSystemOrDefault(propKey, environment.getProperty(propKey));
		return propValue;
	}
	
	public String getModulAdi () {
		return getApplicationId();
	}
	
	public boolean isCodeSecurityDisabled () {
		String propKey = ApplicationPropertyName.CODE_INVOKE_SECURITY_DISABLED.getJvmParamName();
		String propValue = getPropertyValueFromSystemOrDefault(propKey, environment.getProperty(propKey));
		return Utility.toBoolean(propValue);
	}
	
	public String getJndiDisabledParam () {
		String propKey = ApplicationPropertyName.SGEP_JNDI_DISABLED.getJvmParamName();
		String propValue = getPropertyValueFromSystemOrDefault(propKey, environment.getProperty(propKey));
		return propValue;
	}
	
	public Locale getDefaultLocale () {
		if (defaultLocale == null) {
			synchronized (this) {
				String propKey = ApplicationPropertyName.PROP_NAME_DEFAULT_LOCALE.getJvmParamName();
				String propValue = getPropertyValueFromSystemOrDefault(propKey, environment.getProperty(propKey));
				defaultLocale = new Locale(propValue);
			}
		}
		return defaultLocale;
	}

	public Object getApplicationName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getApplicationLink() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
