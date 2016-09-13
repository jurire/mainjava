package gov.sgk.sgep.base.spring.mail;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * 
 * @author o-psungur
 *
 */


@Configuration
@PropertySource(value = { "classpath:mail-properties.xml" })
public abstract class AMailConfig {

	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Autowired
    private Environment environment;
	
	@Bean (name="mailSender")
	public JavaMailSenderImpl mailSender(){
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		
		mailSender.setDefaultEncoding(environment.getRequiredProperty("mail.defaultEncoding"));
		mailSender.setHost(environment.getRequiredProperty("mail.host"));
		mailSender.setProtocol(environment.getRequiredProperty("mail.protocol"));
		mailSender.setUsername(environment.getRequiredProperty("mail.username"));
		mailSender.setPassword(environment.getRequiredProperty("mail.password"));
				
		Properties javaMailProperties = javaMailProperties();
		if (javaMailProperties != null) {
			mailSender.setJavaMailProperties(javaMailProperties);
		}
		
		return mailSender;
	}
	
    protected Properties javaMailProperties() {
        Properties properties = new Properties();
        properties.put("mail.transport.protocol", "smtp");
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", false);
        properties.put("mail.debug", false);
        return properties;        
    }
}
