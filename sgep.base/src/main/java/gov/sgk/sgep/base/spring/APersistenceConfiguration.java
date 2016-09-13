package gov.sgk.sgep.base.spring;

import java.util.Arrays;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.lang3.ArrayUtils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import gov.sgk.sgep.base.api.hibernate.DefaultEntityInterceptor;
import gov.sgk.sgep.base.api.utility.ApplicationPropertyName;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.web.DefaultSessionProvider;
import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.SgepConstants;
import gov.sgk.sgep.utility.Utility;

/**
 * {@literal @}Configuration ile işaretlemeniz gerekiyor çocuk sınıfı<br>
 * 
 * Örneğin;<br>
 * <pre>
 * {@literal @}Configuration
 * {@literal @}PropertySource(value = { "classpath:database-properties.xml","classpath:hibernate-properties.xml" })
 * </pre>
 * 
 * @author o-mssahin
 * @since 7 Eki 2015
 *
 */
@Configuration
//@PropertySource(value = { "classpath:database-properties.xml","classpath:hibernate-properties.xml" })
public abstract class APersistenceConfiguration {
	
	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Autowired
    protected Environment environment;
	
	@Bean (name="sessionFactory")
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setNamingStrategy(new ImprovedNamingStrategy());
        adjustEntityInterceptor (sessionFactory);
        adjustHibernateProperties(sessionFactory);
        adjustPackagesToScan(sessionFactory);
        return sessionFactory;
	}

	/**
	 * Varsayılan olarak {@link DefaultEntityInterceptor} kabul edilir<br>
	 * Session provider olarak {@link DefaultSessionProvider} sınıfı atanır
	 * @return
	 */
	protected org.hibernate.Interceptor entityInterceptor () {
		DefaultEntityInterceptor result = new DefaultEntityInterceptor();
		result.setSessionProvider(new DefaultSessionProvider());
		return result;
	}
	
    private void adjustEntityInterceptor(LocalSessionFactoryBean sessionFactory) {
    	org.hibernate.Interceptor interceptor = entityInterceptor();
    	if (interceptor != null) {
        	sessionFactory.setEntityInterceptor(interceptor);
    	}
	}
    
    /**
     * Sistemin kullanacağı datasource nesnesini belirler.<br>
     * DataSource girilen sistem parametresine göre belirleniyor. 
     * Sistem parametresi context içerisinde yer aldığı için önce contextin oluşması gerekiyor. Bu nedenle dependsOn eklendi<br>
     * DataSource oluşturulduktan sonra {@link APersistenceConfiguration#afterCreationOfDatasource(DataSource)} çağrılır
     * @author o-psungur  
     * @return
     */
	@Bean (name="dataSource")
	@DependsOn(SgepConstants.BEAN_NAME_SPRING_CONTEXT_PROVIDER)
    public DataSource dataSource() {

		boolean jndiDisabled = isDbJndiDisabled(); 
		DataSource result = null;
		//Uygulama sunucusuna jndi kullanılmasın parametresi true verilmişse tanımlı veritabanı ayarları ile datasource oluştur
		if(jndiDisabled){
			LOGGER.info("{} değeri : {} olarak tanımlanmış. Datasource yaratılıyor.", ApplicationPropertyName.SGEP_JNDI_DISABLED.getJvmParamName(), jndiDisabled);
			result = createDataSourceBasic();
		}
		//Uygulama sunucusuna jndi kullanılmasın parametresi verilmemişse sunucu üzerindeki SgepDevDatasource kullan
		else{
			LOGGER.info("{} değeri : {} olarak tanımlanmış. {} kullanılıyor.", ApplicationPropertyName.SGEP_JNDI_DISABLED.getJvmParamName(), getJndiSourceName() ,jndiDisabled);
	        result = createDataSourceJndi();
		}
		
		afterCreationOfDatasource (result);
		return result;
    } 
	
	/**
	 * datasource oluşturulduktan sonra çağrılacak işler. Örneğin şema yaratılması buraya eklenebilir.
	 * @param result
	 */
	protected void afterCreationOfDatasource(DataSource result) {
		
	}

	private DataSource createDataSourceJndi () {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
        dsLookup.setResourceRef(true);
        String jndiName = getJndiSourceName();
        Assert.notBlank(jndiName, "JNDI ismi boş olamaz");
        DataSource dataSource = dsLookup.getDataSource(jndiName);
        return dataSource;
	}
	
	/**
	 * Eğer sgep.jndi.disabled=true olarak atanmamışsa, {@link DataSource} jndi ile oluşturulacak demektir. Bu metot jndi ismini döner.<br> 
	 * 
	 * @return varsayılan: <b>SgepDevDB2Datasource</b>, eğer farklı bir jndi ismi kullanılacaksa bu metodu override edip o ismi dönün
	 */
	protected String getJndiSourceName () {
		return "SgepDevDB2Datasource";
	}
	
	private DataSource createDataSourceBasic () {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
	}
	
	/**
	 * Bu metodu override ederek datasource'u {@link BasicDataSource}'dan oluşturabilirsiniz
	 * @return
	 */
	public boolean isDbJndiDisabled () {
		return Utility.toBoolean(SpringContextProvider.getSystemPropertiesWrapper().getJndiDisabledParam());
	}
     
	/**
	 * validation disable etmek için
	 * <pre>properties.put("javax.persistence.validation.mode", "none");</pre>
	 *  
	 * @return
	 */
    protected Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hbm2ddl.auto"));
        properties.put("hibernate.default_schema", environment.getProperty("hibernate.default_schema", ""));
        //properties.put("javax.persistence.validation.mode", "none");
        return properties;        
    }
     
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
    
    private void adjustPackagesToScan (LocalSessionFactoryBean sessionFactory) {
		String [] packages = packagesToScan();
		if (ArrayUtils.isNotEmpty(packages)) {
			LOGGER.info("packages to scan: " + Arrays.deepToString(packages));
			sessionFactory.setPackagesToScan(packages);
		}
	}
	
	private void adjustHibernateProperties (LocalSessionFactoryBean sessionFactory) {
		Properties properties = hibernateProperties();
		if (properties != null) {
			sessionFactory.setHibernateProperties(properties);
		}
	}	

	/**
	 * Hibernate için gerekli olan modelllerin paketlerinin yerlerini gösterir.
	 * @return null ya da boş eğer herhangi bir paket yoksa
	 */
	protected abstract String [] packagesToScan();
}
