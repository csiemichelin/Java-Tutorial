package com.michelin.java;

import java.util.Arrays;

/*
 * java.util.Arrays: 操作陣列的工具類，裡面定義了很多操作陣列的函數
 * 
 */
public class ArrayToolTest {
	public static void main(String[] args) {
		// 1. boolean equals(int[] a,int[] b): 判斷了兩個陣列是否相等
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = new int[] {1, 3, 2, 4}; 
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		// 2. String toString(int[] a): 輸出陣列信息
		System.out.println(Arrays.toString(arr1));
		
		// 3. void fill(int[] a,int val): 將指定值填充到陣列的所有元素之中
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		// 4. void sort(int[] a): 對陣列進行排序
		Arrays.sort(arr2);	// 底層用QuickSort實作
		System.out.println(Arrays.toString(arr2));
		
		// 5. int binarySearch(int[] a,int key): 對排序後的陣列進行二分法搜尋指定的值
		int[] arr3 = new int[] {-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
		int index = Arrays.binarySearch(arr3, 210);
		if(index >= 0) {
			System.out.println(index);
		}else {
			System.out.println("未找到");
		}
		
	}
}
