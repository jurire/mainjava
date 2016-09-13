package gov.sgk.sgep.base.dao;

import java.util.Collection;
import java.util.Date;

import org.apache.commons.lang3.ClassUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import gov.sgk.sgep.base.utility.BaseUtility;
import gov.sgk.sgep.utility.Utility;

public class Filter {
	private Object value;
	private String propName;
	private Class<?> propClass;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getPropName() {
		return propName;
	}

	public void setPropName(String propName) {
		this.propName = propName;
	}

	public Class<?> getPropClass() {
		return propClass;
	}

	public void setPropClass(Class<?> propClass) {
		this.propClass = propClass;
	}

	public Filter(Object value, String propName, Class<?> propClass) {
		super();
		this.value = value;
		this.propName = propName;
		this.propClass = propClass;
		init();
	}

	private void init() {
	}

	public boolean isPropertyString() {
		return ClassUtils.isAssignable(propClass, String.class);
	}

	public boolean isPropertyNumber() {
		return ClassUtils.isAssignable(propClass, Number.class);
	}

	public boolean isPropertyDate() {
		return ClassUtils.isAssignable(propClass, Date.class);
	}
	
	public boolean isValueCollectionOrArray () {
		return isValueCollection() || isValueArray();
	}
	
	public boolean isValueCollection() {
		return value instanceof Collection;
	}
	
	public boolean isValueArray () {
		return value instanceof Object[];
	}
	
	@SuppressWarnings("unchecked")
	public Criteria addToCriteria(Criteria crit) {
		if (!isValueCollectionOrArray()) {
			if (this.isPropertyString()) {
				crit.add(Restrictions.ilike(propName, (String)value, MatchMode.START));
			} else if (this.isPropertyNumber()){
				Object valueAsNumber = BaseUtility.createNumber((Class<Number>)propClass, value.toString());
				crit.add(Restrictions.eqOrIsNull(propName, valueAsNumber));
			} else if (this.isPropertyDate()) {
				Date valueAsDate = Utility.parseDate(value.toString());
				crit.add(Restrictions.ge(propName, Utility.setDate(valueAsDate, 0, 0, 0)));
				crit.add(Restrictions.le(propName, Utility.setDate(valueAsDate, 23, 59, 59, 999)));
			}
		} else if (isValueArray()) {
			crit.add(Restrictions.in(propName, (Object[])value));
		} else if (isValueCollection()) {
			crit.add(Restrictions.in(propName, (Collection<?>)value));
		}

		return crit;		
	}

}