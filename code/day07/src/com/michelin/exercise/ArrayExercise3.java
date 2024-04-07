package com.michelin.exercise;
/*
 * 使用簡單陣列
   拓展：修改題目，實現array2對array1陣列的複製	
 */
public class ArrayExercise3 {
	public static void main(String[] args) {
		int[] array1, array2;
		array1 = new int[] {2, 3, 5, 7, 11, 13, 17, 19};	// 只new一個就只會有一個陣列
		// 顯示array1的內容
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		
		// 陣列的複製
		array2 = new int[array1.length];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}
		
		// 修改array2中的偶索引元素，使其等於索引值(如array[0]=0,array[2]=2)
		for(int i = 0; i < array2.length; i++) {
			if(i % 2 == 0) {
				array2[i] = i;
			}
		}
		System.out.println();
		// 打印出array1
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");	// 會跟array2的結果一樣，因為是把array1的位址給array2
		}
	}
}
