package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;
import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_ULKE")
public class Ulke extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private String kod;

	@Column(name = "KOD_KPS")
	private Integer kodKPS;

	@Size(max = 30)
	@NotNull
	private String ulkeAdi;

	@Convert (converter=BooleanToStringConverter.class)
	private boolean sozlesmeliMi;

	private Date sozlesmeBaslangicTarihi;

	private Integer stajSuresi;

	private Character yasalKazaSigortasi;

	private Integer telefonKodu;

	private Integer siralamaOnceligi;

	public Date getSozlesmeBaslangicTarihi() {
		return sozlesmeBaslangicTarihi;
	}

	public void setSozlesmeBaslangicTarihi(Date sozlesmeBaslangicTarihi) {
		this.sozlesmeBaslangicTarihi = sozlesmeBaslangicTarihi;
	}

	public Integer getStajSuresi() {
		return stajSuresi;
	}

	public void setStajSuresi(Integer stajSuresi) {
		this.stajSuresi = stajSuresi;
	}

	public Character getYasalKazaSigortasi() {
		return yasalKazaSigortasi;
	}

	public void setYasalKazaSigortasi(Character yasalKazaSigortasi) {
		this.yasalKazaSigortasi = yasalKazaSigortasi;
	}

	public Integer getTelefonKodu() {
		return telefonKodu;
	}

	public void setTelefonKodu(Integer telefonKodu) {
		this.telefonKodu = telefonKodu;
	}

	public Integer getSiralamaOnceligi() {
		return siralamaOnceligi;
	}

	public void setSiralamaOnceligi(Integer siralamaOnceligi) {
		this.siralamaOnceligi = siralamaOnceligi;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getUlkeAdi() {
		return ulkeAdi;
	}

	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}

	@Override
	public Serializable getId() {
		return kod;
	}

	public Integer getKodKPS() {
		return kodKPS;
	}

	public void setKodKPS(Integer kodKPS) {
		this.kodKPS = kodKPS;
	}

	public boolean isSozlesmeliMi() {
		return sozlesmeliMi;
	}

	public void setSozlesmeliMi(boolean sozlesmeliMi) {
		this.sozlesmeliMi = sozlesmeliMi;
	}

}
