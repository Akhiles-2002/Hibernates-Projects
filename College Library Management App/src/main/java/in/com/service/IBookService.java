package in.com.service;

import java.util.List;

import in.com.dto.Books;

public interface IBookService {
	
	public String addBook(Books book);

	public String deleteBook(Integer bookId);

	public String updateBook(Books book);

	public List<Books> searchBook(Integer bookId, String author);

	public List<Books> getAllBooks();

}
