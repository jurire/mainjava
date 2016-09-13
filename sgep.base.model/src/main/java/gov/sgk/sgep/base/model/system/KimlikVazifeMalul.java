package gov.sgk.sgep.base.model.system;

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
 * The persistent class for the KIMLIK_VAZIFE_MALUL database table.
 * 
 */
@Entity
@Table(schema=SgepConstants.SCHEMA_BASE, name="KIMLIK_VAZIFE_MALUL")
@NamedQuery(name="KimlikVazifeMalul.findAll", query="SELECT k FROM KimlikVazifeMalul k")
public class KimlikVazifeMalul extends AModel {
	private static final long serialVersionUID = 1L;

	@Size (max=50)
	private String adi;

	@Temporal(TemporalType.DATE)
	@Column(name="ILK_TESCIL_TARIHI_4C")
	private Date ilkTescilTarihi4c;

	@Size (max=50)
	private String soyadi;

	@Id
	@Column(name="TC_KIMLIK_NO")
	private BigDecimal tcKimlikNo;

	public KimlikVazifeMalul() {
	}

	public String getAdi() {
		return this.adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public Date getIlkTescilTarihi4c() {
		return this.ilkTescilTarihi4c;
	}

	public void setIlkTescilTarihi4c(Date ilkTescilTarihi4c) {
		this.ilkTescilTarihi4c = ilkTescilTarihi4c;
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

	@Override
	public Serializable getId() {
		return tcKimlikNo;
	}

}