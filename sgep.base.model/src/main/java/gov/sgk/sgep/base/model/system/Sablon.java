package gov.sgk.sgep.base.model.system;

import java.util.Locale;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import gov.sgk.sgep.base.api.model.BaseModel;
import gov.sgk.sgep.utility.SgepConstants;


/**
 * 
 * @author o-mssahin
 *
 */
//@Entity
@Table (schema = SgepConstants.SCHEMA_BASE, name="SABLON")
public class Sablon extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "sablon", fetch=FetchType.EAGER)
	private Set<SablonDeger> degerler;
	
	@NotNull @Size (max=10)
	@Column (columnDefinition="CHAR(10)")
	private String modulAdi;
	
	@Column (length=500)
	private String aciklama;
	

	public Set<SablonDeger> getDegerler() {
		return degerler;
	}

	public void setDegerler(Set<SablonDeger> degerler) {
		this.degerler = degerler;
	}
	
	/**
	 * 
	 * @param locale
	 * @return null bulamazsa
	 */
	@Transient
	public SablonDeger getSablonDeger (Locale locale) {
		for (SablonDeger deger: this.degerler) {
			if (deger.getDil().equals(locale.getLanguage())) {
				return deger;
			}
		}
		return null;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getModulAdi() {
		return modulAdi;
	}

	public void setModulAdi(String modulAdi) {
		this.modulAdi = modulAdi;
	}
	
}
