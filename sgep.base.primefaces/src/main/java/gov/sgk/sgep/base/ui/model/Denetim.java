package gov.sgk.sgep.base.ui.model;

import java.io.Serializable;
import java.util.Date;

public class Denetim implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mahkemeAdi;
	private String mahkemeKararNo;
	private Date mahkemeKararTarihi;
	private Date kararKesinlesmeTarihi;
	private String mufettisAdi;
	private String raporNo;
	private Date raporTarihi;
	private String denetimElemanıAdi;
	private String yaziNo;
	private Date yaziTarihi;
	private String kurumAdi;
	
	
	public String getKurumAdi() {
		return kurumAdi;
	}
	public void setKurumAdi(String kurumAdi) {
		this.kurumAdi = kurumAdi;
	}
	public String getMahkemeAdi() {
		return mahkemeAdi;
	}
	public void setMahkemeAdi(String mahkemeAdi) {
		this.mahkemeAdi = mahkemeAdi;
	}
	public String getMahkemeKararNo() {
		return mahkemeKararNo;
	}
	public void setMahkemeKararNo(String mahkemeKararNo) {
		this.mahkemeKararNo = mahkemeKararNo;
	}
	public Date getMahkemeKararTarihi() {
		return mahkemeKararTarihi;
	}
	public void setMahkemeKararTarihi(Date mahkemeKararTarihi) {
		this.mahkemeKararTarihi = mahkemeKararTarihi;
	}
	public Date getKararKesinlesmeTarihi() {
		return kararKesinlesmeTarihi;
	}
	public void setKararKesinlesmeTarihi(Date kararKesinlesmeTarihi) {
		this.kararKesinlesmeTarihi = kararKesinlesmeTarihi;
	}
	public String getMufettisAdi() {
		return mufettisAdi;
	}
	public void setMufettisAdi(String mufettisAdi) {
		this.mufettisAdi = mufettisAdi;
	}
	public String getRaporNo() {
		return raporNo;
	}
	public void setRaporNo(String raporNo) {
		this.raporNo = raporNo;
	}
	public Date getRaporTarihi() {
		return raporTarihi;
	}
	public void setRaporTarihi(Date raporTarihi) {
		this.raporTarihi = raporTarihi;
	}
	public String getDenetimElemanıAdi() {
		return denetimElemanıAdi;
	}
	public void setDenetimElemanıAdi(String denetimElemanıAdi) {
		this.denetimElemanıAdi = denetimElemanıAdi;
	}
	public String getYaziNo() {
		return yaziNo;
	}
	public void setYaziNo(String yaziNo) {
		this.yaziNo = yaziNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Date getYaziTarihi() {
		return yaziTarihi;
	}
	public void setYaziTarihi(Date yaziTarihi) {
		this.yaziTarihi = yaziTarihi;
	}
	
	
	
	

}
