package in.com.dto;

import java.io.Serializable;

public class Admin implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer adminId;
	private String fullname;
	private String emailId;
	private String contactno;
	private String password;
	
	public Admin() {
		System.out.println("Admin Object is created....");
	}
	
	public Integer getAdminId() {
		return adminId;
	}
	
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "Manager [adminId=" + adminId + ", fullname=" + fullname + ", emailId=" + emailId + ", contactno="
				+ contactno + ", password=" + password + "]";
	}

}
