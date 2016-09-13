package gov.sgk.sgep.base.api.utility;

/**
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
public enum ApplicationPropertyName {
	
	/**
	 * tr, en gibi değerler
	 */
	PROP_NAME_DEFAULT_LOCALE ("app.locale"),	
	
	/**
	 * {@link ApplicationMode} enum'undaki değerler olabilir
	 */
	PROP_NAME_APPLICATION_MODE ("app.mode"),
	
	/**
	 * Uygulamanın jndi kullanıp kullanmayacağını belirler<br>
	 * true, false değerleri alabilir
	 */
	SGEP_JNDI_DISABLED ("sgep.jndi.disabled"),
	
	/**
	 * İş katmanı metotları çağrılırken güvenlik kontrolünün yapılmaması için<br>
	 * true, false değerleri alabilir
	 */
	CODE_INVOKE_SECURITY_DISABLED ("sgep.code.invoke.security.disabled"),
	
	/**
	 * Uygulamanın vt'deki id'sine de denk gelen verisi<br>
	 * Modul adı olarak kullanılıyor
	 */
	PROP_NAME_APPLICATION_ID ("app.id"),
	
	PROP_NAME_EHCACHE_PEER_PROVIDER_FACTORY_PROPERTIES ("ehcahce.peer.provider.factory.properties"),
	
	/**
	 * Velocity dosyalarının kopyalanacağı yer<br>
	 * folder.path.velocity
	 */
	FOLDER_PATH_VELOCITY ("folder.path.velocity");
	
	private String jvmParamName;
	
	private ApplicationPropertyName (String jvmParamName) {
		this.setJvmParamName(jvmParamName);
	}

	public String getJvmParamName() {
		return jvmParamName;
	}

	private void setJvmParamName(String jvmParamName) {
		this.jvmParamName = jvmParamName;
	}
	
}
