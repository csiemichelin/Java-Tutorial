package com.michelin.java;

/*
 * 算法的考察: 陣列的複製、反轉、查找(線性查找、二分法查找)
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ", "DD", "MM", "BB", "GG", "AA"};
		
		// 陣列的複製(區別於陣列變量的賦值: arr1 = arr)
		String[] arr1 = new String[arr.length];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		
		
		// 陣列的反轉
		// 方法一:
//		for(int i = 0; i < (arr.length / 2); i++) {
//			String temp = arr[i];
//			arr[i] = arr[arr.length - i -1];
//			arr[arr.length - i -1] = temp;
//		}
		// 方法二: 
		for(int i = 0, j = arr.length - 1; i < j; i++, j--) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// 遍歷
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		
		// 查找 (或搜索)
		// 線性查找(linear search):
		String[] arr2 = new String[] {"JJ", "DD", "MM", "BB", "GG", "AA"};
		String desc = "BB";
		boolean isFlag = true;
		for(int i = 0; i < arr2.length; i++) {
			if(desc.equals(arr[i])) {
				System.out.println("找到了指定的元素，位置為: " + i);
				isFlag = false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("很遺憾，沒有找到喔!");
		}	
		// 二分法查找(binary search)(熟悉):
		// 前提: 所有查找的陣列必須有序
		int[] arr3 = new int[] {-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
		int desc1 = -98;
		int head = 0;	// 初始首索引
		int end = arr3.length - 1;	// 初始的末索引
		boolean isFlag1 = true;
		while(head <= end) {
			int middle = (head + end) / 2;
			if(desc1 == arr3[middle]) {
				System.out.println("找到了指定的元素，位置為: " + middle);
				isFlag1 = false;
				break;
			}else if(arr3[middle] > desc1) {
				end = middle - 1;
			}else {	// arr3[middle] < desc1
				head = middle + 1;
			}
		}
		if(isFlag1) {
			System.out.println("很遺憾，沒有找到啦!");
		}
	}
}
