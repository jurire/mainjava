package gov.sgk.sgep.base.api.model.prm;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;

/**
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
@MappedSuperclass 
public abstract class ParameterModel extends AModel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@NotNull
	@Column
	@Transient
	private Date gecerlillikTarihiBaslangic;

	@Column
	@Transient
	private Date gecerlillikTarihiBitis;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean aktifMi;

	public Date getGecerlillikTarihiBaslangic() {
		return gecerlillikTarihiBaslangic;
	}

	public void setGecerlillikTarihiBaslangic(Date gecerlillikTarihiBaslangic) {
		this.gecerlillikTarihiBaslangic = gecerlillikTarihiBaslangic;
	}

	public Date getGecerlillikTarihiBitis() {
		return gecerlillikTarihiBitis;
	}

	public void setGecerlillikTarihiBitis(Date gecerlillikTarihiBitis) {
		this.gecerlillikTarihiBitis = gecerlillikTarihiBitis;
	}
	
	public boolean isAktifMi() {
		return aktifMi;
	}

	public void setAktifMi(boolean aktifMi) {
		this.aktifMi = aktifMi;
	}
	
}
