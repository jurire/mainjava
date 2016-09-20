package gov.sgk.sgep.base.report;

import java.io.Serializable;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

/**
 * 
 * @author o-mssahin
 *
 */
public interface IJasperReportServer {

	public static enum Type {
		LOCAL, REMOTE;
	}
	
	byte [] exportToPdf (String jrxml, Map<String, Serializable> parameters);
	
	byte [] exportToPdf (String jrxml, Map<String, Serializable> parameters, JRDataSource dataSource);

}
