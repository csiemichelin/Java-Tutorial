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
	}
}