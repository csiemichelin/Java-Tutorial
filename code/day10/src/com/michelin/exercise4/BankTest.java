package com.michelin.exercise4;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		// 連續操作
		bank.getCustomer(0).setAccount(new Account(2000));
		
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客戶: " + bank.getCustomer(0).getFirstName() + "帳戶的餘額為: " + balance);
		
		
		System.out.println("*****************************");
		bank.addCustomer("昆霖", "余");
		System.out.println("銀行客戶的個數為: " + bank.getNumberOfCustomers());
		
	}
}
