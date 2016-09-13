package gov.sgk.sgep.base.business.impl;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gov.sgk.sgep.base.api.NotLoggable;
import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.api.dao.ILogDAO;
import gov.sgk.sgep.base.api.model.auth.Oturum;
import gov.sgk.sgep.base.api.model.log.Log;
import gov.sgk.sgep.base.api.model.log.LogMethod;
import gov.sgk.sgep.base.business.BaseService;
import gov.sgk.sgep.base.spring.BusinessService;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@BusinessService
@Transactional (readOnly=true)
@Service (SgepConstants.BEAN_NAME_LOG_SERVICE)
@NotLoggable
public class LogService extends BaseService implements ILogService {
	
	@Autowired
	ILogDAO logDAO;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LogService.class);

	@Override
	public void createLog(Log log) {
		LOGGER.debug("create Log: " + log);
		addModel(log);
	}

	@Override
	public void deleteLog(Log log) {
		LOGGER.debug("delete Log: " + log);
	}

	@Override
	public void deleteLog(Serializable id) {
		LOGGER.debug("delete Log: " + id);
	}

	@Transactional (readOnly=false)
	@Override
	public void addOturum(Oturum oturum) {
		LOGGER.debug("Oturum: {} kaydedildi", oturum);
		logDAO.addModel(oturum);
	}

	@Override
	protected ILogDAO getDAO() {
		return logDAO;
	}

	/**
	 * 
	 * @param sessionId
	 * @return true oturum bulunduysa ve oturum kapanma zamanı atandıysa
	 */
	@Transactional (readOnly=false)
	@Override
	public void destroySession(String sessionId) {
		boolean result = getDAO().destroySession(sessionId);
		if (!result) {
			LOGGER.warn("SessionId: {} oturumu güncellenemedi. Oturumun kaydı Oturum tablosundan silinmiş olabilir.", sessionId);
		}
	}

	@Override
	public long getCountOfLog() {
		return getDAO().getCount(LogMethod.class, null);
	}

}
