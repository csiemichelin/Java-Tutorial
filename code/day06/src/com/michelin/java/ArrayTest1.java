package com.michelin.java;
/*
 * 二維陣列的使用
 * 
 * 1. 理解:
 * 對於二維陣列的理解，我們可以看成是一維陣列array1又作為另一個一維陣列array2的元素而存在。
 * 其實，從陣列底層的運作機制來看，其實沒有多維陣列。
 * 
 * 2. 二維陣列的使用:
 * 	  1) 二維陣列的宣告和初始化
 * 	  2) 如何調用陣列中指定位置的元素
 * 	  3) 如何獲取陣列的長度
 *    4) 如何遍歷二維陣列
 *    
 *    規定: 二維陣列分為外層陣列的元素，內層陣列的元素
 *    	 int[][] arr = new int[4][3];
 *       外層元素: arr[0], arr[1]等
 *       內層元素: arr[0][0], arr[1][2]等
 *       
 *    5) 陣列元素的默認初始化值
 *    	 > 針對於初始化方式一: 比如: int[][] arr10 = new int[4][3];
 *    		- 外層元素的初始化值為: 地址值
 *    		- 內層元素的初始化值為: 與一維陣列初始化情況相同
 *    	 > 針對於初始化方式二: 比如: int[][] arr10 = new int[4][];
 *    		- 外層元素的初始化值為: null
 *    		- 內層元素的初始化值為: 不能調用，否則報錯
 *    
 *    6) 陣列的記憶體解析 
 * 
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		// 1) 二維陣列的宣告和初始化
		int[] arr = new int[] {1, 2, 3}; // 一維陣列
		// 靜態初始化
		int[][] arr1 = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		// 動態初始化1
		String[][] arr2 = new String[3][2];
		// 動態初始化2
		String[][] arr3 = new String[3][];
		
		// 錯誤寫法:
//		String[][] arr4 = new String[][4];
//		String[4][3] arr5 = new String[][];
//		int[][] arr6 = new int[4][3] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		
		// 正確寫法:
		int[] arr7[] = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		int arr8[][] = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		int[] arr9[] = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		
		
		// 2) 如何調用陣列中指定位置的元素
		System.out.println(arr1[0][1]);	// 2
		System.out.println(arr2[1][1]); // null
//		System.out.println(arr3[1][1]); // 會報錯
		arr3[1] = new String[4];
		System.out.println(arr3[1][1]);	// null
		
		// 3) 如何獲取陣列的長度
		System.out.println(arr7.length); // 3
		System.out.println(arr7[0].length); // 3
		System.out.println(arr7[1].length); // 2
		
		// 4) 如何遍歷二維陣列
		for(int i = 0; i < arr7.length; i++) {
			for(int j = 0; j < arr7[i].length; j++) {
				System.out.print(arr7[i][j] + " ");
			}
			System.out.println();
		}
		
		// 5) 陣列元素的默認初始化值
		int[][] arr10 = new int[4][3];
		System.out.println(arr10[0]);		// 記憶體位址: [I@2c8d66b2
		System.out.println(arr10[0][0]);	// 0
		System.out.println(arr10);			// 記憶體位址: [[I@5a39699c
		
		System.out.println("*****************");
		
		float[][] arr11 = new float[4][3];
		System.out.println(arr11[0]);		// 記憶體位址: [F@3cb5cdba
		System.out.println(arr11[0][0]);	// 0.0
		System.out.println(arr11);			// 記憶體位址: [[F@6bdf28bb
		
		System.out.println("*****************");
		
		String[][] arr12 = new String[4][3];
		System.out.println(arr12[1]);		// 記憶體位址: [Ljava.lang.String;@6b71769e
		System.out.println(arr12[1][1]);	// null
		
		System.out.println("*****************");
		
		double[][] arr13 = new double[4][];
		System.out.println(arr13);			// 記憶體位址: [[D@2752f6e2
		System.out.println(arr13[1]);		// null，陣列本身為引用數據類型，若沒有指向其他陣列則初始化為null
		System.out.println(arr13[1][0]);	// 報錯，沒有指針指到內層陣列
		
	}
}
