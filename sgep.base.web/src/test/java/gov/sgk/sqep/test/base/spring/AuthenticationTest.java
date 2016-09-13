package gov.sgk.sqep.test.base.spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import gov.sgk.sgep.base.spring.aop.AServiceAspect;
import gov.sgk.sgep.base.web.backing.spring.LoginController;

@EnableWebMvc
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@TransactionConfiguration(defaultRollback = true)
@Transactional
@WebAppConfiguration
public class AuthenticationTest  {

	public static final String URL_PREFIX = "http://localhost";

	protected MockMvc mvc;
	
	LoginController controller;


	@Autowired
    private FilterChainProxy springSecurityFilterChain;
	
	@Autowired
	WebApplicationContext applicationContext;
	
	@org.junit.Before
	public void setup () {
		AServiceAspect.DISABLE_SECURITY_FOR_TEST = true;
		mvc = MockMvcBuilders
	              .webAppContextSetup(applicationContext)
	              .addFilters(springSecurityFilterChain)
	              .build();
	}
	
	@Test
    public void testRequiresAuthentication() throws Exception {
        mvc
            .perform(get("/admin"))
            .andExpect(status().isFound())
            .andExpect(redirectedUrl(URL_PREFIX + LoginController.URL_LOGIN));
    }
	
	@Autowired
	LoginController loginController;
	
    @Test
    public void testAuthenticationSuccess() throws Exception {
    	String username = "admin";
    	String password = "passadmin";
    	MockMvc mockMvc = MockMvcBuilders.standaloneSetup(this.loginController).build();
    	mockMvc.perform(post(LoginController.URL_LOGIN).param("username", username).param("password", password))
	    	.andExpect(status().isFound())
	    	.andExpect(request().sessionAttribute(LoginController.ATTR_SESSION_USER_NAME, username))
	    	.andExpect(redirectedUrl(LoginController.URL_REDIRECT_LOGIN_SUCCESS));
    }
    
    @Test
    public void testAuthenticationFail() throws Exception {
    	String username = "admin";
    	String password = "passadmin2";
    	MockMvc mockMvc = MockMvcBuilders.standaloneSetup(this.loginController).build();
    	mockMvc.perform(post(LoginController.URL_LOGIN).param("username", username).param("password", password))
	    	.andExpect(status().isFound())
	    	.andExpect(request().sessionAttribute(LoginController.ATTR_SESSION_ERROR, LoginController.SESSION_ERROR_BAD_CREDENTIAL))
	    	.andExpect(redirectedUrl(LoginController.URL_REDIRECT_LOGIN_FAIL));
    }
	
}
