/*
�D�ءG
�q��LŪ�J�ӼƤ��T�w����ơA�çP�_Ū�J�����ƩM�t�ƪ��ӼơA��J�� 0 �ɵ����{��

����:
1. ���b�`�����󳡤�����ƪ����c: for(;;)�� while(true)
2. �����`�����X�ؤ覡?
	�覡�@: �`�����󳡤��^��false
	�覡�G: �b�`���餤�A����break
*/
import java.util.Scanner;
class WhileLoopTest1{
	public static void main(String[] args){	
		Scanner scanner = new Scanner(System.in);
		int positiveCount = 0;	//��������ƭӼ�
		int negativeCount = 0;	//�����t��ƭӼ�
		while(true){	// for(;;)
			System.out.print("�п�J���: "	);
			int number = scanner.nextInt();
			// �P�_number�����t�Ʊ��p
			if(number > 0){
				positiveCount++;
			}else if(number < 0){
				negativeCount++;
			}else{
				// �@������break�A���X�`��
				break;
			}
		}
		System.out.println("��J�����ƭӼƬ�: " + positiveCount);
		System.out.println("��J���t�ƭӼƬ�: " + negativeCount);
	}
}