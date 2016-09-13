package gov.sgk.sgep.utility;

import java.util.Locale;

/**
 * SGEP projelerinin ortak bütün sabitleri bu sınıfta yer alır.
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
public abstract class SgepConstants {
	
	public static boolean TEST = false;

	/**
	 * new Locale("tr", "TR")
	 */
	public static final Locale LOCALE_TURKISH = new Locale("tr", "TR");
	
	/**
	 * testCacheName
	 */
	public static final String CACHE_NAME_TEST = "testCacheName";
	public static final String CACHE_BASE = "baseCache";
	
	
	public static final String BEAN_NAME_SPRING_CONTEXT_PROVIDER = "springContextProvider";
	public static final String BEAN_NAME_MESSAGE_SOURCE = "messageSource";
	public static final String BEAN_NAME_LABEL_SOURCE = "labelSource";
	public static final String BEAN_NAME_VELOCITY_ENGINE = "velocityEngine";
	public static final String BEAN_NAME_REPORT_ENGINE = "reportEngine";
	public static final String BEAN_NAME_LOG_SERVICE = "logService";
	public static final String BEAN_NAME_LOG_SERVICE_ASYNC = "logServiceAsync";
	public static final String BEAN_NAME_LOG_SERVICE_TASK_EXECUTOR = "logServiceTaskExecutor";
	public static final String BEAN_NAME_MEYES_CLIENT = "meyesClient";
	public static final String BEAN_NAME_SPAS_CLIENT = "spasClient";
	public static final String BEAN_NAME_MERNIS_CLIENT = "mernisClient";
	
	public static final String BEAN_NAME_EMEKLI4A_CLIENT = "emekli4aClient";
	public static final String BEAN_NAME_EMEKLI4B_CLIENT = "emekli4bClient";
	public static final String BEAN_NAME_EMEKLI4C_CLIENT = "emekli4cClient";

	public static final String UNKNOWN = "unknown";
	
	/**
	 * Sgep ortak tablolarının bulunduğu şema 
	 */
	public static final String SCHEMA_BASE = "";
	
	/**
	 * Tescil tablolarının bulunduğu şema
	 */
	public static final String SCHEMA_STES = "STES";
	
	/**
	 * Şimdilik geçici olarak bu isim verilmiştir
	 */
	public static final String SCHEMA_ITES = "ITES";
	
	public static final String CHARSET_ISO_8859_1 = "ISO-8859-1";
	public static final String CHARSET_UTF_8 = "UTF-8";
	
	/**
	 * dd.MM.yyyy
	 */
	public static final String DATE_FORMAT_DD_MM_YYYY = "dd.MM.yyyy";
	
	/**
	 * dd.MM.yyyy HH:mm:ss
	 */
	public static final String DATE_FORMAT_DD_MM_YYYY_HH_mm_ss = "dd.MM.yyyy HH:mm:ss";
	
	/**
	 * dd.MM.yyyy HH:mm:ss.SSSSSS
	 */
	public static final String DATE_FORMAT_DD_MM_YYYY_HH_mm_ss_LONG = "dd.MM.yyyy HH:mm:ss.SSSSSS";
	
	public static final String VELOCITY_PROP_CLASSPATH_RESOURCE_LOADER_PATH = "classpath.resource.loader.path";
	
	public static final String COMMAND_WEB_MENU_TREE_JSON = "menuJson";
	
	public static final String MAIN_JS_LIBRARY_NAME = "sgep-base";
	
	public static final String TURKIYE_KOD = "90";
	
	public static final String PROCESS_TYPE_NEW = "new";
	
	public static final String PROCESS_TYPE_UPDATE = "update";
	
	public static final String PROCESS_TYPE_DELETE = "delete";

	/**
	 * Sanal olarak oluşturulan kök menüsünün id'si <br>
	 * "/" 
	 */
	public static final String MENU_ROOT_ID = "/";
	
}

