package gov.sgk.sgep.base.api.model.system;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
//@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "SABLON_DEGER" 
	//,uniqueConstraints = @UniqueConstraint(columnNames = {"SABLON_ID", "DIL"}) 
)
@IdClass(SablonDil.class)
public class SablonDeger extends AModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "SABLON_ID", nullable = false)
	@Id
	private Sablon sablon;

	@Column (columnDefinition="CHAR(5)", nullable = false)
	@Id
	private String dil;

	@Column(length = 100, unique = true, nullable = false)
	private String isim;

	@Column(length = 500)
	private String konu;

	@Lob
	@Column(nullable = false)
	private String icerik;

	@Transient
	private String sablonOid;

	public SablonDeger() {
		super();
	}

	public SablonDeger(String sablonOid, String isim) {
		super();
		this.isim = isim;
		this.sablonOid = sablonOid;
	}

	public String getKonu() {
		return konu;
	}

	public void setKonu(String konu) {
		this.konu = konu;
	}

	public String getIcerik() {
		return icerik;
	}

	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Sablon getSablon() {
		return sablon;
	}

	public void setSablon(Sablon sablon) {
		this.sablon = sablon;
	}

	public String getSablonOid() {
		return sablonOid;
	}

	public void setSablonOid(String sablonOid) {
		this.sablonOid = sablonOid;
	}

	public String getDil() {
		return dil;
	}

	public void setDil(String dil) {
		this.dil = dil;
	}

	@Override
	public Serializable getId() {
		return sablon.getId() + dil;
	}

}
