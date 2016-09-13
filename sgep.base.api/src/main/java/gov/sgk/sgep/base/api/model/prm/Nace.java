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
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_NACE")
public class Nace extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Column(name = "meslek_grubu")
	@NotNull
	private int  meslekGrubu;
	
	@Column(name = "meslek_grubu_adi")
	@NotNull
	private String meslekGrubuAdi;
	
	@Column(name = "nace_kodu")
	@NotNull
	private String naceKodu;

	@Size (max=250)
	private String aciklama;
	
	@Column(name = "risk")
	@NotNull
	private int risk;
	
	public int getMeslekGrubu() {
		return meslekGrubu;
	}

	public void setMeslekGrubu(int meslekGrubu) {
		this.meslekGrubu = meslekGrubu;
	}


	public String getMeslekGrubuAdi() {
		return meslekGrubuAdi;
	}

	public void setMeslekGrubuAdi(String meslekGrubuAdi) {
		this.meslekGrubuAdi = meslekGrubuAdi;
	}

	public String getNaceKodu() {
		return naceKodu;
	}

	public void setNaceKodu(String naceKodu) {
		this.naceKodu = naceKodu;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public int getRisk() {
		return risk;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}

	@Override
	public Serializable getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
