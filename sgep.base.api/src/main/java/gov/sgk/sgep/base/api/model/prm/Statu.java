package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;
import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_STATU")
public class Statu extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int kod;

	@Column(name = "aciklama")
	@Length(max = 100)
	private String aciklama;
	
	/**
	 * SPAS'a bilgi gidip gitmeyeceği
	 */
	@Convert(converter=BooleanToStringConverter.class)
	private boolean spas;

	@Override
	public Serializable getId() {
		return getKod();
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public boolean isSpas() {
		return spas;
	}

	public void setSpas(boolean spas) {
		this.spas = spas;
	}


}
