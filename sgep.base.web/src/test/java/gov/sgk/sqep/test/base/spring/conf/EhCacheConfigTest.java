package gov.sgk.sqep.test.base.spring.conf;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

import gov.sgk.sgep.base.spring.cache.ACacheConfig;
import net.sf.ehcache.config.CacheConfiguration;

/**
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
@Configuration
@EnableCaching
public class EhCacheConfigTest extends ACacheConfig {

	public static final String CACHE_NAME_TEST = "testCacheName";
	
	@Override
	protected CacheConfiguration[] cacheConfigurations() {
		CacheConfiguration[] result = new CacheConfiguration[1];
		CacheConfiguration cacheConfiguration = new CacheConfiguration();
        cacheConfiguration.setName(CACHE_NAME_TEST);
        cacheConfiguration.setMemoryStoreEvictionPolicy("LRU");
        cacheConfiguration.setMaxEntriesLocalHeap(1000);
        result[0] = cacheConfiguration;
		return result;
	}

	@Override
	protected boolean isDistributed() {
		// TODO Auto-generated method stub
		return false;
	}

}
