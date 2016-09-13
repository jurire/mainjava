package sgep.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 * 
 * @author o-mssahin
 * @since 23 Kas 2015
 *
 */
public class QrCodeTest {

	@Test
	public void testQrCode () throws IOException {
		String value = "sgep.tescil\nsinan";
        File file = QRCode.from(value).to(ImageType.PNG).withCharset("UTF-8").file();
        org.junit.Assert.assertTrue(StringUtils.startsWith(file.getName(), "QRCode"));
        org.junit.Assert.assertTrue(StringUtils.endsWith(file.getName(), ".png"));
        FileUtils.copyFile(file, new File (System.getProperty("javaio.tmp") + "/abc.png"));
        System.out.println(file);
	}
	
}
