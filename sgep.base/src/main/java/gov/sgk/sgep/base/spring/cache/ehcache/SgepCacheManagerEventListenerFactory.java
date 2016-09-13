package gov.sgk.sgep.base.spring.cache.ehcache;

import java.util.Properties;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.event.CacheManagerEventListener;
import net.sf.ehcache.event.CacheManagerEventListenerFactory;

/**
 * 
 * @author o-mssahin
 * @since 11 Kas 2015
 *
 */
public class SgepCacheManagerEventListenerFactory extends CacheManagerEventListenerFactory {

	@Override
	public CacheManagerEventListener createCacheManagerEventListener(CacheManager cacheManager, Properties properties) {
		return new SgepCacheManagerEventListener(cacheManager);
	}

}
