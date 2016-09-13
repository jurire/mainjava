package gov.sgk.sgep.base.business.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ClassUtils;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import gov.sgk.sgep.base.api.business.IParameterService;
import gov.sgk.sgep.base.api.dao.IParameterDAO;
import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.model.prm.ParameterModel;
import gov.sgk.sgep.base.api.model.prm.ParameterType;
import gov.sgk.sgep.base.business.BaseService;
import gov.sgk.sgep.base.spring.BusinessService;
import gov.sgk.sgep.base.spring.message.IMessageSource;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
@BusinessService
@Transactional (readOnly=true)
@Service ("parameterService")
public class ParameterService extends BaseService implements IParameterService {

	@Autowired
	IParameterDAO parameterDAO;
	
	@Autowired
	@Qualifier (value=SgepConstants.BEAN_NAME_LABEL_SOURCE)
	IMessageSource labelMessageSource;
    
	@SuppressWarnings("unchecked")
	@Transactional (propagation=Propagation.NEVER)
	@Override
	@Cacheable (value=SgepConstants.CACHE_BASE)
	public List<ParameterType> listParameterType(String ad, String id) {
        List<ParameterType> result = new ArrayList<>();
		Map<String, ClassMetadata> map = mapAllClassMetadata();
		for (String className : map.keySet()) {
			Class<? extends ACommon> clazz = map.get(className).getMappedClass();
			if (ClassUtils.isAssignable(clazz, ParameterModel.class)) {
				//Hibernate table annotasyonundan sınıf adını okuyor.
				//Table tableAnno = org.springframework.core.annotation.AnnotationUtils.findAnnotation(clazz, Table.class);
				String title = labelMessageSource.getMessage("tb." + className); 
	            result.add(new ParameterType(className, title, clazz)); //classname üfürükten ,title önemli
			}
		}
		
        return result;
	}

	@Override
	public <T extends ACommon> List<T> getAll(Class<T> clazz) {
		//return (List<T>) listParameterType(null, null);
		return super.getAll(clazz);
	}

	@Override
	public <T extends ACommon> T getModelById(Class<T> clazz, Serializable id) {
		return super.getModelById(clazz, id);
	}

	@Override
	protected IParameterDAO getDAO() {
		return parameterDAO;
	}

	@Transactional (readOnly=false)
	@Override
	public void updateParameter(ParameterModel model) {
		getDAO().updateParameter (model);
	}

}
