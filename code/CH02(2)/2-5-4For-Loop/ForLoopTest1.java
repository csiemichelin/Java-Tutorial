/*
�s�g�{���q 1 �`���� 150 �A�æb�C��C�L�@�ӭȡA�t�~�b�C�� 3 �����Ʀ�W�L�X "foo ",
�b�C�� 5 �����Ʀ�W�C�L "biz ", 
�b�C�� 7 �����Ʀ�W�C�L��X "baz "
*/
class ForLoopTest1{
	public static void main(String[] args){
		for(int i = 1; i <= 150; i++){
			System.out.print(i + " ");
			if(i % 3 == 0){
				System.out.print("foo ");
			}
			if(i % 5 == 0){
				System.out.print("biz ");
			}
			if(i % 7 == 0){
				System.out.print("baz ");
			}
			System.out.println();
		}
	}
}