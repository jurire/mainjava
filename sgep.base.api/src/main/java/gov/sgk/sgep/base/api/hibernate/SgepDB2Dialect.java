package gov.sgk.sgep.base.api.hibernate;

import java.sql.Types;

import org.hibernate.dialect.DB2Dialect;

/**
 * DB2dialect'in bazı metotlarını ve db2 tiplerinin bazılarını projede ortak kullanmak için yeni sınıf oluşturuldu.
 * Bu sınıfta hibernate için istenen değişklikleri, eklemeleri yapabilirsiniz.
 * 
 * @author o-mssahin
 * @since 18 Kas 2015
 *
 */
public class SgepDB2Dialect extends DB2Dialect {

	public SgepDB2Dialect() {
		super();
		registerColumnType(Types.NUMERIC, "decimal($p,$s)");
		registerColumnType(Types.DECIMAL, "decimal($p,$s)");
	}

}
