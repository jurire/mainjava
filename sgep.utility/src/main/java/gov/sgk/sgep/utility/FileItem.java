package gov.sgk.sgep.utility;

import java.io.Serializable;

/**
 * Ekrana gönderilecek dosya içerikleri ile ilgili bilgileri tutar<br>
 * 
 * @author o-mssahin
 * @since 23 Kas 2015
 *
 */
public class FileItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private byte [] content;
	
	private String name;
	
	private String extension;
	
	private String contentType;

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	
	
}
