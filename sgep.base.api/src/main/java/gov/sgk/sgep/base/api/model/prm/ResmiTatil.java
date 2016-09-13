package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_RESMI_TATIL")
public class ResmiTatil extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@NotNull
	private Date tarih;

	@Override
	public Serializable getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

}
