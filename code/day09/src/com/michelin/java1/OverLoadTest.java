package com.michelin.java1;
/*
 * 方法的重載(overload) 
 * 1. 在同一個類別中，允許存在一個以上的同名方法，只要它們的參數數量或參數類型不同即可。
 * 	  > "兩同一不同" : 同一個類、相同方法名
 * 					  參數列表不同(參數個數不同、參數類型不同)
 * 2. 舉例: Arrays類中的sort()、binarySearch()等
 * 
 * 3. 判斷是否為重載: 跟方法的權限修飾符、回傳值類型、參數變量名、方法體都沒有關係!
 * 
 * 4. 在通過物件調用方法時，如何確定某一個指定的方法:
 * 	  > 方法名 ----> 參數列表
 */
public class OverLoadTest {
	public static void main(String[] args) {
		OverLoadTest test = new OverLoadTest();
		test.getSum(1, 2);
	}
	
	// 如下的4個方法構成了重載
	public void getSum(int i, int j) {
		System.out.println("1");
	}
	
	public void getSum(double d1, double d2) {
		System.out.println("2");
	}
	
	public void getSum(String s, int i) {
		System.out.println("3");
	}

	public void getSum(int i, String s) {
		System.out.println("4");
	}
	
	// 以下皆不是重載
//	public int getSum(int i, int j) {
//		return 0;
//	}
	
//	public void getSum(int m, int n) {
//		
//	}
	
//	private void getSum(int i, int j) {
//		
//	}
	
//	public void getSum(int i, int j) {
//		System.out.println("5");
//	}
}
