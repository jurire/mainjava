package gov.sgk.sgep.base.api.utility;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * jvm parametresi olarak geçerseniz
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
public class ApplicationDefaultValues {

	private static Map<String, String> VALUES = new ConcurrentHashMap<String, String>();
	
	static {
		registerValue(ApplicationPropertyName.PROP_NAME_APPLICATION_MODE.getJvmParamName(), ApplicationMode.DEV.name());
		registerValue(ApplicationPropertyName.PROP_NAME_DEFAULT_LOCALE.getJvmParamName(), "tr");
		registerValue(ApplicationPropertyName.PROP_NAME_EHCACHE_PEER_PROVIDER_FACTORY_PROPERTIES.getJvmParamName(), "peerDiscovery=automatic,multicastGroupAddress=224.20.20.20,multicastGroupPort=4444");
		registerValue(ApplicationPropertyName.CODE_INVOKE_SECURITY_DISABLED.getJvmParamName(), "false");
	}
	
	/**
	 * Bu metot kullanılarak uygualamya özgü varsayılan özellikler sistem başlama anında yazılabilir
	 * @param key
	 * @param value
	 */
	public static void registerValue (String key, String value) {
		VALUES.put(key, value);
	}
	
	public static String getProperty (String propName) {
		return VALUES.get(propName);
	}
	
	public static String getProperty (ApplicationPropertyName prop) {
		return VALUES.get(prop.getJvmParamName());
	}
	
	public static void load () {
		
	}
	
}
