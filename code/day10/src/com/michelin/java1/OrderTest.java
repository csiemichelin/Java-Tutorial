package com.michelin.java1;

import com.michelin.java.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderPublic = 3;
		// 出了Order類所屬的包之後，私有的結構、缺省宣告的結構就不可以被調用
//		order.orderDefault = 2;
//		order.orderPrivate = 1;		// The field Order.orderPrivate is not visible
		
		order.methodPublic();
		// 出了Order類所屬的包之後，私有的結構、缺省宣告的結構就不可以被調用
//		order.methodDefault();
//		order.methodPrivate();		// The field Order.orderPrivate is not visible
	}
}
