/*
���p�P�ѥ[
Java�ҸաA�L�M���˩����s�F���ӿաG
�p�G�G
���Z��100���ɡA���y�@��BMW
���Z��(80, 99]�ɡA���y�@�xiphone xs max
���Z��[60, 80]�ɡA���y�@�xiPad
�䥦�A������y�]�S���C
�бq��L��J���p�P���������Z�A�å[�H�P�_

����:
1. else���c�O�i��o
2. �������F��
	> �p�G�h�ӱ����F�������O"����"���Y(�ΨS���涰�����Y)�A���ӧP�_�M����y�y�ŧi�b�W���٦��U���A�L�ҿ�
	> �p�G�h�ӱ����F��������"�涰"���Y�A�ݭn�ھڹ�ڱ��p�A�Ҽ{�M�����Ӧb���ӵ��c�ŧi�b�W��
	> �p�G�h�ӱ����F��������"�]�t"���Y�A�q�`���p�U�A�ݭn�N�d���p���ŧi�b�d���j���W���C�_�h�A�d���p���|�S���|����
*/

import java.util.Scanner;
class IfTest1{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J���p�P���������Z: (0-100)");
		int score = scanner.nextInt();
		
		if(score == 100){
			System.out.println("���y�@��BMW");
		}else if(score > 80 && score <= 99){
			System.out.println("���y�@�xiphone xs max");
		}else if(score >= 60 && score <= 80){
			System.out.println("���y�@�xiPad");
		}// else{
		//	System.out.println("������y�]�S��");
		// }
	}
}