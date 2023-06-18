package in.com.servicefactory;

import in.com.service.IStudentService;
import in.com.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private static IStudentService studentService = null;

	private StudentServiceFactory() {

	}

	public static IStudentService getStudentService() {
		if (studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}

}
