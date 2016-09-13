package gov.sgk.sgep.base.spring.cache.ehcache;

import java.io.Serializable;

/**
 * Cache distributed olduğu durumda replicator için gerekli ayarları toplar.<br>
 * eğer distributed false ise diğer özellikler kullanılmaz.
 * @author o-mssahin
 * @since 11 Kas 2015
 *
 */
public class ReplicatorConfig implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean replicatePuts = true;
	boolean replicatePutsViaCopy = true;
	boolean replicateUpdates = true;
	boolean replicateUpdatesViaCopy = true;
	boolean replicateRemovals = true;
	int maximumBatchSize = 1000;
	int replicationInterval = 1000;
	private boolean async = true;
	
	/**
	 * 
	 */
	private boolean distributed = false;

	public boolean isReplicatePuts() {
		return replicatePuts;
	}

	public void setReplicatePuts(boolean replicatePuts) {
		this.replicatePuts = replicatePuts;
	}

	public boolean isReplicatePutsViaCopy() {
		return replicatePutsViaCopy;
	}

	public void setReplicatePutsViaCopy(boolean replicatePutsViaCopy) {
		this.replicatePutsViaCopy = replicatePutsViaCopy;
	}

	public boolean isReplicateUpdates() {
		return replicateUpdates;
	}

	public void setReplicateUpdates(boolean replicateUpdates) {
		this.replicateUpdates = replicateUpdates;
	}

	public boolean isReplicateUpdatesViaCopy() {
		return replicateUpdatesViaCopy;
	}

	public void setReplicateUpdatesViaCopy(boolean replicateUpdatesViaCopy) {
		this.replicateUpdatesViaCopy = replicateUpdatesViaCopy;
	}

	public boolean isReplicateRemovals() {
		return replicateRemovals;
	}

	public void setReplicateRemovals(boolean replicateRemovals) {
		this.replicateRemovals = replicateRemovals;
	}

	public int getMaximumBatchSize() {
		return maximumBatchSize;
	}

	public void setMaximumBatchSize(int maximumBatchSize) {
		this.maximumBatchSize = maximumBatchSize;
	}

	public int getReplicationInterval() {
		return replicationInterval;
	}

	public void setReplicationInterval(int replicationInterval) {
		this.replicationInterval = replicationInterval;
	}

	public boolean isDistributed() {
		return distributed;
	}

	public void setDistributed(boolean distributed) {
		this.distributed = distributed;
	}

	public boolean isAsync() {
		return async;
	}

	public void setAsync(boolean async) {
		this.async = async;
	}

}
