package gov.sgk.sgep.base.ui.primefaces.component;

import org.primefaces.component.calendar.Calendar;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
public class SgepCalendar extends Calendar {

	public SgepCalendar() {
		super();
		this.setPattern(SgepConstants.DATE_FORMAT_DD_MM_YYYY);
		this.setLocale("tr");		
	}
	
}
