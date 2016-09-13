package gov.sgk.sgep.base.spring.cache.ehcache;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Status;
import net.sf.ehcache.event.CacheEventListener;
import net.sf.ehcache.event.CacheManagerEventListener;

/**
 * 
 * @author o-mssahin
 * @since 11 Kas 2015
 *
 */
public class SgepCacheManagerEventListener implements CacheManagerEventListener {

	private static final Logger LOGGER = LoggerFactory.getLogger(SgepCacheManagerEventListener.class);

	CacheManager cacheManager;
	
	ReplicatorConfig replicatorConfig;
	boolean distributed;
	boolean async;
	
	public SgepCacheManagerEventListener(CacheManager cacheManager) {
		ReplicatorConfig replicatorConfig = new ReplicatorConfig();
		this.cacheManager = cacheManager;
		this.distributed = replicatorConfig.isDistributed();
		this.async = replicatorConfig.isAsync();
		this.replicatorConfig = replicatorConfig;
	}

	@Override
	public void init() throws CacheException {
		
	}

	@Override
	public Status getStatus() {
		return null;
	}

	@Override
	public void dispose() throws CacheException {
		
	}

	@Override
	public void notifyCacheAdded(String cacheName) {
		net.sf.ehcache.Cache cache = this.cacheManager.getCache(cacheName);
		List<CacheEventListener> listeners = new ArrayList<>();
		listeners.add(new SgepCacheEventListener());
		for (CacheEventListener cacheEventListener : listeners) {
			cache.getCacheEventNotificationService().registerListener(cacheEventListener);			
		}
		//addListeners(cache);
		LOGGER.info(cacheName + " added");
	}
	
	/*
	private void addListeners(Cache cache) {
		List<CacheEventListener> listeners = new ArrayList<>();
		listeners.add(new SgepCacheEventListener());
		
		if (this.distributed) {
			CacheEventListener replicatorListener = null;
			boolean replicatePuts = replicatorConfig.isReplicatePuts();
			boolean replicatePutsViaCopy = replicatorConfig.isReplicatePutsViaCopy();
			boolean replicateUpdates = replicatorConfig.isReplicateUpdates();
			boolean replicateUpdatesViaCopy = replicatorConfig.isReplicateUpdatesViaCopy();
			boolean replicateRemovals = replicatorConfig.isReplicateRemovals();
			int maximumBatchSize = replicatorConfig.getMaximumBatchSize();
			int replicationInterval = replicatorConfig.getReplicationInterval();
			
			if (this.async) {
				replicatorListener = new RMIAsynchronousCacheReplicator(replicatePuts, replicatePutsViaCopy, replicateUpdates, replicateUpdatesViaCopy, replicateRemovals, replicationInterval, maximumBatchSize);
			} else {
				replicatorListener = new RMISynchronousCacheReplicator(replicatePuts, replicatePutsViaCopy, replicateUpdates, replicateUpdatesViaCopy, replicateRemovals);
			}
			listeners.add(replicatorListener);
		}
		
		for (CacheEventListener cacheEventListener : listeners) {
			cache.getCacheEventNotificationService().registerListener(cacheEventListener);			
		}
	}
	*/

	@Override
	public void notifyCacheRemoved(String cacheName) {
		LOGGER.info(cacheName + " removed");
	}

}
