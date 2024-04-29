package com.michelin.java;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderDefault = 2;
		order.orderPublic = 3;
		// 出了Order類之後，私有的結構就不可以被調用
//		order.orderPrivate = 1;		// The field Order.orderPrivate is not visible
	
		order.methodDefault();
		order.methodPublic();
		// 出了Order類之後，私有的結構就不可以被調用
//		order.methodPrivate();		// The field Order.orderPrivate is not visible
	}
}
