package gov.sgk.sqep.test.base.spring.beans;

import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.utility.UsernamePasswordInvalidException;
import gov.sgk.sgep.utility.Utility;

/**
 * testusers.properties dosyasından değerleri okur
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@Service ("domainUserServiceTest")
public class DomainUserServiceTest implements IDomainUserService, InitializingBean {
	
	static PropertiesFactoryBean prop = new PropertiesFactoryBean();
	{
		prop = new org.springframework.beans.factory.config.PropertiesFactoryBean();
		prop.setLocation(new ClassPathResource("testusers.properties"));
		try {
			prop.afterPropertiesSet();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public DomainUser getDomainUserById(Serializable id) {
		if (getProperties().containsKey(id +".username")) {
			return new DomainUser(Utility.toString(id), null);
		}
		return null;
		
	}

	@Override
	public DomainUser login(Serializable id, String password) throws UsernamePasswordInvalidException {
		DomainUser result = null;
		String propPassword = getProperties().getProperty(id + ".password");
		if (getProperties().containsKey(id + ".username") && password.equals(propPassword)) {
			result = new DomainUser(Utility.toString(id), propPassword);
		} 
		return result;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		prop = new org.springframework.beans.factory.config.PropertiesFactoryBean();
		prop.setLocation(new ClassPathResource("testusers.properties"));
		prop.afterPropertiesSet();
	}
	
	public static Properties getProperties () {
		try {
			return prop.getObject();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
