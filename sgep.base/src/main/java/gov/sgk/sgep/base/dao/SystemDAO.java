package gov.sgk.sgep.base.dao;

import java.math.BigDecimal;
import java.util.Locale;

import org.apache.commons.lang3.math.NumberUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import gov.sgk.sgep.base.api.dao.ISystemDAO;
import gov.sgk.sgep.base.api.model.prm.Mesaj;
import gov.sgk.sgep.base.api.model.system.Kimlik;
import gov.sgk.sgep.base.spring.Dao;
import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
@Dao
@Repository ("systemDAO")
public class SystemDAO extends BaseDAO implements ISystemDAO {

	@Override
	public Mesaj getMesaj(String mesajNo, String modulAdi, Locale locale) {
		if (locale == null) {
			locale = SgepConstants.LOCALE_TURKISH; //TODO application default value'dan al 
		}
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(Mesaj.class);
		Assert.state(NumberUtils.isNumber(mesajNo), "mesaj kodu sayısal olmalı");
		crit.add(Restrictions.eq("mesajNo", Integer.parseInt(mesajNo)));
		crit.add(Restrictions.eq("modulAdi", modulAdi));
		return (Mesaj) crit.uniqueResult();
	}

	@Override
	public Kimlik getKimlik(BigDecimal tckn) {
	
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(Kimlik.class);
		
		crit.add(Restrictions.eq("tcKimlikNo",tckn));
		return (Kimlik) crit.uniqueResult();
	}

}
