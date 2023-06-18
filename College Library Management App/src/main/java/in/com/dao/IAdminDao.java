package in.com.dao;

import in.com.dto.Admin;

public interface IAdminDao {
	
	public Admin adminRegister(String fullname, String emailId, String contactno, String password);

	public String adminLogin(Integer userName, String password);

}
