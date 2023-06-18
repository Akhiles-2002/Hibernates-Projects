package in.com.service;

import java.util.List;

import in.com.dto.LibraryTransaction;

public interface ILibraryTransactionService {
	
	public String issueBook(LibraryTransaction libTranc);
	
	public String submitBook(Integer sId,Integer bId,String submitDate);
	
	public List<LibraryTransaction> showAllLibraryTransaction();

}
