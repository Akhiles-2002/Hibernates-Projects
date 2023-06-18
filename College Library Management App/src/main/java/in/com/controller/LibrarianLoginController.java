package in.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.com.service.ILibrarianService;
import in.com.servicefactory.LibrarianServiceFactory;

@WebServlet("/liblogin")
public class LibrarianLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		ILibrarianService librarianService = LibrarianServiceFactory.getLibrarianService();
		Integer id = Integer.parseInt(request.getParameter("username"));
		String password = request.getParameter("password");

		HttpSession session = request.getSession();
		String status = librarianService.loginLibrarian(id, password);

		HttpSession session1 = request.getSession();
		request.setAttribute("status", status);
		session1.setAttribute("id", id);

		System.out.println(status);

		request.setAttribute("id", id);
		session.setAttribute("status", status);
		requestDispatcher = request.getRequestDispatcher("librarianwindow.jsp");
		requestDispatcher.forward(request, response);

	}

}
