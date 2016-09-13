package gov.sgk.sqep.test.base.spring.beans;

import org.springframework.stereotype.Repository;

import gov.sgk.sgep.base.dao.BaseDAO;
import gov.sgk.sgep.base.spring.Dao;

@Dao
@Repository ("testDAO")
public class TestDAO extends BaseDAO implements ITestDAO {

}
