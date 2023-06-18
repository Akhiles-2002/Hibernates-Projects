package in.com.service;

import in.com.dao.IAdminDao;
import in.com.daofactory.AdminDaoFactory;
import in.com.dto.Admin;

public class AdminServiceImpl implements IAdminService {

	private IAdminDao adminDao = null;
	@Override
	public Admin adminRegister(String fullname, String emailId, String contactno, String password) {
		adminDao = AdminDaoFactory.getAdminDao();
		return adminDao.adminRegister(fullname, emailId, contactno, password);
	}

	@Override
	public String adminLogin(Integer userName, String password) {
		adminDao = AdminDaoFactory.getAdminDao();
		return adminDao.adminLogin(userName, password);
	}

}
