package gov.sgk.sgep.base.model.system;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import gov.sgk.sgep.base.api.model.BaseModel;

@Entity
@Table(name = "TCNO_SICILNO")
public class TCNoSicilNo extends BaseModel {

	private static final long serialVersionUID = 1L;

	@Column(name = "tc_kimlik_no")
	@NotNull
	private BigDecimal tcKimlikNo;

	@Column(name = "kapsam")
	@NotNull
	private String kapsam;

	@Column(name = "sicil_no")
	@Length (max=13)
	private BigDecimal sicilNo;

	@Column(name = "asil_iptal")
	private char asilIptal;

	public BigDecimal getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(BigDecimal tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getKapsam() {
		return kapsam;
	}

	public void setKapsam(String kapsam) {
		this.kapsam = kapsam;
	}

	public BigDecimal getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(BigDecimal sicilNo) {
		this.sicilNo = sicilNo;
	}

	public char getAsilIptal() {
		return asilIptal;
	}

	public void setAsilIptal(char asilIptal) {
		this.asilIptal = asilIptal;
	}

}
