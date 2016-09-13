package gov.sgk.sgep.utility;

import org.apache.commons.lang3.Validate;

/**
 * Kontrolleri if'lerden arındırmak için bu sınıf kullanılabilir.<br>
 * <pre>
 * Asser.notEmpty (string, "string boş olamaz")
 * </pre>
 * Bütün kontroller {@link IllegalArgumentException} aykırı durumunu üretir.
 * @author o-mssahin
 * @since 8 Eki 2015
 *
 */
public class Assert extends Validate {
	
	/**
	 * {@link Validate#isTrue(boolean)} ile aynı işi yapar
	 * 
	 * @param expression
	 * @param message expression false ise message alan bir aykırı durum üretilir
	 * @throws IllegalArgumentException expression false ise 
	 */
	public static void state (boolean expression, String message) {
		isTrue(expression, message);
	}

}
