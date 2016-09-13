package gov.sgk.sgep.base.model.system;

import java.io.Serializable;

/**
 * 
 * @author o-mssahin
 *
 */
public class SablonDil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Sablon sablon;
	private String dil;
	
	public String getDil() {
		return dil;
	}
	public void setDil(String dil) {
		this.dil = dil;
	}
	public Sablon getSablon() {
		return sablon;
	}
	public void setSablon(Sablon sablon) {
		this.sablon = sablon;
	}
	
}
