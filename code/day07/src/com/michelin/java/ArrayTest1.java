package com.michelin.java;

/*
 * 求數值型陣列中元素的最大值、最小值、平均數、總和等
 * 
 * 定義一個int型的一維陣列，包含10個元素，分別賦一些隨機整數，然後求所有元素的最大值，最小值，和值，平均值，並輸出出來。
 * 要求：所有隨機數字都是兩位數。
 * 
 * random公式:
 * [10, 99]
 * 公式: (int)(Math.random() * (99 - 10 + 1) + 10)
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
		}
		
		// 遍歷
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		// 求數值型陣列中元素的最大值
		int maxValue = arr[0];	// 初始化用陣列的第一個元素
		for(int i = 0; i < arr.length; i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("最大值為: " + maxValue);
		
		// 求數值型陣列中元素的最小值
		int minValue = arr[0];	// 初始化用陣列的第一個元素
		for(int i = 0; i < arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值為: " + minValue);
		
		// 求數值型陣列中元素的總和
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("總和為: " + sum);
		
		// 求數值型陣列中元素的平均數
		int avgValue = sum / arr.length;
		System.out.println("平均數為: " + avgValue);
	}
}
