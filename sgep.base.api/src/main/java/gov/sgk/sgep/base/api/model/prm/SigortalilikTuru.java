package gov.sgk.sgep.base.api.model.prm;

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

import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;
import gov.sgk.sgep.utility.SgepConstants;


/**
 * The persistent class for the P_SIGORTALILIK_TURU database table.
 * 
 */
@Entity
@Table(schema=SgepConstants.SCHEMA_BASE, name="P_SIGORTALILIK_TURU")
@NamedQuery(name="PSigortalilikTuru.findAll", query="SELECT p FROM SigortalilikTuru p")
public class SigortalilikTuru extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Column (length=100)
	@Size (max=100)
	private String aciklama;

	@Id
	private int id;
	
	@Column(name="BAGIMLI_MI")
	@Convert (converter=BooleanToStringConverter.class)
	private boolean bagimliMi;

	@Temporal(TemporalType.DATE)
	@Column(name="BASLANGIC_TARIHI")
	private Date baslangicTarihi;

	@Temporal(TemporalType.DATE)
	@Column(name="BITIS_TARIHI")
	private Date bitisTarihi;

	@Column(name="IPC_IAB")
	private String ipcIab;

	@Column(name="IPC_IGB")
	private String ipcIgb;

	@Column (columnDefinition="CHAR(5)")
	private String kapsam;

	@Column(name="SIGORTA_TURU", columnDefinition="CHAR(3)")
	private String sigortaTuru;

	@Column(name="YAS_KONTROLU")
	private String yasKontrolu;

	public String getAciklama() {
		return this.aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public boolean isBagimliMi() {
		return this.bagimliMi;
	}

	public void setBagimliMi(boolean bagimliMi) {
		this.bagimliMi = bagimliMi;
	}

	public Date getBaslangicTarihi() {
		return this.baslangicTarihi;
	}

	public void setBaslangicTarihi(Date baslangicTarihi) {
		this.baslangicTarihi = baslangicTarihi;
	}

	public Date getBitisTarihi() {
		return this.bitisTarihi;
	}

	public void setBitisTarihi(Date bitisTarihi) {
		this.bitisTarihi = bitisTarihi;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getIpcIab() {
		return this.ipcIab;
	}

	public void setIpcIab(String ipcIab) {
		this.ipcIab = ipcIab;
	}

	public String getIpcIgb() {
		return this.ipcIgb;
	}

	public void setIpcIgb(String ipcIgb) {
		this.ipcIgb = ipcIgb;
	}

	public String getKapsam() {
		return this.kapsam;
	}

	public void setKapsam(String kapsam) {
		this.kapsam = kapsam;
	}

	public String getSigortaTuru() {
		return this.sigortaTuru;
	}

	public void setSigortaTuru(String sigortaTuru) {
		this.sigortaTuru = sigortaTuru;
	}

	public String getYasKontrolu() {
		return this.yasKontrolu;
	}

	public void setYasKontrolu(String yasKontrolu) {
		this.yasKontrolu = yasKontrolu;
	}

	@Override
	public Integer getId() {
		return id;
	}

}