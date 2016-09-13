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
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_ILCE")
public class Ilce extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int id; 
	
	@Column(name = "ilKodu")
	@NotNull
	private int ilKodu;
	
	@Column(name = "ilceKodu")
	@NotNull
	private int ilceKodu;
	
	@Column(name = "adi")
	@NotNull
	@Size (max=50)
	private String adi;
	
	@Column (name="ILCE_KODU_KPS")
	private Integer ilceKoduKPS;
	
	private Integer aylikBaglayanUnite;

	public int getIlKodu() {
		return ilKodu;
	}

	public void setIlKodu(int ilKodu) {
		this.ilKodu = ilKodu;
	}


	public int getIlceKodu() {
		return ilceKodu;
	}

	public void setIlceKodu(int ilceKodu) {
		this.ilceKodu = ilceKodu;
	}
	
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public Serializable getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getIlceKoduKPS() {
		return ilceKoduKPS;
	}

	public void setIlceKoduKPS(Integer ilceKoduKPS) {
		this.ilceKoduKPS = ilceKoduKPS;
	}

	public Integer getAylikBaglayanUnite() {
		return aylikBaglayanUnite;
	}

	public void setAylikBaglayanUnite(Integer aylikBaglayanUnite) {
		this.aylikBaglayanUnite = aylikBaglayanUnite;
	}

	
}
