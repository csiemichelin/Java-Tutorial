/*
�򥻼ƾګ��A�������B��W�h:

�e��: �o�̰Q�ת��O7�ذ򥻫��A�ƾڶ����B��, ���]�tboolean���A��

1. �۵M���A�ഫ:
	�e�q�p�����A�P�e�q�j�����A���B���, �|�۰��ഫ���e�q�j���ƾګ��A, �ƾګ��A�p��j�Ƨ�:
	byte�Bchar�Bshort < int < long < float < double
	����: �e�q�j�p�����O�ƪ��d��, ��p: float�e�q�j��long�e�q
	
	�S�O��: ��byte�Bchar�Bshort�T�ث��A���ܼư��B��ɡA���G��int���A
	
2. �j��A�ഫ:
	��VariableTest3.java
*/
class VariableTest2 {
	public static void main(String[] args){
		byte byte1 = 2;
		int int1 = 129;
		// �sĶ���q�L
		// byte byte2 = byte1 + int1;
		int int2 = byte1 + int1;
		long long1 = byte1 + int1;
		System.out.println(int2);
		
		float float1 = byte1 + int1;
		System.out.println(float1);
		
		short short1 = 123;
		double double1 = short1;
		System.out.println(double1);
		
		//******************�S�O��*******************
		char char1 = 'a';	//ASCll: 97
		int int3 = 10;
		int int4 = char1 + int3;
		System.out.println(int4);
		
		short short2 = 10;
		// char char2 = char1 + short2;	//�sĶ���L
		
		byte byte2 = 10;
		// char char3 = char1 + byte2; //�sĶ���L
		
		// short short3 = byte2 + short2; //�sĶ���L
		
		// short short4 = byte1 + byte2; //�sĶ���L
		
		//********************************************
	}
}