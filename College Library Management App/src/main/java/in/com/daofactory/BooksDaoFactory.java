package in.com.daofactory;

import in.com.dao.BookDaoImpl;
import in.com.dao.IBookDao;

public class BooksDaoFactory {

	private static IBookDao bookDao = null;

	private BooksDaoFactory() {

	}

	public static IBookDao getBookDao() {
		if (bookDao == null) {
			bookDao = new BookDaoImpl();
		}
		return bookDao;
	}

}
