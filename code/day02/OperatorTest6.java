/*
�B��l��: �T���B��l
1. (�����F��)? ��F��1 : ��F��2
2. ����
	(1) �����F�������G��boolean���A
	(2) �ھڱ����F�����u�ΰ��A�M�w�����F��1�A�٬O��F��2
		�p�G��F����true�A�h�����F��1
		�p�G��F����false�A�h�����F��2
	(3) ��F��1�M��F��2�A�n�D�O�@�P��(�Τ@���ƭ������Φr������)
	(4) �T���B��l�i�O�M�ϥ�
3. �Z�O�i�H�ϥΤT���B��l���a��A���i�H��g��if-else
*/
class OperatorTest6{
	public static void main(String[] arg){
		// �����Ӿ�ƪ����j��
		int m = 5;
		int n = 12;
		
		int max1 = (m > n)? m : n;
		System.out.println(max1);
		
		double max2 = (m > n)?2 : 1.0;
		// (m > n)?2 : "�����"	// �sĶ���~
		
		//**********************************************************
		String maxStr = (m > n)?"m�j" : (m == n)? "m�Mn�۵�" : "n�j";
		System.out.println(maxStr);
		
		//**********************************************************
		// ����T�Ӽƪ��̤j��
		int num1 = 12;
		int num2 = 30;
		int num3 = -43;
		int max3 = (num1 > num2)? num1 : num2;
		max3 = (max3 > num3)? max3 : num3;
		// int max4 = (((num1 > num2)? num1 : num2) > num3)? ((num1 > num2)? num1 : num2) : num3;	// �۷��e���A����ĳ
		System.out.println("�T�Ӽƪ��̤j�Ȭ�: " + max3);
	}
}