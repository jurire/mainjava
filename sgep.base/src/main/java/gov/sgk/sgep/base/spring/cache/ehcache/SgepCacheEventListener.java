package gov.sgk.sgep.base.spring.cache.ehcache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.Ehcache;
import net.sf.ehcache.Element;
import net.sf.ehcache.event.CacheEventListenerAdapter;

/**
 * Bu dinleyici sadece cache işlemlerini loglar<br>
 * 
 * @author o-mssahin
 * @since 11 Kas 2015
 *
 */
public class SgepCacheEventListener extends CacheEventListenerAdapter {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SgepCacheEventListener.class);

	@Override
	public void notifyElementRemoved(Ehcache cache, Element element) throws CacheException {
		LOGGER.info("Element REMOVED: " + element);
	}

	@Override
	public void notifyElementPut(Ehcache cache, Element element) throws CacheException {
		LOGGER.info("Element PUT: " + element);
	}

	@Override
	public void notifyElementUpdated(Ehcache cache, Element element) throws CacheException {
		LOGGER.info("Element UPDATED: " + element);		
	}
	
}
