/*
While Loop���c���ϥ�
1. �`�����c��4�ӭn��
	(1) ��l�Ʊ���
	(2) �`������ -> (boolean���A)
	(3) �`����
	(4) ���N����
	
2. While�`�������c
	(1)
	while((2)){
		(3);
		(4);
	}
3. �`���L�{: (1) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> ...... -> (2)
4. ����:
	(1) �gwhile�`���d�U�p�ߤ��n��F���N����A�N�i��ɭP���`��!
	(2) �ڭ̼g�{���A�n�קK���`��
	(3) for�`���Mwhile�`���A�O�i�H�ۤ��ഫ��!
		�ϧO: for�`���Mwhile�`������l�Ʊ��󳡤����@�νd�򤣦P
	
5. �t��k: ������
*/
class WhileLoop{
	public static void main(String[] args){
		// �M��100�H�����Ҧ�����
		int i = 1;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
		// �X�Fwhile�`�����i�H�ե�
		System.out.println(i);	// 101
	}
}