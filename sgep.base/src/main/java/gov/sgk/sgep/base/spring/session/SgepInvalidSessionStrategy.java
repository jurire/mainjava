package gov.sgk.sgep.base.spring.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.security.web.session.InvalidSessionStrategy;

/**
 * 
 * @author o-mssahin
 * @since 2 Kas 2015
 *
 */
public class SgepInvalidSessionStrategy implements InvalidSessionStrategy {

	@Override
	public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		LoggerFactory.getLogger(SgepInvalidSessionStrategy.class).info("Invalida Session Detected");
	}

}
