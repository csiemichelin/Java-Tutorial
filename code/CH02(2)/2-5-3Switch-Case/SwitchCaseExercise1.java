/*
從鍵盤分別輸入年、月、日，判斷這一天是當年的第幾天
註：判斷一年是否為閏年的標準：
	(1)可以被 4 整除，但不可被 100 整除
	或
	(2)可以被 400 整除
	
說明:
1. 凡是可以使用switch-case的結構，都可以換成if-else。反之，不成立
2. 我們寫分支結構時，當發現既可以使用switch-case(同時，switch中的表達式的取值情況不多)，又可以使用if-else時，我們優先選擇switch-case
3. 原因: switch-case的執行效率稍高

*/
import java.util.Scanner;
class SwitchCaseExercise1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入年份: ");
		int year = scanner.nextInt();
		System.out.println("請輸入月份: ");
		int month = scanner.nextInt();
		System.out.println("請輸入日期: ");
		int day = scanner.nextInt();
		int sumDays = 0;
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
			// sumDays += 28;
			// 判斷是否為閏年
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				sumDays += 29;
			}else{
				sumDays += 28;
			}
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}
		System.out.println(year + "年" + month + "月" + day + "日是當年的第" + sumDays + "天");
	}
}	