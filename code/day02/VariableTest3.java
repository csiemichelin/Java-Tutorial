/*
強制型態轉換: 自然型態轉換的逆運算
1. 需要使用強轉符: ()
2. 注意點: 強制類型轉換，可能導致精度損失、溢位問題
*/
class VariableTest3 {
	public static void main(String[] args){
		double double1 = 12.3;
		// int int1 = double1;	// 編譯不過
		// 會有精度損失
		int int1 = (int)double1;	
		System.out.println(int1);
		// 沒有精度損失
		long long1 = 123;
		short short1 = (short)long1;
		// 會有溢位問題
		int int2 = 128;
		byte byte1 = (byte)int2;
		System.out.println(byte1);	//輸出-128溢位
		
	}
}