package in.com.dao;

import java.util.List;

import in.com.dto.Student;

public interface IStudentDao {

	public String addStudent(Student student);

	public List<Student> showAllStudents();

	public Student searchStudent(Integer sId);
}
