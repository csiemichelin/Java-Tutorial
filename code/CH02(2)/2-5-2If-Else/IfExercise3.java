/*
�j�a�����D�A�k�j��B�A�k�j����C ����k��a���n���k��A��M�n���X
�@�w������G���G 180cm �H�W�F�I�G�]�I 1 �d�U�H�W�F�ӡG�O�C
��
�p�G�o�T�ӱ���P�ɺ����A�h�G�ڤ@�w�n�����L
��
�p�G�T�ӱ��󦳬��u�����p�A�h�G���a�A��W�����A��U���l
��
�p�G�T�ӱ��󳣤������A�h�G�����I
*/

import java.util.Scanner;
class IfExercise3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�z������: (cm)");
		int height = scanner.nextInt();
		System.out.println("�п�J�z���]�I: (�d�U)");
		double wealth = scanner.nextDouble();
		// ��k�@:
		// System.out.println("�п�J�z�O�_��: (true/false)");
		// boolean isHandsome = scanner.nextBoolean();
		
		// if(height >= 180 && wealth >= 1 && isHandsome){
		// 	System.out.println("�ڤ@�w�n�����L");
		// }else if(height >= 180 || wealth >= 1 || isHandsome){
		// 	System.out.println("���a�A��W�����A��U���l");
		// }else{
		// 	System.out.println("�����I");
		// }
		
		// ��k�G:
		System.out.println("�п�J�z�O�_��: (�O/�_)");
		String isHandsome = scanner.next();
		
		if(height >= 180 && wealth >= 1 && isHandsome.equals('�O')){
		System.out.println("�ڤ@�w�n�����L");
		}else if(height >= 180 || wealth >= 1 || isHandsome.equals('�O')){
		System.out.println("���a�A��W�����A��U���l");
		}else{
		System.out.println("�����I");
		}
		
	}
}