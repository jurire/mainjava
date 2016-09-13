package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_BARO")
public class Baro extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private String  kodu;
	
	@Column(name = "sorumlu_il", nullable = false)
	private int sorumluIl;
	
	@Column(name = "adi", nullable = false)
	private String adi;

	@Override
	public Serializable getId() {
		return kodu;
	}

	public String getKodu() {
		return kodu;
	}

	public void setKodu(String kodu) {
		this.kodu = kodu;
	}

	public int getSorumluIl() {		
		return sorumluIl;
	}

	public void setSorumluIl(int sorumluIl) {
		this.sorumluIl = sorumluIl;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	
}
