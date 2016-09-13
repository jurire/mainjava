package gov.sgk.sgep.base.api.model.system;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import gov.sgk.sgep.base.api.model.BaseModel;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * The persistent class for the MUCBIR_MODUL database table.
 * @author o-mssahin
 */
@Entity
@NamedQuery(name = "MucbirModul.findAll", query = "SELECT m FROM MucbirModul m")
@Table(schema = SgepConstants.SCHEMA_BASE, name = "MUCBIR_MODUL")
public class MucbirModul extends BaseModel {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "MODUL_ID")
	private short modulId;

	@Column(name = "MUCBIR_OLAY_ID")
	private int mucbirOlayId;

	public MucbirModul() {
	}

	public short getModulId() {
		return this.modulId;
	}

	public void setModulId(short modulId) {
		this.modulId = modulId;
	}

	public int getMucbirOlayId() {
		return this.mucbirOlayId;
	}

	public void setMucbirOlayId(int mucbirOlayId) {
		this.mucbirOlayId = mucbirOlayId;
	}

}