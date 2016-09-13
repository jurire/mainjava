package gov.sgk.sgep.base.api.utility;

import java.io.Writer;
import java.util.Map;

import gov.sgk.sgep.utility.SgepConstants;


/**
 * Map ve Metin'in birleştirilme işlemleri sonucunda kullanılacak içeriklerin metotlarının tanımları
 * @author o-mssahin
 *
 */
public interface ITemplateEngine {

	/**
	 * 
	 * @param metin
	 * @param map
	 * @param sablonId log için gönderilecek bir id, tag olarak kullanılır
	 * @return metin şablonla map'i birleştirip String döner
	 * @throws SigortaError herhangi bir hata olursa, sablonId boş gönderilirse
	 */
	String evaluate (String metin, Map<String, Object> map, String sablonId);
	
	/**
	 * 
	 * @param templateLocation getTemplateLocation... metoduyla alınabilir
	 * @param encoding UTF-8, ISO-8859-1 {@link SgepConstants}'da ilgili sabitler var
	 * @param model
	 * @param writer
	 */
	void mergeTemplate(String templateLocation, String encoding, Map<String, Object> model, Writer writer);
	
	/**
	 * 
	 * @param templateLocation getTemplateLocation... metoduyla alınabilir 
	 * @param model
	 * @param writer
	 */
	void mergeTemplate(String templateLocation, Map<String, Object> model, Writer writer);
	
	/**
	 * Sadece adını vererek template girilir<br>
	 * ilk önce file resource'da aranır, sonra classpath'e bakılır
	 * @param templateName
	 * @param model
	 * @param writer
	 */
	void mergeTemplateByNameWithoutLocale(String templateName, Map<String, Object> model, Writer writer);
	
	/**
	 * Sadece adını vererek template girilir<br>
	 * ilk önce file resource'da aranır, sonra classpath'e bakılır
	 * @param templateName
	 * @param model
	 * @param writer
	 */
	void mergeTemplateByName(String templateName, Map<String, Object> model, Writer writer);

	
	/**
	 * 
	 * @param templateLocation getTemplateLocation... metoduyla alınabilir
	 * @param model
	 * @return
	 */
	String mergeTemplateIntoString(String templateLocation, Map<String, Object> model);
	
	/**
	 * 
	 * @param templateLocation getTemplateLocation... metoduyla alınabilir
	 * @param encoding
	 * @param model
	 * @return
	 */
	String mergeTemplateIntoString(String templateLocation, String encoding, Map<String, Object> model);
	
	String getResourceClassPathRoot();
	
	String getResourceFilePathRoot();
	
	/**
	 * classpath'e bakar
	 * @param resourceName
	 * @return
	 */
	String getTemplateLocationClass (String resourceName);
	
	/**
	 * Locale gerektirmeyen kaynakların yeri için, classpath'e bakar
	 * @param resourceName
	 * @return
	 */
	String getTemplateLocationClassWithoutLocale (String resourceName);
	
	/**
	 * filepath'e bakar
	 * @param resourceName
	 * @return
	 */
	String getTemplateLocationFile (String resourceName);
	
	/**
	 * Locale gerektirmeyen kaynakların yeri için, filepath'e bakar
	 * @param resourceName
	 * @return
	 */
	String getTemplateLocationFileWithoutLocale (String resourceName);

}
