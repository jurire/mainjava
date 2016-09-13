package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_MALI_TATIL")
public class MaliTatil extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column
	private Date baslangicTarihi;

	@Column
	private Date bitisTarihi;

	@Override
	public Serializable getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBaslangicTarihi() {
		return baslangicTarihi;
	}

	public void setBaslangicTarihi(Date baslangicTarihi) {
		this.baslangicTarihi = baslangicTarihi;
	}

	public Date getBitisTarihi() {
		return bitisTarihi;
	}

	public void setBitisTarihi(Date bitisTarihi) {
		this.bitisTarihi = bitisTarihi;
	}

}
