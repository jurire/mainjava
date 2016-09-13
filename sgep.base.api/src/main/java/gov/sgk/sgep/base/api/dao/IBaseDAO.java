package gov.sgk.sgep.base.api.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.metadata.ClassMetadata;

import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.utility.SortOrder;

/**
 * 
 * @author o-mssahin
 * @since 5 Eki 2015
 *
 */
public interface IBaseDAO {
	/**
	 * AModel'i veri tabanına ekler
	 *
	 * @param model
	 *            {@link ACommon}
	 */
	void addModel(ACommon model);

	/**
	 * Update Test
	 *
	 * @param model
	 *            {@link AModel}
	 */
	void updateModel(ACommon model);

	/**
	 * Delete Test
	 *
	 * @param Test
	 *            Test
	 */
	void deleteModel(ACommon model);

	/**
	 * Get Base model<br>
	 * id modelin sınıfının id tipine dönüştürülür. Eğer null ise null döner.
	 * @param id
	 *            {@link AModel} Id
	 */
	<T extends ACommon> T getModelById(Class<T> clazz, Serializable id);
	
	<T extends ACommon> boolean existsModelById(Class<T> clazz, Serializable id);

	
	/**
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 */
	<T extends ACommon> T getModelById(Class<T> clazz, String id);

	/**
	 * Get {@link AModel} List
	 *
	 */
	<T extends ACommon> Collection<T> getAll(Class<T> clazz);
	
	List<?> getAll(Class<?> clazz, int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Serializable> filters);
	
	int getCount(Class<?> clazz, Map<String, Serializable> filters);

	/**
	 * Hibernate'deki entity sınıflarıyla ilgili bütün bilgileri içerir
	 * @return
	 */
	Map<String, ClassMetadata> mapAllClassMetadata();
	
}

