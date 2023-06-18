package in.com.dao;

import java.util.List;

import in.com.dto.LibraryTransaction;

public interface ILibraryTransactionDao {

	public String issueBook(LibraryTransaction libTranc);

	public String submitBook(Integer sId, Integer bId, String submitDate);

	public List<LibraryTransaction> showAllLibraryTransaction();

}
