package gov.sgk.sgep.base.ui.model;

import java.io.Serializable;

public class IletisimBilgileri implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String telefonNo;
	private String gsmNo;
	private String ePosta;
	private String bulvar;
	private String cadde;
	private String sokak;
	private String disKapi;
	private String icKapi;
	private String mahKoy;
	private String postaKodu;
	private String il;
	private String ilce;
	
	
	
	
	public String getBulvar() {
		return bulvar;
	}
	public void setBulvar(String bulvar) {
		this.bulvar = bulvar;
	}
	public String getCadde() {
		return cadde;
	}
	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getSokak() {
		return sokak;
	}
	public void setSokak(String sokak) {
		this.sokak = sokak;
	}
	public String getDisKapi() {
		return disKapi;
	}
	public void setDisKapi(String disKapi) {
		this.disKapi = disKapi;
	}
	public String getIcKapi() {
		return icKapi;
	}
	public void setIcKapi(String icKapi) {
		this.icKapi = icKapi;
	}
	public String getMahKoy() {
		return mahKoy;
	}
	public void setMahKoy(String mahKoy) {
		this.mahKoy = mahKoy;
	}
	public String getPostaKodu() {
		return postaKodu;
	}
	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}
	public String getIl() {
		return il;
	}
	public void setIl(String il) {
		this.il = il;
	}
	public String getIlce() {
		return ilce;
	}
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	public String getGsmNo() {
		return gsmNo;
	}
	public void setGsmNo(String gsmNo) {
		this.gsmNo = gsmNo;
	}
	public String getePosta() {
		return ePosta;
	}
	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
	
	

}
