package com.michelin.java;
/*
 * 陣列的冒泡排序(Bubble Sort)的實現
 * 步驟:
 * 1. 比較相鄰元素：依序比較陣列中相鄰的兩個元素。
 * 2. 交換位置：如果順序不正確，則交換它們的位置，確保較大（或較小）的元素在後面。
 * 3. 重複步驟 1 和 2：重複以上步驟，直到沒有需要交換的元素。
 * 4. 結束：當沒有發生任何交換時，陣列已經排好序。
 * 結論:
 * Bubble sort 是一種簡單但效率低下的排序演算法，其時間複雜度為 O(n^2)。
 */
public class BubbleSortTest {
	public static void main(String[] args) {
		int[] arr = new int[] {43, 32, 76, -98, 0, 64, 33, -21, 32, 99};	// String, class也可以進行排序
		
		// 冒泡排序
		for(int i = 0; i < arr.length - 1; i++) {	// 幾輪(最後一輪就是他自己不用交換)
			for(int j = 0; j < arr.length - 1 - i; j++) {	// 每輪做到的最後一個值(因為排好的會放到後面)
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// 遍歷
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
