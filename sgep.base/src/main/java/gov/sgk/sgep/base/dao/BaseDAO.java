package gov.sgk.sgep.base.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;

import gov.sgk.sgep.base.api.dao.IBaseDAO;
import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.model.prm.ParameterModel;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;
import gov.sgk.sgep.base.utility.BaseUtility;
import gov.sgk.sgep.utility.SortOrder;

/**
 * Data access object (DAO) kalıcılığı sağlayan kaynakla doğrudan bağlantı kuran yapıya denir.<br>
 * BaseDAO bu yapılan baba sınıfıdır.  {@link SessionFactory} 'ye doğrudan erişen bu sınıftır.<br>
 * 
 * Çocuk sınıflarda dao'yu bean olarak kullanmak için aşağıdaki tanım yapmalısınız. xxxDAO bean'e verilen isimdir.
 * Spring bu isimle tutar bu dao bean'ini. {@literal @}Dao tanımı ise projenin hangi bean'lerinin dao olduğunu bilmesi için 
 * eklenmesi gereken bir işarettir. İşlevsel olarak bir geçerliliği yoktur.
 *  
 * <pre>
 * {@literal @}Dao
 * {@literal @}Repository ("xxxDAO")
 * </pre>
 * @author o-mssahin
 * @since 5 Eki 2015
 *
 */
