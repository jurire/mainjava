package gov.sgk.sgep.base.api.model.configuration;

import javax.persistence.Entity;
import javax.persistence.Table;

import gov.sgk.sgep.base.api.model.BaseModel;

/**
 * Sistem özelliklerinin veri tabanı hali
 * 
 * @author o-mssahin
 * @since 8 Eki 2015
 *
 */
@Entity
@Table (name="SYS_APP_CONFIGURATION")
public class ApplicationConfiguration extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
