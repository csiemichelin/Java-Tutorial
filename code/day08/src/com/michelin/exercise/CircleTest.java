package com.michelin.exercise;
/*
 * 利用物件導向的程式方法，設計類別Circle計算圓的面積。
 */
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		c1.radius = 2.1;
		
		// 對應方法一:
//		double area = c1.findArea();
//		System.out.println("面積為: " + area);
		
		// 對應方法二:
		c1.findArea();
		
		// 錯誤的調用:
		double area = c1.findArea(3.4);
		System.out.println("面積為: " + area);
	}
}
