package com.michelin.exercise;
/*
 * 使用簡單陣列
	(1)建立一個名為ArrayExercise2的類，在main()方法中宣告array1和array2兩個變量，他們是int[]類型的陣列。
	(2)使用大括號{}，將array1初始化為8個質數：2,3,5,7,11,13,17,19。
	(3)顯示array1的內容。
	(4)賦值array2變數等於array1，修改array2中的偶索引元素，使其等於索引值
	(如array[0]=0,array[2]=2)。 印出array1。
 * 
 * 
 * 思考：array1和array2是什麼關係？ array1和array2地址值相同，都指向了堆空間中的唯一一個陣列實體
	拓展：修改題目，實現array2對array1陣列的複製	
 */
public class ArrayExercise2 {
	public static void main(String[] args) {
		int[] array1, array2;
		array1 = new int[] {2, 3, 5, 7, 11, 13, 17, 19};	// 只new一個就只會有一個陣列
		// 顯示array1的內容
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		// 賦值array2變數等於array1
		// 不能稱作陣列的複製
		array2 = array1;
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
