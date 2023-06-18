package in.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.dto.LibraryTransaction;
import in.com.service.ILibraryTransactionService;
import in.com.servicefactory.LibraryTransactionServiceFactory;

@WebServlet("/booksubmit")
public class BookSubmitController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ILibraryTransactionService libTransService = LibraryTransactionServiceFactory.getLibraryTransactionService();
		RequestDispatcher requestDispatcher = null;

		LibraryTransaction libraryTransaction = new LibraryTransaction();
		
		int sid = Integer.parseInt(request.getParameter("sid"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		String submitdate = request.getParameter("submitdate");
		libraryTransaction.setsId(sid);
		libraryTransaction.setbId(bid);
		libraryTransaction.setIssueDate(submitdate);

		String submitBook = libTransService.submitBook(sid, bid, submitdate);
		System.out.println("status " + submitBook);

		request.setAttribute("submitBook", submitBook);
		request.setAttribute("sid", sid);
		request.setAttribute("bid", bid);
		request.setAttribute("submitdate", submitdate);
		requestDispatcher = request.getRequestDispatcher("submitbook.jsp");
		requestDispatcher.forward(request, response);

		
	}

}
