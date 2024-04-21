package com.michelin.java;
/*
 * 一、設計類，就是設計類的成員
 * 1. 屬性 = 成員變量 = field = 域、字段
 * 2. 方法 = 成員方法 = 函數 = method
 * 	> 創建類的物件 = 類的實例化 = 實例化類
 * 
 * 二、類和物件的使用(物件導向思想落地的實現)
 * 1. 創建類、設計類的成員
 * 2. 創建類的對象
 * 3. 通過"物件.屬性" 或 "物件.方法" 呼叫物件的結構
 * 
 * 三、如果創建了一個類的多個物件，則每個物件都獨立擁有一套類的屬性。(非static的)
 * 	> 意味著: 如果我們修改一個物件的屬性a，則不影響另外一個物件屬性a的值
 * 
 * 四、物件的記憶體解析	
 */

// 測試類
public class PersonTest {
	public static void main(String[] args) {
		// 2. 創建Person類的物件
		Person p1 = new Person();
		// Scanner scanner = new Scanner(System.in);
		
		// 呼叫物件的結構: 屬性、方法
		// 3. 呼叫屬性: "物件.屬性"
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		// 3. 呼叫方法: "物件.方法"
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		//***********************************
		Person p2 = new Person();
		System.out.println(p2.name);	// Tom? null? 報錯?
		System.out.println(p2.isMale);	// false
		//***********************************
		// 相當於array2 = array1
		// 將p1變量保存的物件地址值賦給p3，導致p1和p3指向了堆空間中的同一個物件實體
		Person p3 = p1;
		System.err.println(p3.name); 	// Tom
		p3.age = 10;
		System.out.println(p1.age);		// 10
	}
}

// 1. 創建類、設計類的成員
class Person{
	// 屬性
	String name;
	int age = 1;
	boolean isMale;
	
	// 方法
	public void eat() {
		System.out.println("人可以吃飯");
	}
	public void sleep() {
		System.out.println("人可以睡覺");
	}
	public void talk(String language) {
		System.out.println("人可以說話，使用的是: " + language);
	}
}
