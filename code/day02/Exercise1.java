import java.util.Scanner;
class Exercise{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		// 提示用戶輸入名字
        System.out.print("請輸入百位的整數: ");
		int number = scanner.nextInt();
		
		int hundredDigit = number / 100;
		int tenDigit = number % 100 / 10;
		int digit =  number % 100 % 10;
		
		System.out.println("百位數: " + hundredDigit);
		System.out.println("十位數: " + tenDigit);
		System.out.println("個位數: " + digit);
	}
}