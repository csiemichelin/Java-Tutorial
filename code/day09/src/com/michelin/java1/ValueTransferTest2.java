package com.michelin.java1;
/*
 * 2. 值傳遞機制: 
 * 	  call by value: 如果參數是基本數據類型，此時實參賦給形參的是實參所保存的數據值
 *    call by reference: 如果參數是引用數據類型，此時實參賦給形參的是實參存儲數據的地址值 
 */
public class ValueTransferTest2 {
	public static void main(String[] args) {
		Data data = new Data();
		
		data.m = 10;
		data.n = 20;
		
		System.out.println("m = " + data.m + ", n = " + data.n);
		
		// 交換m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;
		
		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(data);
		
		System.out.println("m = " + data.m + ", n = " + data.n);
	}
	
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
}

class Data{
	int m;
	int n;
}