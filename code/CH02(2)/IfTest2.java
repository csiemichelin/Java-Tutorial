/*
�g�{���G����L��J�T�Ӿ�Ƥ��O�s�J�ܼ�num1�Bnum2�Bnum3
�復�̶i��Ƨ�(�ϥ�if-else if)�A�åB�q�p��j��X

����:
1. if-else���c�O�i�H�ۤ��O�M��
2. �p�Gif-else���c��������y�y�u���@��ɡA�������@��{}�i�H�ٲ����C���O�A����ĳ�j�a�ٲ�
*/

import java.util.Scanner;
class IfTest2{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�Ĥ@�Ӿ��: ");
		int num1 = scanner.nextInt();
		System.out.println("�п�J�ĤG�Ӿ��: ");
		int num2 = scanner.nextInt();
		System.out.println("�п�J�ĤT�Ӿ��: ");
		int num3 = scanner.nextInt();
		
		System.out.println("�q�p��j��X: ");
		if(num1 > num2){
			if(num3 > num1) 
				System.out.println(num2 + "," + num1 + "," + num3);
			else if (num3 <= num1 && num3 > num2)
				System.out.println(num2 + "," + num3 + "," + num1);
			else
				System.out.println(num3 + "," + num2 + "," + num1);
		}else{	// num2 >= num1 
			if(num3 > num2)
				System.out.println(num1 + "," + num2 + "," + num3);
			else if (num3 <= num2 && num3 > num1)
				System.out.println(num1 + "," + num3 + "," + num2);
			else
				System.out.println(num3 + "," + num1 + "," + num2);
		}
	}
}