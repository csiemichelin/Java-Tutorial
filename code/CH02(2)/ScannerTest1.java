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
		
		int num = scanner.nextInt();
		System.out.println(num);
	}
}