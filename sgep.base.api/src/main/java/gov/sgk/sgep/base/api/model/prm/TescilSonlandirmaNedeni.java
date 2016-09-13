package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "P_TESCIL_SONLANDIRMA_NEDENI")
public class TescilSonlandirmaNedeni extends ParameterModel {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	
	@Size (max=5)
	@NotNull
	private String kapsam;
	
	@Size (max=3)
	@NotNull
	private String kod;
	
	@Size (max=50)
	private String aciklama;
	
	/**
	 * SPAS'a bilgi gidip gitmeyeceği
	 */
	@Convert(converter=BooleanToStringConverter.class)
	private boolean spas;
	
	public String getKapsam() {
		return kapsam;
	}

	public void setKapsam(String kapsam) {
		this.kapsam = kapsam;
	}
	

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	@Override
	public Serializable getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public boolean isSpas() {
		return spas;
	}

	public void setSpas(boolean spas) {
		this.spas = spas;
	}
	
}
