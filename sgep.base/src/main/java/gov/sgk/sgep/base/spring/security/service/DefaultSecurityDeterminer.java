package gov.sgk.sgep.base.spring.security.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.business.ISecurityDeterminer;
import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.utility.Assert;

/**
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
@Service ("defaultSecurityDeterminer")
public class DefaultSecurityDeterminer implements ISecurityDeterminer {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultSecurityDeterminer.class);
	
	@Override
	public boolean authorized(IRole role, Function function) {
		boolean result = false;
		Assert.notNull(role, "role null olamaz");
		Assert.notNull(function, "function null olamaz");
		String functionId = function.getId();
		
		//parametre olarak gelen function yerine roldeki function'lara bakılıyor.
		//function parametresinin sadece id'si kullanılıyor
		Function mainFuntion = role.getFunction(functionId);
		
		if (mainFuntion == null) {
			LOGGER.info("Function [{}] not defined in role [{}]", functionId, role);
			result = false;
		} else if (mainFuntion.isAktifMi()) {
			result = true;
		} else { //not active
			LOGGER.info("Function [{}] not active in role [{}]", functionId, role);
		}
		
		return result;
	}

	@Override
	public boolean authorized(List<? extends IRole> roles, Function function) {
		Assert.notEmpty(roles, "roles boş olamaz");
		boolean result = false;
		for (IRole iRole : roles) {
			if (authorized(iRole, function)) {
				result = true;
				break;
			}
		}
		return result;
	}

}
