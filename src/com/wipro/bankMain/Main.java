package com.wipro.bankMain;
import com.wipro.bank.bean.TransferBean;
import com.wipro.bank.service.BankService;
public class Main {
	public static void main(String[] args) {
		BankService bankService=new BankService();
		System.out.println(bankService.checkBalance("3456"));
		TransferBean transferBean=new TransferBean();
		transferBean.setFromAccountNumber("4567");
		transferBean.setAmount((float) 100);
		transferBean.setToAccountNumber("3456");
		transferBean.setDateOfTransaction(
				new java.sql.Date(new java.util.Date().getTime())
		);
		System.out.println(bankService.transfer(transferBean));
	}
}
