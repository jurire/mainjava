package gov.sgk.sgep.base.business.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.NotLoggable;
import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.api.model.auth.Oturum;
import gov.sgk.sgep.base.api.model.log.Log;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Log servisin işlemlerini async olarak gerçekleştirir<br>
 * Configuration sınıfında {@literal @}EnableAsync işareti olması gerekir 
 * @author o-mssahin
 *
 */
@Service (SgepConstants.BEAN_NAME_LOG_SERVICE_ASYNC)
@Async (SgepConstants.BEAN_NAME_LOG_SERVICE_TASK_EXECUTOR)
@NotLoggable
public class LogServiceAsync implements ILogService {

	@Autowired @Qualifier (SgepConstants.BEAN_NAME_LOG_SERVICE)
	ILogService delegate;
	
	@Override	
	public void createLog(Log log) {
		delegate.createLog(log);
	}

	@Override
	public void deleteLog(Log log) {
		delegate.deleteLog(log);
	}

	@Override
	public void deleteLog(Serializable id) {
		delegate.deleteLog(id);
	}

	@Override
	public void addOturum(Oturum oturum) {
		delegate.addOturum(oturum);
	}

	@Override
	public void destroySession(String sessionId) {
		delegate.destroySession(sessionId);
	}

	@Override
	public long getCountOfLog() {
		return delegate.getCountOfLog();
	}


}
