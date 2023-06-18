package in.com.service;

import java.util.List;

import in.com.dto.Student;

public interface IStudentService {

	public String addStudent(Student student);

	public List<Student> showAllStudents();

	public Student searchStudent(Integer sId);

}
