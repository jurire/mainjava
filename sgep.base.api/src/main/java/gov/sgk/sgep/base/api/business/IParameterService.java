package gov.sgk.sgep.base.api.business;

import java.util.List;

import gov.sgk.sgep.base.api.model.prm.ParameterModel;
import gov.sgk.sgep.base.api.model.prm.ParameterType;

public interface IParameterService extends IBaseService {

	List<ParameterType> listParameterType (String ad, String id);
	
	void updateParameter (ParameterModel model);
	
}
