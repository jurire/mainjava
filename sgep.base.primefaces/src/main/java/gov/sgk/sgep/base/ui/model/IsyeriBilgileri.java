package gov.sgk.sgep.base.ui.model;

import java.io.Serializable;

public class IsyeriBilgileri implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sicilNo;
     
    private String sgm;
     
    private String unvan;
     
    private String adSoyad;
     
    private String statu;
     
    private String vergiNo;
     
    private String kapsamaAlinisTarihi;
     
    private String kapsamdanCikisTarihi;
     
    private String izOlmaTarihi;
 
    private String adres;
    
    private String SaymanlikNo;
    
    private String kurumNo;
    
    private String kurumAdi;
    
    private String isYeriStatu;
    

	public String getSaymanlikNo() {
		return SaymanlikNo;
	}

	public void setSaymanlikNo(String saymanlikNo) {
		SaymanlikNo = saymanlikNo;
	}

	public String getKurumNo() {
		return kurumNo;
	}

	public void setKurumNo(String kurumNo) {
		this.kurumNo = kurumNo;
	}

	public String getKurumAdi() {
		return kurumAdi;
	}

	public void setKurumAdi(String kurumAdi) {
		this.kurumAdi = kurumAdi;
	}

	public String getIsYeriStatu() {
		return isYeriStatu;
	}

	public void setIsYeriStatu(String isYeriStatu) {
		this.isYeriStatu = isYeriStatu;
	}

	public String getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

	public String getSgm() {
		return sgm;
	}

	public void setSgm(String sgm) {
		this.sgm = sgm;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getStatu() {
		return statu;
	}

	public void setStatu(String statu) {
		this.statu = statu;
	}

	public String getVergiNo() {
		return vergiNo;
	}

	public void setVergiNo(String vergiNo) {
		this.vergiNo = vergiNo;
	}

	public String getKapsamaAlinisTarihi() {
		return kapsamaAlinisTarihi;
	}

	public void setKapsamaAlinisTarihi(String kapsamaAlinisTarihi) {
		this.kapsamaAlinisTarihi = kapsamaAlinisTarihi;
	}

	public String getKapsamdanCikisTarihi() {
		return kapsamdanCikisTarihi;
	}

	public void setKapsamdanCikisTarihi(String kapsamdanCikisTarihi) {
		this.kapsamdanCikisTarihi = kapsamdanCikisTarihi;
	}

	public String getIzOlmaTarihi() {
		return izOlmaTarihi;
	}

	public void setIzOlmaTarihi(String izOlmaTarihi) {
		this.izOlmaTarihi = izOlmaTarihi;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
    
}