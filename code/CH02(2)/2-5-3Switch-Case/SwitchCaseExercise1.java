/*
�q��L���O��J�~�B��B��A�P�_�o�@�ѬO��~���ĴX��
���G�P�_�@�~�O�_���|�~���зǡG
	(1)�i�H�Q 4 �㰣�A�����i�Q 100 �㰣
	��
	(2)�i�H�Q 400 �㰣
	
����:
1. �Z�O�i�H�ϥ�switch-case�����c�A���i�H����if-else�C�Ϥ��A������
2. �ڭ̼g���䵲�c�ɡA��o�{�J�i�H�ϥ�switch-case(�P�ɡAswitch������F�������ȱ��p���h)�A�S�i�H�ϥ�if-else�ɡA�ڭ��u�����switch-case
3. ��]: switch-case������Ĳv�y��

*/
import java.util.Scanner;
class SwitchCaseExercise1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�~��: ");
		int year = scanner.nextInt();
		System.out.println("�п�J���: ");
		int month = scanner.nextInt();
		System.out.println("�п�J���: ");
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
			// �P�_�O�_���|�~
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
		System.out.println(year + "�~" + month + "��" + day + "��O��~����" + sumDays + "��");
	}
}	