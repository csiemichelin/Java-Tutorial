/*
���D: ��ǥͦ��Z�j�� 60 �����A��X"�X��"�C �C�� 60 �����A��X"���X��"�C

����: �p�Gswitch-case���c�����h��case������y�y�ۦP�A�h�i�H�Ҽ{�i��X�֡C
*/

import java.util.Scanner;
class SwitchCaseTest1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�ǥͦ��Z: ");
		int score = scanner.nextInt();
		
		// ��k�@:
		switch(score / 10){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("���X��");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 6:
			System.out.println("�X��");
			break;
		}
		
		// ��k�G:
		switch(score / 60){
		case 0:
			System.out.println("���X��");
			break;
		case 1:
			System.out.println("�X��");
			break;
		}
	}
}