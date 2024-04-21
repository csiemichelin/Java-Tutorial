package com.michelin.exercise;

public class Circle {
	// 屬性
	double radius;
	
	// 求圓的面積
	// 方法一:
//	public double findArea() {
//		double area = Math.PI * radius * radius;
//		return area;
//	}
	
	// 方法二:
	public void findArea() {
		double area = Math.PI * radius * radius;
		System.out.println("面積為: " + area);
	}
	
	// 錯誤情況:
	public double findArea(double r) {
		double area = Math.PI * r * r;
		return area;
	}
}
