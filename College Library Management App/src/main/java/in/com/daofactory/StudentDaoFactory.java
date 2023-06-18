package in.com.daofactory;

import in.com.dao.IStudentDao;
import in.com.dao.StudentDaoImpl;

public class StudentDaoFactory {

	private static IStudentDao studentDao = null;

	private StudentDaoFactory() {

	}

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}

}
