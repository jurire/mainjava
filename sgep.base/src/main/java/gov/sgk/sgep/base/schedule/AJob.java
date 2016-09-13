package gov.sgk.sgep.base.schedule;


import java.util.Date;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.security.core.Authentication;

import gov.sgk.sgep.base.api.NotLoggable;
import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.api.model.log.LogJob;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.utility.BaseUtility;
import gov.sgk.sgep.utility.Utility;

/**
 * Bütün zamanlanmış işler bu sınıftan türetilmelidir.
 * Bu sınıftan türeyen iş parçacıkları, otomatik olarak loglama işlemlerini gerçekleştirmiş olacak
 * 
 * @author o-psungur
 *
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public abstract class AJob extends QuartzJobBean {
	
	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {		
		
		if (LOGGER.isInfoEnabled()) { 
			LOGGER.info("JOB[" + name() + "] Basladi");		
		}
		
		Date start = new Date();
		
		Date end = null;
		Exception ex = null;
		
		try {			
			Class<?> clazz = this.getClass();
			if (isJobExecutionDisabled(clazz)) {
				String mesaj = String.format("%s disabled, calistirilmadi. System property: %s disabled", name(), getExecutionDisabledSystemProperty(clazz));
				LOGGER.warn(mesaj);
				ex = new Exception(mesaj);
			} else {
				run(context);
			}
		} catch (Exception e) {
			ex = e;
			LOGGER.error("Hata" , e);
		} finally {
			end = new Date();
			logToDB(start, end, ex);
		}
		logInfo(ex);
	}	
	
	private void logInfo (Exception ex) {
		if (LOGGER.isInfoEnabled()) {
			String hata = "";
			if (ex == null) {
				hata = "Basarılı";
			} else {
				hata = "Hatalı: "+ ex.toString();
			}
			
			LOGGER.info("JOB[" + name() + "] Bitti; Durum: " + hata);
			
		}		
	}
	
	/**
	 * İş'e bir isim vermelisiniz.<br>
	 * Loglama açısından biricik olmasına dikkat ediniz!!!
	 * @return
	 */
	public String name() {
		return this.getClass().getSimpleName();
	}

	
	public AJob () {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("JOB[" + name() + "] yaratiliyor");
		}
	}	
	
	public void executeForTest(JobExecutionContext context) throws JobExecutionException {
		this.executeInternal(context);
	}
	
	private void logToDB (Date start, Date end, Exception e) {
		
		if(!this.getClass().isAnnotationPresent(NotLoggable.class)) {
			try {				
				ILogService lServis = SpringContextProvider.getLogService();
				Authentication au = BaseUtility.getAuthentication();
				
				LogJob jLog = new LogJob();
				jLog.setUserId(au != null ? au.getName() : "unknown");
				jLog.setJobName(this.name());
				jLog.setStart(start);
				jLog.setEnd(end);
				jLog.setSuccess(e == null);
				
				if (e != null) {
					jLog.setError(Utility.exceptionToString(e));
				}
				
				lServis.createLog(jLog);
			} catch (Exception e2) {
				LOGGER.error(e2.toString());
			}
		
		}
	}
	
	/**
	 * İş çalıştığı zaman yapılacakları buraya yazmalısınız
	 * 
	 * @param context
	 * @throws JobExecutionException
	 */
	public abstract void run (JobExecutionContext context) throws JobExecutionException;

	/**
	 *  
	 * @param clazz
	 * @return sınıf çalıştırılması disabled yapılmış mı yapılmamış 
	 */
	protected boolean isJobExecutionDisabled (Class<?> clazz) {
		return Utility.toBoolean(System.getProperty(getExecutionDisabledSystemProperty(clazz)));
	}
	
	protected String getExecutionDisabledSystemProperty (Class<?> clazz) {
		return clazz.getSimpleName() + ".disabled";
	}
	

}
