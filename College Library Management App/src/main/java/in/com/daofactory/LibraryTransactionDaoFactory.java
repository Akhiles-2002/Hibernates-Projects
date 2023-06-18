package in.com.daofactory;

import in.com.dao.ILibraryTransactionDao;
import in.com.dao.LibraryTransactionDaoImpl;

public class LibraryTransactionDaoFactory {

	private static ILibraryTransactionDao libararyTransactionDao = null;

	private LibraryTransactionDaoFactory() {

	}

	public static ILibraryTransactionDao getLibraryTransactionDao() {
		if (libararyTransactionDao == null) {
			libararyTransactionDao = new LibraryTransactionDaoImpl();
		}
		return libararyTransactionDao;
	}

}
