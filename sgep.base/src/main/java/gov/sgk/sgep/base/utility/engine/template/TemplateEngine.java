package gov.sgk.sgep.base.utility.engine.template;

import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.tools.generic.DateTool;
import org.apache.velocity.tools.generic.NumberTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.ui.velocity.VelocityEngineUtils;

import gov.sgk.sgep.base.api.utility.ApplicationPropertyName;
import gov.sgk.sgep.base.api.utility.ITemplateEngine;
import gov.sgk.sgep.base.api.utility.exception.BaseError;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;
import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.SgepConstants;
import gov.sgk.sgep.utility.Utility;

/**
 * Velocity işlemleri 
 * @author sinans
 *
 */
public class TemplateEngine implements ITemplateEngine, InitializingBean {

	protected static Logger logger = LoggerFactory.getLogger(TemplateEngine.class);

	@Autowired
	VelocityEngine velocityEngine;

	@Autowired
	SystemPropertiesWrapper systemPropertiesWrapper;

	private String resourceClassPathRoot = "";
	private String resourceFileLoaderRoot = "";

	@Override
	public String evaluate(String metin, Map<String, Object> map, String sablonId) {
		Assert.notEmpty(metin, "Metin boş olamaz");
		Assert.notEmpty(sablonId, "SablonId boş olamaz. LogTag olarak kullanılmaktadır. Herhangi bir karakter dizisi gönderebilirsiniz.");

		String sonuc = null;
		if (map == null) {
			map = new HashMap<>();
		}

		/** Test için eklendi**/
		if (map.containsKey("date")) {
			map.put("date", map.get("date"));
		}
		/** Test için eklendi**/
		if (map.containsKey("money")) {
			map.put("money", new BigDecimal(map.get("money").toString()));
		}

		SpringContextProvider.getSystemPropertiesWrapper().getApplicationId();
		
		map.put("applicationId", systemPropertiesWrapper.getApplicationId());
		map.put("applicationMode", systemPropertiesWrapper.getApplicationMode());
		map.put("applicationName", systemPropertiesWrapper.getApplicationName());
		map.put("applicationWebLink", systemPropertiesWrapper.getApplicationLink());
		map.put("DT", new DateTool());
		map.put("NT", new NumberTool());
//		map.put("PST", new ParaSayiTool());
		
		addBeansToMap(map);
		
		VelocityContext context = new VelocityContext(map);		
		StringWriter writer = new StringWriter();
		boolean evaluateSonuc = false;
		try {
			evaluateSonuc = velocityEngine.evaluate(context, writer, sablonId, metin);
		} catch (Exception e) {
			throw new BaseError(e);
		}
		if (!evaluateSonuc) {
			throw new BaseError("Velocity Hata. Çalışma Zamanı hatalarına bakınız.");
		}
		sonuc = writer.toString();
		IOUtils.closeQuietly(writer);
		return sonuc;
	}

	public String getTemplateLocationClass (String resourceName) {
		return String.format("%s_%s.vm", resourceClassPathRoot + resourceName, systemPropertiesWrapper.getDefaultLocale());	
	}

	@Override
	public String getTemplateLocationClassWithoutLocale(String resourceName) {
		return String.format("%s.vm", resourceClassPathRoot + resourceName);			
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		if (StringUtils.isNotEmpty(getResourceClassPathRoot())) {
			return;
		}
		String classPath = velocityEngine.getProperty("classpath.resource.loader.path").toString();
		String filePath = velocityEngine.getProperty("file.resource.loader.path").toString();		
		if (StringUtils.isEmpty(classPath)) {
			classPath  = "/";
		}
		this.setResourceClassPathRoot(classPath);
		this.setResourceFileLoaderRoot(filePath);
		copyTemplatesToFolder();
	}

	public String getResourceClassPathRoot() {
		return resourceClassPathRoot;
	}

	public void setResourceClassPathRoot(String resourceClassPathRoot) {
		this.resourceClassPathRoot = resourceClassPathRoot;
	}

	@Override
	public void mergeTemplate(String templateLocation, String encoding, Map<String, Object> model, Writer writer) {
		addBeansToMap(model);
		VelocityEngineUtils.mergeTemplate(velocityEngine, templateLocation, encoding, model, writer);
	}

	/**
	 * encoding olarak default UTF-8 gönderilir
	 */
	@Override
	public void mergeTemplate(String templateLocation, Map<String, Object> model, Writer writer) {
		this.mergeTemplate(templateLocation, SgepConstants.CHARSET_UTF_8, model, writer);
	}

