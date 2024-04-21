package com.michelin.exercise;
/*
 * 1. 編寫程式，定義三個重載方法並呼叫。 方法名為mOL。
 * 	  三個方法分別接收一個int參數、兩個int參數、一個字串參數。 
 *    分別執行平方運算並輸出結果，相乘並輸出結果，輸出字串信息。
 *    在主類別的main ()方法中分別用參數來區別呼叫三個方法。
 *    
 * 2. 定義三個重載方法max()
 * 	  第一個方法求兩個int值中的最大值，
 *    第二個方法求兩個double值中的最大值
 *    第三個方法求三個double值中的最大值，並分別呼叫三個方法。
 * 
 */
public class OverLoadExercise {
	// 1. 如下的三個方法構成重載
	public void mol(int i) {
		System.out.println(i * i);
	}
	
	public void mol(int i, int j) {
		System.out.println(i * j);
	}
	
	public void mol(String s) {
		System.out.println(s);
	}
	
	// 2. 如下的三個方法構成重載
	public int max(int i, int j) {
		return (i > j)? i: j;
	}
	
	public double max(double d1, double d2) {
		return (d1 > d2)? d1: d2;
	}
	
	public double max(double d1, double d2, double d3) {
		double max =  (d1 > d2)? d1: d2;
		return (max > d3)? max: d3;
	}
}
