/*
�B��l�|: �޿�B��l 
& && | || ! ^

����:
1. �޿�B��l�ާ@���Oboolean���A���ܼ�
*/
class OperatorTest4{
	public static void main(String[] args){
		// �Ϥ� & �P &&
		// �ۦP�I1:  & �P && �B�⵲�G�ۦP
		// �ۦP�I2: ��Ÿ�����Otrue�ɡA�G�̳��|����Ÿ��k�䪺�B��
		// ���P�I: ��Ÿ�����Oflase�ɡA&�~�����Ÿ��k�䪺�B��A&&���A����Ÿ��k�䪺�B��
		// �}�o���A���˨ϥ� &&
		boolean bool1 = true;
		bool1 = false;
		int num1 = 10;
		if(bool1 & (num1++ > 0)){
			System.out.println("�ڲ{�b�b�x�_");
		}else{
			System.out.println("�ڲ{�b�b����");		
		}
		System.out.println("num1 = " + num1);	// ��X���G: 11
		
		boolean bool2 = true;
		bool2 = false;
		int num2 = 10;
		if(bool2 && (num2++ > 0)){
			System.out.println("�ڲ{�b�b�x�_");
		}else{
			System.out.println("�ڲ{�b�b����");
		}
		System.out.println("num2 = " + num2);	// ��X���G: 10
		
		// �Ϥ�  �P ||
		// �ۦP�I1:  | �P || �B�⵲�G�ۦP
		// �ۦP�I2: ��Ÿ�����Ofalse�ɡA�G�̳��|����Ÿ��k�䪺�B��
		// ���P�I: ��Ÿ�����Otrue�ɡA|�~�����Ÿ��k�䪺�B��A||���A����Ÿ��k�䪺�B��
		// �}�o���A���˨ϥ� ||
		boolean bool3 = false;
		bool3 = true;
		int num3 = 10;
		if(bool3 | (num3++ > 0)){
			System.out.println("�ڲ{�b�b�x�_");
		}else{
			System.out.println("�ڲ{�b�b����");		
		}
		System.out.println("num3 = " + num3);	// ��X���G: 11
		
		boolean bool4 = false;
		bool4 = true;
		int num4 = 10;
		if(bool4 || (num4++ > 0)){
			System.out.println("�ڲ{�b�b�x�_");
		}else{
			System.out.println("�ڲ{�b�b����");		
		}
		System.out.println("num4 = " + num4);	// ��X���G: 10
		
		
	}
}