	@Override
	public String mergeTemplateIntoString(String templateLocation, String encoding, Map<String, Object> model) {
		addBeansToMap(model);
		return VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, templateLocation, encoding, model);
	}
	
	@Override
	public String mergeTemplateIntoString(String templateLocation, Map<String, Object> model) {
		return this.mergeTemplateIntoString(templateLocation, SgepConstants.CHARSET_UTF_8, model);
	}

	/**
	 * velocity içinde kullanmak için bütün bean'ler context'e eklenir<br>
	 * Static'leri de ekler, kullanmak istediğiniz statiği ekleyin
	 * @param map
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void addBeansToMap (Map map) {
		if (map != null) {
			map.put("StringUtils", StringUtils.class);
			map.put("Utility", Utility.class);
			map.put("ArrayUtils", ArrayUtils.class);
			map.put("CollectionUtils", CollectionUtils.class);
			map.put("appCtx", SpringContextProvider.getContext());
//			Map<String, Object> serviceBeanMap = ServiceProvider.getBeanMapWithAnnotation(new Class[]{DomainService.class, UtilityService.class});
//			map.putAll(serviceBeanMap);			
		}
	}

	@Override
	public void mergeTemplateByNameWithoutLocale(String templateName, Map<String, Object> model, Writer writer) {
		String templateLocation = !templateName.endsWith(".vm") ? templateName + ".vm" : templateName;  
		try {
			mergeTemplate(templateLocation, model, writer);			
		} catch (Exception e) {
			logger.error(e.getMessage());	
			logger.info(templateLocation + " için classpath'e bakılıyor...");
			templateLocation = getTemplateLocationClassWithoutLocale(templateName);
			mergeTemplate(templateLocation, model, writer);
		}
	}

	@Override
	public String getResourceFilePathRoot() {
		return resourceFileLoaderRoot;
	}

	public String getResourceFileLoaderRoot() {
		return resourceFileLoaderRoot;
	}

	public void setResourceFileLoaderRoot(String resourceFileLoaderRoot) {
		this.resourceFileLoaderRoot = resourceFileLoaderRoot;
	}

	@Override
	public String getTemplateLocationFile(String resourceName) {
		if (!resourceFileLoaderRoot.trim().endsWith("/")) {
			resourceName = "/" + resourceName;
		}
		return String.format("%s_%s.vm", resourceFileLoaderRoot + resourceName, systemPropertiesWrapper.getDefaultLocale());	
	}

	@Override
	public String getTemplateLocationFileWithoutLocale(String resourceName) {
		if (!resourceFileLoaderRoot.trim().endsWith("/")) {
			resourceName = "/" + resourceName;
		}
		return String.format("%s.vm", resourceFileLoaderRoot + resourceName);
	}

	@Override
	public void mergeTemplateByName(String templateName, Map<String, Object> model, Writer writer) {
		String templateLocation = String.format("%s_%s.vm", templateName, systemPropertiesWrapper.getDefaultLocale());	
		try {
			mergeTemplate(templateLocation, model, writer);			
		} catch (Exception e) {
			logger.error(e.getMessage());	
			logger.info(templateLocation + " için classpath'e bakılıyor...");
			templateLocation = getTemplateLocationClass(templateName);
			mergeTemplate(templateLocation, model, writer);
		}
	}

	private void copyTemplatesToFolder () {
		String dizinStr = systemPropertiesWrapper.getProperty(ApplicationPropertyName.FOLDER_PATH_VELOCITY.getJvmParamName());
		File dizin = new File(dizinStr);
		dizin.mkdirs();
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			PathMatchingResourcePatternResolver res = new PathMatchingResourcePatternResolver(classLoader);
			org.springframework.core.io.Resource [] scriptler = res.getResources(velocityEngine.getProperty(SgepConstants.VELOCITY_PROP_CLASSPATH_RESOURCE_LOADER_PATH) + "*.vm");
			for (org.springframework.core.io.Resource script : scriptler) {
				InputStream is = script.getInputStream();
				String dosyaYol = dizinStr + File.separator + script.getFilename();
				logger.debug("Yazılan velocity template: " + dosyaYol);
				FileUtils.copyInputStreamToFile(is, new File(dosyaYol)); //is stream kapatılıyor
			}
			logger.info("Velocity sablonlar " + dizinStr + " dizinine yazıldı");
		} catch (Exception e) {
			logger.error(Utility.toString(e));
		}	
	}

}
