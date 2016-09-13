package gov.sgk.sgep.base.api.dao;

import java.util.Set;

import gov.sgk.sgep.base.api.model.auth.ASecModel;
import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Role;

/**
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
public interface IDomainSecurityDAO extends IBaseDAO {

	void addRole (Role role);
	
	Role getRole (String id, String modulAdi);
	
	void updateRole (Role role);

	Function getFunction(String id, String modulAdi);

	Menu getMenu(String id, String modulAdi);

	Set<Menu> listMenu(String modulAdi);

	Set<Role> listRole(String modulAdi);

	boolean existsModel(ASecModel model);
	
}
