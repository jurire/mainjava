package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_UNITE")
public class Unite extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "kod")
	@NotNull
	private int kod;

	@Size(max = 50)
	@NotNull
	@NotEmpty
	private String uniteAdi;

	@Column(name = "UNITE_KODU_4A")
	private Integer uniteKodu4A;

	@Column(name = "UNITE_KODU_4B")
	private Integer uniteKodu4B;

	@Column(name = "UNITE_KODU_4C")
	private Integer uniteKodu4C;

	private BigDecimal telefonNo;

	@Column(name = "e_posta")
	private String ePosta;

	@Column(name = "posta_adresi")
	private String postaAdresi;

	@Column(name = "bagli_oldugu_unite")
	private Integer bagliOlduguUnite;

	private Integer aylikBaglayanUnite;

	public Integer getUniteKodu4A() {
		return uniteKodu4A;
	}

	public void setUniteKodu4A(Integer uniteKodu4A) {
		this.uniteKodu4A = uniteKodu4A;
	}

	public Integer getUniteKodu4B() {
		return uniteKodu4B;
	}

	public void setUniteKodu4B(Integer uniteKodu4B) {
		this.uniteKodu4B = uniteKodu4B;
	}

	public Integer getUniteKodu4C() {
		return uniteKodu4C;
	}

	public void setUniteKodu4C(Integer uniteKodu4C) {
		this.uniteKodu4C = uniteKodu4C;
	}

	public BigDecimal getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(BigDecimal telefonNo) {
		this.telefonNo = telefonNo;
	}

	public Integer getAylikBaglayanUnite() {
		return aylikBaglayanUnite;
	}

	public void setAylikBaglayanUnite(Integer aylikBaglayanUnite) {
		this.aylikBaglayanUnite = aylikBaglayanUnite;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public String getUniteAdi() {
		return uniteAdi;
	}

	public void setUniteAdi(String uniteAdi) {
		this.uniteAdi = uniteAdi;
	}


	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPostaAdresi() {
		return postaAdresi;
	}

	public void setPostaAdresi(String postaAdresi) {
		this.postaAdresi = postaAdresi;
	}

	public Integer getBagliOlduguUnite() {
		return bagliOlduguUnite;
	}

	public void setBagliOlduguUnite(Integer bagliOlduguUnite) {
		this.bagliOlduguUnite = bagliOlduguUnite;
	}

	@Override
	public Serializable getId() {
		return kod;
	}

}
