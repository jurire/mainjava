package gov.sgk.sgep.base.api.business;

import java.io.Serializable;

import gov.sgk.sgep.base.api.model.auth.Oturum;
import gov.sgk.sgep.base.api.model.log.Log;

/**
 * 
 * @author o-mssahin
 *
 */
public interface ILogService {

	void createLog(Log log);
	
	void deleteLog(Log log);
	
	void deleteLog(Serializable id);
	
	void addOturum (Oturum oturum);
	
	void destroySession (String sessionId);

	long getCountOfLog ();

}
