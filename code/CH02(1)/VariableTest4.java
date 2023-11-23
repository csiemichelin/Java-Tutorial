class VariableTest4{
	public static void main(String[] args){
		// 1.編碼情況1:
		long long1 = 1234;	// 系統會將其強制轉為int
		System.out.println(long1);
		// 編譯失敗: 過大的整數
		// long long2 = 1234123412341234;
		long long2 = 1234123412341234L;
		
		//*******************************************
		// 編譯失敗: float結尾一定要加f或F
		// float float1 = 12.3;
		
		// 2.編碼情況2:
		// 整數: 默認型態為int
		// 浮點數: 默認型態為double
		byte byte1 = 12;
		byte byte2 = byte1;	// 編譯通過
		// byte byte2 = byte1 + 1;	// 編譯不過，因為1默認為int，因此依照自動型態轉換，要用int存
		int int2 = byte1 + 1;
		
		//float float2 = byte1 + 12.3;	// 編譯不過，因為12.3默認為double，因此依照自動型態轉換，要用double存
		double double1 = byte1 + 12.3;
	}
}