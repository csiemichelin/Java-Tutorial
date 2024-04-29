package com.michelin.exercise4;

public class Account {
	private double balance;	// 餘額
	
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// 存錢操作
	public void deposit(double amt) {
		if(amt > 0) {
			balance += amt;
			System.out.println("存錢成功");
		}
	}
	
	// 取錢操作
	public void withdraw(double amt) {
		if(balance >= amt) {
			balance -= amt;
			System.out.println("取錢成功");
		}else {
			System.out.println("餘額不足");
		}
	}
}
