package gov.sgk.sqep.test.base.spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.quartz.CronTrigger;
import org.quartz.Trigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import gov.sgk.sgep.base.spring.schedule.AScheduleConfig;
import gov.sgk.sqep.test.base.spring.HelloJob;
import gov.sgk.sqep.test.base.spring.HelloJob2;

/**
 * 
 * @author o-psungur
 *
 */

@Configuration
public class TestSchedulerConfiguration extends AScheduleConfig {

	@Autowired
	Environment environment;
	
	@Override
	protected List<Trigger> cronConfigurations() {
		List<Trigger> triggerList = new ArrayList<Trigger>();
		
		CronTrigger helloJobTrigger = createCronTrigger(HelloJob.class, "HelloJob", "HelloJobTrigger", "0 0/1 * * * ?");
		CronTrigger helloJobTrigger2 = createCronTrigger(HelloJob2.class, "HelloJob2", "HelloJobTrigger2", "0 0/2 * * * ?");
		triggerList.add(helloJobTrigger);
		triggerList.add(helloJobTrigger2);
		return triggerList;

	}

}
