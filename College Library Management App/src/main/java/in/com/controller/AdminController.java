package in.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.com.dto.Admin;
import in.com.service.IAdminService;
import in.com.servicefactory.AdminServiceFactory;

@WebServlet("/controller/*")
public class AdminController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		IAdminService adminService = null;
		RequestDispatcher requestDispatcher = null;

		if (request.getRequestURI().endsWith("register"))
		{
			adminService = AdminServiceFactory.getAdminService();
			Admin admin = new Admin();

			String fullname = request.getParameter("name");
			String emailId = request.getParameter("emailid");
			String contactno = request.getParameter("contact");
			String password = request.getParameter("password");

			admin.setFullname(fullname);
			admin.setEmailId(emailId);
			admin.setContactno(contactno);
			admin.setPassword(password);

			admin = adminService.adminRegister(fullname, emailId, contactno, password);

			request.setAttribute("admin", admin);
			requestDispatcher = request.getRequestDispatcher("/adminregisterconfirm.jsp");
			requestDispatcher.forward(request, response);

		}
		
		if(request.getRequestURI().endsWith("adminlogin")) {
			adminService = AdminServiceFactory.getAdminService();
			
			Integer id = Integer.parseInt(request.getParameter("username"));
			String password = request.getParameter("password");
			
			HttpSession session = request.getSession();
			String status = adminService.adminLogin(id, password);
			
			request.setAttribute("status", status);
			session.setAttribute("id", id);
			
			requestDispatcher = request.getRequestDispatcher("/adminwindow.jsp");
			requestDispatcher.forward(request, response);
			
		}

	}

}
