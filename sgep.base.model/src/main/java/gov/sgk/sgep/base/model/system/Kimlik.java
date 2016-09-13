package gov.sgk.sgep.base.model.system;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * The persistent class for the KIMLIK database table.
 * 
 * @author o-mssahin
 * 
 */
@Entity
@NamedQuery(name = "Kimlik.findAll", query = "SELECT k FROM Kimlik k")
@Table(schema = SgepConstants.SCHEMA_BASE, name = "KIMLIK")
public class Kimlik extends AModel {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TC_KIMLIK_NO")
	private BigDecimal tcKimlikNo;

	@Size(max = 50)
	private String adi;

	@Column(name = "AILE_SIRA_NO")
	private BigDecimal aileSiraNo;

	@Column(name = "ANA_ADI")
	private String anaAdi;

	@Column(name = "BABA_ADI")
	private String babaAdi;

	private BigDecimal basamak;

	@Column(name = "BIREY_SIRA_NO")
	private BigDecimal bireySiraNo;

	@Column(name = "CILT_NO")
	private BigDecimal ciltNo;

	private char cinsiyeti;

	@Temporal(TemporalType.DATE)
	@Column(name = "DOGUM_TARIHI")
	private Date dogumTarihi;

	@Column(name = "DOGUM_YERI")
	private String dogumYeri;

	@Column(name = "IL_KODU")
	private short ilKodu;

	@Column(name = "ILCE_KODU")
	private short ilceKodu;

	@Size (max=50)
	@Column(name = "ILK_SOYADI")
	private String ilkSoyadi;

	@Temporal(TemporalType.DATE)
	@Column(name = "ILK_TESCIL_TARIHI_4A")
	private Date ilkTescilTarihi4a;

	@Temporal(TemporalType.DATE)
	@Column(name = "ILK_TESCIL_TARIHI_4B")
	private Date ilkTescilTarihi4b;

	@Temporal(TemporalType.DATE)
	@Column(name = "ILK_TESCIL_TARIHI_4C")
	private Date ilkTescilTarihi4c;

	@Column(name = "MAHALLE_KOY")
	private String mahalleKoy;

	@Column(name = "MEDENI_HALI")
	private char medeniHali;

	@Size (max=50)
	private String soyadi;
	
	@Convert(converter=BooleanToStringConverter.class)
	@Column (name="T4CLI_OLUR_MU")
	private boolean t4CliOlurMu;

	@Column(name = "UYRUK_KODU", columnDefinition="CHAR")
	private String uyrukKodu;

	public Kimlik() {
	}

	public String getAdi() {
		return this.adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public BigDecimal getAileSiraNo() {
		return this.aileSiraNo;
	}

	public void setAileSiraNo(BigDecimal aileSiraNo) {
		this.aileSiraNo = aileSiraNo;
	}

	public String getAnaAdi() {
		return this.anaAdi;
	}

	public void setAnaAdi(String anaAdi) {
		this.anaAdi = anaAdi;
	}

	public String getBabaAdi() {
		return this.babaAdi;
	}

	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}

	public BigDecimal getBasamak() {
		return this.basamak;
	}

	public void setBasamak(BigDecimal basamak) {
		this.basamak = basamak;
	}

	public BigDecimal getBireySiraNo() {
		return this.bireySiraNo;
	}

	public void setBireySiraNo(BigDecimal bireySiraNo) {
		this.bireySiraNo = bireySiraNo;
	}

	public BigDecimal getCiltNo() {
		return this.ciltNo;
	}

	public void setCiltNo(BigDecimal ciltNo) {
		this.ciltNo = ciltNo;
	}

	public Date getDogumTarihi() {
		return this.dogumTarihi;
	}

	public void setDogumTarihi(Date dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getDogumYeri() {
		return this.dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public short getIlKodu() {
		return this.ilKodu;
	}

	public void setIlKodu(short ilKodu) {
		this.ilKodu = ilKodu;
	}

	public short getIlceKodu() {
		return this.ilceKodu;
	}

	public void setIlceKodu(short ilceKodu) {
		this.ilceKodu = ilceKodu;
	}

	public String getIlkSoyadi() {
		return this.ilkSoyadi;
	}

	public void setIlkSoyadi(String ilkSoyadi) {
		this.ilkSoyadi = ilkSoyadi;
	}

	public Date getIlkTescilTarihi4a() {
		return this.ilkTescilTarihi4a;
	}

	public void setIlkTescilTarihi4a(Date ilkTescilTarihi4a) {
		this.ilkTescilTarihi4a = ilkTescilTarihi4a;
	}

	public Date getIlkTescilTarihi4b() {
		return this.ilkTescilTarihi4b;
	}

	public void setIlkTescilTarihi4b(Date ilkTescilTarihi4b) {
		this.ilkTescilTarihi4b = ilkTescilTarihi4b;
	}

	public Date getIlkTescilTarihi4c() {
		return this.ilkTescilTarihi4c;
	}

	public void setIlkTescilTarihi4c(Date ilkTescilTarihi4c) {
		this.ilkTescilTarihi4c = ilkTescilTarihi4c;
	}

	public String getMahalleKoy() {
		return this.mahalleKoy;
	}

	public void setMahalleKoy(String mahalleKoy) {
		this.mahalleKoy = mahalleKoy;
	}

	public char getMedeniHali() {
		return medeniHali;
	}

	public void setMedeniHali(char medeniHali) {
		this.medeniHali = medeniHali;
	}

	public String getSoyadi() {
		return this.soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public BigDecimal getTcKimlikNo() {
		return this.tcKimlikNo;
	}

	public void setTcKimlikNo(BigDecimal tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getUyrukKodu() {
		return this.uyrukKodu;
	}

	public void setUyrukKodu(String uyrukKodu) {
		this.uyrukKodu = uyrukKodu;
	}

	public char getCinsiyeti() {
		return cinsiyeti;
	}

	public void setCinsiyeti(char cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}

	@Override
	public Serializable getId() {
		return tcKimlikNo;
	}

	public boolean isT4CliOlurMu() {
		return t4CliOlurMu;
	}

	public void setT4CliOlurMu(boolean t4CliOlurMu) {
		this.t4CliOlurMu = t4CliOlurMu;
	}

}