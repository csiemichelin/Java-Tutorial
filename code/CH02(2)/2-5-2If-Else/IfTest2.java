/*
寫程式：由鍵盤輸入三個整數分別存入變數num1、num2、num3
對它們進行排序(使用if-else if)，並且從小到大輸出

說明:
1. if-else結構是可以相互嵌套的
2. 如果if-else結構中的執行語句只有一行時，對應的一對{}可以省略的。但是，不建議大家省略
*/

import java.util.Scanner;
class IfTest2{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入第一個整數: ");
		int num1 = scanner.nextInt();
		System.out.println("請輸入第二個整數: ");
		int num2 = scanner.nextInt();
		System.out.println("請輸入第三個整數: ");
		int num3 = scanner.nextInt();
		
		System.out.println("從小到大輸出: ");
		if(num1 > num2){
			if(num3 > num1) 
				System.out.println(num2 + "," + num1 + "," + num3);
			else if (num3 <= num1 && num3 > num2)
				System.out.println(num2 + "," + num3 + "," + num1);
			else
				System.out.println(num3 + "," + num2 + "," + num1);
		}else{	// num2 >= num1 
			if(num3 > num2)
				System.out.println(num1 + "," + num2 + "," + num3);
			else if (num3 <= num2 && num3 > num1)
				System.out.println(num1 + "," + num3 + "," + num2);
			else
				System.out.println(num3 + "," + num1 + "," + num2);
		}
	}
}