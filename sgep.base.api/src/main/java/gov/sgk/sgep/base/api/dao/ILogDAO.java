package gov.sgk.sgep.base.api.dao;

/**
 * 
 * @author o-mssahin
 *
 */
public interface ILogDAO extends IBaseDAO {

	boolean destroySession (String sessionId);
	
}
