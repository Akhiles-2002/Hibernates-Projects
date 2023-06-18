package in.com.dto;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer sid;
	private String sname;
	private String mailid;
	private String contactno;
	private String password;
	private String gender;
	private String department;
	private String course;
	private String admissionyear;
	private String dob;
	
	public Student() {
		System.out.println("Student Object is Created...");
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAdmissionyear() {
		return admissionyear;
	}

	public void setAdmissionyear(String admissionyear) {
		this.admissionyear = admissionyear;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mailid=" + mailid + ", contactno=" + contactno
				+ ", password=" + password + ", gender=" + gender + ", department=" + department + ", course=" + course
				+ ", admissionyear=" + admissionyear + ", dob=" + dob + "]";
	}

}
