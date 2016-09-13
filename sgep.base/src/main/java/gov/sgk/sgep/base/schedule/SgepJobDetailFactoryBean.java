package gov.sgk.sgep.base.schedule;

import org.springframework.core.env.Environment;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;


/**
 * Tüm joblar için ortak olan detayları tek yerden atamak için JobDetailFactoryBean sınıfından türetildi
 * @author o-psungur
 *
 */
public class SgepJobDetailFactoryBean extends JobDetailFactoryBean {

    private Environment environment;
	
	public SgepJobDetailFactoryBean() {
		super();
	}

	@Override
	public void afterPropertiesSet() {
		setDurability(Boolean.parseBoolean(getEnvironment().getRequiredProperty("quartz.job.durability")));
		setGroup(getEnvironment().getRequiredProperty("quartz.group.name"));		
		super.afterPropertiesSet();
	}

	public Environment getEnvironment() {
		return environment;
	}

	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	
}
