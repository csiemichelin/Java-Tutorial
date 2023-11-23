/*
運算子五: 位運算子  (不常用，但需了解)

結論:
1. 位運算子的操作都是整數型態的數據
2. <<，在一定範圍內，每像左移1位，相當於 * 2
   >>，在一定範圍內，每像右移1位，相當於 / 2
      
面試題: 
1. 最高效方式的計算2 * 8 ?		2 << 3 或 8 << 1
*/
class OperatorTest5{
	public static void main(String[] arg){
		int num = 21;
		num = -21;
		System.out.println("num << 2: " + (num << 2));		// 輸出結果: 84
		System.out.println("num << 27: " + (num << 27));	// 輸出結果: -1476395008，最高位變成一，為負數
		
		int m = 12;
		int n = 5;
		System.out.println("m & n: " + (m & n));			// 輸出結果: 4
		System.out.println("m | n: " + (m | n));			// 輸出結果: 13
		System.out.println("m ^ n: " + (m ^ n));			// 輸出結果: 9，互斥或
		
		//***************************************************************
		// 練習: 交換兩個變數的值
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		// 方式一: 定義臨時變數
		// int temp = num1;
		// num1 = num2;
		// num2 = temp;
		// System.out.println("num1 = " + num1 + ", num2 = " + num2);
		// 方式二: 好處: 不用定義臨時變數
		// 弊端: 1. 相加可能超過儲存範圍，2. 有侷限性只能用在數值型態
		// num1 = num1 + num2;
		// num2 = num1 - num2;
		// num1 = num1 - num2;
		// System.out.println("num1 = " + num1 + ", num2 = " + num2);
		// 方式三: 使用位運算子
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
	}
}