package com.michelin.exercise4;

public class Bank {
	private Customer[] customers;	// 存放多個客戶的陣列
	private int numberOfCustomers;	// 紀錄客戶的個數
	
	public Bank() {
		customers = new Customer[10];
	}
	
	// 添加客戶
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l);
//		customers[numberOfCustomers] = cust;
//		numberOfCustomers++;
		customers[numberOfCustomers++] = cust;
	}
	
	// 獲取客戶的個數
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	// 獲取指定位置上的客戶
	public Customer getCustomer(int index) { 
//		return customers[index];	// 不夠嚴謹，可能報異常
		if(index >= 0 && index < numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
	
}
