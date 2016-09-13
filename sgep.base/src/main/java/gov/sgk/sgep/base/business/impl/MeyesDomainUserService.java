package gov.sgk.sgep.base.business.impl;

import java.io.Serializable;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.DisableSecurity;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.api.utility.UsernamePasswordInvalidException;
import gov.sgk.sgep.base.spring.BusinessService;
import gov.sgk.sgep.base.spring.security.service.ADomainUserService;
import gov.sgk.sgep.base.webservice.consumer.meyes.MeyesClient;
import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.KullaniciBilgiYetkiGetirResponse;
import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.MeyesKullaniciYetkiUniteVO;
import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
@BusinessService
@org.springframework.transaction.annotation.Transactional (readOnly=true)
@Service ("meyesDomainUserService")
public class MeyesDomainUserService extends ADomainUserService {

	@Autowired (required=false)
	MeyesClient meyesClient;
	
	@Override
	public DomainUser getDomainUserById(Serializable id) {
		LOGGER.debug("getting domain user by id: {}", id);
		String username = StringUtils.leftPad(Utility.toString(id), 8, '0');
		
		KullaniciBilgiYetkiGetirResponse res = meyesClient.getKullaniciBilgiYetki(username, "uygtest", "10.254.5.12");
		MeyesKullaniciYetkiUniteVO meyesUser= res.getKullaniciBilgiYetkiGetirReturn();
		//ctx.close();
		DomainUser user = new DomainUser();
		
		if(meyesUser.getSonucKodu() == 0)
		{
			user.setAdi(meyesUser.getKullaniciAdi());
			user.setSoyadi(meyesUser.getKullaniciSoyadi());
			user.setPassword("test");
			user.setTcKimlikNo(meyesUser.getKullaniciTcKimlikNo());
			user.setLoginName(meyesUser.getKullaniciKod());
			user.setRoles(Arrays.asList(Role.createRole(IRole.ROLE_ID_ADMIN)));
		}
		addRolesToUser(user);
		return user;
	}

/*
	@Override
	public DomainUser getDomainUserById(Serializable id) {
		LOGGER.debug("getting domain user by id: {}", id);
		final String username = Utility.toString(id);
		//TODO şimdilik kullanıcı list'den alınıyor
		DomainUser user = CollectionUtils.find(TestDomainUserService.list, new Predicate<DomainUser>() {
			@Override
			public boolean evaluate(DomainUser object) {
				return StringUtils.equals(object.getLoginName(), username);
			}
		});
		
		//TODO rollerini ayarla, rolleri vt'den al function'lar ve menü'ler dolu şekilde
		//TODO rolleri meyesden gelenlere göre ayarla
		List<? extends IRole> listRole = user.getRoles();
		LOGGER.info("userid: {}, Role count: {}", id, Objects.toString(listRole, "rol yok"));
		LOGGER.info("domainSecurityService: {}", domainSecurityService);
		List<Role> newListRole = new ArrayList<>();

		for (int i = 0; i < listRole.size(); i++) {
			Role dbRole = domainSecurityService.getRole(listRole.get(i).getId());
			newListRole.add(dbRole);	
		} 
		user.setRoles(newListRole);
		
		return user;
	}
*/

	@DisableSecurity
	@Override
	public DomainUser login(Serializable id, String password) throws UsernamePasswordInvalidException {
		//TODO id ve password'u meyes'e gönderilmeli
		//Aşağıyı değiştir
		DomainUser user = getDomainUserById(id);
		//Providerlar birden fazla olduğu için aykırı durum üretmek yerine null dönmeliyiz 
		//if (user == null) throw new UsernamePasswordInvalidException();
		LOGGER.debug("login by id: {}", id);
		return user;
	}

}
