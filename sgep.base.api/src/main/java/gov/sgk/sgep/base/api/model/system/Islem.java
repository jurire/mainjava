package gov.sgk.sgep.base.api.model.system;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import gov.sgk.sgep.utility.SgepConstants;

@Entity
@Table(schema = SgepConstants.SCHEMA_BASE, name = "ISLEM")
public class Islem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSurum() {
		return surum;
	}

	public void setSurum(int surum) {
		this.surum = surum;
	}

	@NotNull
	@Version
	private int surum;
	
	@Column(name = "oturum_id", nullable = false)
	private String oturumId;
	
	@Column(name = "uygulama_kodu", nullable = false, columnDefinition="CHAR")
	@Size (max=10)
	private String uygulamaKodu;
	
	@Column(name = "islem_zamani", nullable = false)
	private Timestamp islemZamani;

	public String getUygulamaKodu() {
		return uygulamaKodu;
	}

	public void setUygulamaKodu(String uygulamaKodu) {
		this.uygulamaKodu = uygulamaKodu;
	}
	
	public Timestamp getIslemZamani() {
		return islemZamani;
	}

	public void setIslemZamani(Timestamp islemZamani) {
		this.islemZamani = islemZamani;
	}
}
