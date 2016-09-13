package gov.sgk.sgep.base.api.model.log;

import javax.persistence.MappedSuperclass;

import gov.sgk.sgep.base.api.model.BaseModel;

/**
 * 
 * @author o-mssahin
 * @since 9 Eki 2015
 *
 */
@MappedSuperclass
public abstract class Log  extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String description;
	private boolean success;
	
	/**
	 * Aykırı durum
	 */
	private String error;
	private int executionTime;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public int getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}
}
