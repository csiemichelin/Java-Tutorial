/*
�B��l���@: ��ƹB��l
+ - + - * / % (�e)++ (��)++ (�e)-- (��)-- +
*/
class OperatorTest{
	public static void main(String[] args){
		// 1. ����: /
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2; 
		System.out.println(result1);			// ��X���G: 2
		
		int result2 = num1 / num2 * num2;
		System.out.println(result2);			// ��X���G: 10
		
		double result3 = num1 / num2;	
		System.out.println(result3);			// ��X���G: 2.0
		
		double result4 = num1 / num2 + 0.0;		// ��X���G: 2.0
		double result5 = num1 / (num2 + 0.0);	// ��X���G: 2.4�A���ন�B�I�ƹB��N���|���l�ƪ����D
		double result6 = (double)num1 / num2;	// ��X���G: 2.4�A���ন�B�I�ƹB��N���|���l�ƪ����D
		double result7 = (double)(num1 / num2);	// ��X���G: 2.0
		
		// 2. ���l��: %
		// ���G�����t�ƥѳQ���ƨM�w
		// �}�o���A�ΨӧP�_��_�Q���ɪ����p
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);	// ��X���G: 2
		
		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);	// ��X���G: -2
		
		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);	// ��X���G: 2
		
		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);	// ��X���G: -2
		
		// 3. (�e)++ :���[�@�A�B��A(��)++: ���B��A�[�@ 
		int a1 = 10;
		int b1 = ++a1;
		System.out.println("a1 = " + a1 + ", b1 = " + b1);	// ��X���G: a1 = 11, b1 = 11
		
		int a2 = 10;
		int b2 = a2++;
		System.out.println("a2 = " + a2 + ", b2 = " + b2);	// ��X���G: a2 = 11, b2 = 10
		
		int a3 = 10;
		a3++;	// �o��a3++��++a3���G�ۦP
		int b3 = a3;
		System.out.println("a3 = " + a3 + ", b3 = " + b3);	// ��X���G: a3 = 11, b3 = 11
		
		// 4. (�e)-- :����@�A�B��A(��)--: ���B��A��@ 
		int a4 = 10;
		int b4 = a4--;
		System.out.println("a4 = " + a4 + ", b4 = " + b4);	// ��X���G: a4 = 9, b4 = 10
		
		//***************************�`�N�I*********************************
		short short1 = 10;
		// short1 = short1 + 1;	// �sĶ����
		short1 = (short)(short1 + 1);
		short1++;	// ���|���ܦۨ����A������
		
		byte byte1 = 127;
		byte1++;
		System.out.println("byte1 = " + byte1);		// ��X���G: -128�A�o�ͷ�����D�A�Ѧ�VariableTest3.java
		
		
	}
}