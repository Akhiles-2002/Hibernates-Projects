package in.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.com.dto.Librarian;
import in.com.service.ILibrarianService;
import in.com.servicefactory.LibrarianServiceFactory;

@WebServlet("/librarian/*")
public class LibrarianController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ILibrarianService librarianService = null;
		RequestDispatcher requestDispatcher = null;

		if (request.getRequestURI().endsWith("regi")) {
			librarianService = LibrarianServiceFactory.getLibrarianService();
			Librarian librarian = new Librarian();

			String fullname = request.getParameter("fullname");
			String emailId = request.getParameter("emailid");
			String contactno = request.getParameter("contactno");
			String password = request.getParameter("password");

			librarian.setFullname(fullname);
			librarian.setMailid(emailId);
			librarian.setContactno(contactno);
			librarian.setPassword(password);

			librarian = librarianService.registerLibrarian(fullname, emailId, contactno, password);

			request.setAttribute("librarian", librarian);
			requestDispatcher = request.getRequestDispatcher("/librarianinsertresponse.jsp");
			requestDispatcher.forward(request, response);
		}

		if (request.getRequestURI().endsWith("delete")) {
			librarianService = LibrarianServiceFactory.getLibrarianService();

			Integer libId = Integer.parseInt(request.getParameter("lid"));

			String status = librarianService.deleteLibrarian(libId);

			request.setAttribute("status", status);
			requestDispatcher = request.getRequestDispatcher("/librariandeleteresponse.jsp");
			requestDispatcher.forward(request, response);
		}

		if (request.getRequestURI().endsWith("search")) {
			librarianService = LibrarianServiceFactory.getLibrarianService();

			Integer libId = Integer.parseInt(request.getParameter("lid"));

			Librarian librarian = librarianService.searchLibrarian(libId);

			request.setAttribute("librarian", librarian);
			requestDispatcher = request.getRequestDispatcher("/librariansearchresult.jsp");
			requestDispatcher.forward(request, response);
		}

		if (request.getRequestURI().endsWith("edit")) {

			librarianService = LibrarianServiceFactory.getLibrarianService();
			String lid = request.getParameter("lid");

			Librarian searchLibrarian = librarianService.searchLibrarian(Integer.parseInt(lid));

			request.setAttribute("searchLibrarian", searchLibrarian);
			requestDispatcher = request.getRequestDispatcher("../librarianedit.jsp");
			requestDispatcher.forward(request, response);

		}

		if (request.getRequestURI().endsWith("update")) {

			librarianService = LibrarianServiceFactory.getLibrarianService();
			Librarian librarian = new Librarian();
			librarian.setLibId(Integer.parseInt(request.getParameter("lid")));
			librarian.setFullname(request.getParameter("lname"));
			librarian.setMailid(request.getParameter("lmailid"));
			librarian.setContactno(request.getParameter("lcontactno"));
			librarian.setPassword(request.getParameter("lpassword"));

			String status = librarianService.updateLibrarian(librarian);

			request.setAttribute("status", status);
			requestDispatcher = request.getRequestDispatcher("../../librarianupdateresponse.jsp");
			requestDispatcher.forward(request, response);

		}

		if (request.getRequestURI().endsWith("showalllibrarian")) {

			librarianService = LibrarianServiceFactory.getLibrarianService();
			List<Librarian> librarianList = librarianService.showAllLibrarian();

			System.out.println(librarianList);

			request.setAttribute("librarianList", librarianList);
			requestDispatcher = request.getRequestDispatcher("../showalllibrarian.jsp");
			requestDispatcher.forward(request, response);

		}

//		if (request.getRequestURI().endsWith("librarianlogin")) {
//
//			RequestDispatcher requestDispatcher1 = null;
//			librarianService = LibrarianServiceFactory.getLibrarianService();
//			Integer id = Integer.parseInt(request.getParameter("username"));
//			String password = request.getParameter("password");
//
//			HttpSession session = request.getSession();
//			String status = librarianService.loginLibrarian(id, password);
//
//			HttpSession session1 = request.getSession();
//			request.setAttribute("status", status);
//			session1.setAttribute("id", id);
//
//			System.out.println(status);
//
//			request.setAttribute("id", id);
//			session.setAttribute("status", status);
//			requestDispatcher1 = request.getRequestDispatcher("/librarianwindow.jsp");
//			requestDispatcher1.forward(request, response);
//
//		}

	}

}
