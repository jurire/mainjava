package gov.sgk.sgep.base.dao;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import gov.sgk.sgep.base.api.dao.ILogDAO;
import gov.sgk.sgep.base.spring.Dao;

/**
 * 
 * @author o-mssahin
 *
 */
@Dao
@Repository ("logDAO")
public class LogDAO extends BaseDAO implements ILogDAO {

	@Override
	public boolean destroySession(String sessionId) {
		String sql = "update Oturum set oturumSonlanmaZamani = :osz where id = :id";
		Query query = this.createQuery(sql);
		query.setParameter("id", sessionId);
		query.setParameter("osz", new Timestamp(new Date().getTime()));
		int result = query.executeUpdate();
		return result > 0;
	}

}
