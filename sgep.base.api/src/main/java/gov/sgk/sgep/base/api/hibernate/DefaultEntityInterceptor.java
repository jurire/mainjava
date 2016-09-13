package gov.sgk.sgep.base.api.hibernate;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.validation.IValidationService;
import gov.sgk.sgep.base.api.web.ISessionProvider;
import gov.sgk.sgep.utility.SgepConstants;
import gov.sgk.sgep.utility.Utility;

/**
 * Hibernate işlemleri yapılırken bu kesici çalışmaktadır varsayılan olarak.<br>
 * 
 * 
 * @author o-mssahin
 * @since 5 Eki 2015
 *
 */
public class DefaultEntityInterceptor extends EmptyInterceptor {

	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultEntityInterceptor.class);
	
	IValidationService validationService;
	
	private ISessionProvider sessionProvider;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) {
		boolean result = false;
		if (entity instanceof ACommon) {
	        int indexOf = ArrayUtils.indexOf(propertyNames, "guncellemeZamani");
	        if (indexOf >= 0) {
		        currentState[indexOf] = createDateValue(entity, "guncellemeZamani");
		        result = true;
	        }
	        result = result | setKullanici((ACommon) entity, currentState, propertyNames);
	    }
		validatePrePersistence(entity);		
		return result;
	}

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		boolean result = false;
		if (entity instanceof ACommon) {
            int indexOf = ArrayUtils.indexOf(propertyNames, "eklemeZamani");
            if (indexOf >= 0) {
                state[indexOf] = createDateValue(entity, "eklemeZamani");
                result = true;
            }
            result = result | setKullanici ((ACommon) entity, state, propertyNames);            
        }
		validatePrePersistence(entity);		
		return result;
	}
	
	/**
	 * entity'deki kullanıcı'yı atar
	 * @param entity
	 * @return kullanıcı ile ilgili alan değiştirildiyse true
	 */
	private boolean setKullanici(ACommon entity, Object [] state, String [] propertyNames) {
		boolean result = false;
		String kullanici = sessionProvider != null ? sessionProvider.sessionUsername() : SgepConstants.UNKNOWN;
		int indexOf = ArrayUtils.indexOf(propertyNames, "kullanici");
        if (indexOf >= 0 && StringUtils.isBlank(Utility.toString(state[indexOf]))) {
        	String sKullanici = Utility.toString(state[indexOf]);
        	if (!StringUtils.equals(sKullanici, kullanici)) {
        		state[indexOf] = kullanici;
        		result = true;
        	}
        }
        return result;
	}

	private Object createDateValue (Object entity, String propName) {
		return new Timestamp(new Date().getTime());
	}
	
	/**
	 * validationService null değilse doğrulama işlemi çağrılır
	 * @param entity
	 */
	private void validatePrePersistence (Object entity) {
		if (validationService == null) {
			LOGGER.debug("ValidationService null. Doğrulama işlemi yapılmayacak.");
		} else if (validationService.isAktif()) {
			LOGGER.debug("ValidationService aktif. Doğrulama işlemi yapılacak.");
			validationService.validatePrePersistence(entity);
		} else {
			LOGGER.debug("ValidationService pasif. Doğrulama işlemi yapılmayacak.");
		}
	}

	public ISessionProvider getSessionProvider() {
		return sessionProvider;
	}

	public void setSessionProvider(ISessionProvider sessionProvider) {
		this.sessionProvider = sessionProvider;
	}

}
