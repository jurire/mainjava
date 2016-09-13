package gov.sgk.sqep.test.base.spring.conf;

import java.util.Properties;

import org.springframework.context.annotation.Configuration;

import gov.sgk.sgep.base.spring.EngineConfiguration;

/**
 * 
 * @author o-mssahin
 *
 */
@Configuration
public class TestEngineConfiguration extends EngineConfiguration {

	@Override
	protected Properties velocityProperties() {
		// TODO Auto-generated method stub
		Properties result = super.velocityProperties();
		result.setProperty("classpath.resource.loader.path", "/template/velocity/");
		return result;
	}

}
