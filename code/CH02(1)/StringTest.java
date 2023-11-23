/*
Stirng型態變數的使用:
1. String可以和8種基本數據型態的變數做運算(包含boolean)，且運算只能是是連接運算(+)
2. 連接運算的結果仍然是String型態
3. +運算子(Operator): 如果左右運算元(Operand)，有一個為String則此運算子做為連接運算，不然做為加號運算
*/
class StringTest{
	public static void main(String[] args){
		String string1 = "";
		// char char1 = '';	//編譯不通過，char不能為空
		//*****************************************************************
		int number = 1001;
		String numberStr = "學號: ";
		String info1 = numberStr + number;	// + : 為連接運算
		System.out.println(info1);
		boolean bool1 = true;
		String info2 = numberStr + bool1;
		System.out.println(info2);
		//*****************************************************************
		// 練習1:
		char char1 = 'a';	// ASCll: a(97), A(65)
		int num = 10;
		String str = "hello";
		System.out.println(char1 + num + str);	// 輸出結果: 107hello
		System.out.println(char1 + str + num);	// 輸出結果: ahello10
		System.out.println(char1 + (num + str));	// 輸出結果: a10hello
		System.out.println((char1 + num) + str);	// 輸出結果: 107hello
		System.out.println(str + num + char1);	// 輸出結果: hello10a
		
		// 練習2:
		// 輸出*	*
		System.out.println("*	*");			// 輸出結果*	*
		System.out.println('*' + '\t' + '*');	// 輸出結果93，42+9+42，因為+左右運算元非字串，故為加法運算
		System.out.println('*' + "\t" + '*');	// 輸出結果*	*
		System.out.println('*' + '\t' + "*");	// 輸出結果51*
		System.out.println('*' + ('\t' + "*"));	// 輸出結果*	*
		
		//*****************************************************************
		// String string2 = 123;		// 編譯不過
		String string2 = 123 + "";
		System.out.println(string2);	// 輸出結果: 123
		
		// int num1 = string2;			// 編譯不過
		// int num1 = (int)string2;	// 編譯不過
		int num1 = Integer.parseInt(string2);
	}
}
