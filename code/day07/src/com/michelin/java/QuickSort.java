package com.michelin.java;
/*
 * /**
 * 快速排序
 * 透過一趟排序將待排序記錄分割成獨立的兩部分，其中一部分記錄的關鍵字都比另一部分關鍵字小，
 * 則分別對這兩部分繼續排序，直到整個序列有序。
 */
public class QuickSort {
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	private static void subSort(int[] data, int start, int end) {
		if (start < end) {
			int base = data[start];
			int low = start + 1;
			int high = end;
			System.out.println("此輪的pivot值為: " + base + ", low起始索引值為: " + low + ", high起始索引值為: " + high);
			while (true) {
				while (low < end && data[low] - base <= 0) {
					low++;
				}
				while (high > start && data[high] - base >= 0) {
					high--;
				}
				if (low < high) {
					swap(data, low, high);
				} else {	// 每一輪的結束
					break;
				}
			}
			swap(data, start, high);	// 每一輪的結束，pivot(這裡是設start)與high進行交換
			
			System.out.println("此輪排序後為：\n" + java.util.Arrays.toString(data));
			System.out.println();
			
			subSort(data, start, high - 1);	// 遞迴呼叫
			subSort(data, high + 1, end);
		}
	}
	public static void quickSort(int[] data){
		subSort(data, 0, data.length - 1);
	}
	
	
	public static void main(String[] args) {
		int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
		System.out.println("排序之前：\n" + java.util.Arrays.toString(data));
		System.out.println();
		quickSort(data);
		System.out.println("排序之後：\n" + java.util.Arrays.toString(data));
	}
}
