package in.com.servicefactory;

import in.com.service.BookServiceImpl;
import in.com.service.IBookService;

public class BooksServiceFactory {

	private static IBookService bookService = null;

	private BooksServiceFactory() {

	}

	public static IBookService getBooksService() {
		if (bookService == null) {
			bookService = new BookServiceImpl();
		}
		return bookService;
	}

}
