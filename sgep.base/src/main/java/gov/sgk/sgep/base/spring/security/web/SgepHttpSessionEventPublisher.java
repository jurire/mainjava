package gov.sgk.sgep.base.spring.security.web;

import javax.servlet.http.HttpSessionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.session.HttpSessionEventPublisher;

import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
public class SgepHttpSessionEventPublisher extends HttpSessionEventPublisher {

	private static final Logger LOGGER = LoggerFactory.getLogger(SgepHttpSessionEventPublisher.class);
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		super.sessionCreated(event);
		LOGGER.info("SESSION: {} created", getSessioId (event));
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		super.sessionDestroyed(event);
		String sessionId = getSessioId (event);
		if (!SpringContextProvider.getSystemPropertiesWrapper().isApplicationInDevelopment()) {
			ILogService logService = SpringContextProvider.getContext().getBean(SgepConstants.BEAN_NAME_LOG_SERVICE_ASYNC, ILogService.class);
			logService.destroySession(sessionId);
			LOGGER.info("SESSION: {} destroyed and updated in Oturum table", sessionId);
		}
		LOGGER.info("SESSION: {} destroyed", sessionId);
	}

	private String getSessioId(HttpSessionEvent event) {
		return event.getSession().getId();
	}
	
}
