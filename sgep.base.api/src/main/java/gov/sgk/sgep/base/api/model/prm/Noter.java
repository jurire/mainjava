package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import gov.sgk.sgep.utility.SgepConstants;


@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_NOTER")
public class Noter extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private String kodu;
	
	@Column(name = "sorumlu_il")
	@NotNull
	private String sorumluIl;
	
	@NotNull
	@Size (max=50)
	private String adi;

	public String getSorumluIl() {
		return sorumluIl;
	}

	public void setSorumluIl(String sorumluIl) {
		this.sorumluIl = sorumluIl;
	}
	
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public Serializable getId() {
		return getKodu();
	}

	public String getKodu() {
		return kodu;
	}

	public void setKodu(String kodu) {
		this.kodu = kodu;
	}

}
