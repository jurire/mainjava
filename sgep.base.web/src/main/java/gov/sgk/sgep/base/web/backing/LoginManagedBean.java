package gov.sgk.sgep.base.web.backing;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;

import gov.sgk.sgep.base.api.business.IBaseService;
import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Menu.RootAndNewTree;
import gov.sgk.sgep.base.api.model.auth.Oturum;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.utility.BaseUtility;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Login için backing bean
 * 
 * @author o-mssahin
 *
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginManagedBean extends ABaseManagedBean {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginManagedBean.class);
	
	@ManagedProperty(value="#{authenticationManager}")
    private AuthenticationManager authenticationManager = null;
	
	private String uname;
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String doLogin() {
		String result = "home";
    	LOGGER.info("Login request by {}", this.getUname());
    	if (isSecurityEnabled()) {
            try {
                Authentication resultAuth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(this.getUname(), this.getPassword()));
                if (resultAuth == null) {
                	throw new BadCredentialsException("Hatalı giriş");
                }
                SecurityContextHolder.getContext().setAuthentication(resultAuth);
                if (resultAuth.isAuthenticated()) {
                    String redirectUrl = getSavedRequest ();
					if (StringUtils.isNotBlank(redirectUrl)) {
						LOGGER.debug("Save request [{}] e yönediliriliyor", redirectUrl);
                        FacesContext.getCurrentInstance().getExternalContext().redirect(redirectUrl);
                        result = null;
                    }
					if (!SpringContextProvider.getSystemPropertiesWrapper().isApplicationInDevelopment()) {
						logAuthentication(resultAuth);
					}
                }            
            } catch (AuthenticationException | IOException e) {
            	LOGGER.error("Hata", e);
            	addMessage(new FacesMessage(FacesMessage.SEVERITY_WARN, "Geçersiz Giriş!", "Tekrar Deneyiniz!"));
                result = "";
            }
            //redirect("pages/secure/home.xhtml");
            return result;
    	} else {
        	LOGGER.warn("authenticationManager, home'a yönlendiriliyor");
            return "home";
    	}
    }
	
	public String doLogout() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(getHttpServletRequest(), getHttpServletResponse(), auth);
		}
		SecurityContextHolder.getContext().setAuthentication(null);
		SecurityContextHolder.clearContext();
		return "loggedout";
	}	

	/**
	 * Sisteme girişi log'lar
	 * @param resultAuth
	 */
	private void logAuthentication(Authentication resultAuth) {
		Oturum oturum = new Oturum();
		oturum.setOturumAcilmaZamani(new Timestamp(new Date().getTime()));
		oturum.setMakineAdi(SgepConstants.UNKNOWN);
		oturum.setIp(getClientIp());
		oturum.setId(getSessionId());
		oturum.setKullanici(BaseUtility.getAuthentication().getName());
		getLogServiceAsync().addOturum(oturum);
	}

	/**
	 * 
	 * @return Kaydedilmiş girilmeye çalışılan url. Böyle bir istek yoksa null
	 */
    public String getSavedRequest() {
        HttpServletRequest request = getHttpServletRequest ();
        HttpServletResponse response = getHttpServletResponse (); 
        RequestCache requestCache = new HttpSessionRequestCache();
        SavedRequest savedRequest = requestCache.getRequest(request, response);
        return savedRequest == null ? null : savedRequest.getRedirectUrl();
	}

	public String cancel() {
        return null;
    }

    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }

    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }	

	@Override
	protected void init() {
	}
	
	public void onPageLoad (ComponentSystemEvent event) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (!(auth instanceof AnonymousAuthenticationToken)) {
	    	//ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) FacesContext.getCurrentInstance().getApplication().getNavigationHandler();
			//nav.performNavigation("home");
	    	redirect("pages/secure/home.xhtml");
	    }
	}
	
	/**
	 * 
	 * @return authenticationManager null ise true
	 */
	public boolean isSecurityEnabled () {
		return authenticationManager != null;
	}
	
	public void menuToJson () {
		IDomainSecurityService secService = SpringContextProvider.getContext().getBean(IDomainSecurityService.class);
		Set<Menu> menuSet = secService.listMenuByRoleId(Role.ROLE_ID_TEST, "STES");
		RootAndNewTree rootAndNewTree = secService.adjustMenuTree(menuSet);		
		RequestContext reqCtx = RequestContext.getCurrentInstance();
        reqCtx.addCallbackParam("menuJson", secService.jsonMenuTree(rootAndNewTree));
	}

	@Override
	protected IBaseService getServiceForLoading() {
		// TODO Auto-generated method stub
		return null;
	}

}