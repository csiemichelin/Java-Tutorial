/*
�s�g�{���G�q��L�W��J 2019 �~�� "month" �M "day"�A�n�D�q�L�{����X��J������� 2019 �~���ĴX��

����: break�bswitch���O�i�諸
*/
import java.util.Scanner;
class SwitchCaseTest2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J2019�����: ");
		int month = scanner.nextInt();
		System.out.println("�п�J2019�����: ");
		int day = scanner.nextInt();
		
		// �ŧi�`�Ѽ�
		int sumDays = 0;
		/* �覡�@: ���l
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
		/* �覡�G: ���l
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
		// �覡�T:	�˵ۼg
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
		System.out.println("2019�~" + month + "��" + day + "��O��~����" + sumDays + "��");
	}
}