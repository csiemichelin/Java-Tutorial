package com.michelin.exercise3;
/*
 * 寫一個測試程式
 * 1. 創建一個Customer，名字叫Jane Smith，他有一個帳號為1000，餘額為2000元，年利率為1.23%的帳戶 
 * 2. 對Jane Smith操作:
 * 	  ① 存入100元，再取出960元，再取出2000元
 *    ② 打印出Jane Smith的基本信息:
 *      成功存入: 100.0	
 *      成功取出: 960.0
 *      餘額不足，取款失敗
 *      Customer [Smith, Jane] has a account: id is 1000, auunalInterestRate is 1.23%, balance is 1140.0
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane", "Smith");
		Account acct = new Account(1000, 2000, 0.0123);
		cust.setAccount(acct);
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		System.out.println("Customer[" + cust.getFirstName() + ", " 
				+ cust.getLastName() + "] has a account: id is "+ cust.getAccount().getId()
				+ ", auunalInterestRate is " + cust.getAccount().getAnnualInterestRate() * 100 + "%, balance is " + cust.getAccount().getBalance());
	}
}
