package gov.sgk.sgep.base.utility.engine.rule.openl;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;
import org.openl.rules.runtime.RulesEngineFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import gov.sgk.sgep.base.api.business.engine.IRuleEngine;
import gov.sgk.sgep.base.api.business.engine.OpenLRuleContext;
import gov.sgk.sgep.base.api.business.engine.RuleContext;
import gov.sgk.sgep.base.utility.engine.rule.TempFolder;
import gov.sgk.sgep.utility.Assert;

/**
 * Gerçek işi yapan kural motoru, OpenL-tablets
 * @author o-mssahin
 *
 */
@Component ("ruleEngineOpenLTablets")
public class RuleEngineOpenLTablets implements IRuleEngine, InitializingBean {

	private static Logger LOGGER = LoggerFactory.getLogger(RuleEngineOpenLTablets.class);
	
	TempFolder tf;
	
	@Override
	public <T> T execute(RuleContext<T> context) {
		Assert.state (context instanceof OpenLRuleContext, "context OpenLRuleContext'den türemeli.");
		OpenLRuleContext<T> ruleContext = (OpenLRuleContext<T>)context;
		//TODO tablo xls'lerin ortak bir yerden al
		//Date date = context.ruleDate();
		RulesEngineFactory<?> rulesFactory = new RulesEngineFactory<>(tf.getFilePath(context.ruleId()));		
		return invokeMethod(rulesFactory, ruleContext, ruleContext.getArgs());
	}
	
	@SuppressWarnings("unchecked")
	private <T> T invokeMethod(RulesEngineFactory<?> rulesFactory, OpenLRuleContext<T> ruleContext, Object... args) {
		Object rules = rulesFactory.newEngineInstance();
		Class<?> clazz = rulesFactory.getInterfaceClass();
		String methodName = ruleContext.getMethodName ();
		Class<?>[] parameterTypes = ruleContext.getParameterTypes ();
		try {
			Method method = clazz.getMethod(methodName, parameterTypes);
			LOGGER.info("Executing context: {}", ruleContext);			
			return (T) method.invoke(rules, args);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		tf = new TempFolder("openl-rules").create();		
		LOGGER.info(ruleEngineName() + " create as rule engine");
		adjustFiles(tf);
	}

	@Override
	public String ruleEngineName() {
		return this.getClass().getSimpleName();
	}

	/**
	 * bütün xslx dosyaları classpath'de duruyor. Openl-tablets'in classpath'den okunacak şekilde contstructor'ı bulunamadı.
	 * Dolayısıyla classpath'deki dosyaların hepsi 
	 * @throws IOException 
	 */
	private void adjustFiles (TempFolder tf) throws IOException {
		InputStream is = ClassLoader.getSystemResourceAsStream("openl-rules");
		StringWriter sFiles = new StringWriter();
		IOUtils.copy(is, sFiles);
		Scanner scanner = new Scanner(sFiles.toString());
		try {
			while (scanner.hasNextLine()) {
				String fileName = scanner.nextLine();
				tf.addFile(fileName);
			}
		} finally {
			scanner.close();
		}
	}

	
}
