package in.com.service;

import java.util.List;

import in.com.dao.IBookDao;
import in.com.daofactory.BooksDaoFactory;
import in.com.dto.Books;

public class BookServiceImpl implements IBookService {

	private IBookDao bookDao = null;

	@Override
	public String addBook(Books book) {
		bookDao = BooksDaoFactory.getBookDao();
		return bookDao.addBook(book);
	}

	@Override
	public String deleteBook(Integer bookId) {
		bookDao = BooksDaoFactory.getBookDao();
		return bookDao.deleteBook(bookId);
	}

	@Override
	public String updateBook(Books book) {
		bookDao = BooksDaoFactory.getBookDao();
		return bookDao.updateBook(book);
	}

	@Override
	public List<Books> searchBook(Integer bookId, String author) {
		bookDao = BooksDaoFactory.getBookDao();
		return bookDao.searchBook(bookId, author);
	}

	@Override
	public List<Books> getAllBooks() {
		bookDao = BooksDaoFactory.getBookDao();
		return bookDao.getAllBooks();
	}

}
