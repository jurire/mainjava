package gov.sgk.sgep.base.api.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * İşlem id alanı bütün tablolarda olmadığı için kalıtıma bu sınıf eklendi.
 * @author o-mssahin
 * @since 18 Kas 2015
 *
 */
@MappedSuperclass
public abstract class ACommon implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column
	private Timestamp eklemeZamani;

	@Column
	private Timestamp guncellemeZamani;

	
	@Column (length = 100)
	private String kullanici;
	
	@NotNull
	@Version
	private int surum;
	
	public ACommon() {
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
	}

	public Timestamp getEklemeZamani() {
		return eklemeZamani;
	}

	public Timestamp getGuncellemeZamani() {
		return guncellemeZamani;
	}

	public void setGuncellemeZamani(Timestamp guncellemeZamani) {
		this.guncellemeZamani = guncellemeZamani;
	}

	public void setEklemeZamani(Timestamp eklemeZamani) {
		this.eklemeZamani = eklemeZamani;
	}

	public String getKullanici() {
		return kullanici;
	}

	public void setKullanici(String kullanici) {
		this.kullanici = kullanici;
	}

	public abstract Serializable getId ();

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj.getClass().equals(this.getClass())) {
			Serializable id = this.getId();
			Serializable pId = ((ACommon) obj).getId();
			if (id != null ) {
				result = id.equals(pId);
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		Serializable id = getId();
		return id == null ? 0 : id.hashCode();
	}

	public int getSurum() {
		return surum;
	}

	public void setSurum(int surum) {
		this.surum = surum;
	}
}
