package gov.sgk.sgep.base.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import gov.sgk.sgep.base.api.dao.IDomainSecurityDAO;
import gov.sgk.sgep.base.api.model.auth.ASecModel;
import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.spring.Dao;

/**
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
@Dao
@Repository ("domainSecurityDAO")
public class DomainSecurityDAO extends BaseDAO implements IDomainSecurityDAO {
	
	@Override
	public void addRole(Role role) {
		addModel(role);
	}

	@Override
	public Role getRole(String id, String modulAdi) {
		return getSecModel(Role.class, id, modulAdi);
	}

	@Override
	public void updateRole(Role role) {
		updateModel(role);
	}

	@Override
	public Function getFunction(String id, String modulAdi) {
		return getSecModel(Function.class, id, modulAdi);
	}

	@Override
	public Menu getMenu(String id, String modulAdi) {
		return getSecModel(Menu.class, id, modulAdi);
	}
	
	/**
	 * 
	 * @param clazz
	 * @param id
	 * @param modulAdi
	 * @return Security modeli getirir
	 */
	@SuppressWarnings("unchecked")
	private <T extends ASecModel> T getSecModel (Class<T> clazz, String id, String modulAdi) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(clazz);
		crit.add(Restrictions.eq("id", id));
		crit.add(Restrictions.eq("modulAdi", modulAdi));
		crit.add(Restrictions.eq("aktifMi", true));
		return (T) crit.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	private <T extends ASecModel> List<T>  listSecModel (Class<T> clazz, String modulAdi) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(clazz);
		if (StringUtils.isNotBlank(modulAdi)) {
			crit.add(Restrictions.eq("modulAdi", modulAdi));
		}
		crit.add(Restrictions.eq("aktifMi", true));
		return crit.list();
	}

	@Override
	public Set<Menu> listMenu(String modulAdi) {
		return new TreeSet<>(listSecModel(Menu.class, modulAdi));
	}

	@Override
	public Set<Role> listRole(String modulAdi) {
		return new TreeSet<>(listSecModel(Role.class, modulAdi));
	}

	/**
	 * role isim ve modul adına göre arar
	 */
	@Override
	public boolean existsModel(ASecModel model) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(model.getClass());
		crit.add(Restrictions.eq("modulAdi", model.getModulAdi()));
		crit.add(Restrictions.eq("isim", model.getIsim()));
		crit.add(Restrictions.eq("aktifMi", true));
		Integer totalResult = ((Number)crit.setProjection(Projections.rowCount()).uniqueResult()).intValue();
		return totalResult > 0;
	}

}
