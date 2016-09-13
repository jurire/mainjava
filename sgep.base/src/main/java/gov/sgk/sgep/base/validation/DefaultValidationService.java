package gov.sgk.sgep.base.validation;

import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.validation.IValidationService;

/**
 * {@link javax.validation.Validation} metotlarını kullanarak doğrulama yapar.<br>
 * 
 * @author o-mssahin
 * @since 5 Eki 2015
 *
 */
@Service
public class DefaultValidationService implements IValidationService {

	@Override
	public void validatePrePersistence(Object entity) {
//		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//		Validator validator = factory.getValidator();
//		validator.validate(entity);		
	}

	@Override
	public boolean isAktif() {
		return true;
	}

}
