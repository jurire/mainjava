package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_ISKUR_MESLEK")
public class IskurMeslek extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private String kod;

	@Size (max=100)
	private String aciklama;

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	@Override
	public Serializable getId() {
		return kod;
	}

}
