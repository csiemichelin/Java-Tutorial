package com.michelin.java;
/*
 * 類中屬性的使用
 * 
 * 一、屬性(成員變量) VS 局部變量
 * 1. 相同點:
 * 		1.1 定義變量的格式: 數據類型 變量名 = 變量值
 * 		1.2 先宣告，後使用
 * 		1.3 變量都有其對應的作用域
 * 
 * 2. 不同點:
 * 		2.1 在類中宣告的位置不同
 * 			屬性: 直接定義在類的{}內
 * 			局部變量: 宣告在方法內、方法參數、代碼塊內、建構子參數、建構子內部的變量
 * 		2.2 關於權限修飾符的不同
 * 			屬性: 可以在宣告屬性時，指名其權限，使用權限修飾符(也可以不用添加)
 * 				> 常用的權限修飾符: private、public、缺省(沒添加)、protected	--> 封裝性再細說
 * 				> 目前，宣告變量，都不用添加權限修飾符就可以了
 * 			局部變量: 不可以使用權限修飾符
 * 		2.3 默認初始化值的情況:
 * 			屬性: 類的屬性，根據其類型，都有默認初始化值
 * 				> 整型(byte、short、int、long): 0
 * 				> 浮點型(float、double): 0.0
 * 				> 字元型(char): 0(或'\u0000')
 * 				> 布林型(boolean): false
 * 				> 引用數據類型(類、陣列、接口): null
 * 			局部變量: 沒有默認的初始化值
 * 				> 意味著: 我們在調用局部變量之前，一定要顯示賦值
 * 				> 特別的: 參數在調用時，再賦值即可
 * 		2.4 在記憶體中加載的位置
 * 			屬性: 加載到堆(heap)空間中	(非static的，static放在方法區)
 * 			局部變量: 加載到棧(stack)空間中
 */
public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
		
		u1.talk("日語");
	}
}

class User{
	// 屬性(或成員變量)
	String name;
	public int age;
	boolean isMale;
	
	public void talk(String language) {	// language: 參數，也是局部變量
		System.out.println("我們使用" + language + "進行交流");
	}
	
	public void eat() {
		String food = "臭豆腐";	// 局部變量
		System.out.println("台灣人喜歡吃: " + food);
	}
}