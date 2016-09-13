package gov.sgk.sgep.base.spring;

import java.util.Properties;

import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.apache.velocity.runtime.resource.loader.FileResourceLoader;
import org.apache.velocity.runtime.resource.loader.StringResourceLoader;
import org.apache.velocity.runtime.resource.util.StringResourceRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.ui.velocity.VelocityEngineFactoryBean;

import gov.sgk.sgep.base.api.utility.ApplicationPropertyName;
import gov.sgk.sgep.base.api.utility.ITemplateEngine;
import gov.sgk.sgep.base.utility.engine.template.QuietReferenceInsertionHandler;
import gov.sgk.sgep.base.utility.engine.template.TemplateEngine;
import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Template Engine, ScriptEngine gibi utility bean'lerin yapılandırılması bu sınıfta gerçekleştirilir.<br>
 * Eğer velocity ve Scripting kullanmak istiyorsanız bu sınıfı Proje'de import etmeniz gerekmektedir. 
 * @author o-mssahin
 *
 */
@Configuration
@PropertySource(value = { "classpath:velocity.properties" })
public class EngineConfiguration {
	
	@Autowired
	Environment environment;
	
	@Bean (name=SgepConstants.BEAN_NAME_VELOCITY_ENGINE)
	public VelocityEngineFactoryBean velocityEngine () {
		VelocityEngineFactoryBean result = new VelocityEngineFactoryBean();
		result.setVelocityProperties(velocityProperties());
		return result;
	}
	
	@Bean
	public ITemplateEngine getTemplateEngine () {
		return new TemplateEngine();
	}
	
	/**
	 * Aşağıdaki özellikler atanır. Özellikleri değiştirmek için override ediniz.
	 * <pre>
	 * resource.loader=classpath,file,string
	 * classpath.resource.loader.class = org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader
	 * classpath.resource.loader.cache = false
	 * classpath.resource.loader.path = /META-INF/resources/velocity/
	 * file.resource.loader.class = org.apache.velocity.runtime.resource.loader.FileResourceLoader
	 * file.resource.loader.cache = false
	 * file.resource.loader.path = ${dizin.yolu.velocity}
	 * string.resource.loader.description = Velocity StringResource loader
	 * string.resource.loader.class = org.apache.velocity.runtime.resource.loader.StringResourceLoader
	 * string.resource.loader.repository.class = org.apache.velocity.runtime.resource.util.StringResourceRepositoryImpl
	 * string.resource.loader.cache = false
	 * string.resource.loader.repository.static = false
	 * input.encoding = UTF-8
	 * output.encoding = UTF-8
	 * eventhandler.referenceinsertion.class = com.cs.sigorta.servis.utility.mail.QuietReferenceInsertionHandler
	 * </pre> 
	 * @return
	 */
	protected Properties velocityProperties () {
		Properties result = new Properties();
		String fileResourceLoaderPath = environment.getProperty(ApplicationPropertyName.FOLDER_PATH_VELOCITY.getJvmParamName());
		Assert.notBlank(fileResourceLoaderPath, "Velocity file.resource.loader.path özelliği null olamaz. " + ApplicationPropertyName.FOLDER_PATH_VELOCITY.getJvmParamName() + " atanmalı");
		result.put("resource.loader","classpath,file,string");
		result.put("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		result.put("classpath.resource.loader.cache","false");
		result.put(SgepConstants.VELOCITY_PROP_CLASSPATH_RESOURCE_LOADER_PATH, "/template/velocity/");
		result.put("file.resource.loader.class", FileResourceLoader.class.getName());
		result.put("file.resource.loader.cache","false");
		result.put("file.resource.loader.path", fileResourceLoaderPath);
		result.put("string.resource.loader.description","Velocity StringResource loader");
		result.put("string.resource.loader.class", StringResourceLoader.class.getName());
		result.put("string.resource.loader.repository.class", StringResourceRepositoryImpl.class.getName());
		result.put("string.resource.loader.cache", "false");
		result.put("string.resource.loader.repository.static", "false");
		result.put("input.encoding", SgepConstants.CHARSET_UTF_8);
		result.put("output.encoding", SgepConstants.CHARSET_UTF_8);
		result.put("eventhandler.referenceinsertion.class", QuietReferenceInsertionHandler.class.getName());
		return result;
	}
	
}
