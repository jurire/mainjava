package gov.sgk.sgep.base.ui.jsf.handler;

import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerFactory;

/**
 * Bu sınıf faces-conf.xml dosyasında tanımlanmalıdır<br>
 * Eğer kendi sınıfınızı tanımlamak istiyorsanız bu sınıfı extend edip "getExceptionHandler" yerine kendi sınıfınızı dönmelisiniz.<br>
 * {@link DefaultExceptionHandlerFactory} varsayılan olarak {@link DefaultExceptionHandler} sınıfını kullanmaktadır.<br>
 * Aykırı durumların okunabilir mesaj eşleğini spring resource'larından okumak için {@link AExceptionHandler}'dan kendi sınıfınızı üretip, 
 * ona göre mesaj içeriklerini dönmelisiniz. ve bu sınıfı başka bir HandlerFactory sınıfından dönüp faces-config.xml dosyasında belirtmelisiniz.<br>
 *  
 * 
 * @author o-mssahin
 *
 */
public class DefaultExceptionHandlerFactory extends ExceptionHandlerFactory {

	private ExceptionHandlerFactory parent;

	public DefaultExceptionHandlerFactory(ExceptionHandlerFactory parent) {
		this.setParent(parent);
	}

	@Override
	public ExceptionHandler getExceptionHandler() {
		return new DefaultExceptionHandler(getParent().getExceptionHandler());
	}

	public ExceptionHandlerFactory getParent() {
		return parent;
	}

	private void setParent(ExceptionHandlerFactory parent) {
		this.parent = parent;
	}
}