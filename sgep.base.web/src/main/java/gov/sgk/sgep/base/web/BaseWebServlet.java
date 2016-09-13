package gov.sgk.sgep.base.web;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.model.auth.Menu;
import gov.sgk.sgep.base.api.model.auth.Menu.RootAndNewTree;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 * @since 26 Eki 2015
 *
 */
@WebServlet ("/base")
public class BaseWebServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if (SgepConstants.COMMAND_WEB_MENU_TREE_JSON.equals(cmd)) {
			menuTree(request, response);
		} else {
			StringBuilder sb = new StringBuilder();
			if (SpringContextProvider.getContext() != null) {
				sb.append("AppId: " + SpringContextProvider.getSystemPropertiesWrapper().getApplicationId());
				response.getWriter().write(sb.toString());
			} else {
				response.getWriter().write("Spring context yüklenmedi");
			}
			//response.getWriter().write(String.format("%s tanımsız cmd", cmd));
		}
	}
	
	private void menuTree (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IDomainSecurityService secService = SpringContextProvider.getContext().getBean(IDomainSecurityService.class);
		Set<Menu> menuSet = secService.listMenuByRoleId(Role.ROLE_ID_TEST, "STES");
		RootAndNewTree rootAndNewTree = secService.adjustMenuTree(menuSet);		
		response.getWriter().write(secService.jsonMenuTree(rootAndNewTree));
	}


	@Override
	public void init() throws ServletException {
		super.init();
	}
	
}