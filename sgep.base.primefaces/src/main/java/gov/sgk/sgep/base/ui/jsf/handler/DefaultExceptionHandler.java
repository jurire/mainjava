package gov.sgk.sgep.base.ui.jsf.handler;

import javax.faces.context.ExceptionHandler;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.HibernateException;

import gov.sgk.sgep.base.api.utility.exception.IException;

/**
 * 
 * @author o-mssahin
 * @since 2 Kas 2015
 *
 */
public class DefaultExceptionHandler extends AExceptionHandler {
	
	public DefaultExceptionHandler(ExceptionHandler wrapped) {
		super(wrapped);
	}

	@Override
	public String getSummaryOfMessage(Throwable t) {
		return "Hata";
	}

	@Override
	public String getDetailOfMessage(Throwable t) {
		return getMessageOfThrowable(t);
	}
	
	/**
	 * Asıl nedene erişmek için t'nin cause'ları üzerinden gezmek gerekecektir.<br>
	 * Cause'lar {@link IException} ı gerçekleştiriyorsa mesajları yazılabilir 
	 * @param t
	 * @return Atılan aykırı durumun anlamlı mesajlar şeklinde dön
	 */
	public static String getMessageOfThrowable (Throwable t) {
		String result = getMessage(t).toString();
		
		//Eğer mesaj alınamadıysa
		if (StringUtils.isBlank(result)) {
			result = t.getMessage();
		}
		return result;
	}
	
	public static StringBuilder getMessage (Throwable t) {
		if (t == null) {
			return new StringBuilder();
		}
		if (t instanceof IException) {
			String mesaj =  ((IException) t).description();
			return getMessage(t.getCause()).append(mesaj + StringUtils.LF);
		} else if (t instanceof org.hibernate.exception.JDBCConnectionException) {
			String mesaj =  "Veri tabanı bağlantısı kurulamıyor";
			return getMessage(t.getCause()).append(mesaj + StringUtils.LF);
		} else if (t instanceof org.hibernate.StaleObjectStateException) {
			String mesaj =  "Satır başkası tarafından değiştirilmiş. Kaydı tekrar çekip işlem yapınız.";
			return getMessage(t.getCause()).append(mesaj + StringUtils.LF);
		} else if (t instanceof org.hibernate.exception.DataException ) {
			String mesaj = String.format("Modelin verisinde hata var. Hata: %s", ((org.hibernate.exception.DataException)t).getSQLException().getMessage());
			return getMessage(t.getCause()).append(mesaj + StringUtils.LF);
		} else if (t instanceof HibernateException) {
			String mesaj =  "Veri tabanı sql'de hata. Ayrıntılar için log'a bakınız.";
			return getMessage(t.getCause()).append(mesaj + StringUtils.LF);
		} else {
			return getMessage(t.getCause());
		}
	}

}
