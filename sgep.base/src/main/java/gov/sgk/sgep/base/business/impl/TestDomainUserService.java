package gov.sgk.sgep.base.business.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.DisableSecurity;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.api.utility.UsernamePasswordInvalidException;
import gov.sgk.sgep.base.spring.security.service.ADomainUserService;
import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 * @since 9 Eki 2015
 *
 */
@Service ("testDomainUserService")
public class TestDomainUserService extends ADomainUserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestDomainUserService.class);
	
	public static List<DomainUser> list = new ArrayList<>();
	
	static {
		DomainUser user = new DomainUser();
		user.setLoginName(DomainUser.USER_NAME_ADMIN);
		user.setPassword("password - admin");
		user.setUniteKod("ünite - admin");
		user.setRoles(Arrays.asList(Role.createRole(IRole.ROLE_ID_ADMIN)));
		list.add(user);
		
		user = new DomainUser();
		user.setLoginName(DomainUser.USER_NAME_TEST);
		user.setPassword("password - test");
		user.setUniteKod("ünite - test");
		user.setRoles(Arrays.asList(Role.createRole(IRole.ROLE_ID_TEST)));
		list.add(user);
	}
	
	@Override
	public DomainUser getDomainUserById(Serializable id) {
		LOGGER.debug("getting domain user by id: {}", id);
		final String username = Utility.toString(id);
		DomainUser user = CollectionUtils.find(list, new Predicate<DomainUser>() {
			@Override
			public boolean evaluate(DomainUser object) {
				return StringUtils.equalsIgnoreCase(object.getLoginName(), username);
			}
		});
		try {
			addRolesToUser(user);
		} catch (Exception e) {
			LOGGER.error("Kullanıcıya rol eklemede hata. Roller TestDomainUser için elle verilecek");
		}
		return user;
	}

	@DisableSecurity
	@Override
	public DomainUser login(Serializable id, String password) throws UsernamePasswordInvalidException {
		DomainUser user = getDomainUserById(id);
		//Providerlar birden fazla olduğu için aykırı durum üretmek yerine null dönmeliyiz 
		//if (user == null) throw new UsernamePasswordInvalidException();
		LOGGER.debug("login by id: {}, user: {}", id, user);
		return user;
	}

}
