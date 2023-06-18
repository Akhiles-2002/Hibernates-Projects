package in.com.daofactory;

import in.com.dao.ILibrarianDao;
import in.com.dao.LibrarianDaoImpl;

public class LibrarianDaoFactory {

	private static ILibrarianDao librarianDao = null;

	private LibrarianDaoFactory() {

	}

	public static ILibrarianDao getLibrarianDao() {
		if (librarianDao == null) {
			librarianDao = new LibrarianDaoImpl();
		}
		return librarianDao;
	}

}
