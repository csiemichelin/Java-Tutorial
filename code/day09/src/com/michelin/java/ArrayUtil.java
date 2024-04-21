package com.michelin.java;

/*
 * 自定義陣列的工具類
 * 
 */
public class ArrayUtil {
	// 求陣列的最大值
	public int getMax(int[] arr) {
		int maxValue = arr[0]; // 初始化用陣列的第一個元素
		for (int i = 0; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	// 求陣列的最小值
	public int getMin(int[] arr) {
		int minValue = arr[0]; // 初始化用陣列的第一個元素
		for (int i = 0; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	// 求陣列的總和
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 求陣列的平均值
	public int getAvg(int[] arr) {
		return getSum(arr) / arr.length;
	}

	// 反轉陣列
	public void reverse(int[] arr) {
		for (int i = 0; i < (arr.length / 2); i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}

	// 複製陣列
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	// 陣列排序
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) { // 幾輪(最後一輪就是他自己不用交換)
			for (int j = 0; j < arr.length - 1 - i; j++) { // 每輪做到的最後一個值(因為排好的會放到後面)
				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
					
					// 錯誤的:
//					swap(arr[j], arr[j + 1]);
					// 正確的:
					swap(arr, i, j);
				}
			}
		}
	}
	
	// 錯誤的: 交換陣列中指定兩個位置元素的值
//	public void swap(int i, int j) {
//		int temp = i;
//		i = j;
//		j = temp;
//	}
	// 正確的: 交換陣列中指定兩個位置元素的值
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// 遍歷陣列
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	// 查找指定元素
	public int getIndex(int[] arr, int dest) {
		for (int i = 0; i < arr.length; i++) {
			if (dest == arr[i]) {
				return i;
			}
		}
		return -1;	// 回傳一個負數，表示沒有找到
	}
}
