class VariableTest4{
	public static void main(String[] args){
		// 1.�s�X���p1:
		long long1 = 1234;	// �t�η|�N��j���ରint
		System.out.println(long1);
		// �sĶ����: �L�j�����
		// long long2 = 1234123412341234;
		long long2 = 1234123412341234L;
		
		//*******************************************
		// �sĶ����: float�����@�w�n�[f��F
		// float float1 = 12.3;
		
		// 2.�s�X���p2:
		// ���: �q�{���A��int
		// �B�I��: �q�{���A��double
		byte byte1 = 12;
		byte byte2 = byte1;	// �sĶ�q�L
		// byte byte2 = byte1 + 1;	// �sĶ���L�A�]��1�q�{��int�A�]���̷Ӧ۰ʫ��A�ഫ�A�n��int�s
		int int2 = byte1 + 1;
		
		//float float2 = byte1 + 12.3;	// �sĶ���L�A�]��12.3�q�{��double�A�]���̷Ӧ۰ʫ��A�ഫ�A�n��double�s
		double double1 = byte1 + 12.3;
	}
}