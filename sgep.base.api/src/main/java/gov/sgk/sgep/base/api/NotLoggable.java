/**
 * 
 */
package gov.sgk.sgep.base.api;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import gov.sgk.sgep.base.api.business.ILogService;

/**
 * {@link ILogService} gerçekleştirimleri için kullanılabilir
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@Documented
@Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface NotLoggable {

}
