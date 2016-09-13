package gov.sgk.sgep.base.spring.security.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.utility.Assert;

/**
 * 
 * @author o-mssahin
 * @since 20 Kas 2015
 *
 */
public abstract class ADomainUserService implements IDomainUserService {

	protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	protected IDomainSecurityService domainSecurityService;
	
	/**
	 * user'a veri tabanından çekilen rolleri ekler. Veri tabanından çekilen rollerde function'lar da vardır. 
	 * Security ona göre kontrol eder.
	 * @param user
	 */
	public void addRolesToUser (DomainUser user ) {
		Assert.notNull(user, "user null olamaz");
		String loginName = user.getLoginName();
		List<? extends IRole> listRole = user.getRoles();
		LOGGER.info("loginName: {}, Role count: {}", loginName, Objects.toString(listRole, "rol yok"));
		LOGGER.info("domainSecurityService: {}", domainSecurityService);
		List<Role> newListRole = new ArrayList<>();
		String modulAdi = SpringContextProvider.getSystemPropertiesWrapper().getModulAdi();
		if (CollectionUtils.isNotEmpty(listRole)) {
			for (int i = 0; i < listRole.size(); i++) {
				if (listRole.get(i) != null) {
					Role dbRole = domainSecurityService.getRole(listRole.get(i).getId(), modulAdi);
					newListRole.add(dbRole);	
				}
			} 
		}
		user.setRoles(newListRole);		
	}
}
