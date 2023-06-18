package in.com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.com.dto.Librarian;
import in.com.util.JdbcUtil;

public class LibrarianDaoImpl implements ILibrarianDao {

	private Connection connection = null;
	private PreparedStatement insertPreparedStatement = null;
	private PreparedStatement retrievePreparedStatement = null;
	private ResultSet resultSet = null;
	private String status = "fail";

	@Override
	public Librarian registerLibrarian(String fullname, String emailId, String contactno, String password) {
		String sqlInsertQuery = "insert into librarian(`fullname`,`emailid`,`contactno`,`password`) values (?,?,?,?)";
		Librarian librarian = null;

		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				insertPreparedStatement = connection.prepareStatement(sqlInsertQuery,
						PreparedStatement.RETURN_GENERATED_KEYS);
			}

			if (insertPreparedStatement != null) {
				insertPreparedStatement.setString(1, fullname);
				insertPreparedStatement.setString(2, emailId);
				insertPreparedStatement.setString(3, contactno);
				insertPreparedStatement.setString(4, password);

				int rowAffected = insertPreparedStatement.executeUpdate();
				librarian = new Librarian();

				resultSet = insertPreparedStatement.getGeneratedKeys();
				Integer libId = null;

				if (resultSet.next()) {
					libId = resultSet.getInt(1);
					librarian.setLibId(libId);
					librarian.setContactno(contactno);
					librarian.setFullname(fullname);
					librarian.setMailid(emailId);
					librarian.setPassword(password);

					if (rowAffected == 1) {
						return librarian;
					}
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return librarian;
	}

	@Override
	public String updateLibrarian(Librarian lib) {
		String sqlUpdateQuery = "update librarian set fullname=?, emailid=?, contactno=?, password=? where libid=?";
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				insertPreparedStatement = connection.prepareStatement(sqlUpdateQuery);
			}
			if (insertPreparedStatement != null) {
				
				insertPreparedStatement.setString(1, lib.getFullname());
				insertPreparedStatement.setString(2, lib.getMailid());
				insertPreparedStatement.setString(3, lib.getContactno());
				insertPreparedStatement.setString(4, lib.getPassword());
				insertPreparedStatement.setInt(5, lib.getLibId());

				int rowAffected = insertPreparedStatement.executeUpdate();

				if (rowAffected == 1) {
					return "success";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public String deleteLibrarian(Integer lid) {
		String sqlDeleteQuery = "delete from librarian where libid=?";

		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				insertPreparedStatement = connection.prepareStatement(sqlDeleteQuery);
			}
			if (insertPreparedStatement != null) {
				insertPreparedStatement.setInt(1, lid);

				int rowAffected = insertPreparedStatement.executeUpdate();

				if (rowAffected == 1) {
					status = "success";
				} else {
					status = "fail";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Librarian searchLibrarian(Integer lid) {
		Librarian librarian = null;
		String sqlSelectQuery = "select libid,fullname,emailid,contactno,password from librarian where libid=?";

		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				retrievePreparedStatement = connection.prepareStatement(sqlSelectQuery);
			}
			if (retrievePreparedStatement != null) {
				retrievePreparedStatement.setInt(1, lid);

				resultSet = retrievePreparedStatement.executeQuery();
			}
			if (resultSet != null) {
				if (resultSet.next()) {
					librarian = new Librarian();
					librarian.setLibId(resultSet.getInt(1));
					librarian.setFullname(resultSet.getString(2));
					librarian.setMailid(resultSet.getString(3));
					librarian.setContactno(resultSet.getString(4));
					librarian.setPassword(resultSet.getString(5));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return librarian;
	}

	@Override
	public String loginLibrarian(Integer id, String password) {
		
		String sqlQuery = "select libid, password from librarian where libid=? and password=?";

		try {
			try {
				connection = JdbcUtil.getJdbcConnction();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (connection != null) {
				retrievePreparedStatement = connection.prepareStatement(sqlQuery);
			}
			if (retrievePreparedStatement != null) {
				retrievePreparedStatement.setInt(1, id);
				retrievePreparedStatement.setString(2, password);
				resultSet = retrievePreparedStatement.executeQuery();
			}
			if (resultSet != null) {
				if (resultSet.next()) {
					return "success";
				}
			}

		} catch (SQLException se) {
			se.printStackTrace();
		}
		
		return status;
	}

	@Override
	public List<Librarian> showAllLibrarian() {
		
		List<Librarian> list = null;
		Librarian librarian = null;
		String sqlSelectQuery = "select libid, fullname, emailid ,contactno, password from librarian";
		
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				
				retrievePreparedStatement = connection.prepareStatement(sqlSelectQuery);
			}
			if (retrievePreparedStatement != null) {
				resultSet = retrievePreparedStatement.executeQuery();
			}
			if (resultSet != null) {
				list = new ArrayList<>();
				
				while (resultSet.next()) {
					librarian = new Librarian();
					librarian.setLibId(resultSet.getInt(1));
					librarian.setFullname(resultSet.getString(2));
					librarian.setMailid(resultSet.getString(3));
					librarian.setContactno(resultSet.getString(4));
					librarian.setPassword(resultSet.getString(5));

					list.add(librarian);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
