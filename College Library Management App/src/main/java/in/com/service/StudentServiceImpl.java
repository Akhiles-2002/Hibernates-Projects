package in.com.service;

import java.util.List;

import in.com.dao.IStudentDao;
import in.com.daofactory.StudentDaoFactory;
import in.com.dto.Student;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao studentDao = null;
	
	@Override
	public String addStudent(Student student) {
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.addStudent(student);
	}

	@Override
	public List<Student> showAllStudents() {
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.showAllStudents();
	}

	@Override
	public Student searchStudent(Integer sId) {
		studentDao = StudentDaoFactory.getStudentDao();
		return studentDao.searchStudent(sId);
	}

}
