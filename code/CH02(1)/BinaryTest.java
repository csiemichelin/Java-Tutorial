/*
對於整數，有四種表示方式:
1. 二進制: 以0b或0B開頭
2. 十六進制: 以0x或0X開頭
3. 八進制: 以0開頭
4. 十進制: 一般整數
*/
class BinaryTest{
	public static void main(String[] args){
		int num1 = 0b110;	// 二進制
		int num2 = 110;		// 十進制
		int num3 = 0127;	// 八進制
		// int num3 = 0128;	// 編譯不過，八進制8要進位
		int num4 = 0x110A;	// 十六進制
		
		// 終端機執行輸出轉成十進位 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		
		// 十進制轉二進制
		System.out.println("Bunary num2 = " + Integer.toBinaryString(num2));
		// 十進制轉八進制
		System.out.println("Octal num2 = " + Integer.toOctalString(num2));
		// 十進制轉十六進制
		System.out.println("Heximal num2 = " + Integer.toHexString(num2));
	}
}