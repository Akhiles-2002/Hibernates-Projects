package in.com.daofactory;

import in.com.dao.AdminDaoImpl;
import in.com.dao.IAdminDao;

public class AdminDaoFactory {

	private static IAdminDao adminDao = null;

	private AdminDaoFactory() {

	}

	public static IAdminDao getAdminDao() {
		if (adminDao == null) {
			adminDao = new AdminDaoImpl();
		}
		return adminDao;
	}

}
