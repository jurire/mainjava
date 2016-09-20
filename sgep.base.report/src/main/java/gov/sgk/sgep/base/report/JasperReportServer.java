package gov.sgk.sgep.base.report;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections4.MapUtils;
import org.apache.commons.io.IOUtils;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

/**
 * Singleton server her {@link Type} için
 * @author o-mssahin
 *
 */
public class JasperReportServer implements IJasperReportServer {

	private static final Map<Type, IJasperReportServer> map = new ConcurrentHashMap<>();
	
	private JasperReportServer () {
		super();
	}
	
	public static IJasperReportServer getServer (Type type) {
		IJasperReportServer result = (IJasperReportServer) MapUtils.getObject(map, type);
		if (result == null) {
			result = new JasperReportServer();
			map.put(type, result);
		}
		return result;
	}
	
	public static IJasperReportServer getServer () {
		return getServer(Type.LOCAL);
	}

	/**
	 * 
	 * @throws RuntimeException
	 */
	public byte[] exportToPdf(String jrxml, Map<String, Serializable> parameters) {
		InputStream inputStream = null;
		ByteArrayOutputStream baos = null;
		try {
			inputStream = ClassLoader.getSystemResourceAsStream(jrxml);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters);
			baos = new ByteArrayOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, baos);
			return baos.toByteArray();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(inputStream);
			IOUtils.closeQuietly(baos);
		}
	}

	@Override
	public byte[] exportToPdf(String jrxml, Map<String, Serializable> parameters, JRDataSource dataSource) {
		InputStream inputStream = null;
		ByteArrayOutputStream baos = null;
		try {
			inputStream = ClassLoader.getSystemResourceAsStream(jrxml);
			JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
			JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
			baos = new ByteArrayOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperPrint, baos);
			return baos.toByteArray();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			IOUtils.closeQuietly(inputStream);
			IOUtils.closeQuietly(baos);
		}
	}
	
}
