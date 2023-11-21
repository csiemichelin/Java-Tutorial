/*
變數型態:
1. 基本數據型態: 
	* 整數: byte/ short/ int / long
	* 浮點數: float/ double
	* 字元: char
	* 布林值: boolean
2. 引用數據型態:
	* 類別: class (字串為此種)
	* 接口: interface
	* 數組: array[]
*/
class VariableTest1 {
	public static void main(String[] args){
		// 變數定義
		int myAge = 12;
		// 變數使用
		System.out.println(myAge);
		
		// 變數宣告
		int myNumber;
		// 變數附值
		myNumber = 1001;
		System.out.println(myNumber);
		
		// 1. 整數: byte(8 bits)/ short(2 Bytes)/ int(4 Bytes)/ long(8 Bytes), 主要用int
		// Byte的範圍: -128 ~ 127
		byte byte1 = 12;
		byte byte2 = -128;
		System.out.println(byte1);
		System.out.println(byte2);
		short short1 = 128;
		int int1 = 1234;
		// long附值需要以"L"或"l"結尾
		long long1 = 3414256457L;	
		System.out.println(long1);
		
		// 2. 浮點數: float(4 Bytes)/ double(8 Bytes), 主要用double
		// float(4 Bytes)表示的範圍會比long(8 Bytes)還大
		double double1 = 123.1;
		System.out.println(double1);
		// float附值需要以"F"或"f"結尾
		float float1 = 123.1F;
		System.out.println(float1);
		
		// 3. 字元: char (1字元 = 2 Bytes, C 語言1字元 = 1 Bytes)
		char char1 = 'a';
		char char2 = '台';
		System.out.println(char1);
		System.out.println(char2);
		// 也可以直接使用Unicode編碼\\u開頭的16進制
		char char3 = '\u0043';
		System.out.println(char3);
		// 將文件保存為ANSI GBK編碼格式，則可以在終端機解析中文
		System.out.println("早上好，台灣!");
		
		// 4. 布林值: boolean
		// 只能為true, false 要小寫
		boolean bool1 = true;
		System.out.println(bool1);
	}
}