package gov.sgk.sgep.base.model.system;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gov.sgk.sgep.base.api.model.BaseModel;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * The persistent class for the MUCBIR_OLAY database table.
 * @author o-mssahin
 */
@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "MUCBIR_OLAY")
@NamedQuery(name = "MucbirOlay.findAll", query = "SELECT m FROM MucbirOlay m")
public class MucbirOlay extends BaseModel {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name = "BASLANGIC_TARIHI")
	private Date baslangicTarihi;

	@Temporal(TemporalType.DATE)
	@Column(name = "BELGE_VERME_TARIHI")
	private Date belgeVermeTarihi;

	@Temporal(TemporalType.DATE)
	@Column(name = "BITIS_TARIHI")
	private Date bitisTarihi;

	@Column(name = "ETKI_ALANI", columnDefinition="CHAR")
	private String etkiAlani;

	@Column(name = "MUCBIR_SEBEP_ID")
	private short mucbirSebepId;

	public MucbirOlay() {
	}

	public Date getBaslangicTarihi() {
		return this.baslangicTarihi;
	}

	public void setBaslangicTarihi(Date baslangicTarihi) {
		this.baslangicTarihi = baslangicTarihi;
	}

	public Date getBelgeVermeTarihi() {
		return this.belgeVermeTarihi;
	}

	public void setBelgeVermeTarihi(Date belgeVermeTarihi) {
		this.belgeVermeTarihi = belgeVermeTarihi;
	}

	public Date getBitisTarihi() {
		return this.bitisTarihi;
	}

	public void setBitisTarihi(Date bitisTarihi) {
		this.bitisTarihi = bitisTarihi;
	}

	public String getEtkiAlani() {
		return this.etkiAlani;
	}

	public void setEtkiAlani(String etkiAlani) {
		this.etkiAlani = etkiAlani;
	}

	public short getMucbirSebepId() {
		return this.mucbirSebepId;
	}

	public void setMucbirSebepId(short mucbirSebepId) {
		this.mucbirSebepId = mucbirSebepId;
	}

}