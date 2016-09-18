package gov.sgk.sgep.base.ui.primefaces.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import gov.sgk.sgep.base.api.business.IBaseService;
import gov.sgk.sgep.base.api.model.AModel;

/**
 * 
 * @author o-mssahin
 *
 * @param <T>
 */
public abstract class SgepSelectableDataModel<T extends AModel> extends ListDataModel<T> implements SelectableDataModel<T>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Class<T> clazz;
	
	public SgepSelectableDataModel() {
		super();
		List<T> list = getService().getAll(clazz);
		setWrappedData(list);
	}

	public SgepSelectableDataModel(List<T> list) {
		super(list);
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
