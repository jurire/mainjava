package gov.sgk.sgep.base.ui.model;

import java.io.Serializable;

/**
 * 
 * @author o-saslan
 *
 */
public class KimlikBilgileri implements Serializable {
 

 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ilKodu;
	private String yeniSubeKodu;  
	private String eskiSubeKodu; 
	private String siraNo;
	private String araciNo;
	private String kimlikNo;
	private boolean kimlikNoYok;
	private String emekliSicilNo;
	private String sskSicilNo;
	private String adi;
	private String soyadi;
	private String ilkSoyadi;
	private String babaAdi;
	private String anaAdi;
	private String ikametgahAdresi;
	private String dogumYeri;
	private String dogumTarihi;
	private String cinsiyet;
	private String medeniHali;
	private String uyruk;
	private String nufusaKayitliOlduguIl;
	private String nufusaKayitliOlduguIlce;
	private String nufusaKayitliOlduguMahKoy;
	private String nufusaKayitliOlduguCiltNo;
	private String nufusaKayitliOlduguAileSiraNo;
	private String nufusaKayitliOlduguSiraNo;
	private String aylikGelirDurumu;
	private String satirAdi;
	
	
	public String getUyruk() {
		return uyruk;
	}
	public void setUyruk(String uyruk) {
		this.uyruk = uyruk;
	}
	
	public boolean isKimlikNoYok() {
		return kimlikNoYok;
	}
	public void setKimlikNoYok(boolean kimlikNoYok) {
		this.kimlikNoYok = kimlikNoYok;
	}
	public String getIlKodu() {
		return ilKodu;
	}
	public void setIlKodu(String ilKodu) {
		this.ilKodu = ilKodu;
	}
	public String getYeniSubeKodu() {
		return yeniSubeKodu;
	}
	public void setYeniSubeKodu(String yeniSubeKodu) {
		this.yeniSubeKodu = yeniSubeKodu;
	}
	public String getEskiSubeKodu() {
		return eskiSubeKodu;
	}
	public void setEskiSubeKodu(String eskiSubeKodu) {
		this.eskiSubeKodu = eskiSubeKodu;
	}
	public String getSiraNo() {
		return siraNo;
	}
	public void setSiraNo(String siraNo) {
		this.siraNo = siraNo;
	}
	public String getAraciNo() {
		return araciNo;
	}
	public void setAraciNo(String araciNo) {
		this.araciNo = araciNo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getSatirAdi() {
		return satirAdi;
	}
	public void setSatirAdi(String satirAdi) {
		this.satirAdi = satirAdi;
	}
	public String getAylikGelirDurumu() {
		return aylikGelirDurumu;
	}
	public void setAylikGelirDurumu(String aylikGelirDurumu) {
		this.aylikGelirDurumu = aylikGelirDurumu;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getIlkSoyadi() {
		return ilkSoyadi;
	}
	public void setIlkSoyadi(String ilkSoyadi) {
		this.ilkSoyadi = ilkSoyadi;
	}
	public String getBabaAdi() {
		return babaAdi;
	}
	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}
	public String getAnaAdi() {
		return anaAdi;
	}
	public void setAnaAdi(String anaAdi) {
		this.anaAdi = anaAdi;
	}
	public String getIkametgahAdresi() {
		return ikametgahAdresi;
	}
	public void setIkametgahAdresi(String ikametgahAdresi) {
		this.ikametgahAdresi = ikametgahAdresi;
	}
	public String getDogumYeri() {
		return dogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}
	public String getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public String getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public String getMedeniHali() {
		return medeniHali;
	}
	public void setMedeniHali(String medeniHali) {
		this.medeniHali = medeniHali;
	}
	public String getNufusaKayitliOlduguIl() {
		return nufusaKayitliOlduguIl;
	}
	public void setNufusaKayitliOlduguIl(String nufusaKayitliOlduguIl) {
		this.nufusaKayitliOlduguIl = nufusaKayitliOlduguIl;
	}
	public String getNufusaKayitliOlduguIlce() {
		return nufusaKayitliOlduguIlce;
	}
	public void setNufusaKayitliOlduguIlce(String nufusaKayitliOlduguIlce) {
		this.nufusaKayitliOlduguIlce = nufusaKayitliOlduguIlce;
	}
	public String getNufusaKayitliOlduguMahKoy() {
		return nufusaKayitliOlduguMahKoy;
	}
	public void setNufusaKayitliOlduguMahKoy(String nufusaKayitliOlduguMahKoy) {
		this.nufusaKayitliOlduguMahKoy = nufusaKayitliOlduguMahKoy;
	}
	public String getNufusaKayitliOlduguCiltNo() {
		return nufusaKayitliOlduguCiltNo;
	}
	public void setNufusaKayitliOlduguCiltNo(String nufusaKayitliOlduguCiltNo) {
		this.nufusaKayitliOlduguCiltNo = nufusaKayitliOlduguCiltNo;
	}
	public String getNufusaKayitliOlduguAileSiraNo() {
		return nufusaKayitliOlduguAileSiraNo;
	}
	public void setNufusaKayitliOlduguAileSiraNo(String nufusaKayitliOlduguAileSiraNo) {
		this.nufusaKayitliOlduguAileSiraNo = nufusaKayitliOlduguAileSiraNo;
	}
	public String getNufusaKayitliOlduguSiraNo() {
		return nufusaKayitliOlduguSiraNo;
	}
	public void setNufusaKayitliOlduguSiraNo(String nufusaKayitliOlduguSiraNo) {
		this.nufusaKayitliOlduguSiraNo = nufusaKayitliOlduguSiraNo;
	}
	public String getEmekliSicilNo() {
		return emekliSicilNo;
	}
	public void setEmekliSicilNo(String emekliSicilNo) {
		this.emekliSicilNo = emekliSicilNo;
	}
	public String getKimlikNo() {
		return kimlikNo;
	}
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	public String getSskSicilNo() {
		return sskSicilNo;
	}
	public void setSskSicilNo(String sskSicilNo) {
		this.sskSicilNo = sskSicilNo;
	}

}