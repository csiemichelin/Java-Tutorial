/*
�p�⪯���~��
*/

import java.util.Scanner;
class IfExercise1{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�������~��: ");
		int dogAge = scanner.nextInt();
		
		if(dogAge >= 0 && dogAge <= 2){
			System.out.println("�۷��H���~��: " + (dogAge * 10.5));
		}else if(dogAge > 2){
			System.out.println("�۷��H���~��: " + (2 * 10.5 + (dogAge - 2) * 4));
		}else{
			System.out.println("�����٨S�X�ͩO");
		}
	}
}