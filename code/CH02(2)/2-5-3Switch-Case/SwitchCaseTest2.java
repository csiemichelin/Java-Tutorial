/*
編寫程式：從鍵盤上輸入 2019 年的 "month" 和 "day"，要求通過程式輸出輸入的日期為 2019 年的第幾天

說明: break在switch中是可選的
*/
import java.util.Scanner;
class SwitchCaseTest2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入2019的月份: ");
		int month = scanner.nextInt();
		System.out.println("請輸入2019的日期: ");
		int day = scanner.nextInt();
		
		// 宣告總天數
		int sumDays = 0;
		/* 方式一: 冗餘
		if(month == 1){
			sumDays = day;
		} else if(month == 2){
			sumDays = 31 + day;
		} else if(month == 3){
			sumDays = 31 + 28 + day;
		} else if(month == 4){
			sumDays = 31 + 28 + 31 + day;
		}
		// ...
		else{	// month = 12
			// sumDays = ....... + day;
		}
		*/
		/* 方式二: 冗餘
		switch(month){
		case 1:
			sumDays = day;
			break;
		case 2:
			sumDays = 31 + day;
			break;
		case 3:
			sumDays = 31 + 28 + day;
			break;
		// ...
		}
		*/
		// 方式三:	倒著寫
		switch(month){
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}
		System.out.println("2019年" + month + "月" + day + "日是當年的第" + sumDays + "天");
	}
}