package gov.sgk.sgep.base.utility.engine.template;

import org.apache.velocity.app.event.ReferenceInsertionEventHandler;

/**
 * velocity'de null gelen değerler için ${xx.metodismi} şeklinde yazmasını engellemek için.
 * 
 * @author o-mssahin
 * 
 */
public class QuietReferenceInsertionHandler implements ReferenceInsertionEventHandler {
	
	public Object referenceInsert(String reference, Object value) {
		return value == null ? "" : value;
	}
}