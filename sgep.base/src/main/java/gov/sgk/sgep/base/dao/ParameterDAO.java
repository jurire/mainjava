package gov.sgk.sgep.base.dao;

import org.springframework.stereotype.Repository;

import gov.sgk.sgep.base.api.dao.IParameterDAO;
import gov.sgk.sgep.base.api.model.prm.ParameterModel;
import gov.sgk.sgep.base.spring.Dao;

/**
 * 
 * @author o-mssahin
 * @since 10 Kas 2015
 *
 */
@Dao
@Repository ("parameterDAO")
public class ParameterDAO extends BaseDAO implements IParameterDAO {

	@Override
	public void updateParameter(ParameterModel model) {
		updateModel(model);
	}

}
