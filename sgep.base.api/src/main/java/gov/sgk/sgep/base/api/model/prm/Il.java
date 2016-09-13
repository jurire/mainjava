package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import gov.sgk.sgep.utility.SgepConstants;


@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_IL")
public class Il extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int kodu;
	
	@Column(name = "adi") 
	private String adi;
	
	private Integer alanKodu1;
	
	private Integer alanKodu2;
	
	public Integer getAlanKodu1() {
		return alanKodu1;
	}

	public void setAlanKodu1(Integer alanKodu1) {
		this.alanKodu1 = alanKodu1;
	}

	public Integer getAlanKodu2() {
		return alanKodu2;
	}

	public void setAlanKodu2(Integer alanKodu2) {
		this.alanKodu2 = alanKodu2;
	}

	public int getKodu() {
		return kodu;
	}

	public void setKodu(int kodu) {
		this.kodu = kodu;
	}
	
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	@Override
	public Serializable getId() {
		return kodu;
	}

}
