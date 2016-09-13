package gov.sgk.sgep.base.api.domain;

import java.io.Serializable;

import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.base.api.model.auth.Role;

/**
 * 
 * @author o-mssahin
 * @since 7 Eki 2015
 *
 */
public interface IRole extends Serializable {
	
	String ROLE_ID_ADMIN = "ROLE_ADMIN";
	String ROLE_ID_TEST = "ROLE_TEST";
	String ROLE_ID_DUMMY = "ROLE_DUMMY";
	
	String getId ();
	
	/**
	 * ROLE_DUMMY
	 */
	IRole DUMMY = Role.createRole(ROLE_ID_DUMMY);
	
	/**
	 * ROLE_TEST
	 */
	IRole TEST = Role.createRole(ROLE_ID_TEST);

	boolean hasFunction(String functionId);
	
	/**
	 * 
	 * @param functionId
	 * @return
	 */
	Function getFunction(String functionId);
	

}
