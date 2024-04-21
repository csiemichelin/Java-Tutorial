package com.michelin.exercise1;
/*
 * （1）定義一個Circle類，包含一個double型的radius屬性代表圓的半徑，一個findArea()方法回傳圓的面積。
 */
public class Circle {
	double radius; // 半徑
	
	// 求圓的面積
	public double findArea() {
		return radius* radius * Math.PI;
	}
}
