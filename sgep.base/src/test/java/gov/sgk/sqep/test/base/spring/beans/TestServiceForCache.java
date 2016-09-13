package gov.sgk.sqep.test.base.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import gov.sgk.sqep.test.base.spring.conf.EhCacheConfigTest;

/**
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
@Service
public class TestServiceForCache implements ITestServiceForCache {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestServiceForCache.class);
	
	public static int readCountCachable = 0;
	public static int readCountNotCachable = 0;

	
	@Cacheable (key="#id", value=EhCacheConfigTest.CACHE_NAME_TEST)
	@Override
	public String getPojoCachable(String id) {
		LOGGER.info("getPojoCachable invoked by id: {} ", id);
		readCountCachable++;
		return id.toUpperCase();
	}

	@Override
	public String getPojoNotCachable(String id) {
		LOGGER.info("getPojoNotCachable invoked by id: {} ", id);
		readCountNotCachable++;
		return id.toUpperCase();
	}

}
