package gov.sgk.sgep.base.ui.primefaces;

import gov.sgk.sgep.utility.SortOrder;

/**
 * 
 * @author o-mssahin
 * @since 20 Eki 2015
 *
 */
public abstract class Utility {

	public static SortOrder toSgepSortOrder (org.primefaces.model.SortOrder sortOrder) {
		SortOrder result = null;
		if (org.primefaces.model.SortOrder.ASCENDING.equals(sortOrder)) {
			result = SortOrder.ASCENDING;
		} else if (org.primefaces.model.SortOrder.DESCENDING.equals(sortOrder)) {
			result = SortOrder.DESCENDING;
		} else if (org.primefaces.model.SortOrder.UNSORTED.equals(sortOrder)) {
			result = SortOrder.UNSORTED;
		}
		return result;
	}
	
}
