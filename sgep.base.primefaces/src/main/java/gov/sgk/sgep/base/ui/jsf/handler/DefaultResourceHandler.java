package gov.sgk.sgep.base.ui.jsf.handler;

import javax.faces.application.ResourceHandler;

import org.primefaces.application.resource.PrimeResourceHandler;

/**
 * Primeface {@link ResourceHandler} için,  proje kapsamında müdahale edilmesi gereken kod değişikliklerinde bu sınıfı kullanabilirsiniz.
 * @author o-mssahin
 *
 */
public class DefaultResourceHandler extends PrimeResourceHandler {

	public DefaultResourceHandler(ResourceHandler wrapped) {
		super(wrapped);
	}
	
}
