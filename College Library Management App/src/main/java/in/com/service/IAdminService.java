package in.com.service;

import in.com.dto.Admin;

public interface IAdminService {
	
	public Admin adminRegister(String fullname, String emailId, String contactno, String password);

	public String adminLogin(Integer userName, String password);

}
