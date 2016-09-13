package gov.sgk.sgep.base.web.backing;

import java.io.IOException;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.text.StrTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import gov.sgk.sgep.base.api.business.IBaseService;
import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.api.business.IParameterService;
import gov.sgk.sgep.base.api.business.ISystemService;
import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.base.api.model.prm.Mesaj;
import gov.sgk.sgep.base.api.utility.exception.BaseError;
import gov.sgk.sgep.base.spring.message.IMessageSource;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.ui.primefaces.model.SgepLazyDataModel;
import gov.sgk.sgep.base.ui.primefaces.model.SgepSelectableDataModel;
import gov.sgk.sgep.utility.IpUtils;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * JSF için Ortak Managed Bean<br>
 * Ortak metotlar bu sınıfta yer almaktadır.
 * @author o-mssahin
 * @since 25 Kas 2015
 *
 */
public abstract class ABaseManagedBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	public ISystemService getSystemService() {
		return SpringContextProvider.getContext().getBean(ISystemService.class);
	}
	
	public IParameterService getParameterService() {
		return SpringContextProvider.getContext().getBean(IParameterService.class);
	}
	
	public ILogService getLogServiceAsync() {
		return SpringContextProvider.getLogServiceAsync();
	}
	
	public static IDomainSecurityService getDomainSecurityService () {
		return SpringContextProvider.getContext().getBean(IDomainSecurityService.class);
	}
	
	@PostConstruct
	public void doInit() {
		if (FacesContext.getCurrentInstance().getViewRoot() != null) {
			FacesContext.getCurrentInstance().getViewRoot().setLocale(SgepConstants.LOCALE_TURKISH);
		}
		init();
		LOGGER.info("inited: {}", this);
	}
	
	@PreDestroy
	public void preDestroy() {
		destroy();
		LOGGER.info("destroyed");
	}

	/**
	 * 
	 * @param path örneğin "pages/secure/home.xhtml"
	 * @throws RuntimeException
	 */
	public void redirect (String path) {
    	String context = FacesContext.getCurrentInstance().getExternalContext().getRequestContextPath();
    	String fullPath = String.format(context + "/%s", path);
		try {
			LOGGER.debug("Redirecting to " + fullPath);
			FacesContext.getCurrentInstance().getExternalContext().redirect(fullPath);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static HttpServletResponse getHttpServletResponse() {
		return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
	}

	public static HttpServletRequest getHttpServletRequest() {
		return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
	}
	
	protected void addMessage(FacesMessage message) {
		addMessage(null, message);
    }
	
	protected void addMessage(String clientId, FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(clientId, message);
    }

	public <T extends AModel> SgepLazyDataModel<T> createSgepLazyDataModel (Class<T> clazz) {
		SgepLazyDataModel<T> result = new SgepLazyDataModel<T>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public IBaseService getService() {
				return ABaseManagedBean.this.getServiceForLoading();
			}
		};
		result.setClazz(clazz);
		return result;
	}
	
	public <T extends AModel> SgepSelectableDataModel<T> createSgepSelectedDataModel (Class<T> clazz) {
		SgepSelectableDataModel<T> result = new SgepSelectableDataModel <T>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public IBaseService getService() {
				return ABaseManagedBean.this.getServiceForLoading();
			}
		};
		//result.setWrappedData(result.getService().getAll(clazz));
		result.setClazz(clazz);
		return result;
	}

	/**
	 * 
	 * @return
	 */
	public static String getSessionId () {
		FacesContext fCtx = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fCtx.getExternalContext().getSession(false);
		return session.getId();			
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getClientIp () {
		HttpServletRequest request = getHttpServletRequest();
		String ip;
		boolean found = false;
		if ((ip = request.getHeader("x-forwarded-for")) != null) {
			StrTokenizer tokenizer = new StrTokenizer(ip, ",");
			while (tokenizer.hasNext()) {
				ip = tokenizer.nextToken().trim();
				if (IpUtils.isIPv4Valid(ip) && !IpUtils.isIPv4Private(ip)) {
					found = true;
					break;
				}
			}
		}
		if (!found) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	
	/**
	 * Bean içinde ilklendirilmesi gereken işlemler burada yapılabilir<br>
	 * Örneğin view'ler için değişkenlerin doldurulması gibi
	 */
	protected abstract void init ();
	
	protected void destroy () {
		
	}
	
	/**
	 * Lazy doldurmak için gerekli servisin bean tarafından sağlanması için<br> 
	 * {@link SgepLazyDataModel} için kullanılabilir
	 * @return
	 */
	protected IBaseService getServiceForLoading() {
		throw new RuntimeException("getServiceForLoading çağrılıyor. Gerçekleştirimi yapınız.");
	}
	
	protected void addInfoMessage(String msg) {
		addInfoMessage(null, msg);
    }
	
	protected void addInfoMessage(String clientId, String msg) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, getValueFromLabelSource("lbl.bilgi"), msg);
		addMessage(clientId, message);
    }
	
	protected void addWarnMessage(String clientId, String msg) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, getValueFromLabelSource("lbl.uyari"), msg);
		addMessage(clientId, message);
    }
	
	protected void addWarnMessage(String msg) {
		addWarnMessage(null, msg);
    }
	
	protected void addErrorMessage(String clientId, String msg) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, getValueFromLabelSource("lbl.hata"), msg);
		addMessage(clientId, message);
    }
	
	protected void addMessage(String clientId, Mesaj mesaj) {
		Assert.notNull(mesaj, "mesaj null olamaz");
		String msg = mesaj.getMesajMetni();
		char mesajTipi = mesaj.getMesajTipi();
		if (Mesaj.Tip.ERROR.getSymbol() == mesajTipi) {
			addErrorMessage(clientId, msg);
		} else if (Mesaj.Tip.INFO.getSymbol() == mesajTipi) {
			addInfoMessage(clientId, msg);
		} else if (Mesaj.Tip.WARNING.getSymbol() == mesajTipi) {
			addWarnMessage(clientId, msg);
		} else {
			throw new BaseError ("Mesajın tipi belli değil");
		}
	}
	
	protected void addMessage(Mesaj mesaj) {
		addMessage(null, mesaj);
	}

	public String getValueFromLabelSource (String code) {
		IMessageSource ms = SpringContextProvider.getLabelSource();
		return ms.getMessage(code);
	}
	
	public void mesajGoster (String mesajKodu) {
		IMessageSource ms = SpringContextProvider.getMessageSource();
		String modulAdi = getModulAdi();
		Mesaj mesaj = ms.getMesaj(mesajKodu, modulAdi);
		addMessage(mesaj);
	}
	
	/**
	 * Bu değer mesaj vb. modül adı alan metotlara gönderilebilir
	 * @return uygulamanın adı
	 */
	public static String getModulAdi() {
		return SpringContextProvider.getSystemPropertiesWrapper().getApplicationId();
	}
	
	public String getYetkiliIlKodu () {
		return "06";
	}
	
	public String getYetkiliSubeKodu () {
		return "006";
	}

}
