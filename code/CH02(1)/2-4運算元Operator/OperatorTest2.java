/*
�B��l�G: ��ȹB��l 
= += -= *=  /= %=
*/
class OperatorTest2{
	public static void main(String[] args){
		// 1. ��ȲŸ�: =
		// �s����
		int int1, int2;
		int1 = int2 = 10;
		int int3 = 10, int4 = 20;
		
		//*******************************************************************
		// 2. �X�i��ȲŸ�: += -= *=  /= %=
		int num1 = 10;
		num1 += 2;					// num1 = num1 + 2
		System.out.println(num1);	// ��X���G: 12
		
		int num2 = 12;
		num2 %= 5;					// num2 = num2 % 5
		System.out.println(num2);	// ��X���G: 2
		
		//***************************�t�O*************************************
		short short1 = 10;
		// short1 = short1 + 2;		// �sĶ����
		short1 += 2;				// ���|�����ܼƥ������ƾګ��A
		System.out.println(short1);	// ��X���G: 12
		
		//*******************************************************************
		// �}�o���A�p�G�Ʊ��ܼƹ�{+2���ާ@�A���X�ؤ�k? (�e��: int num = 10;)
		// ��k�@: num = num + 2;
		// ��k�G: num += 2;	// ����
		// num++++;				// �sĶ����
		
		// �}�o���A�p�G�Ʊ��ܼƹ�{+1���ާ@�A���X�ؤ�k? (�e��: int num = 10;)
		// ��k�@: num = num + 1;
		// ��k�G: num += 1;
		// ��k�T: num++;		// ����
		
		//***************************�m��*************************************
		// �m��1
		int i = 1;
		i *= 0.1;				// i = i * 0.1; (���|�����ܼƥ������ƾګ��A)
		System.out.println(i);	// ��X���G: 0
		i++;					
		System.out.println(i);	// ��X���G: 1
		
		// �m��2
		int m = 2;
		int n = 3;
		n *= m++;						// n = n * m++;
		System.out.println("m = " + m);	// ��X���G: 3
		System.out.println("n = " + n);	// ��X���G: 6
		
		// �m��3
		int n1 = 10;
		n1 += (n1++) + (++n1);		// n1 = n1 + (n1++) + (++n1);
									// 10 + 10 -> n = 11 -> 10 + 10 + 12 -> n = 32
		System.out.println(n1);		// ��X���G: 32
	}
}