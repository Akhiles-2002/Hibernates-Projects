package in.com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chooserole")
public class ChooseRoleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String role = request.getParameter("role");

		System.out.println("role is : " + role);

		if (role.equalsIgnoreCase("admin")) {
			System.out.println("we are going to admin login page...");
			response.sendRedirect("adminlogin.jsp");
		} else if (role.equalsIgnoreCase("librarian")) {
			System.out.println("we are going to librarian login page...");
			response.sendRedirect("librarianlogin.jsp");
		} else if (role.equalsIgnoreCase("student")) {
			System.out.println("we are going to librarian login page...");
			response.sendRedirect("studentlogin.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
	}

}
