package gov.sgk.sgep.base.schedule;

import java.util.ArrayList;
import java.util.List;

import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-psungur
 *
 */
public class SgepSchedulerFactoryBean extends org.springframework.scheduling.quartz.SchedulerFactoryBean {

	private static final Logger LOGGER = LoggerFactory.getLogger(SgepSchedulerFactoryBean.class);

    private Environment environment;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("Quartz jobs: " + isEnableQuartzTasks());
	    if (isEnableQuartzTasks()) {
	        super.afterPropertiesSet();
	    }
	}
	
	
	/**
	 * trigger'ların eklenebilmesi için quartz-properties içerisinden enabled yapılması
	 *  veya insertallquartzjob'ın true olması gerekiyor
	 */
	@Override
	public void setTriggers(Trigger ... triggers) {
		if (isInsertAllQuartzTasks()) {
			super.setTriggers(triggers);
		} else {
			List<Trigger> eklenecekler = new ArrayList<>();
			for (Trigger trigger : triggers) {
				String triggerJobName = trigger.getJobKey().getName();
				if (Utility.toBoolean(getEnvironment().getRequiredProperty(triggerJobName + ".enabled"))) {
					eklenecekler.add(trigger);
					logger.info("Scheduler'a eklenecek: " + triggerJobName);
				}
			}
			super.setTriggers(eklenecekler.toArray(new Trigger[]{}));
		}
	}

	public boolean isEnableQuartzTasks() {
		return Utility.toBoolean(getEnvironment().getRequiredProperty("enable.quartz.tasks"));
	}

	/**
	 * Eklenecek job'lar jobname.enabled=[true,false] şeklinde schedular'a eklenebilir<br>
	 * Eğer insert.all.quartz.tasks değeri true ise jobname.enabled değerine bakılmadan schedular'a eklenir
	 */
	public boolean isInsertAllQuartzTasks() {
		return Utility.toBoolean(getEnvironment().getRequiredProperty("insert.all.quartz.task"));
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

}
