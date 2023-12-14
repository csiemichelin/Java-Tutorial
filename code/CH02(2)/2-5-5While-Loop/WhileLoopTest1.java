/*
題目：
從鍵盤讀入個數不確定的整數，並判斷讀入的正數和負數的個數，輸入為 0 時結束程式

說明:
1. 不在循環條件部分限制次數的結構: for(;;)或 while(true)
2. 結束循環有幾種方式?
	方式一: 循環條件部分回傳false
	方式二: 在循環體中，執行break
*/
import java.util.Scanner;
class WhileLoopTest1{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		int positiveCount = 0;	//紀錄正整數個數
		int negativeCount = 0;	//紀錄負整數個數
		while(true){	// for(;;)
			System.out.print("請輸入整數: "	);
			int number = scanner.nextInt();
			// 判斷number的正負數情況
			if(number > 0){
				positiveCount++;
			}else if(number < 0){
				negativeCount++;
			}else{
				// 一旦執行break，跳出循環
				break;
			}
		}
		System.out.println("輸入的正數個數為: " + positiveCount);
		System.out.println("輸入的負數個數為: " + negativeCount);
	}
}