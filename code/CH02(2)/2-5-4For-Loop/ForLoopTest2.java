/*
�D�ءG��J��ӥ���� m �M n �A�D��̤j�����ƩM�̤p������ �C
��p 12 �M 20 ���̤j�����ƬO 4 �A�̤p�����ƬO 60 �C

�����Gbreak ����r���ϥ�
*/
import java.util.Scanner;
class ForLoopTest2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�Ĥ@�ӥ����: ");
		int m = scanner.nextInt();
		System.out.println("�п�J�ĤG�ӥ����: ");
		int n = scanner.nextInt();
		
		// ����̤j���]��
		// 1. �����ƪ��̤p��
		int min = (m <= n)? m : n;
		// 2. �M��
		for(int i = min; i >= 1; i--){	// �q�j���p����̤j
			if(m % i == 0 && n % i == 0){
				System.out.println("�̤j���]�Ƭ�: " + i);
				break;
			}
		}
		
		// ����̤p������
		// 1. �����ƪ��̤j��
		int max = (m >= n)? m : n;
		// 2. �M��
		for(int i = max; i <= m * n; i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("�̤p�����Ƭ�: " + i);
				break;
			}
		}
	}
}