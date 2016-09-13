package gov.sgk.sqep.test.base.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import gov.sgk.sgep.base.api.model.BaseModel;

@Entity
@Table(name="DERS")
public class DersTest extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ad;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
}
