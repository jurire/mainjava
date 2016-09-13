package gov.sgk.sgep.base.api.business;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;

import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.utility.UsernamePasswordInvalidException;
import gov.sgk.sgep.utility.Utility;

/**
 * Kullanıcı ldap'dan, web servis ile veya veri tabanından alınabilir.<br>
 * Bu arayüz bu tip kaynakları soyutlamak için kullanılır<br>
 * Validation da buradan yapılır
 * 
 * @author o-mssahin
 * @since 8 Eki 2015
 *
 */
public interface IDomainUserService {

	/**
	 * 
	 * @param id tckn, sicil no, oid gibi herhangi bir değer olabilir
	 * @return
	 */
	DomainUser getDomainUserById (Serializable id); 
	
	/**
	 * 
	 * @param id
	 * @param password
	 * @return giriş yapılabilirse domainUser döndürülür, kullanıcı bulunamazsa <b>null</b> dönün. Null dönülmesinin sebebi manager'daki bütün provider'larda denenmesi için null kontrolü yapılıyor.
	 * 
	 */
	DomainUser login (Serializable id, String password) throws UsernamePasswordInvalidException;
	
	/**
	 * 
	 * @return dummy servis nesnesi
	 */
	IDomainUserService DUMMY_SERVICE = new IDomainUserService(){
		@Override
		public DomainUser getDomainUserById(Serializable id) {
			if (StringUtils.isEmpty(Utility.toString(id))) {
				return null;
			}
			LoggerFactory.getLogger("Dummy DomainUserService").warn("Dummy domain user getiriliyor");
			return DomainUser.DUMMY;
		}

		@Override
		public DomainUser login(Serializable id, String password) {
			return getDomainUserById(id);
		}
	};
	
}
