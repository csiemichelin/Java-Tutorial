/*
�B��l��: ��B��l  (���`�ΡA���ݤF��)

����:
1. ��B��l���ާ@���O��ƫ��A���ƾ�
2. <<�A�b�@�w�d�򤺡A�C������1��A�۷�� * 2
   >>�A�b�@�w�d�򤺡A�C���k��1��A�۷�� / 2
      
�����D: 
1. �̰��Ĥ覡���p��2 * 8 ?		2 << 3 �� 8 << 1
*/
class OperatorTest5{
	public static void main(String[] arg){
		int num = 21;
		num = -21;
		System.out.println("num << 2: " + (num << 2));		// ��X���G: 84
		System.out.println("num << 27: " + (num << 27));	// ��X���G: -1476395008�A�̰����ܦ��@�A���t��
		
		int m = 12;
		int n = 5;
		System.out.println("m & n: " + (m & n));			// ��X���G: 4
		System.out.println("m | n: " + (m | n));			// ��X���G: 13
		System.out.println("m ^ n: " + (m ^ n));			// ��X���G: 9�A������
		
		//***************************************************************
		// �m��: �洫����ܼƪ���
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		// �覡�@: �w�q�{���ܼ�
		// int temp = num1;
		// num1 = num2;
		// num2 = temp;
		// System.out.println("num1 = " + num1 + ", num2 = " + num2);
		// �覡�G: �n�B: ���Ωw�q�{���ܼ�
		// ����: 1. �ۥ[�i��W�L�x�s�d��A2. ���]���ʥu��Φb�ƭȫ��A
		// num1 = num1 + num2;
		// num2 = num1 - num2;
		// num1 = num1 - num2;
		// System.out.println("num1 = " + num1 + ", num2 = " + num2);
		// �覡�T: �ϥΦ�B��l
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
	}
}