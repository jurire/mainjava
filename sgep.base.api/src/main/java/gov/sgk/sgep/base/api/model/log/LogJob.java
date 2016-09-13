package gov.sgk.sgep.base.api.model.log;

import java.util.Date;


/**
 * Job tipindeki işlemlerin logunu tutar.
 * Şimdilik veritabanı ayarlamaları devre dışı
 * @author o-psungur
 *
 */


//@Entity
//@Table (name="LOG_JOB")
public class LogJob extends Log{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String jobName;
	
//	@Column (name="START_TIME")
	private Date start;
	
//	@Column (name="END_TIME")
	private Date end;
	
	//getters setters
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;

	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}

	
}
