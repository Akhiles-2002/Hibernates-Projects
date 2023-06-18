package in.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.com.dto.Student;
import in.com.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao {

	private Connection connection = null;
	private PreparedStatement insertPreparedStatement = null;
	private PreparedStatement retrievePreparedStatement = null;
	private ResultSet resultSet = null;
	private String status = "fail";
	private Student student = null;

	@Override
	public String addStudent(Student student) {

		String sqlInsertQuery = "insert into student (sname, mailid, contactno, password, gender, department, course, admissionyear, dob) values(?,?,?,?,?,?,?,?,?)";

		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				insertPreparedStatement = connection.prepareStatement(sqlInsertQuery);
			}
			if (insertPreparedStatement != null) {
				insertPreparedStatement.setString(1, student.getSname());
				insertPreparedStatement.setString(2, student.getMailid());
				insertPreparedStatement.setString(3, student.getContactno());
				insertPreparedStatement.setString(4, student.getPassword());
				insertPreparedStatement.setString(5, student.getGender());
				insertPreparedStatement.setString(6, student.getDepartment());
				insertPreparedStatement.setString(7, student.getCourse());
				insertPreparedStatement.setString(8, student.getAdmissionyear());
				insertPreparedStatement.setString(9, student.getDob());

				int rowAffercted = insertPreparedStatement.executeUpdate();

				if (rowAffercted == 1) {
					status = "success";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}		
		return status;
	}

	@Override
	public List<Student> showAllStudents() {
		
		List<Student> list = null;
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				String sqlSelectQuery = "select * from student";
				retrievePreparedStatement = connection.prepareStatement(sqlSelectQuery);
			}
			if (retrievePreparedStatement != null) {
				resultSet = retrievePreparedStatement.executeQuery();
			}
			if (resultSet != null) {
				list = new ArrayList<>();
				while (resultSet.next()) {
					student = new Student();
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setMailid(resultSet.getString(3));
					student.setContactno(resultSet.getString(4));
					student.setPassword(resultSet.getString(5));
					student.setGender(resultSet.getString(6));
					student.setDepartment(resultSet.getString(7));
					student.setCourse(resultSet.getString(8));
					student.setAdmissionyear(resultSet.getString(9));
					student.setDob(resultSet.getString(2));
					list.add(student);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return list;
	}

	@Override
	public Student searchStudent(Integer sId) {
		
		try {
			connection = JdbcUtil.getJdbcConnction();

			if (connection != null) {
				String sqlSelectQuery = "Select * from student where sid=?";
				retrievePreparedStatement = connection.prepareStatement(sqlSelectQuery);
			}
			if(retrievePreparedStatement!=null) {
				retrievePreparedStatement.setInt(1, sId);
				
				resultSet=retrievePreparedStatement.executeQuery();
			}
			if(resultSet!=null) {
				if(resultSet.next()) {
					student=new Student();
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setMailid(resultSet.getString(3));
					student.setContactno(resultSet.getString(4));
					student.setPassword(resultSet.getString(5));
					student.setGender(resultSet.getString(6));
					student.setDepartment(resultSet.getString(7));
					student.setCourse(resultSet.getString(8));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return student;
	}

}
