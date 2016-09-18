package gov.sgk.sqep.test.base.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import gov.sgk.sgep.base.spring.AConfiguration;
import gov.sgk.sgep.base.spring.WebServiceConfig;
import gov.sgk.sqep.test.base.spring.conf.EhCacheConfigTest;
import gov.sgk.sqep.test.base.spring.conf.TestEngineConfiguration;
import gov.sgk.sqep.test.base.spring.conf.TestMailConfiguration;
import gov.sgk.sqep.test.base.spring.conf.TestPersistenceConfiguration;
import gov.sgk.sqep.test.base.spring.conf.TestSchedulerConfiguration;
import gov.sgk.sqep.test.base.spring.conf.TestSecurityConfiguration;

/**
 * 
 * @author o-mssahin
 * @since 1 Eki 2015
 *
 */
@EnableWebMvc
@EnableAspectJAutoProxy
@Configuration
@ComponentScan ({
	"gov.sgk.sgep.base.spring.beans",
	"gov.sgk.sqep.test.base.spring.beans",
	"gov.sgk.sgep.base.dao",
	"gov.sgk.sgep.base.business.impl",
	"gov.sgk.sgep.base.utility.engine.rule.openl" //openl-tablets kural motoru için
	
	,"gov.sgk.sgep.base.web.backing.spring"
})
@Import ({
	TestSecurityConfiguration.class 
	,EhCacheConfigTest.class
	,TestPersistenceConfiguration.class
	,TestMailConfiguration.class
	,WebServiceConfig.class
	,TestEngineConfiguration.class
	,TestSchedulerConfiguration.class
})
public class TestConfiguration extends AConfiguration {

	/*
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.hsqldb.jdbc.Driver");
		dataSource.setUrl("jdbc:hsqldb:hsql://127.0.0.1:1476 ");
		dataSource.setUsername("sa");
		dataSource.setPassword("");
		return dataSource;
	}
	*/
	
	@Override
	protected String[] messageResourceBaseNames() {
		return new String[]{"classpath:messages"};
	}

	@Override
	protected String[] labelResourceBaseNames() {
		return new String[]{"classpath:labels"};
	}
	
	
}
