/*
如何從鍵盤獲取不同型態的變數，需要使用Scanner class

具體實現步驟:
1. 導入包: import java.util.Scanner;
2. Scanner的實例化: Scanner scanner = new Scanner(System.in);
3. 呼叫Scanner class的相關方法，來獲取指定型態的變數

注意: 
需要根據相應的方法，來輸入指定型態的值，如果輸入的型態與要求的型態不匹配時，會報異常: InputMisMatchException
導致程式終止
*/

// 1. 導入包: import java.util.Scanner;
import java.util.Scanner;

class ScannerTest1{
	public static void main(String[] args){
		// 2. Scanner的實例化
		Scanner scanner = new Scanner(System.in);
		
		// 3. 呼叫Scanner class的相關方法，來獲取指定型態的變數
		System.out.println("請輸入你的姓名: ");
		String name = scanner.next();
		System.out.println(name);
		
		System.out.println("請輸入你的年齡: ");
		int age = scanner.nextInt();
		System.out.println(age);
		
		System.out.println("請輸入你的體重: ");
		double weight = scanner.nextDouble();
		System.out.println(weight);
		
		System.out.println("您是否單身? (true/false)");
		boolean isLonly = scanner.nextBoolean();
		System.out.println(isLonly);
		
		// 對於char型態的獲取，Scanner沒有提有提供相關的方法，只能獲取一個字串
		System.out.println("請輸入你的性別: (男/女)");
		String gender = scanner.next();	// "男"
		char genderChar = gender.charAt(0);	// 獲取索引值為0的字元
		System.out.println(genderChar);
	}
}