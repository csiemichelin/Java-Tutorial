package com.michelin.java1;
/*
 * 方法形參的傳遞機制: 值傳遞
 * 
 * 1. 形參: 方法定義時，聲明的小括號內的參數
 * 	  實參: 方法調用時，實際傳遞給形參的數據
 * 
 * 2. 值傳遞機制: 
 * 	  call by value: 如果參數是基本數據類型，此時實參賦給形參的是實參所保存的數據值
 *    call by reference: 如果參數是引用數據類型，此時實參賦給形參的是實參存儲數據的地址值
 */
public class ValueTransferTest1 {
	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		System.out.println("m = " + m + ", n = " + n);
		// 交換兩個變量的值
//		int temp = m;
//		m = n;
//		n = temp;
		
		ValueTransferTest1 test = new ValueTransferTest1();
		test.swap(m, n);
		
		System.out.println("m = " + m + ", n = " + n);
	}
	
	public void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}
}
