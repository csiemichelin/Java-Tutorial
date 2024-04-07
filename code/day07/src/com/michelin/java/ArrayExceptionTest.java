package com.michelin.java;
/*
 * 陣列中的常見異常:
 * 1. 陣列索引越界異常: ArrayIndexOutOfBoundsException
 * 2. 空指針異常: NullPointerException
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
		// 1. 陣列索引越界異常: ArrayIndexOutOfBoundsException
		int[] arr = new int[] {1, 2, 3, 4, 5};
//		for(int i = 0; i <= arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[-2]);
		
		// 2. 空指針異常: NullPointerException
		// 情況一:
//		int[] arr1 = new int[] {1, 2, 3};
//		arr1 = null;
//		System.out.println(arr1);		// 可以輸出為null
//		System.out.println(arr1[0]);	//不能輸出，為空指針
		
		// 情況二:
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0]);	// 可以輸出為null
//		System.out.println(arr2[0][0]);	//不能輸出，為空指針
		
		// 情況三:
		String[] arr3 = new String[] {"AA", "BB", "CC"};
		arr3[0] = null;
		System.out.println(arr3[0]);	// 可以輸出為null
		System.out.println(arr3[0].toString());	// class中的變量被設為null，則無法再調用其方法
	}
}
