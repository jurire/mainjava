package gov.sgk.sgep.base.api.model.system;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import gov.sgk.sgep.base.api.model.BaseModel;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * The persistent class for the MUCBIR_UNITE database table.
 * 
 */
@Entity
@NamedQuery(name = "MucbirUnite.findAll", query = "SELECT m FROM MucbirUnite m")
@Table(schema = SgepConstants.SCHEMA_BASE, name = "MUCBIR_UNITE")
public class MucbirUnite extends BaseModel {

	private static final long serialVersionUID = 1L;

	@Column(name = "ETKILENEN_UNITE")
	private BigDecimal etkilenenUnite;

	@Column(name = "MUCBIR_OLAY_ID")
	private int mucbirOlayId;

	public MucbirUnite() {
	}

	public BigDecimal getEtkilenenUnite() {
		return this.etkilenenUnite;
	}

	public void setEtkilenenUnite(BigDecimal etkilenenUnite) {
		this.etkilenenUnite = etkilenenUnite;
	}


	public int getMucbirOlayId() {
		return this.mucbirOlayId;
	}

	public void setMucbirOlayId(int mucbirOlayId) {
		this.mucbirOlayId = mucbirOlayId;
	}


}