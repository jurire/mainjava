package gov.sgk.sgep.base.ui.model;

import java.io.Serializable;
import java.util.Date;

public class IseGirisBilgileriGiris implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tescilId;
	private String memuriyeteBasTrh;
	private String kurumaBasTrh;
	
	/**
	 * Veri tabanında integer olarak olarak tutulmuş sigortalılık türü  
	 */
	private Integer sigortalilikTuru;
	private String kurumSicilNo;
	private String hizmetSinifi;
	private String gorevUnvani;
	private String gorevYapilanBirim;
	private String csbgIsKoluKodu;
	private String ogrenimDurumu;
	private Date ogrenimDurumuBitisTarihi;
	private String askerlikDurumu;
	private Date askerlikDurumuBasTrh;
	private Date askerlikDurumuTerhisTrh;
	private Date tashihliDogumTarihi;
	private String kazaiRustKarari;
	 
	private Date iseGirisTarihi;
	private String meslekKoduAdi;
	private Integer resenTescil;
	private Integer resenTescilNedeni;
	private String gorevKodu;
	private String engelliKodu;
	private String eskiHukumlu;
	private String otuzGunAzCalisma;
	private String bildirimSuresiIstisnasi;
	private Date maliyeBakVizeTrh;
	private String evrakGelisTuru;
	private String evrakSayisi;
	private Date kurumaIntikalTrh;
	private Date postaTarihi;
	private Date evrakTarihi;
	
	
	
	
	
	public Date getPostaTarihi() {
		return postaTarihi;
	}
	public void setPostaTarihi(Date postaTarihi) {
		this.postaTarihi = postaTarihi;
	}
		public String getTescilId() {
		return tescilId;
	}
	public void setTescilId(String tescilId) {
		this.tescilId = tescilId;
	}
	public String getEvrakGelisTuru() {
		return evrakGelisTuru;
	}
	public void setEvrakGelisTuru(String evrakGelisTuru) {
		this.evrakGelisTuru = evrakGelisTuru;
	}
	public String getEvrakSayisi() {
		return evrakSayisi;
	}
	public void setEvrakSayisi(String evrakSayisi) {
		this.evrakSayisi = evrakSayisi;
	}
	
	public Integer getResenTescilNedeni() {
		return resenTescilNedeni;
	}
	public void setResenTescilNedeni(Integer resenTescilNedeni) {
		this.resenTescilNedeni = resenTescilNedeni;
	}
	public Date getIseGirisTarihi() {
		return iseGirisTarihi;
	}
	public void setIseGirisTarihi(Date iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}
	public String getMeslekKoduAdi() {
		return meslekKoduAdi;
	}
	public void setMeslekKoduAdi(String meslekKoduAdi) {
		this.meslekKoduAdi = meslekKoduAdi;
	}
	
	public Integer getResenTescil() {
		return resenTescil;
	}
	public void setResenTescil(Integer resenTescil) {
		this.resenTescil = resenTescil;
	}
	public String getGorevKodu() {
		return gorevKodu;
	}
	public void setGorevKodu(String gorevKodu) {
		this.gorevKodu = gorevKodu;
	}
	public String getEngelliKodu() {
		return engelliKodu;
	}
	public void setEngelliKodu(String engelliKodu) {
		this.engelliKodu = engelliKodu;
	}
	public String getEskiHukumlu() {
		return eskiHukumlu;
	}
	public void setEskiHukumlu(String eskiHukumlu) {
		this.eskiHukumlu = eskiHukumlu;
	}
	public String getOtuzGunAzCalisma() {
		return otuzGunAzCalisma;
	}
	public void setOtuzGunAzCalisma(String otuzGunAzCalisma) {
		this.otuzGunAzCalisma = otuzGunAzCalisma;
	}
	public Date getMaliyeBakVizeTrh() {
		return maliyeBakVizeTrh;
	}
	public void setMaliyeBakVizeTrh(Date maliyeBakVizeTrh) {
		this.maliyeBakVizeTrh = maliyeBakVizeTrh;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getMemuriyeteBasTrh() {
		return memuriyeteBasTrh;
	}
	public void setMemuriyeteBasTrh(String memuriyeteBasTrh) {
		this.memuriyeteBasTrh = memuriyeteBasTrh;
	}
	public String getKurumaBasTrh() {
		return kurumaBasTrh;
	}
	public void setKurumaBasTrh(String kurumaBasTrh) {
		this.kurumaBasTrh = kurumaBasTrh;
	}
	
	public String getKurumSicilNo() {
		return kurumSicilNo;
	}
	public void setKurumSicilNo(String kurumSicilNo) {
		this.kurumSicilNo = kurumSicilNo;
	}
	public String getHizmetSinifi() {
		return hizmetSinifi;
	}
	public void setHizmetSinifi(String hizmetSinifi) {
		this.hizmetSinifi = hizmetSinifi;
	}
	public String getGorevUnvani() {
		return gorevUnvani;
	}
	public void setGorevUnvani(String gorevUnvani) {
		this.gorevUnvani = gorevUnvani;
	}
	public String getGorevYapilanBirim() {
		return gorevYapilanBirim;
	}
	public void setGorevYapilanBirim(String gorevYapilanBirim) {
		this.gorevYapilanBirim = gorevYapilanBirim;
	}
	public String getCsbgIsKoluKodu() {
		return csbgIsKoluKodu;
	}
	public void setCsbgIsKoluKodu(String csbgIsKoluKodu) {
		this.csbgIsKoluKodu = csbgIsKoluKodu;
	}
	public String getOgrenimDurumu() {
		return ogrenimDurumu;
	}
	public void setOgrenimDurumu(String ogrenimDurumu) {
		this.ogrenimDurumu = ogrenimDurumu;
	}
	public Date getOgrenimDurumuBitisTarihi() {
		return ogrenimDurumuBitisTarihi;
	}
	public void setOgrenimDurumuBitisTarihi(Date ogrenimDurumuBitisTarihi) {
		this.ogrenimDurumuBitisTarihi = ogrenimDurumuBitisTarihi;
	}
	public String getAskerlikDurumu() {
		return askerlikDurumu;
	}
	public void setAskerlikDurumu(String askerlikDurumu) {
		this.askerlikDurumu = askerlikDurumu;
	}
	public String getKazaiRustKarari() {
		return kazaiRustKarari;
	}
	public void setKazaiRustKarari(String kazaiRustKarari) {
		this.kazaiRustKarari = kazaiRustKarari;
	}
	public String getBildirimSuresiIstisnasi() {
		return bildirimSuresiIstisnasi;
	}
	public void setBildirimSuresiIstisnasi(String bildirimSuresiIstisnasi) {
		this.bildirimSuresiIstisnasi = bildirimSuresiIstisnasi;
	}
	public Integer getSigortalilikTuru() {
		return sigortalilikTuru;
	}
	public void setSigortalilikTuru(Integer sigortalilikTuru) {
		this.sigortalilikTuru = sigortalilikTuru;
	}
	public Date getAskerlikDurumuBasTrh() {
		return askerlikDurumuBasTrh;
	}
	public void setAskerlikDurumuBasTrh(Date askerlikDurumuBasTrh) {
		this.askerlikDurumuBasTrh = askerlikDurumuBasTrh;
	}
	public Date getAskerlikDurumuTerhisTrh() {
		return askerlikDurumuTerhisTrh;
	}
	public void setAskerlikDurumuTerhisTrh(Date askerlikDurumuTerhisTrh) {
		this.askerlikDurumuTerhisTrh = askerlikDurumuTerhisTrh;
	}
	public Date getTashihliDogumTarihi() {
		return tashihliDogumTarihi;
	}
	public void setTashihliDogumTarihi(Date tashihliDogumTarihi) {
		this.tashihliDogumTarihi = tashihliDogumTarihi;
	}
	public Date getKurumaIntikalTrh() {
		return kurumaIntikalTrh;
	}
	public void setKurumaIntikalTrh(Date kurumaIntikalTrh) {
		this.kurumaIntikalTrh = kurumaIntikalTrh;
	}
	public Date getEvrakTarihi() {
		return evrakTarihi;
	}
	public void setEvrakTarihi(Date evrakTarihi) {
		this.evrakTarihi = evrakTarihi;
	}

	


}
