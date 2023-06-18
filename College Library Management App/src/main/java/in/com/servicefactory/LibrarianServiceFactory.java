package in.com.servicefactory;

import in.com.service.ILibrarianService;
import in.com.service.LibrarianServiceImpl;

public class LibrarianServiceFactory {

	private static ILibrarianService librarianService = null;

	private LibrarianServiceFactory() {

	}

	public static ILibrarianService getLibrarianService() {
		if (librarianService == null) {
			librarianService = new LibrarianServiceImpl();
		}
		return librarianService;
	}

}
