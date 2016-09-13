package gov.sgk.sqep.test.base.web;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class BaseTestWebApplicationInitializer implements WebApplicationInitializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(BaseTestWebApplicationInitializer.class);
	
    @Override
    public void onStartup(ServletContext container) {
        // Create the 'root' Spring application context
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(BaseWebTestConfiguration.class);

        // Manage the lifecycle of the root application context
        container.addListener(new ContextLoaderListener(rootContext));
        LOGGER.info("initialized");
    }

}