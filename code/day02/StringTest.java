/*
Stirng���A�ܼƪ��ϥ�:
1. String�i�H�M8�ذ򥻼ƾګ��A���ܼư��B��(�]�tboolean)�A�B�B��u��O�O�s���B��(+)
2. �s���B�⪺���G���M�OString���A
3. +�B��l(Operator): �p�G���k�B�⤸(Operand)�A���@�Ӭ�String�h���B��l�����s���B��A���M�����[���B��
*/
class StringTest{
	public static void main(String[] args){
		String string1 = "";
		// char char1 = '';	//�sĶ���q�L�Achar���ର��
		//*****************************************************************
		int number = 1001;
		String numberStr = "�Ǹ�: ";
		String info1 = numberStr + number;	// + : ���s���B��
		System.out.println(info1);
		boolean bool1 = true;
		String info2 = numberStr + bool1;
		System.out.println(info2);
		//*****************************************************************
		// �m��1:
		char char1 = 'a';	// ASCll: a(97), A(65)
		int num = 10;
		String str = "hello";
		System.out.println(char1 + num + str);	// ��X���G: 107hello
		System.out.println(char1 + str + num);	// ��X���G: ahello10
		System.out.println(char1 + (num + str));	// ��X���G: a10hello
		System.out.println((char1 + num) + str);	// ��X���G: 107hello
		System.out.println(str + num + char1);	// ��X���G: hello10a
		
		// �m��2:
		// ��X*	*
		System.out.println("*	*");			// ��X���G*	*
		System.out.println('*' + '\t' + '*');	// ��X���G93�A42+9+42�A�]��+���k�B�⤸�D�r��A�G���[�k�B��
		System.out.println('*' + "\t" + '*');	// ��X���G*	*
		System.out.println('*' + '\t' + "*");	// ��X���G51*
		System.out.println('*' + ('\t' + "*"));	// ��X���G*	*
		
		//*****************************************************************
		// String string2 = 123;		// �sĶ���L
		String string2 = 123 + "";
		System.out.println(string2);	// ��X���G: 123
		
		// int num1 = string2;			// �sĶ���L
		// int num1 = (int)string2;	// �sĶ���L
		int num1 = Integer.parseInt(string2);
	}
}
