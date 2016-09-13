package gov.sgk.sgep.base.api.utility;

import java.io.Serializable;
import java.util.Map;

import gov.sgk.sgep.utility.SortOrder;

/**
 * 
 * @author mehmetsinan.sahin
 *
 */
public class QueryParams implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int first;
	int pageSize; 
	private String sortField;
	private SortOrder sortOrder; 
	private Map<String, Serializable> filters;
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getSortField() {
		return sortField;
	}
	public void setSortField(String sortField) {
		this.sortField = sortField;
	}
	public SortOrder getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Map<String, Serializable> getFilters() {
		return filters;
	}
	public void setFilters(Map<String, Serializable> filters) {
		this.filters = filters;
	}
	
}
