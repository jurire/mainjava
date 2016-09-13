package gov.sgk.sgep.base.api.business.engine;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Bu sınıf bir kuralın çalıştırılması için gerekli olan bütün arayüzleri sağlar<br>
 * 
 * @author o-mssahin
 *
 */
public interface RuleContext<T> extends Serializable {

	/**
	 * ruleId kuralla ilgili kimliği döner. Örneğin xls tabanlı kurallar için xls'inin yolu döndürülebilir.
	 * @return
	 */
	String ruleId ();
	
	/**
	 * Kuralın içinde java nesneleri kullanılabilir. Bu metot kullanılacak nesneleri dönebilir.
	 * @return
	 */
	Map<? extends Serializable, ? extends Serializable> objectMap ();
	
	Date ruleDate ();

}
