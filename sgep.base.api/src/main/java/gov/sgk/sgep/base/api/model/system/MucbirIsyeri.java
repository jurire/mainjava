package gov.sgk.sgep.base.api.model.system;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import gov.sgk.sgep.base.api.model.BaseModel;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * The persistent class for the MUCBIR_ISYERI database table.
 * 
 */
@Entity
@NamedQuery(name = "MucbirIsyeri.findAll", query = "SELECT m FROM MucbirIsyeri m")
@Table(schema = SgepConstants.SCHEMA_BASE, name = "MUCBIR_ISYERI")
public class MucbirIsyeri extends BaseModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "ESKI_SUBE")
	private BigDecimal eskiSube;

	private int il;

	private int ilce;

	@Column(name = "MUCBIR_OLAY_ID")
	private int mucbirOlayId;

	private BigDecimal sirano;

	@Column(name = "YENI_SUBE")
	private BigDecimal yeniSube;

	public MucbirIsyeri() {
	}

	public BigDecimal getEskiSube() {
		return this.eskiSube;
	}

	public void setEskiSube(BigDecimal eskiSube) {
		this.eskiSube = eskiSube;
	}

	public int getMucbirOlayId() {
		return this.mucbirOlayId;
	}

	public void setMucbirOlayId(int mucbirOlayId) {
		this.mucbirOlayId = mucbirOlayId;
	}

	public BigDecimal getSirano() {
		return this.sirano;
	}

	public void setSirano(BigDecimal sirano) {
		this.sirano = sirano;
	}

	public BigDecimal getYeniSube() {
		return this.yeniSube;
	}

	public void setYeniSube(BigDecimal yeniSube) {
		this.yeniSube = yeniSube;
	}
	
	public int getIl() {
		return il;
	}

	public void setIl(int il) {
		this.il = il;
	}

	public int getIlce() {
		return ilce;
	}

	public void setIlce(int ilce) {
		this.ilce = ilce;
	}

}