package in.com.dto;

import java.io.Serializable;

public class LibraryTransaction implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer sId;
	private Integer bId;
	private String issueDate;
	private String dueDate;
	private String submitDate;
	private Integer fine;
	
	public LibraryTransaction() {
		System.out.println("LibraryTransaction Object is created...");
	}
	
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(String submitDate) {
		this.submitDate = submitDate;
	}
	public Integer getFine() {
		return fine;
	}
	public void setFine(Integer fine) {
		this.fine = fine;
	}
	@Override
	public String toString() {
		return "LibrarianTransaction [sId=" + sId + ", bId=" + bId + ", issueDate=" + issueDate + ", dueDate=" + dueDate
				+ ", submitDate=" + submitDate + ", fine=" + fine + "]";
	}

}
