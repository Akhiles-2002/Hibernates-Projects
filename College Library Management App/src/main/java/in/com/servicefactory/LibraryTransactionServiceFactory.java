package in.com.servicefactory;

import in.com.service.ILibraryTransactionService;
import in.com.service.LibraryTransactionServiceImpl;

public class LibraryTransactionServiceFactory {

	private static ILibraryTransactionService libararyTransactionService = null;

	private LibraryTransactionServiceFactory() {

	}

	public static ILibraryTransactionService getLibraryTransactionService() {
		if (libararyTransactionService == null) {
			libararyTransactionService = new LibraryTransactionServiceImpl();
		}
		return libararyTransactionService;
	}

}
