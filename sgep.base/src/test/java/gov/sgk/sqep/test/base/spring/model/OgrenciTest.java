package gov.sgk.sqep.test.base.spring.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import gov.sgk.sgep.base.api.model.BaseModel;

@Entity
@Table(name="OGRENCI")
public class OgrenciTest extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final String OGRENCI_ADI_1 = "OgrAdı1";
	public static final String OGRENCI_ADI_2 = "OgrAdı2";
	public static final String OGRENCI_ADI_3 = "3OgrAdı";
	
	private String ad;
	
	@OneToMany (fetch=FetchType.EAGER, orphanRemoval=true, cascade=CascadeType.ALL)
	private Set<DersTest> dersler;
	
	@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private BolumTest bolum;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Set<DersTest> getDersler() {
		return dersler;
	}

	public void setDersler(Set<DersTest> dersler) {
		this.dersler = dersler;
	}

	/**
	 * @return the bolum
	 */
	public BolumTest getBolum() {
		return bolum;
	}

	/**
	 * @param bolum the bolum to set
	 */
	public void setBolum(BolumTest bolum) {
		this.bolum = bolum;
	}
	
}
