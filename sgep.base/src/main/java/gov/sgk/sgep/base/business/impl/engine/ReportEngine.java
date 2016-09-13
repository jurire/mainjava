package gov.sgk.sgep.base.business.impl.engine;

import java.io.Serializable;
import java.util.Map;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.business.engine.IReportEngine;
import gov.sgk.sgep.base.report.IJasperReportServer;
import gov.sgk.sgep.base.report.JasperReportServer;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
@Service (SgepConstants.BEAN_NAME_REPORT_ENGINE)
public class ReportEngine implements IReportEngine, InitializingBean {

	IJasperReportServer jrServer;
	
	@Override
	public byte [] getIgbDokum(Map<String, Serializable> map) {
		String jrxml = "reports/iggDokum.jrxml";
		return jrServer.exportToPdf(jrxml, map);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		jrServer = JasperReportServer.getServer();
	}
	
}
