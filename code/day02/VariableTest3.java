/*
�j��A�ഫ: �۵M���A�ഫ���f�B��
1. �ݭn�ϥαj���: ()
2. �`�N�I: �j�������ഫ�A�i��ɭP��׷l���B������D
*/
class VariableTest3 {
	public static void main(String[] args){
		double double1 = 12.3;
		// int int1 = double1;	// �sĶ���L
		// �|����׷l��
		int int1 = (int)double1;	
		System.out.println(int1);
		// �S����׷l��
		long long1 = 123;
		short short1 = (short)long1;
		// �|��������D
		int int2 = 128;
		byte byte1 = (byte)int2;
		System.out.println(byte1);	//��X-128����
		
	}
}