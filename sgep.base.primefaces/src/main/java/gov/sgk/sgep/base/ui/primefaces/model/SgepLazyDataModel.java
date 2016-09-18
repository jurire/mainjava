package gov.sgk.sgep.base.ui.primefaces.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

import gov.sgk.sgep.base.api.business.IBaseService;
import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.base.api.utility.QueryResult;
import gov.sgk.sgep.base.ui.primefaces.Utility;

/**
 * 
 * @author o-mssahin
 * @since 2 Eki 2015
 *
 */
public abstract class SgepLazyDataModel<T extends AModel> extends LazyDataModel<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Class<T> clazz;

	public SgepLazyDataModel() {
	}

	public List<T> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		IBaseService service = getService();
		Map<String, Serializable> serFilters = new HashMap<>();
		for (Entry<String, Object> entry : filters.entrySet()) {
			Serializable value = entry.getValue() instanceof Serializable ? (Serializable)entry.getValue() : null;
			serFilters.put(entry.getKey(), value);
		}
		
		QueryResult<T> result = service.getAll(getClazz(), first, pageSize, sortField, Utility.toSgepSortOrder(sortOrder), serFilters);
		setRowCount(result.getCount());
		return result.getData();
	}

	public List<T> load(int first, int pageSize, List<SortMeta> multiSortMeta, Map<String, Object> filters) {
		throw new UnsupportedOperationException("Lazy loading is not implemented.");
	}

	public T getRowData(String rowKey) {
		return getService().getModelById(clazz, rowKey);
	}

	public Object getRowKey(T object) {
		if (object instanceof AModel) {
			return ((AModel) object).getId();
		} else {
			return UUID.randomUUID().toString();
		}
	}

	public abstract IBaseService getService();

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

}
