/*
break�Mcontinue����r���ϥ�

			�ϥνd��		�`�����ϥΪ��@��(���P�I)		�ۦP�I
break:		switch-case			
			�`�����c��		������e�`��					����r�᭱�����n������y�y	

continue:	�`�����c��		�������`��					����r�᭱�����n������y�y
*/

class BreakContinue{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++){
			if(i % 4 == 0){
				// break;	// ��X: 123
				continue;	// ��X: 123567910
				// System.out.print("���ߤ��ΤW�Z!!!");
			}
			System.out.print(i);
		}
		System.out.println("\n");
		//========================================================
		label: for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 10; j++){
				if(j % 4 == 0){
					// break;	// �q�{���X�]�q������r�̪񪺤@�h�`��
					// continue;
					// break label; // �������w���Ѫ��@�h�`�����c
					continue label;	// �������w���Ѫ��@�h�`�����c���榸�`��
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}