/*
運算子之一: 算數運算子
+ - + - * / % (前)++ (後)++ (前)-- (後)-- +
*/
class OperatorTest{
	public static void main(String[] args){
		// 1. 除號: /
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2; 
		System.out.println(result1);			// 輸出結果: 2
		
		int result2 = num1 / num2 * num2;
		System.out.println(result2);			// 輸出結果: 10
		
		double result3 = num1 / num2;	
		System.out.println(result3);			// 輸出結果: 2.0
		
		double result4 = num1 / num2 + 0.0;		// 輸出結果: 2.0
		double result5 = num1 / (num2 + 0.0);	// 輸出結果: 2.4，先轉成浮點數運算就不會有餘數的問題
		double result6 = (double)num1 / num2;	// 輸出結果: 2.4，先轉成浮點數運算就不會有餘數的問題
		double result7 = (double)(num1 / num2);	// 輸出結果: 2.0
		
		// 2. 取餘數: %
		// 結果的正負數由被除數決定
		// 開發中，用來判斷能否被除盡的情況
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);	// 輸出結果: 2
		
		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);	// 輸出結果: -2
		
		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);	// 輸出結果: 2
		
		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);	// 輸出結果: -2
		
		// 3. (前)++ :先加一再運算，(後)++: 先運算再加一 
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ", b1 = " + b1);	// 輸出結果: a1 = 11, b1 = 11
		
		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ", b2 = " + b2);	// 輸出結果: a2 = 11, b2 = 10
		
		int a3 = 10;
		a3++;	// 這裡a3++或++a3結果相同
		int b3 = a3;
		System.out.println("a3 = " + a3 + ", b3 = " + b3);	// 輸出結果: a3 = 11, b3 = 11
		
		// 4. (前)-- :先減一再運算，(後)--: 先運算再減一 
		int a4 = 10;
		int b4 = a4--;
		System.out.println("a4 = " + a4 + ", b4 = " + b4);	// 輸出結果: a4 = 9, b4 = 10
		
		//***************************注意點*********************************
		short short1 = 10;
		// short1 = short1 + 1;	// 編譯失敗
		short1 = (short)(short1 + 1);
		short1++;	// 不會改變自身型態的類型
		
		byte byte1 = 127;
		byte1++;
		System.out.println("byte1 = " + byte1);		// 輸出結果: -128，發生溢位問題，參考VariableTest3.java
		
		
	}
}