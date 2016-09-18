package gov.sgk.sgep.base.ui.jsf.resolver;

import java.io.UnsupportedEncodingException;

import javax.el.ELContext;
import javax.el.ResourceBundleELResolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * jsf içinden properties'den okunan değerlerin utf-8 olmasını sağlar
 * @author o-mssahin
 * @issue 177
 *
 */
public class DefaultResourceBundleELResolver extends ResourceBundleELResolver {

	private static final Logger LOGGER = LoggerFactory.getLogger("");
	
	@Override
	public Object getValue(ELContext context, Object base, Object property) {
		Object result = null;
		Object temp = super.getValue(context, base, property);
		if (temp != null) {
			try {
				result = new String(temp.toString().getBytes(SgepConstants.CHARSET_ISO_8859_1), SgepConstants.CHARSET_UTF_8);
			} catch (UnsupportedEncodingException e) {
				LOGGER.error("EncodingException", e);
				result = "??ex??" + property;
			}
		}
		return result;
	}
	
}
