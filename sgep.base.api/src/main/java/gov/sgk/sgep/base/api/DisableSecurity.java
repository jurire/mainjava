package gov.sgk.sgep.base.api;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * Bazı metotlar için security işlemleri yapılmaz, örneğin, login, 
 * herkes tarafından çağrılabilir.
 * <br>
 * Bu tip metotlara eklenebilir
 * 
 * @author o-mssahin
 * @since 13 Eki 2015
 *
 */
@Documented
@Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DisableSecurity {

}
