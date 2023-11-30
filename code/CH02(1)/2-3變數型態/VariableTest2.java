/*
基本數據型態之間的運算規則:

前提: 這裡討論的是7種基本型態數據間的運算, 不包含boolean型態的

1. 自然型態轉換:
	容量小的型態與容量大的型態做運算時, 會自動轉換為容量大的數據型態, 數據型態小到大排序:
	byte、char、short < int < long < float < double
	說明: 容量大小指的是數的範圍, 比如: float容量大於long容量
	
	特別的: 當byte、char、short三種型態的變數做運算時，結果為int型態
	
2. 強制型態轉換:
	見VariableTest3.java
*/
class VariableTest2 {
	public static void main(String[] args){
		byte byte1 = 2;
		int int1 = 129;
		// 編譯不通過
		// byte byte2 = byte1 + int1;
		int int2 = byte1 + int1;
		long long1 = byte1 + int1;
		System.out.println(int2);
		
		float float1 = byte1 + int1;
		System.out.println(float1);
		
		short short1 = 123;
		double double1 = short1;
		System.out.println(double1);
		
		//******************特別的*******************
		char char1 = 'a';	//ASCll: 97
		int int3 = 10;
		int int4 = char1 + int3;
		System.out.println(int4);
		
		short short2 = 10;
		// char char2 = char1 + short2;	//編譯不過
		
		byte byte2 = 10;
		// char char3 = char1 + byte2; //編譯不過
		
		// short short3 = byte2 + short2; //編譯不過
		
		// short short4 = byte1 + byte2; //編譯不過
		
		//********************************************
	}
}