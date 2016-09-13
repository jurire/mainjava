package gov.sgk.sgep.base.spring.schedule;

import java.text.ParseException;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.quartz.CronTrigger;
import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

import gov.sgk.sgep.base.schedule.SgepJobDetailFactoryBean;
import gov.sgk.sgep.base.schedule.SgepSchedulerFactoryBean;

/**
 * Zamanlı işler için kullanılan ana metodlar ve şablon yapıları tanımlar
 * Kullandığınız modülde bu sınıftan türeyen bir konfigürasyon girebilirsiniz
 * @author o-psungur
 *
 */


@Configuration
@PropertySource(value = { "classpath:quartz-properties.xml" })
public abstract class AScheduleConfig {

	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Autowired
    private Environment environment;
	
	
	@Bean(name="jobFactory")
	public SgepSchedulerFactoryBean schedulerFactoryBean() {

		SgepSchedulerFactoryBean scheduler = new SgepSchedulerFactoryBean();
		scheduler.setEnvironment(environment);
		List<Trigger> triggers = cronConfigurations();
		if(CollectionUtils.isNotEmpty(triggers)){
			scheduler.setTriggers(triggers.toArray(new Trigger[triggers.size()]));
		}
		return scheduler;
	}
	
	
	protected abstract List<Trigger> cronConfigurations ();
	
	/**
	 * 
	 * @param clazz Job için tanımlanan sınıf (AJob sınıfından türemesi gerekiyor)
	 * @param jobDetailName job için kullanılacak isim (sınıf ismi ile aynı verebilirsiniz)
	 * @param triggerName trigger için kullanılacak isim (jobdetailname + Trigger verebilirsiniz)
	 * @param cronExpression job çalışma sıklığını ve zamanını belirleyen cron expression
	 * @return
	 */
	protected CronTrigger createCronTrigger(Class clazz,String jobDetailName, String triggerName, String cronExpression) {

		CronTriggerFactoryBean ctFactory = new CronTriggerFactoryBean();
		SgepJobDetailFactoryBean jdFactory = new SgepJobDetailFactoryBean();
		jdFactory.setEnvironment(environment);
		jdFactory.setJobClass(clazz);
		jdFactory.setName(jobDetailName);
		jdFactory.afterPropertiesSet();

		ctFactory.setJobDetail(jdFactory.getObject());
		ctFactory.setGroup("mygroup");
		ctFactory.setName(triggerName);
		ctFactory.setCronExpression(cronExpression);

		try {
			ctFactory.afterPropertiesSet();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return ctFactory.getObject();
	}
	

	
}
