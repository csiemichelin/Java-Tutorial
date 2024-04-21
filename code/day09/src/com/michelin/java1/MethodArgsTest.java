package com.michelin.java1;
/*
 * 可變個數形參的方法
 * 
 * 1. jdk 5.0新增的內容
 * 2. 具體使用: 
 * 	  2.1 可變個數形參的格式: 數據類型 ... 變量名
 * 	  2.2 當呼叫可變個數形參的方法時，傳入的參數個數可以是: 0個、1個、2個、...
 *    2.3 可變個數形參的方法與本類中方法名相同，形參不同的方法之間構成重載
 *    2.4 可變個數形參的方法與本類中方法名相同，形參類型也相同的陣列之間不構成重載。換句話說，二者不能共存
 *    2.5 可變個數形參在方法的形參中，必須聲明在末尾
 *    2.6 可變個數形參在方法的形參中，最多只能聲明一個可變形參
 */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("hello", "world");
		test.show(new String[]{"hello", "world"});
		test.show();
		
		// 就有調用形參類型為陣列的方法
//		test.show(new String[]{"hello", "world"});
	}
	
	public void show(int i) {
		
	}
	
	public void show(String s) {
		System.out.println("show(String)");
	}
	
	public void show(String ... strs) {
		System.out.println("show(String ... strs)");
		for(int i = 0; i < strs.length; i++){
			System.out.println(strs[i]);
		}
	}
	
	// 與可變個數形參的方法不能共存
//	public void show(String[] s) {
//		
//	}
	
	public void show(int i, String ... strs) {
		
	}
	
	// The variable argument type String of the method
	// show must be the last parameter
//	public void show(String ... strs, int i) {
//		
//	}
}