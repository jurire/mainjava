package gov.sgk.sgep.base.ui.model;

import java.io.Serializable;
import java.util.Date;

public class KimlikNoVeIseGirisTarihiGirisi implements Serializable{

	 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private String uyruk;
     
	    private String kimlikNo;
	     
	    private Date iseGirisTarihi;

		public String getUyruk() {
			return uyruk;
		}

		public void setUyruk(String uyruk) {
			this.uyruk = uyruk;
		}

		public String getKimlikNo() {
			return kimlikNo;
		}

		public void setKimlikNo(String kimlikNo) {
			this.kimlikNo = kimlikNo;
		}

		public Date getIseGirisTarihi() {
			return iseGirisTarihi;
		}

		public void setIseGirisTarihi(Date iseGirisTarihi) {
			this.iseGirisTarihi = iseGirisTarihi;
		}
	     
}
