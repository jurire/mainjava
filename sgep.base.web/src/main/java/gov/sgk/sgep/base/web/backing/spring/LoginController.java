package gov.sgk.sgep.base.web.backing.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.domain.DomainUser;

/**
 * Spring controller for login
 * @author mehmetsinan.sahin
 *
 */
@Controller
public class LoginController implements InitializingBean {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	public static final String ATTR_SESSION_USER = "_session_attr_user";
	public static final String ATTR_SESSION_USER_NAME = "_session_attr_user_name";
	public static final String ATTR_SESSION_ERROR = "_session_attr_error";
	public static final String SESSION_ERROR_BAD_CREDENTIAL = "BAD_CREDENTIAL";
	public static final String URL_LOGIN = "/login";
	public static final String URL_REDIRECT_LOGIN_SUCCESS = "/";
	public static final String URL_REDIRECT_LOGIN_FAIL = "/login?error";
	
	@Autowired @Qualifier ("domainUserServiceTest")
	IDomainUserService domainUserService;

	@Autowired
	AuthenticationManager authenticationManager;

	@RequestMapping(value = URL_LOGIN, method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("login");
		DomainUser user = new DomainUser();
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = URL_LOGIN, method = RequestMethod.POST)
	public String executeLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {
		String result = null;
		Authentication auth = null;
		LOGGER.info("Login request by username: {}", username);
		try {
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
			auth = authenticationManager.authenticate(token);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		if (auth != null) {
			session.setAttribute(ATTR_SESSION_USER_NAME, username);
			result = "redirect:" + URL_REDIRECT_LOGIN_SUCCESS;
		} else {
			session.setAttribute(ATTR_SESSION_ERROR, SESSION_ERROR_BAD_CREDENTIAL);
			result = "redirect:" + URL_REDIRECT_LOGIN_FAIL;
		}
		return result;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info("Inited");
	}
}
