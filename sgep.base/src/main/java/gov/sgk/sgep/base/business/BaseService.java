package gov.sgk.sgep.base.business;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.metadata.ClassMetadata;
import org.springframework.transaction.annotation.Transactional;

import gov.sgk.sgep.base.api.business.IBaseService;
import gov.sgk.sgep.base.api.dao.IBaseDAO;
import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.utility.QueryResult;
import gov.sgk.sgep.utility.SortOrder;

/**
 * {@link BaseService} bütün transactional servislerin baba sınıfıdır. Dao sınıflarını kullanarak
 * veri tabanı işlemlerini yapar.<br/>
 * Extend eden sınıf aşağıdaki belirteçleri eklemesi gerekir<br/>
 * <pre>
 * {@literal @}BusinessService
 * {@literal @}org.springframework.transaction.annotation.Transactional (readOnly=true)
 * {@literal @}Service ("xxxService")
 * </pre>
 * readOnly=true ifadesi bütün metotların veri değiştiremez olduğun gösterir. Eklenen metot veri değiştirecekse
 * {@literal @}Transactional (readOnly=false) olarak değiştirmelisiniz.
 * 
 * @author o-mssahin
 * @since 5 Eki 2015
 *
 */
public abstract class BaseService implements IBaseService {

	@Transactional (readOnly=false)
	@Override
	public void addModel(ACommon model) {
		getDAO().addModel(model);
	}

	@Override
	public void updateModel(ACommon model) {
		getDAO().updateModel(model);
	}

	/**
	 * Geçici olarak modeli silindi olarak işaretler.
	 * {@link ACommon#isAktifMi()} alanını false yapar ve günceller
	 * @param model
	 *            {@link ACommon}
	 */
	@Override
	public void deleteModel(ACommon model) {
		deleteModel(model, false);
	}
	
	/**
	 * Geçici olarak modeli silindi olarak işaretler.
	 * {@link ACommon#isAktifMi()} alanını false yapar ve günceller
	 * @param model
	 *            {@link ACommon}
	 * @param permanently true ise model'i geri dönülmemek üzere siler, aksi durumda silindi olarak işaretler
	 */
	@Override
	public void deleteModel(ACommon model, boolean permanently) {
//		if (permanently) {
//			getDAO().deleteModel(model);			
//		} else {
//			model.setAktifMi(false);
//			updateModel(model);
//		}
		getDAO().deleteModel(model);			
	}

	@Override
	public void deleteModel(Class<? extends ACommon> clazz, Serializable id) {
		deleteModel(getModelById(clazz, id));
	}
	
	@Override
	public void deleteModel(Class<? extends ACommon> clazz, int id, boolean permanently) {
		deleteModel(getModelById(clazz, id), permanently);
	}

	@Override
	public <T extends ACommon> List<T> getAll(Class<T> clazz) {
		return (List<T>) getDAO().getAll(clazz);
	}

	@Override
	public <T extends ACommon> T getModelById(Class<T> clazz, Serializable id) {
		return (T) getDAO().getModelById(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Transactional (readOnly=true)
	@Override
	public <T extends ACommon> QueryResult<T> getAll(Class<T> clazz, int first, int pageSize, String sortField,
			SortOrder sortOrder, Map<String, Serializable> filters) {
		List<T> data = (List<T>) getDAO().getAll(clazz, first, pageSize, sortField, sortOrder, filters);
		int count = getDAO().getCount(clazz, filters);
		return new QueryResult<T>(data, count);
	}

	@Override
	public Map<String, ClassMetadata> mapAllClassMetadata() {
		return getDAO().mapAllClassMetadata();
	}

	/**
	 * Bütün servisler kendi dao'sunu döndürmeli<br>
	 * Örneğin;
	 * <pre>
	 * @Override
	 * protected ITestDAO getDAO() {
	 * 		return testDAO;
	 * 	}
	 * </pre>
	 * @return
	 */
	protected abstract IBaseDAO getDAO();

}
