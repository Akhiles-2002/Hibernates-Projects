package in.com.dto;

import java.io.Serializable;

public class Librarian implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer libId;
	private String fullname;
	private String mailid;
	private String contactno;
	private String password;
	
	public Librarian() {
		System.out.println("Librarian Object is created....");
	}

	public Integer getLibId() {
		return libId;
	}

	public void setLibId(Integer libId) {
		this.libId = libId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	@Override
	public String toString() {
		return "Librarian [libId=" + libId + ", fullname=" + fullname + ", mailid=" + mailid + ", contactno="
				+ contactno + ", password=" + password + "]";
	}
	
}
