/*
����ơA���|�ت�ܤ覡:
1. �G�i��: �H0b��0B�}�Y
2. �Q���i��: �H0x��0X�}�Y
3. �K�i��: �H0�}�Y
4. �Q�i��: �@����
*/
class BinaryTest{
	public static void main(String[] args){
		int num1 = 0b110;	// �G�i��
		int num2 = 110;		// �Q�i��
		int num3 = 0127;	// �K�i��
		// int num3 = 0128;	// �sĶ���L�A�K�i��8�n�i��
		int num4 = 0x110A;	// �Q���i��
		
		// �׺ݾ������X�ন�Q�i�� 
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		
		// �Q�i����G�i��
		System.out.println("Bunary num2 = " + Integer.toBinaryString(num2));
		// �Q�i����K�i��
		System.out.println("Octal num2 = " + Integer.toOctalString(num2));
		// �Q�i����Q���i��
		System.out.println("Heximal num2 = " + Integer.toHexString(num2));
	}
}