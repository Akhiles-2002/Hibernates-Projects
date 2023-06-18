package in.com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.com.dto.Student;
import in.com.service.IStudentService;
import in.com.servicefactory.StudentServiceFactory;

@WebServlet("/studentcontroller/*")
public class StudentController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		IStudentService studentService = StudentServiceFactory.getStudentService();

		if (request.getRequestURI().endsWith("addstudent")) {

			Student student = new Student();
			student.setSname(request.getParameter("sname"));
			student.setMailid(request.getParameter("mailid"));
			student.setContactno(request.getParameter("contactno"));
			student.setPassword(request.getParameter("password"));
			student.setGender(request.getParameter("gender"));
			student.setDepartment(request.getParameter("department"));
			student.setCourse(request.getParameter("course"));
			student.setAdmissionyear(request.getParameter("admissionyear"));
			student.setDob(request.getParameter("dob"));

			String addStudent = studentService.addStudent(student);

			request.setAttribute("addStudent", addStudent);
			requestDispatcher = request.getRequestDispatcher("../studentregistrationresponse.jsp");
			requestDispatcher.forward(request, response);

		}

		if (request.getRequestURI().endsWith("getallstudents")) {

			List<Student> showAllStudents = studentService.showAllStudents();
			System.out.println(showAllStudents);
			request.setAttribute("showAllStudents", showAllStudents);
			requestDispatcher = request.getRequestDispatcher("../showallstudents.jsp");
			requestDispatcher.forward(request, response);
		}

		if (request.getRequestURI().endsWith("searchstudent")) {
			Integer sId = Integer.parseInt(request.getParameter("sid"));
			Student searchStudents = studentService.searchStudent(sId);
			request.setAttribute("searchStudents", searchStudents);
			requestDispatcher = request.getRequestDispatcher("../searchstudentresponse.jsp");
			requestDispatcher.forward(request, response);
		}

	}

}
