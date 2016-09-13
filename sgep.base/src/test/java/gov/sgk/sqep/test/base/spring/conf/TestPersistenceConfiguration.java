package gov.sgk.sqep.test.base.spring.conf;

import java.io.IOException;
import java.util.Arrays;

import javax.sql.DataSource;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import gov.sgk.sgep.base.api.utility.exception.BaseError;
import gov.sgk.sgep.base.spring.APersistenceConfiguration;

/**
 * 
 * @author o-mssahin
 * @since 15 Eki 2015
 *
 */
@Configuration
@PropertySource(value = { "classpath:database-properties.xml","classpath:hibernate-properties.xml" })
public class TestPersistenceConfiguration extends APersistenceConfiguration {

	@Override
	protected String[] packagesToScan() {
		LOGGER.info("packages to scan");
		return new String[] {
			"gov.sgk.sgep.base.api.model.prm", 
			"gov.sgk.sgep.base.api.model.auth",
			"gov.sgk.sqep.test.base.spring.model",
			"gov.sgk.sgep.base.api.model.log"
		};
	}

	@Override
	protected void afterCreationOfDatasource(DataSource dataSource) {
		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
		String defaultSchema = environment.getProperty("hibernate.default_schema", "");
		String[] sqlInitializationScriptFiles = { "test-create-schema.sql" };
		LOGGER.info("{} sqlInitializationScripts calisitiriliyor", Arrays.deepToString(sqlInitializationScriptFiles));
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		PathMatchingResourcePatternResolver res = new PathMatchingResourcePatternResolver(classLoader);
		for (String sqlScriptFile : sqlInitializationScriptFiles) {
			Resource sqlScriptResource = res.getResource(sqlScriptFile);
			if (StringUtils.isNotEmpty(defaultSchema)) {
				String content;
				try {
					content = IOUtils.toString(sqlScriptResource.getInputStream(), "UTF-8");
				} catch (IOException e) {
					throw new BaseError(e);
				}
				sqlScriptResource = new ByteArrayResource(StringUtils.replace(content, "%SCHEMA_NAME%", defaultSchema).getBytes());
			} else {
				throw new BaseError("test-create-schema.sql'de %SCHEMA_NAME% değerini set edecek ne JVM parametersi ne de hibernate properties dosyasında değer var. hibernate.default_schema değerini yazın");
			}
			populator.addScript(sqlScriptResource);
		}
		DatabasePopulatorUtils.execute(populator, dataSource);
	}

	@Override
	public boolean isDbJndiDisabled() {
		return true;
	}

}
