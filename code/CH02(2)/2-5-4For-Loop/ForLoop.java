/*
For Loop���c���ϥ�
1. �`�����c��4�ӭn��
	(1) ��l�Ʊ���
	(2) �`������ -> (boolean���A)
	(3) �`����
	(4) ���N����
	
2. for�`�������c
	for((1); (2); (4)){
		(3)
	}

3. �`���L�{: (1) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> ...... -> (2)
*/
class ForLoop{
	public static void main(String[] args){
		for(int i = 1; i < 5; i++){
			System.out.println("Hello World!");
		}
		// i: �bFor Loop�����ġA�X�FFor Loop�N����
		// System.out.println(i);
		
		// �m��
		int num = 1;
		for(System.out.print('a'); num <= 3; System.out.print('c'), num++){
			System.out.print('b');
		}
		System.out.println();
		// ��X���G: abcbcbc
		
		// ���D: �M��100�H�������ơA��X�Ҧ����ƪ��M�A��X�Ҧ����ƪ��Ӽ�
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("�`�M��: " + sum);
		System.out.println("�ӼƬ�: " + count);
	}
}