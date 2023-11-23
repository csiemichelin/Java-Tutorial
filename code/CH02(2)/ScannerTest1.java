/*
如何從鍵盤獲取不同型態的變數，需要使用Scanner class

具體實現步驟:
1. 導入包: import java.util.Scanner;
2. Scanner的實例化: Scanner scanner = new Scanner(System.in);
3. 呼叫Scanner class的相關方法，來獲取指定型態的變數
*/
import java.util.Scanner;

class ScannerTest1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
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
		double isLonly = scanner.nextBoolean();
		System.out.println(isLonly);
		
		// 對於char
	}
}