public abstract class BaseDAO implements IBaseDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	protected SystemPropertiesWrapper systemPropertiesWrapper;	
	
	@Override
	public void addModel(ACommon model) {
		getCurrentSession().save(model);	
	}

	@Override
	public void updateModel(ACommon model) {
		Session session = getCurrentSession();
		session.update(model);
		session.flush();
	}

	@Override
	public void deleteModel(ACommon model) {
		getCurrentSession().delete(model);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends ACommon> T getModelById(Class<T> clazz, Serializable id) {
		if (id == null) {
			return null;
		}
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(clazz);
//		Class<?> idClass = BaseUtility.getClassOfProperty(clazz, "id");
//		Object idValue = null;
//		try {
//			idValue = idClass.getConstructor(String.class).newInstance(Objects.toString(id, "0"));
//		} catch (Exception e) {
//			throw new BaseError(e.getMessage());
//		}
		crit.add(Restrictions.eq("id", id));
		if (ClassUtils.isAssignable(clazz, ParameterModel.class)) {
			crit.add(Restrictions.eq("aktifMi", true));
		}
		return (T) crit.uniqueResult();
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public <T extends ACommon> T getModelById(Class<T> clazz, String id) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(clazz);
		crit.add(Restrictions.eq("id", id));
		if (ClassUtils.isAssignable(clazz, ParameterModel.class)) {
			crit.add(Restrictions.eq("aktifMi", true));
		}
		return (T) crit.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends ACommon> Collection<T> getAll(Class<T> clazz) {
		Session session = getSessionFactory().getCurrentSession();
		Criteria crit = session.createCriteria(clazz);
		return crit.list();
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected Session getCurrentSession (){
		return getSessionFactory().getCurrentSession();
	}

	/**
	 * hql
	 */
	public Query createQuery(String query) {
		return getCurrentSession().createQuery(query);
	}

	/**
	 * native sql
	 */
	protected SQLQuery createSQLQuery(String query) {
		return getCurrentSession().createSQLQuery(query);
	}

	@Override
	public List<?> getAll(Class<?> clazz, int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Serializable> filters) {
		Criteria crit = getCurrentSession().createCriteria(clazz);
		crit.setFirstResult(first);
		crit.setFetchSize(pageSize);
		crit.setMaxResults(pageSize);
		addFiltersToCriteria(clazz, crit, filters);
		Order order = createOrder(sortField, sortOrder);
		if (order != null) {
			crit.addOrder(order);
		}
		return crit.list();
	}
	
	@Override
	public <T extends ACommon> boolean existsModelById(Class<T> clazz, Serializable id) {
		Criteria crit = getCurrentSession().createCriteria(clazz);
		crit.add(Restrictions.eq("id", id));
		return getRowCount(crit) > 0;
	}
	
	protected int getRowCount(Criteria crit) {
		int totalResult = ((Number)crit.setProjection(Projections.rowCount()).uniqueResult()).intValue();
		return totalResult;
	}

	@Override
	public int getCount(Class<?> clazz, Map<String, Serializable> filters) {
		Criteria crit = getCurrentSession().createCriteria(clazz);
		return getRowCount(crit);
	}
	
	@SuppressWarnings("unchecked")
	protected Criteria addFiltersToCriteria(Class<?> clazz, Criteria crit, Map<String, Serializable> filters) {
		if (MapUtils.isEmpty(filters)) {
			return crit;
		}
		/*
		for (String propName : filters.keySet()) {
			Object value = filters.get(propName);
			Class<?> propClass = BaseUtility.getClassOfProperty(clazz, propName);
			if (ClassUtils.isAssignable(propClass, String.class)) {
				crit.add(Restrictions.ilike(propName, (String)value, MatchMode.START));
			} else if (ClassUtils.isAssignable(propClass, Number.class)){
				Object valueAsNumber = BaseUtility.createNumber((Class<Number>)propClass, value.toString());
				crit.add(Restrictions.eqOrIsNull(propName, valueAsNumber));
			} else if (ClassUtils.isAssignable(propClass, Date.class)){
				Date valueAsDate = Utility.parseDate(value.toString());
				crit.add(Restrictions.ge(propName, Utility.setDate(valueAsDate, 0, 0, 0)));
				crit.add(Restrictions.le(propName, Utility.setDate(valueAsDate, 23, 59, 59, 999)));
			}
		}
		*/
		for (String propName : filters.keySet()) {
			Object value = filters.get(propName);
			Class<?> propClass = BaseUtility.getClassOfProperty(clazz, propName);
			if (StringUtils.indexOf(propName, ".") > 0) {
				propName = addAliasToCriteriaAndChangePropName (crit, propName);
			}
			Filter filter = new Filter(value, propName, propClass);
			filter.addToCriteria(crit);
			
		}
		return crit;
	}
	
	/**
	 * 
	 * @param crit
	 * @param propName "." ile gelebilir, bu durumda herbirine alias ekleniyor
	 * @return
	 */
	public static String addAliasToCriteriaAndChangePropName(Criteria crit, String propName) {
		String [] rand = new String [5];
		RandomAlias ra = new RandomAlias();
		for (int i = 0; i < rand.length; i++) {
			rand [i] = ra.random();
		}
		String result = propName;
		if (StringUtils.indexOf(propName, ".") > 0) {
			String [] propArr = StringUtils.split(propName, ".");
			String alias = "";
			for (int i = 0; i < propArr.length - 1; i++) {
				String newProp = StringUtils.isEmpty(alias) ? propArr [i] : alias + "." + propArr[i];
				alias = rand [i];
				crit.createAlias(newProp, alias);
			}
			result = alias + "." + propArr[propArr.length - 1];
		}
		
		return result;
	}
	
	static class RandomAlias  {
		 StringBuilder sb = new StringBuilder("abcdefghijkl");
		 String random () {
			 shuffle(sb);
			 return sb.toString();
		 }
	
		public void shuffle(StringBuilder sb) {
			Random rand = new Random();
			for (int i = sb.length() - 1; i > 1; i--) {
				int swapWith = rand.nextInt(i);
				char tmp = sb.charAt(swapWith);
				sb.setCharAt(swapWith, sb.charAt(i));
				sb.setCharAt(i, tmp);
			}
		}
	}
	
	@Override
	public Map<String, ClassMetadata> mapAllClassMetadata () {
		return sessionFactory.getAllClassMetadata();
	}
	
	
	/**
	 * {@link SortOrder}'dan hibernate'in anlayacağı {@link Order} a çevirir
	 * @param fieldName
	 * @param sortOrder
	 * @return
	 */
	public static Order createOrder (String fieldName, SortOrder sortOrder){
		Order result = null;
		if (StringUtils.isBlank(fieldName)) {
			return null;
		}
		if (SortOrder.ASCENDING.equals(sortOrder)) {
			result = Order.asc(fieldName);
		} else if (SortOrder.DESCENDING.equals(sortOrder)) {
			result = Order.desc(fieldName);
		} 
		return result;
	}
	
}
