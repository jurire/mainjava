package gov.sgk.sqep.test.base.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import gov.sgk.sgep.base.spring.APersistenceConfiguration;

@Configuration
@PropertySource(value = { 
		"classpath:database-properties-test.xml",
		"classpath:hibernate-properties-test.xml" 
		})
public class BaseTestPersistenceConfiguration extends APersistenceConfiguration {

	@Override
	protected String[] packagesToScan() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isDbJndiDisabled() {
		return true;
	}

}
