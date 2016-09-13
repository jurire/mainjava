package gov.sgk.sgep.base.utility.engine.rule;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 *
 */
public class TempFolder {
		private static final Logger LOGGER = LoggerFactory.getLogger(TempFolder.class);
		
		/**
		 * 
		 */
		private String folderName;
		
		/**
		 * create metodu dışarıdan çağrılmalıdır<br>
		 * 
		 * @param folderName boş olamaz
		 */
		public TempFolder(String folderName) {
			Assert.notBlank(folderName, "folderName boş olmamalı.");
			Assert.state(StringUtils.length(folderName) < 100, "folderName boyu 100'ü geçmemeli.");
			this.folderName = folderName;
		}
		
		String folderPath = Utility.getJavaTmpdir() + folderName;
		List<String> fileNames = new ArrayList<>();

		public void addFile(String fileName) throws FileNotFoundException, IOException {
			fileName = StringUtils.trim(fileName);
			if (StringUtils.startsWith(fileName, "~$")) {
				LOGGER.warn("Not Copied file: {}, temp excel file", fileName);
				return;
			}
			fileNames.add(fileName);
			InputStream is = ClassLoader.getSystemResourceAsStream(folderName + "/" + fileName);
			IOUtils.copy(is, new FileOutputStream(folderPath + "/" + fileName));
			LOGGER.info("Copied file: {}", fileName);
		}
		
		public String getFilePath(String fileName)  {
			return folderPath + "/" + fileName;
		}

		public TempFolder create() throws IOException {
			new File(folderPath).delete();
			new File(folderPath).mkdir();
			LOGGER.info("{} created", folderPath);
			return this;
		}
	}