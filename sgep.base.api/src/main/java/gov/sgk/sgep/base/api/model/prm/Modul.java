package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_MODUL")
public class Modul extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Size(max = 50)
	private String aciklama;

	@Override
	public Serializable getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

}
