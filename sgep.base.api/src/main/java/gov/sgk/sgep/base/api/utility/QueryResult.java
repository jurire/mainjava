package gov.sgk.sgep.base.api.utility;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author o-mssahin
 * @since 21 Eki 2015
 *
 */
public class QueryResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<T> data;
	private int count;
	
	public QueryResult(List<T> data, int count) {
		super();
		this.setData(data);
		this.count = count;
	}

	public QueryResult() {
		this(null, 0);
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
