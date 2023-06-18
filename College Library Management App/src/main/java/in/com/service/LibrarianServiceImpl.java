package in.com.service;

import java.util.List;

import in.com.dao.ILibrarianDao;
import in.com.daofactory.LibrarianDaoFactory;
import in.com.dto.Librarian;

public class LibrarianServiceImpl implements ILibrarianService {

	private ILibrarianDao librarianDao = null;
	
	@Override
	public Librarian registerLibrarian(String fullname, String emailId, String contactno, String password) {
		librarianDao = LibrarianDaoFactory.getLibrarianDao();
		return librarianDao.registerLibrarian(fullname, emailId, contactno, password);
	}

	@Override
	public String updateLibrarian(Librarian lib) {
		librarianDao = LibrarianDaoFactory.getLibrarianDao();
		return librarianDao.updateLibrarian(lib);
	}

	@Override
	public String deleteLibrarian(Integer lid) {
		librarianDao = LibrarianDaoFactory.getLibrarianDao();
		return librarianDao.deleteLibrarian(lid);
	}

	@Override
	public Librarian searchLibrarian(Integer lid) {
		librarianDao = LibrarianDaoFactory.getLibrarianDao();
		return librarianDao.searchLibrarian(lid);
	}

	@Override
	public String loginLibrarian(Integer id, String password) {
		librarianDao = LibrarianDaoFactory.getLibrarianDao();
		return librarianDao.loginLibrarian(id, password);
	}

	@Override
	public List<Librarian> showAllLibrarian() {
		librarianDao = LibrarianDaoFactory.getLibrarianDao();
		return librarianDao.showAllLibrarian();
	}

}
