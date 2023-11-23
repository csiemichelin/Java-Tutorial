/*
運算子六: 三元運算子
1. (條件表達式)? 表達式1 : 表達式2
2. 說明
	(1) 條件表達式的結果為boolean型態
	(2) 根據條件表達式的真或假，決定執行表達式1，還是表達式2
		如果表達式為true，則執行表達式1
		如果表達式為false，則執行表達式2
	(3) 表達式1和表達式2，要求是一致的(統一為數值類型或字串類型)
	(4) 三元運算子可嵌套使用
3. 凡是可以使用三元運算子的地方，都可以改寫為if-else; 反之，不成立(因為三元運算子要統一為數值類型或字串類型)
4. 如果程式可以使用三元運算子，又可以使用if-else結構，那麼優先選擇三元運算子。原因: 簡潔、執行效率高
*/
class OperatorTest6{
	public static void main(String[] arg){
		// 獲取兩個整數的較大值
		int m = 5;
		int n = 12;
		
		int max1 = (m > n)? m : n;
		System.out.println(max1);
		
		double max2 = (m > n)?2 : 1.0;
		// (m > n)?2 : "不對喔"	// 編譯錯誤
		
		//**********************************************************
		String maxStr = (m > n)?"m大" : (m == n)? "m和n相等" : "n大";
		System.out.println(maxStr);
		
		//**********************************************************
		// 獲取三個數的最大值
		int num1 = 12;
		int num2 = 30;
		int num3 = -43;
		int max3 = (num1 > num2)? num1 : num2;
		max3 = (max3 > num3)? max3 : num3;
		// int max4 = (((num1 > num2)? num1 : num2) > num3)? ((num1 > num2)? num1 : num2) : num3;	// 相當於前兩行，不建議
		System.out.println("三個數的最大值為: " + max3);
		
		//**********************************************************
		// 改寫成if-else
		if(m > n){
			System.out.println(m);
		}else{
			System.out.println(n);
		}
	}
}