package gov.sgk.sgep.base.api.model.auth;

import javax.persistence.Entity;
import javax.persistence.Table;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@Entity
@Table (schema=SgepConstants.SCHEMA_BASE, name="YTK_FONKSIYON")
public class Function extends ASecModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public static Function DUMMY = new Function(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
		public boolean isAktifMi() {
			return false;
		}
	};


	@Override
	public final String secModelName() {
		return "Function";
	}
	
}
