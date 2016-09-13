package gov.sgk.sgep.base.api.model.auth;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "OTURUM")
public class Oturum extends ACommon {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@Column(name = "oturum_acilma_zamani")
	@NotNull
	private Timestamp oturumAcilmaZamani;
	
	@Column(name = "oturum_sonlanma_zamani")
	private Timestamp oturumSonlanmaZamani;
	
	@Column(name = "ip")
	@NotNull
	private String ip;
	
	@Column(name = "makine_adi", columnDefinition="CHAR(15)")
	private String makineAdi;
	
	public Timestamp getOturumAcilmaZamani() {
		return oturumAcilmaZamani;
	}

	public void setOturumAcilmaZamani(Timestamp oturumAcilmaZamani) {
		this.oturumAcilmaZamani = oturumAcilmaZamani;
	}
	
	public Timestamp getOturumSonlanmaZamani() {
		return oturumSonlanmaZamani;
	}

	public void setOturumSonlanmaZamani(Timestamp oturumSonlanmaZamani) {
		this.oturumSonlanmaZamani = oturumSonlanmaZamani;
	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getMakineAdi() {
		return makineAdi;
	}

	public void setMakineAdi(String makineAdi) {
		this.makineAdi = makineAdi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
