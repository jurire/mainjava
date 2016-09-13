package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema=SgepConstants.SCHEMA_BASE, name = "P_EVRAK_GELIS_TURU")
public class EvrakGelisTuru extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int kod;

	@Size (max=50)
	private String aciklama;
	
	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
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
		return null;
	}

}
