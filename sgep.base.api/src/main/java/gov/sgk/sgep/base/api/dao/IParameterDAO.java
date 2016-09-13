package gov.sgk.sgep.base.api.dao;

import gov.sgk.sgep.base.api.model.prm.ParameterModel;

/**
 * 
 * @author o-mssahin
 * @since 10 Kas 2015
 *
 */
public interface IParameterDAO extends IBaseDAO {

	void updateParameter(ParameterModel model);

}
