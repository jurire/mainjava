package gov.sgk.sgep.base.ui.jsf.csv;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.validate.ClientValidator;

import gov.sgk.sgep.utility.SgepConstants;
import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 *
 */
@FacesValidator("sgep.validator.tckn")
public class TcknValidator implements Validator, ClientValidator {

	@Override
	public Map<String, Object> getMetadata() {
		return null;
	}

	@Override
	public String getValidatorId() {
		return "sgep.validator.tckn";
	}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String sValue = Utility.toString(value);
		if (StringUtils.startsWith(sValue, "0") || StringUtils.length(sValue) != 11) {
			//TODO hata mesajını locale'e göre al
			throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation Error", sValue + "Kimlik Numarası geçersiz. İşleme devam edilemez."));
		}
		if (StringUtils.startsWith(sValue, "9") ) {
			if(SgepConstants.TURKIYE_KOD.equals(getCountryCode(component, "country")))
			{
				throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Validation Error", sValue + "Kimlik Numarası ile Uyruk uyumlu değil. İşleme devam edilemez."));
			}
		}
	}
	
	/**
	 * countryCode boş ise tckn kontrolü yap, eğer boş değil Türkiye'yse yap
	 * @param countryCode
	 * @param tckn boş ise validation'u hiç bir şekilde yapma
	 * @return
	 */
	/*
	private boolean isTcknValidationWillBeMade (String countryCode, String tckn) {
		//boolean b = StringUtils.isNoneBlank("");
		return StringUtils.isNotBlank(tckn) &&  (StringUtils.isBlank(countryCode) || SgepConstants.TURKIYE_KOD.equals(countryCode));
		
	}
	*/
	
	private String getCountryCode (UIComponent component, String countryElementId) {
		String result = null;
		try {
			result = Utility.toString(((SelectOneMenu)component.getParent().findComponent(countryElementId)).getValue());			
		} catch (Exception e) {
		}
		return result;
	}

}
