package gov.sgk.sgep.base.spring.cache;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;

import gov.sgk.sgep.base.api.utility.ApplicationPropertyName;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;
import gov.sgk.sgep.base.utility.MBeanUtility;
import gov.sgk.sgep.utility.Assert;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.config.CacheConfiguration.CacheEventListenerFactoryConfiguration;
import net.sf.ehcache.config.Configuration;
import net.sf.ehcache.config.FactoryConfiguration;

/**
 * {@link ACacheConfig} Ehcache'i cache gerçekleştirimi olarak kabul eder.<br>
 * Eğer başka bir cache kullanılmak istenirse, başka bir gerçekleştirim yazmak zorundasınız.
 * Extend eden sınıfta aşağıdaki annotation'ları belirtiniz
 * 
 * <pre> 
 * {@literal @}Configuration 
 * {@literal @}EnableCaching
 * </pre> 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
public abstract class ACacheConfig implements CachingConfigurer {

	/**
	 * Sistem için geçerli keş ayarlarını tanımlayınız, eğer cache ayarınız yoksa null ya da boş dönebilirsiniz
	 * @return {@link CacheConfiguration} dizisi <br>
	 * 		ehcache ayarları için gerekli olan dizi
	 */
	protected abstract CacheConfiguration [] cacheConfigurations ();
	
	/**
	 * Eğer cache distributed ise ana configuration'a ve cache'lere ilgili özellikler eklenir.
	 * 
	 * @return
	 */
	protected abstract boolean isDistributed ();
	
    @Bean(destroyMethod="shutdown")
    public net.sf.ehcache.CacheManager ehCacheManager() {
        net.sf.ehcache.config.Configuration config = createConfiguration ();
        addCacheConfigurations (config);
        addCacheManagerEventListenerFactory (config);
        return net.sf.ehcache.CacheManager.newInstance(config);
    }

    /**
     * Ehcache konfigurasyonuna cache manager event listener factroy ekler
     * @param config
     */
    protected void addCacheManagerEventListenerFactory(Configuration config) {
        FactoryConfiguration<?> factoryConfiguration = new FactoryConfiguration<>();
		factoryConfiguration.className("gov.sgk.sgep.base.spring.cache.ehcache.SgepCacheManagerEventListenerFactory");
		config.addCacheManagerEventListenerFactory(factoryConfiguration);
	}

	private Configuration createConfiguration() {
    	Configuration result = new net.sf.ehcache.config.Configuration();
    	if (isDistributed()) {
    		FactoryConfiguration<?> peerListenerFactoryConf = new FactoryConfiguration<>();
    		String port = SystemPropertiesWrapper.getPropertyValueFromSystem("RMICacheManagerPeerListener.port");
    		Assert.notEmpty(port, "Ehcache distributed ayarlandığında port'un boş olmaması gerekir. RMICacheManagerPeerListener.port ayarını jvm'den ya da ApplicationDefaultValues.registerValue ile atamalısınız.");
    		peerListenerFactoryConf.className("net.sf.ehcache.distribution.RMICacheManagerPeerListenerFactory");
    		peerListenerFactoryConf.setPropertySeparator(",");
    		peerListenerFactoryConf.setProperties("port=" + port +  ",socketTimeoutMillis=2000");
    		result.addCacheManagerPeerListenerFactory(peerListenerFactoryConf);
    		
    		FactoryConfiguration<?> peerProviderFactoryConf = new FactoryConfiguration<>();
    		peerProviderFactoryConf.className("net.sf.ehcache.distribution.RMICacheManagerPeerProviderFactory");
    		peerProviderFactoryConf.setPropertySeparator(",");
    		peerProviderFactoryConf.setProperties(SystemPropertiesWrapper.getPropertyValueFromSystem(ApplicationPropertyName.PROP_NAME_EHCACHE_PEER_PROVIDER_FACTORY_PROPERTIES.getJvmParamName()));
    		result.addCacheManagerPeerProviderFactory(peerProviderFactoryConf);
    	}
		return result;
	}

	protected void addCacheConfigurations(net.sf.ehcache.config.Configuration config) {
        CacheConfiguration [] cacheConfigurations = cacheConfigurations();
        if (ArrayUtils.isNotEmpty(cacheConfigurations)) {
            for (CacheConfiguration cacheConfiguration : cacheConfigurations()) {
            	if (isDistributed()) {
            		CacheEventListenerFactoryConfiguration conf = new CacheEventListenerFactoryConfiguration();
                	conf.className("net.sf.ehcache.distribution.RMICacheReplicatorFactory");
                	conf.setPropertySeparator(",");
                	conf.setProperties("replicateAsynchronously=true, replicatePuts=true, replicateUpdates=true,replicateUpdatesViaCopy=false, replicateRemovals=true");
                	cacheConfiguration.addCacheEventListenerFactory(conf);
            	}
            	if (cacheConfiguration != null) {       
                	config.addCache(cacheConfiguration);
            	}
    		}
        }
	}

	@Bean
    @Override
    public CacheManager cacheManager() {
		EhCacheCacheManager cacheManager = new EhCacheCacheManager(ehCacheManager());
		MBeanUtility.registerEhcache(cacheManager.getCacheManager());
        return cacheManager;
    }

    @Bean
    @Override
    public KeyGenerator keyGenerator() {
        return new MethodAwareCacheKeyGenerator();
    }

	@Override
	public CacheResolver cacheResolver() {
		return null;
	}

	@Override
	public CacheErrorHandler errorHandler() {
		return null;
	}
}
