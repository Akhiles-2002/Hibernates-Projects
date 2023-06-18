package in.com.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import in.com.dao.ILibraryTransactionDao;
import in.com.daofactory.LibraryTransactionDaoFactory;
import in.com.dto.LibraryTransaction;

public class LibraryTransactionServiceImpl implements ILibraryTransactionService {

	private ILibraryTransactionDao libTransDao = null;
	
	@Override
	public String issueBook(LibraryTransaction libTranc) {
		libTransDao = LibraryTransactionDaoFactory.getLibraryTransactionDao();
		System.out.println("Before "+libTranc);

		String issueDate = libTranc.getIssueDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();

		try {
			Date parse = sdf.parse(issueDate);
			calendar.setTime(parse);
		} catch (Exception e) {
			e.printStackTrace();
		}

		calendar.add(Calendar.DAY_OF_MONTH, 14);
		Date time = calendar.getTime();
		String dueDate = sdf.format(time);

		libTranc.setDueDate(dueDate);
		System.out.println("after "+libTranc);
		return libTransDao.issueBook(libTranc);
	
	}

	@Override
	public String submitBook(Integer sId, Integer bId, String submitDate) {
		libTransDao = LibraryTransactionDaoFactory.getLibraryTransactionDao();
		return libTransDao.submitBook(sId, bId, submitDate);
	}

	@Override
	public List<LibraryTransaction> showAllLibraryTransaction() {
		libTransDao = LibraryTransactionDaoFactory.getLibraryTransactionDao();
		return libTransDao.showAllLibraryTransaction();
	}

}
