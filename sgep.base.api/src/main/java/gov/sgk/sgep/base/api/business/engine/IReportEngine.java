package gov.sgk.sgep.base.api.business.engine;

import java.io.Serializable;
import java.util.Map;

/**
 * 
 * @author o-mssahin
 *
 */
public interface IReportEngine {

	byte [] getIgbDokum (Map<String, Serializable> map);
	
}
