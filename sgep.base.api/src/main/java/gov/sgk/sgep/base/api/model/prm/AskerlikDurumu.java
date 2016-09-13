package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_ASKERLIK_DURUMU")
public class AskerlikDurumu extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int kodu;

	@Column(name = "aciklama")
	@Length(max = 100)
	private String aciklama;

	@Override
	public Serializable getId() {
		return getKodu();
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public int getKodu() {
		return kodu;
	}

	public void setKodu(int kodu) {
		this.kodu = kodu;
	}

}
