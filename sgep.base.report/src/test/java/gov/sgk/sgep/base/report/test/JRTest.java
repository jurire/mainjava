package gov.sgk.sgep.base.report.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import gov.sgk.sgep.base.report.IJasperReportServer;
import gov.sgk.sgep.base.report.JasperReportServer;
import gov.sgk.sgep.utility.Utility;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.renderers.JRSimpleImageMapRenderer;

/**
 * Jasper reports testleri
 * @author o-mssahin
 *
 */
public class JRTest {
	
	static String jrxml = "reports/test_jasper.jrxml";

	/**
	 * classpath'de olan test_jasper.jrxml dosyasından test_jasper.pdf dosyası oluşturulur. pdf dosyası java.io.tmp dizininde oluşturulur.<br>
	 * Assert ile kontrol edilir dosyanın olup olmadığı ve dosyanın boyu. Oluşturulan dosya daha sonra silinir. <br>
	 * NOT: qrcode.png resmini raporun içine yerleştirir. qrcode parametre olarak gönderilmektedir.
	 * @throws JRException
	 * @throws IOException 
	 */
	@Test
	public void testPdf() throws JRException, IOException {

		InputStream inputStream = ClassLoader.getSystemResourceAsStream(jrxml);
		String destFileName = Utility.getJavaTmpdir() + "test_jasper.pdf";
		File destFile = new File (destFileName);
		try {
			DataBeanMaker dataBeanMaker = new DataBeanMaker();
			List<DataBean> dataBeanList = dataBeanMaker.getDataBeanList();
			JRBeanCollectionDataSource beanColDataSource = new  JRBeanCollectionDataSource(dataBeanList);
			Map<String, Serializable> parameters = getParameters ();
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);
			JasperExportManager.exportReportToPdfFile(jasperPrint, destFileName);
			Assert.assertTrue(destFile.exists() && destFile.length() > 10);
			LoggerFactory.getLogger(JRTest.class).info("PDF oluşturuldu: {} -> {}", jrxml, destFileName);
		} finally {
			IOUtils.closeQuietly(inputStream);
			//destFile.delete();
			LoggerFactory.getLogger(JRTest.class).info("PDF silindi: {}", destFileName);
		}
	}
	
	private Map<String, Serializable> getParameters() throws IOException {
		Map<String, Serializable> parameters = new HashMap<>();
		byte [] arr = IOUtils.toByteArray(ClassLoader.getSystemResourceAsStream("qrcode.png"));
		JRSimpleImageMapRenderer image = new JRSimpleImageMapRenderer(arr, new ArrayList<>());
		parameters.put("qrcode", image);
		return parameters;
	}

	@Test
	public void testJasperReport () throws IOException {
		DataBeanMaker dataBeanMaker = new DataBeanMaker();
		List<DataBean> dataBeanList = dataBeanMaker.getDataBeanList();
		JRBeanCollectionDataSource beanColDataSource = new  JRBeanCollectionDataSource(dataBeanList);
		IJasperReportServer server = JasperReportServer.getServer();
		byte [] result = server.exportToPdf(jrxml, getParameters(), beanColDataSource);
		LoggerFactory.getLogger(JRTest.class).info("Üretilen ");
		Assert.assertTrue(result.length > 100);
	}
	
}
