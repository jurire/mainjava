package gov.sgk.sgep.base.api.model.system;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * The persistent class for the ASKERLIK database table.
 * @author o-mssahin
 */
@Entity
@NamedQuery(name = "Askerlik.findAll", query = "SELECT a FROM Askerlik a")
@Table(schema = SgepConstants.SCHEMA_BASE, name = "ASKERLIK")
public class Askerlik extends AModel {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "TC_KIMLIK_NO")
	private BigDecimal tcKimlikNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "ASKERLIK_BASLANGIC_TARIHI")
	private Date askerlikBaslangicTarihi;

	@Temporal(TemporalType.DATE)
	@Column(name = "ASKERLIK_BITIS_TARIHI")
	private Date askerlikBitisTarihi;

	@Column(name = "ASKERLIK_DURUMU_KODU")
	private short askerlikDurumuKodu;

	@Column (length=200)
	@Size (max=200)
	private String aciklama;

	@Temporal(TemporalType.DATE)
	@Column(name="ATEGMEN_NASP_TARIHI")
	private Date ategmenNaspTarihi;

	@Temporal(TemporalType.DATE)
	@Column(name="KITA_HIZMET_BASLANGIC_TARIHI")
	private Date kitaHizmetBaslangicTarihi;

	@Temporal(TemporalType.DATE)
	@Column(name="KITA_HIZMET_BITIS_TARIHI")
	private Date kitaHizmetBitisTarihi;

	@Temporal(TemporalType.DATE)
	@Column(name="YSUBAY_OKUL_BITIS_TARIHI")
	private Date ysubayOkulBitisTarihi;
	
	public Date getAtegmenNaspTarihi() {
		return ategmenNaspTarihi;
	}

	public void setAtegmenNaspTarihi(Date ategmenNaspTarihi) {
		this.ategmenNaspTarihi = ategmenNaspTarihi;
	}

	public Date getKitaHizmetBaslangicTarihi() {
		return kitaHizmetBaslangicTarihi;
	}

	public void setKitaHizmetBaslangicTarihi(Date kitaHizmetBaslangicTarihi) {
		this.kitaHizmetBaslangicTarihi = kitaHizmetBaslangicTarihi;
	}

	public Date getKitaHizmetBitisTarihi() {
		return kitaHizmetBitisTarihi;
	}

	public void setKitaHizmetBitisTarihi(Date kitaHizmetBitisTarihi) {
		this.kitaHizmetBitisTarihi = kitaHizmetBitisTarihi;
	}

	public Date getYsubayOkulBitisTarihi() {
		return ysubayOkulBitisTarihi;
	}

	public void setYsubayOkulBitisTarihi(Date ysubayOkulBitisTarihi) {
		this.ysubayOkulBitisTarihi = ysubayOkulBitisTarihi;
	}

	public Askerlik() {
	}

	public Date getAskerlikBaslangicTarihi() {
		return this.askerlikBaslangicTarihi;
	}

	public void setAskerlikBaslangicTarihi(Date askerlikBaslangicTarihi) {
		this.askerlikBaslangicTarihi = askerlikBaslangicTarihi;
	}

	public Date getAskerlikBitisTarihi() {
		return this.askerlikBitisTarihi;
	}

	public void setAskerlikBitisTarihi(Date askerlikBitisTarihi) {
		this.askerlikBitisTarihi = askerlikBitisTarihi;
	}

	public short getAskerlikDurumuKodu() {
		return this.askerlikDurumuKodu;
	}

	public void setAskerlikDurumuKodu(short askerlikDurumuKodu) {
		this.askerlikDurumuKodu = askerlikDurumuKodu;
	}

	public BigDecimal getTcKimlikNo() {
		return this.tcKimlikNo;
	}

	public void setTcKimlikNo(BigDecimal tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	@Override
	public Serializable getId() {
		return tcKimlikNo;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

}