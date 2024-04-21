package com.michelin.exercise;
/*
 * 3.1 寫一個程式，宣告一個method方法，在方法中列印一個10*8 的*型矩形，在main方法中呼叫該方法。
 * 3.2 修改上一個程式，在method1方法中，除列印一個10*8的*型矩形外，再計算該矩形的面積，並將其作為方法回傳值。 在main方法中呼叫該方法，接收傳回的面積值並列印。
 * 3.3 修改上一個程式，在method2方法提供m和n兩個參數，方法中列印一個m*n的*型矩形，併計算該矩形的面積， 將其作為方法回傳值。 在main方法中呼叫此方法，接收回傳的面積值並列印
 */
public class Exercise3Test {
	public static void main(String[] args) {
		Exercise3 test = new Exercise3();
		
		// 3.1測試
		test.method();
		
		// 3.2測試
		// 方式一:
//		int area = test.method1();
//		System.out.println("面積為: " + area);
		// 方式二:
		System.out.println(test.method1());
		
		// 3.3測試
		int area = test.method2(12, 10);
		System.out.println("面積為: " + area);
	}
}