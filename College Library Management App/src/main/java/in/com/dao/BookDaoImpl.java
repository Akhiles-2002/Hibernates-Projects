package in.com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.com.dto.Books;
import in.com.util.JdbcUtil;

public class BookDaoImpl implements IBookDao {

	private Connection connection = null;
	private PreparedStatement insertPreparedStatement = null;
	private PreparedStatement retrievePreparedStatement = null;
	private ResultSet resultSet = null;
	private String status = "fail";

	@Override
	public String addBook(Books book) {

		String insertBookQuery = "insert into books (bookid,bookname,subject,author,title,category,qty)values(?,?,?,?,?,?,?)";
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				insertPreparedStatement = connection.prepareStatement(insertBookQuery);
			}
			if (insertPreparedStatement != null) {
				insertPreparedStatement.setInt(1, book.getBookId());
				insertPreparedStatement.setString(2, book.getBookName());
				insertPreparedStatement.setString(3, book.getSubject());
				insertPreparedStatement.setString(4, book.getAuthor());
				insertPreparedStatement.setString(5, book.getTitle());
				insertPreparedStatement.setString(6, book.getCategory());
				insertPreparedStatement.setInt(7, book.getQty());

				int rowAffected = insertPreparedStatement.executeUpdate();

				if (rowAffected == 1) {
					return "success";
				} else {
					return "fail";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String deleteBook(Integer bookId) {

		String deleteBookQuery = "delete from books where bookid=?";
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				insertPreparedStatement = connection.prepareStatement(deleteBookQuery);
			}
			if (insertPreparedStatement != null) {
				insertPreparedStatement.setInt(1, bookId);
				int rowAffected = insertPreparedStatement.executeUpdate();

				if (rowAffected == 1) {
					return "success";
				} else {
					return "fail";
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String updateBook(Books book) {

		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				String sqlUpdateQuery = "update books set bookname=?,subject=?,author=?,title=?,category=?,qty=? where bookid=?";
				insertPreparedStatement = connection.prepareStatement(sqlUpdateQuery);
			}
			if (insertPreparedStatement != null) {
				insertPreparedStatement.setString(1, book.getBookName());
				insertPreparedStatement.setString(2, book.getSubject());
				insertPreparedStatement.setString(3, book.getAuthor());
				insertPreparedStatement.setString(4, book.getTitle());
				insertPreparedStatement.setString(5, book.getCategory());
				insertPreparedStatement.setInt(6, book.getQty());
				insertPreparedStatement.setInt(7, book.getBookId());

				int rowAffected = insertPreparedStatement.executeUpdate();

				if (rowAffected == 1) {
					status = "success";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public List<Books> searchBook(Integer bookId, String author) {

		List<Books> list = null;
		String selectBookSearchQuery = "select bookid,bookname,subject,author,title,category,qty from books where bookid=? or author=?";
		try {
			try {
				connection = JdbcUtil.getJdbcConnction();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (connection != null) {
				retrievePreparedStatement = connection.prepareStatement(selectBookSearchQuery);
			}
			if (retrievePreparedStatement != null) {
				retrievePreparedStatement.setInt(1, bookId);
				retrievePreparedStatement.setString(2, author);

				resultSet = retrievePreparedStatement.executeQuery();
			}
			if (resultSet != null) {
				Books books = null;
				list = new ArrayList<>();
				while (resultSet.next()) {
					books = new Books();
					books.setBookId(resultSet.getInt(1));
					books.setBookName(resultSet.getString(2));
					books.setSubject(resultSet.getString(3));
					books.setAuthor(resultSet.getString(4));
					books.setTitle(resultSet.getString(5));
					books.setCategory(resultSet.getString(6));
					books.setQty(resultSet.getInt(7));
					list.add(books);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Books> getAllBooks() {

		List<Books> list = new ArrayList<>();
		String selectBookSearchQuery = "select bookid,bookname,subject,author,title,category,qty from books";
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				retrievePreparedStatement = connection.prepareStatement(selectBookSearchQuery);
			}
			if (retrievePreparedStatement != null) {

				resultSet = retrievePreparedStatement.executeQuery();
			}
			if (resultSet != null) {
				Books books = null;
				while (resultSet.next()) {
					books = new Books();
					books.setBookId(resultSet.getInt(1));
					books.setBookName(resultSet.getString(2));
					books.setSubject(resultSet.getString(3));
					books.setAuthor(resultSet.getString(4));
					books.setTitle(resultSet.getString(5));
					books.setCategory(resultSet.getString(6));
					books.setQty(resultSet.getInt(7));
					list.add(books);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}

}
