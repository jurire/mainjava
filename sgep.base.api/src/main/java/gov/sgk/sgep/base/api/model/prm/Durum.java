package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the P_DURUM database table.
 * 
 */
@Entity
@Table(name="P_DURUM")
@NamedQuery(name="Durum.findAll", query="SELECT p FROM Durum p")
public class Durum extends ParameterModel {
	private static final long serialVersionUID = 1L;

	private String aciklama;
	
	@Id
	private short kodu;

	public Durum() {
	}

	public String getAciklama() {
		return this.aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public short getKodu() {
		return this.kodu;
	}

	public void setKodu(short kodu) {
		this.kodu = kodu;
	}

	@Override
	public Serializable getId() {
		return kodu;
	}

}