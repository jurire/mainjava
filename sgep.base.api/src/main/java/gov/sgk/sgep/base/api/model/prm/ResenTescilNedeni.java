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
@Table(schema=SgepConstants.SCHEMA_BASE,name = "P_RESEN_TESCIL_NEDENI")
public class ResenTescilNedeni extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@NotNull
	private int kod;

	@Column(name = "resen_tipi")
	@NotNull
	private char resentipi;

	@Size(max = 100)
	private String aciklama;

	public char getResentipi() {
		return resentipi;
	}

	public void setResentipi(char resentipi) {
		this.resentipi = resentipi;
	}

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
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
