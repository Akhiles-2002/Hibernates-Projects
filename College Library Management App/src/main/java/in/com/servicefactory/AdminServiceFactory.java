package in.com.servicefactory;

import in.com.service.AdminServiceImpl;
import in.com.service.IAdminService;

public class AdminServiceFactory {

	private static IAdminService adminService = null;

	private AdminServiceFactory() {

	}

	public static IAdminService getAdminService() {
		if (adminService == null) {
			adminService = new AdminServiceImpl();
		}
		return adminService;
	}

}
