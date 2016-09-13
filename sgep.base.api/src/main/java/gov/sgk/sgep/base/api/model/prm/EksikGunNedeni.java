package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_EKSIK_GUN_NEDENI")
public class EksikGunNedeni extends ParameterModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer kod;
	
	@Size (max=200)
	private String aciklama;

	@Override
	public Serializable getId() {
		return getKod();
	}

	public Integer getKod() {
		return kod;
	}

	public void setKod(Integer kod) {
		this.kod = kod;
	}

}
