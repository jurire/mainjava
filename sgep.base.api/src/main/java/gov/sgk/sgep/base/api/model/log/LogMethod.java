package gov.sgk.sgep.base.api.model.log;

import javax.persistence.Entity;
import javax.persistence.Table;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "LOG_METOT")
public class LogMethod extends Log {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String bean;
	private String method;
	private String parameters;
	
	public String getBean() {
		return bean;
	}
	public void setBean(String bean) {
		this.bean = bean;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

}
