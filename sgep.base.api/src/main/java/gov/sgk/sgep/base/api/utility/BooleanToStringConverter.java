package gov.sgk.sgep.base.api.utility;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanToStringConverter implements AttributeConverter<Boolean, String> {

	@Override
	public String convertToDatabaseColumn(Boolean value) {
		return (value != null && value) ? "E" : "H";
	}

	@Override
	public Boolean convertToEntityAttribute(String value) {
		return "E".equals(value);
	}

}