/*
Do While Loop���c���ϥ�
1. �`�����c��4�ӭn��
	(1) ��l�Ʊ���
	(2) �`������ -> (boolean���A)
	(3) �`����
	(4) ���N����
	
2. Do While�`�������c
	(1)
	do{
		(3);
		(4);
	}while((2));
3. �`���L�{: (1) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> ...... -> (2)
4. ����:
	(1) do-while�ܤַ|����@���`����
	(2)�}�o���A�ϥ�for�Mwhile��h�@�ǡA���֨ϥ�do-while
*/
class DoWhileLoop{
	public static void main(String[] args){
		// �M��100�H�����Ҧ����ơA�íp��Ҧ����ƪ��M�H�ΰ��ƪ��Ӽ�
		int num = 1;
		int sum = 0;	// �����`�M
		int count = 0;	// �����Ӽ�
		do{
			if(num % 2 == 0){
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}while(num <= 100);
		
		System.out.println("�`�M��: " + sum);
		System.out.println("�ӼƬ�: " + count);
		//*******************do-while�ܤְ���@�����Ҥl**************************
		int number1 = 10;
		while(number1 > 10){
			System.out.println("hello:while");
			number1--;
		}
		int number2 = 10;
		do{	
			System.out.println("hello:do-while");
			number2--;
		}while(number2 > 10);
	}
}