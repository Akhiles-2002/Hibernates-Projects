package in.com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.com.dto.Admin;
import in.com.util.JdbcUtil;

public class AdminDaoImpl implements IAdminDao {

	private Connection connection = null;
	private PreparedStatement insertPreparedStatement = null;
	private PreparedStatement retrievePreparedStatement = null;
	private ResultSet resultSet = null;
	private String status = "fail";

	@Override
	public Admin adminRegister(String fullname, String emailId, String contactno, String password) {

		String sqlInsertQuery = "insert into admin(`fullname`,`emailid`,`contactno`,`password`) values (?,?,?,?)";
		Admin admin = null;

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
				admin = new Admin();

				resultSet = insertPreparedStatement.getGeneratedKeys();
				Integer adminId = null;

				if (resultSet.next()) {
					adminId = resultSet.getInt(1);
					admin.setAdminId(adminId);
					admin.setFullname(fullname);
					admin.setEmailId(emailId);
					admin.setContactno(contactno);
					admin.setPassword(password);

					if (rowAffected == 1) {
						return admin;
					}
				}
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return admin;
	}

	@Override
	public String adminLogin(Integer userName, String password) {

		String sqlQuery = "select adminid, password from admin where adminid=? and password=?";

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
				retrievePreparedStatement.setInt(1, userName);
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

}
