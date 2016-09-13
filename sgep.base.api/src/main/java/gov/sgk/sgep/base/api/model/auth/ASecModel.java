package gov.sgk.sgep.base.api.model.auth;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.GenericGenerator;

import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;

/**
 * Security Modellerin ana sınıfı
 * 
 * @author o-mssahin
 * @since 18 Kas 2015
 *
 */
@MappedSuperclass
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"modulAdi", "isim"})})
public abstract class ASecModel extends AModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String id;
	
	@Column
	private String modulAdi;
	
	@Column (length=100)
	private String isim;
	
	@Convert(converter=BooleanToStringConverter.class)
	private boolean aktifMi;

	public boolean isAktifMi() {
		return aktifMi;
	}

	public void setAktifMi(boolean aktifMi) {
		this.aktifMi = aktifMi;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModulAdi() {
		return modulAdi;
	}

	public void setModulAdi(String modulAdi) {
		this.modulAdi = modulAdi;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ASecModel) {
			ASecModel model = (ASecModel) obj;
			return StringUtils.equalsIgnoreCase(model.secModelName(), this.secModelName()) &&
					StringUtils.equalsIgnoreCase(model.id, this.id) &&
					StringUtils.equalsIgnoreCase(model.modulAdi, this.modulAdi); 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(secModelName(), id, modulAdi);
	}

	/**
	 * @return model'in ismi
	 */
	public abstract String secModelName ();

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	@Override
	public String toString() {
		return String.format("%s:{%s, %s}", this.secModelName(), this.getIsim(), this.getModulAdi());
	}
	
}
