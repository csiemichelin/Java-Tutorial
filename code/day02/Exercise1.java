import java.util.Scanner;
class Exercise{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		// ���ܥΤ��J�W�r
        System.out.print("�п�J�ʦ쪺���: ");
		int number = scanner.nextInt();
		
		int hundredDigit = number / 100;
		int tenDigit = number % 100 / 10;
		int digit =  number % 100 % 10;
		
		System.out.println("�ʦ��: " + hundredDigit);
		System.out.println("�Q���: " + tenDigit);
		System.out.println("�Ӧ��: " + digit);
	}
}