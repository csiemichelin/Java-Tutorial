package com.michelin.java;

/*
 * 1. 陣列(Array)，是多個相同類型資料按一定順序排列的集合，並使用一個名字命名並透過編號的方式對這些數據進行統一管理。
 * 
 * 2. 陣列相關的信息:
 *    > 陣列名
 *    > 元素
 *    > 索引
 *    > 陣列的長度
 * 
 * 3. 陣列的特點:
 *    1) 陣列是有序排列的
 *    2) 陣列屬於引用數據類型的變量。陣列的元素，既可以是基本數據類型，也可以是引用數據類型
 *    3) 創建陣列的對象會在記憶體中開闢一整塊連續的空間
 *    4) 陣列的長度一旦確定，就不能修改
 *    
 * 4. 陣列的分類:
 * 	  1) 按照維數: 一維陣列、二維陣列
 *    2) 按照陣列元素的類型: 基本數據類型元素的陣列、引用數據類型元素的陣列
 * 
 * 5. 一維陣列的使用:
 * 	  1) 一維陣列的宣告和初始化
 * 	  2) 如何調用陣列中指定位置的元素
 * 	  3) 如何獲取陣列的長度
 *    4) 如何遍歷陣列
 *    5) 陣列元素的默認初始化值
 *    	 > 陣列元素是整型: 0
 *       > 陣列元素是浮點型: 0.0
 *       > 陣列元素是char型: ASCll = 0或'\u0000'，不是指'0'
 *       > 陣列元素是boolean型: false
 *       > 陣列元素是引用數據類型: null，但不是"null"
 *    6) 陣列的記憶體解析 
 */
public class ArrayTest {
	public static void main(String[] args) {
		// 1) 一維陣列的宣告和初始化
		int[] ids; // 宣告
		// 1.1 靜態初始化: 陣列的初始化和陣列元素的附值操作同時進行
		ids = new int[] {1001, 1002, 1003, 1004};
		// 1.2 動態初始化: 陣列的初始化和陣列元素的附值操作分開進行
		String[] names = new String[5];
		
		// 錯誤寫法:
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3] {1, 2, 3};
//		int[] ids1;
//		ids1 = {1001, 1002, 1003, 1004};
		
		// 正確寫法:
		String names1[] = new String[5];	// 括號也可以寫在變數後
		int[] arr6 = {1, 2, 3, 4, 5};	// 類型推斷
		
		// 總結: 數組一旦初始化完成，其長度就確定了
		
		
		// 2) 如何調用陣列中指定位置的元素: 通過索引的方式調用
		// 陣列的索引從0開始的，到陣列的長度-1結束
		names[0] = "小魚";
		names[1] = "小昆";
		names[2] = "小霖";
		names[3] = "缺水魚";
		names[4] = "米奇霖";
//		names[5] = "超出範圍啦";
		
		
		// 3) 如何獲取陣列的長度
		// 屬性: length
		System.out.println(names.length); // 5
		System.out.println(ids.length);
		
		
		// 4) 如何遍歷陣列
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// 5) 陣列元素的默認初始化值
		int[] arr = new int[4];
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("**************");
		short[] arr1 = new short[4];
		for(int i=0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("**************");
		float[] arr2 = new float[4];
		for(int i=0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("**************");
		char[] arr3 = new char[4];
		for(int i=0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		if(arr3[0] == 0) {
			System.out.println("你好!");
		}
		System.out.println("**************");
		boolean[] arr4 = new boolean[4];
		for(int i=0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println("**************");
		String[] arr5 = new String[4];
		for(int i=0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		if(arr5[0] == null) {
			System.out.println("小魚驚訝了!");
		}
		if(arr5[0] == "null") {
			System.out.println("這是錯的喔!");
		}

	}
}
