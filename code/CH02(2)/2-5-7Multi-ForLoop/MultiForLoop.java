/*
�O�M�`�����ϥ�
1.�O�M�`��:�N�@�Ӵ`�����cA�n���b�t�@�Ӵ`�����cB���`���餤,�N�c���F�O�M�`��
2. 
���h�`���G�`�����cA
�~�h�`���G�`�����cB
3. ����:
	(1)���h�`�����c�M���@�M�A�u�۷��~�h�`���`�������F�@��
	(2)���]�~�h�`���ݭn����m���A���h�`���ݭn����n���C���ɤ��h�`�����`����@�@����Fm * n��
4. �ޥ�:
	(1)�~�h�`������C�ơA���h�`��������
*/
class MultiForLoop{
	public static void main(String[] args){
		// ******
		// System.out.println("******");
		for(int i = 1; i <= 6; i++){
			System.out.print('*');
		}
		System.out.println();
		/*
		******
		******
		******
		******
		*/
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 6; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		/*			i(�C��)			j(���)
		*			1				1
		**			2				2
		***			3				3
		****		4				4
		*****		5				5
		*/
		for(int i = 1; i <= 5; i++){	//����C��
			for(int j = 1; j <= i; j++){	// ������
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		/*			i(�C��)			j(���)
		*****		1				5
		****		2				4
		***			3				3
		**			4				2
		*			5				1
		*/
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <=  6 - i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}