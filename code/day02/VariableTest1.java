/*
�ܼƫ��A:
1. �򥻼ƾګ��A: 
	* ���: byte/ short/ int / long
	* �B�I��: float/ double
	* �r��: char
	* ���L��: boolean
2. �ޥμƾګ��A:
	* ���O: class (�r�ꬰ����)
	* ���f: interface
	* �Ʋ�: array[]
*/
class VariableTest1 {
	public static void main(String[] args){
		// �ܼƩw�q
		int myAge = 12;
		// �ܼƨϥ�
		System.out.println(myAge);
		
		// �ܼƫŧi
		int myNumber;
		// �ܼƪ���
		myNumber = 1001;
		System.out.println(myNumber);
		
		// 1. ���: byte(8 bits)/ short(2 Bytes)/ int(4 Bytes)/ long(8 Bytes), �D�n��int
		// Byte���d��: -128 ~ 127
		byte byte1 = 12;
		byte byte2 = -128;
		System.out.println(byte1);
		System.out.println(byte2);
		short short1 = 128;
		int int1 = 1234;
		// long���Ȼݭn�H"L"��"l"�����A���[�hlong�|�Q�j��A�ഫ��int
		long long1 = 3414256457L;	
		System.out.println(long1);
		
		// 2. �B�I��: float(4 Bytes)/ double(8 Bytes), �D�n��double
		// float(4 Bytes)��ܪ��d��|��long(8 Bytes)�٤j
		double double1 = 123.1;
		System.out.println(double1);
		// float���Ȼݭn�H"F"��"f"����
		float float1 = 123.1F;
		System.out.println(float1);
		
		// 3. �r��: char (1�r�� = 2 Bytes, C �y��1�r�� = 1 Bytes)
		char char1 = 'a';
		char char2 = '�x';
		System.out.println(char1);
		System.out.println(char2);
		// �]�i�H�����ϥ�Unicode�s�X\\u�}�Y��16�i��
		char char3 = '\u0043';
		System.out.println(char3);
		// �N���O�s��ANSI GBK�s�X�榡�A�h�i�H�b�׺ݾ��ѪR����
		System.out.println("���W�n�A�x�W!");
		
		// 4. ���L��: boolean
		// �u�ରtrue, false �n�p�g
		boolean bool1 = true;
		System.out.println(bool1);
	}
}