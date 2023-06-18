package in.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.dto.LibraryTransaction;
import in.com.service.ILibraryTransactionService;
import in.com.servicefactory.LibraryTransactionServiceFactory;

@WebServlet("/showlibrarytransaction")
public class LibraryTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ILibraryTransactionService libTransService = LibraryTransactionServiceFactory.getLibraryTransactionService();
		RequestDispatcher requestDispatcher = null;
		List<LibraryTransaction> showAllLibraryTransaction = libTransService.showAllLibraryTransaction();

		request.setAttribute("showAllLibraryTransaction", showAllLibraryTransaction);
		requestDispatcher = request.getRequestDispatcher("/showalllibrarytransaction.jsp");
		requestDispatcher.forward(request, response);

	}

}
