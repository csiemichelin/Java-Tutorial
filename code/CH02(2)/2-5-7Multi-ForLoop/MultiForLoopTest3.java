/*
�O�M�`�������ΤG:

��X100000�H�����Ҧ����: ��{�覡�@
��Ƭ��u��Q1�M�������㰣���۵M��	--> �q2�}�l��o�Ӽ�-1��������A������Q�o�Ӽƥ����㰣
�̤p�����: 2

��MultiForLoopTest2.java���u��
*/
class MultiForLoopTest3{
	public static void main(String[] args){
		boolean isFlag = true;	// �Х�i�O�_�Qj���ɡA���ɭק���
		int count = 0;	//������ƪ��Ӽ�
		
		// �����e�ɶ��Z��1970-01-01 00:00:00���@���
		long start = System.currentTimeMillis();
		for(int i = 2; i <= 100000; i++){	// �M��100�H�����۵M��
			// for(int j = 2; j < i; j++){	// j�Qi�h��
			for(int j = 2; j <= Math.sqrt(i); j++){	//�u�ƤG: �糧������ƪ��۵M�Ʀ���
				if(i % j == 0){	// i�Qj����
					isFlag = false;
					break;	//�u�Ƥ@: �u�糧���D��ƪ��۵M�ƬO���Ī� 
				}
			}
			if(isFlag == true){
				// System.out.println(i);
				count++;
			}
			// ���misFlag
			isFlag = true;
		}
		
		// �����e�ɶ��Z��1970-01-01 00:00:00���@���
		long end = System.currentTimeMillis();
		System.out.println("��ƪ��ӼƬ�: " + count);
		System.out.println("�Ҫ�O���ɶ���: " + (end - start) + "ms");	// �S�u�Ʈɶ���: 13545ms, �u�Ƥ@: 1248ms, �u�Ƥ@ + �u�ƤG : 20ms
	}
}