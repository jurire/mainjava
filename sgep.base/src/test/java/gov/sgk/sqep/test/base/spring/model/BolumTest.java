package gov.sgk.sqep.test.base.spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import gov.sgk.sgep.base.api.model.BaseModel;

@Entity
@Table(name="BOLUM")
public class BolumTest extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String BOLUM_ADI_1 = "Bolum1";
	public static final String BOLUM_ADI_2 = "Bolum2";
	
	private String ad;

	/**
	 * @return the ad
	 */
	public String getAd() {
		return ad;
	}

	/**
	 * @param ad the ad to set
	 */
	public void setAd(String ad) {
		this.ad = ad;
	}

}
