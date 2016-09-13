package gov.sgk.sgep.base.api.business;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.metadata.ClassMetadata;

import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.utility.QueryResult;

/**
 * 
 * @author o-mssahin
 * @since 2 Eki 2015
 *
 */
public interface IBaseService {
	/**
	 * Add {@link ACommon}
	 *
	 * @param model
	 *            {@link ACommon}
	 */
	void addModel(ACommon model);

	/**
	 * Update Test
	 *
	 * @param model
	 *            {@link ACommon}
	 */
	void updateModel(ACommon model);

	void deleteModel(ACommon model);
	
	/**
	 * 
	 * @param model
	 * @param permanently
	 */
	void deleteModel(ACommon model, boolean permanently);
	
	/**
	 * 
	 * @param clazz
	 * @param id
	 */
	void deleteModel(Class<? extends ACommon> clazz, Serializable id);

	/**
	 * 
	 * @param clazz
	 * @param id
	 * @param permanently
	 */
	void deleteModel(Class<? extends ACommon> clazz, int id, boolean permanently);
	
	/**
	 * Get {@link ACommon}
	 * @param clazz Getirilecek sınıf
	 * @param id 
	 */
	<T extends ACommon> T getModelById(Class<T> clazz, Serializable id);
	
	/**
	 * Get {@link ACommon} List
	 *
	 * @return List - {@link ACommon} list
	 */
	<T extends ACommon> List<T> getAll(Class<T> clazz);
	
	<T extends ACommon> QueryResult<T> getAll (Class<T> clazz, int first, int pageSize, String sortField, gov.sgk.sgep.utility.SortOrder sortOrder, Map<String, Serializable> filters);
	
	
	Map<String, ClassMetadata> mapAllClassMetadata();
	
}
