package gov.sgk.sgep.base.api.business;

import java.util.List;

import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.model.auth.Function;

/**
 * Güvenlikle ilgili davranışları belirler<br>
 * Örneğin rol'ün fonksiyonu çalıştırmaya yetkili olup olmadığının davranışları gibi.
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
public interface ISecurityDeterminer {

	/**
	 * 
	 * @param role
	 * @param function
	 * @return role function'ı çalıştırmaya yetkili mi?
	 */
	boolean authorized (IRole role, Function function);
	
	/**
	 * 
	 * @param roles
	 * @param function
	 * @return Genel mantık role'lerin içinde function yetkili mi? 
	 */
	boolean authorized (List<? extends IRole> roles, Function function);
	
}
