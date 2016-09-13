package gov.sgk.sgep.base.api.model.prm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import gov.sgk.sgep.base.api.model.BaseModel;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Uyarı, Bilgilendirme ve Hata mesajlarının modeli
 * 
 * @author o-mssahin
 *
 */
@Entity
@Table (schema = SgepConstants.SCHEMA_BASE, name="P_MESAJ")
public class Mesaj extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static enum Tip {
		INFO ('B'), WARNING ('U'), ERROR ('H');
		private char symbol;
		private Tip (char symbol){
			this.symbol = symbol;
		}
		public char getSymbol() {
			return symbol;
		}
	}	

	private int mesajNo;
	
	@NotNull @Size (max=10)
	private String modulAdi;
	
	@NotNull @Size (max=250)
	private String mesajMetni;
	
	@NotNull @Size (max=100)
	private String kisaAciklama;
	
	@NotNull
	private char mesajTipi;
	
	@Column (columnDefinition="CHAR")
	private String dil;
	
	public String getMesajMetni() {
		return mesajMetni;
	}

	public void setMesajMetni(String mesajMetni) {
		this.mesajMetni = mesajMetni;
	}

	public String getKisaAciklama() {
		return kisaAciklama;
	}

	public void setKisaAciklama(String kisaAciklama) {
		this.kisaAciklama = kisaAciklama;
	}

	public char getMesajTipi() {
		return mesajTipi;
	}

	public void setMesajTipi(char mesajTipi) {
		this.mesajTipi = mesajTipi;
	}

	public int getMesajNo() {
		return mesajNo;
	}

	public void setMesajNo(int mesajNo) {
		this.mesajNo = mesajNo;
	}

	public String getModulAdi() {
		return modulAdi;
	}

	public void setModulAdi(String modulAdi) {
		this.modulAdi = modulAdi;
	}
	
	/**
	 * 
	 * @param content
	 * @return
	 */
	public static Mesaj createNotFoundMesaj (String content) {
		Mesaj result = new Mesaj();
		result.setMesajMetni(content);
		result.setKisaAciklama(content);
		result.setMesajTipi(Tip.WARNING.getSymbol());
		return result;		
	}

	public String getDil() {
		return dil;
	}

	public void setDil(String dil) {
		this.dil = dil;
	}
	
}
