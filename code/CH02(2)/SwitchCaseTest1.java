/*
例題: 對學生成績大於 60 分的，輸出"合格"。 低於 60 分的，輸出"不合格"。

說明: 如果switch-case結構中的多個case的執行語句相同，則可以考慮進行合併。
*/

import java.util.Scanner;
class SwitchCaseTest1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入學生成績: ");
		int score = scanner.nextInt();
		
		// 方法一:
		switch(score / 10){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不合格");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 6:
			System.out.println("合格");
			break;
		}
		
		// 方法二:
		switch(score / 60){
		case 0:
			System.out.println("不合格");
			break;
		case 1:
			System.out.println("合格");
			break;
		}
	}
}