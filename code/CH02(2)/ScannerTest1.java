/*
�p��q��L������P���A���ܼơA�ݭn�ϥ�Scanner class

�����{�B�J:
1. �ɤJ�]: import java.util.Scanner;
2. Scanner����Ҥ�: Scanner scanner = new Scanner(System.in);
3. �I�sScanner class��������k�A��������w���A���ܼ�
*/
import java.util.Scanner;

class ScannerTest1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�A���m�W: ");
		String name = scanner.next();
		System.out.println(name);
		
		System.out.println("�п�J�A���~��: ");
		int age = scanner.nextInt();
		System.out.println(age);
		
		System.out.println("�п�J�A���魫: ");
		double weight = scanner.nextDouble();
		System.out.println(weight);
		
		System.out.println("�z�O�_�樭? (true/false)");
		double isLonly = scanner.nextBoolean();
		System.out.println(isLonly);
		
		// ���char
	}
}