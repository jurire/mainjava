package gov.sgk.sgep.base.ui.jsf.handler;

import java.util.Iterator;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.application.ProjectStage;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;

import org.primefaces.application.exceptionhandler.ExceptionInfo;
import org.primefaces.application.exceptionhandler.PrimeExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.sgk.sgep.base.api.utility.exception.IException;

/**
 * Jsf'de aykırı durum oluştuğunda bu durumun nasıl ele alınmasını belirleyen
 * sınıf
 * 
 * @author o-mssahin
 * 
 *
 */
public abstract class AExceptionHandler extends PrimeExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(AExceptionHandler.class);

	public AExceptionHandler(ExceptionHandler wrapped) {
		super(wrapped);
	}

	@Override
	public void handle() throws FacesException {
		Iterator<?> iterator = getUnhandledExceptionQueuedEvents().iterator();

		FacesContext fc = FacesContext.getCurrentInstance();
		while (iterator.hasNext()) {
			ExceptionQueuedEvent event = (ExceptionQueuedEvent) iterator.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event.getSource();
			Throwable throwable = context.getException();
			try {
				Flash flash = fc.getExternalContext().getFlash();
				
				Throwable rootCause = getRootCause(throwable);
				 // print exception in development stage
                if (fc.getApplication().getProjectStage() == ProjectStage.Development) {
                    //rootCause.printStackTrace();
                }
				
				// Put the exception in the flash scope to be displayed in the
				// error page if necessary
				String message = getDetailOfMessage(throwable);
				flash.put("errorDetails", message);
				LOGGER.error("The error in the flash(javax.faces.context.Flash): {}", message);
				if (fc.getApplication().getProjectStage() == ProjectStage.Development) {
                    //rootCause.printStackTrace();
					LOGGER.error("Error Trace in JSF", throwable);
                }
				String summary = getSummaryOfMessage(throwable);
				// NavigationHandler navigationHandler = fc.getApplication().getNavigationHandler();
				// navigationHandler.handleNavigation(fc, null, "error?faces-redirect=true");
				if (controlShowSummary() && showSummary(throwable)) {
					summary = "";
				}

				if (!fc.getPartialViewContext().isAjaxRequest()) {
                    ExceptionInfo info = createExceptionInfo(rootCause);
					handleRedirect(fc, rootCause, info, false);
				} else {
					fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, message));
					fc.renderResponse();
				}

			} catch (Exception e) {
                LOGGER.error("Could not handle exception!", e);
			} finally {
				iterator.remove();
			}
		}
		// Let the parent handle the rest
		getWrapped().handle();
	}

	/**
	 * 
	 * @param t
	 * @return Jsf mesajında hata penceresinin özet kısmında çıkan mesaj
	 */
	public abstract String getSummaryOfMessage(Throwable t);

	/**
	 * Mesajların ekranda, summary'li gösterilip gösterilemeyeceğinin
	 * kontrolünün yapılıp yapılmayacağı belirlenir.<br>
	 * Eğer summary'nin gösterilip gösterilmeyeceği kontrolü yapılacaksa
	 * {@link Throwable}'ın {@link IException}'dan dönmesi ve showSummary'nin
	 * true olması gerekir.<br>
	 * Şimdilik Tescil uygulaması summary'yi göstermiyor varsayılan olarak
	 * 
	 * @return
	 */
	protected boolean controlShowSummary() {
		return false;
	}

	protected boolean showSummary(Throwable throwable) {
		// return (throwable instanceof IException) &&
		// ((IException)throwable).showSummary();
		return true;
	}

	/**
	 * 
	 * @param t
	 * @return Jsf mesajında hata penceresinde hatanın açıklama kısmında çıkan
	 *         mesaj
	 */
	public abstract String getDetailOfMessage(Throwable t);

}