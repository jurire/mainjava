package gov.sgk.sqep.test.base.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import gov.sgk.sgep.base.spring.AConfiguration;

@Configuration
@EnableTransactionManagement
@ComponentScan ({
	"gov.sgk.sgep.base.business", 
	"gov.sgk.sgep.base.dao",
	"gov.sgk.sgep.base.spring.aop",
	"gov.sgk.sgep.base.business.impl",
	"gov.sgk.sgep.base.spring.session" //sessionmanagementfilter için
	})
@Import ({
	BaseTestSecurityConfiguration.class,
	BaseTestPersistenceConfiguration.class
})
@EnableAspectJAutoProxy
@EnableAsync
public class BaseWebTestConfiguration extends AConfiguration {

	@Override
	protected String[] messageResourceBaseNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] labelResourceBaseNames() {
		// TODO Auto-generated method stub
		return null;
	}

}
