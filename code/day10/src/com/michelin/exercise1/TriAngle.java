package com.michelin.exercise1;
/*
 * 寫兩個類，TriAngle和TriAngleTest，
 * 其中TriAngle類中宣告私有的底邊長base和高height，同時宣告公共方法存取私有變數。 
 * 此外，提供類必要的構造子。 在另一個類中使用這些公共方法，計算三角形的面積
 * 
 */
public class TriAngle {
	private double base; 	// 底邊長
	private double height;	// 高
	
	public TriAngle() {
		
	}
	public TriAngle(double b, double h) {
		base = b;
		height = h;
	}
	
	public void setBase(double b) {
		base = b;
	}
	public double getBase() {
		return base;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	public double getHeight() {
		return height;
	}
	
	
	
}
