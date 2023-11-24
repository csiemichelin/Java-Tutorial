/*
���䵲�c����switch-case

1. �榡
switch(��F��){
case �`��1:
	����y�y1;
	// break;
	
case �`��2:
	����y�y2;
	// break;

...

default:
	����y�yn;
	// break;
}

2. ����
	(1) �ھ�switch��F�������ȡA�@���ǰt�U��case�����`�ơA�@���ǰt���\�A�h�i�J������case���c���A�I�s�����y�y�C
		��I�s������y�y�H��A�h���M�~��V�U�����Lcase���c��������y�y�A����J��break����r�Φ�switch-case���c������������C
	(2) �Pif-else���P�A���O�h��@�A�Y�n��{�h��@�A�h�C��case���c�����n�[�Jbreak
	(3) break�i�H�ϥΦbswitch-case���c���A��ܤ@������즹����r�A�N���Xswitch-case���c
	(4) switch���c������F���A�u��O�p�U�����ؼƾګ��A���@: (�S��boolean)
		byte�Bshort�Bchar�Bint�B�T�|���A(JDK5.0�s�W)�BString���A(JDK6.0�s�W)
	(5) case����u���n���`�ơA�����n���d��
	(6) break����r�O�i�諸
	(7) default: �۷��if-else���c����else�A�Bdefault���c�O�i�諸�A�t�~��m�]�O�F����(���O�i�H��b�̫e��)
*/
class SwitchCase{
	public static void main(String[] args){
		int number = 2;
		switch(number){
		case 0: 
			System.out.println("zero");
			break;
		case 1: 
			System.out.println("one");
			break;
		case 2: 
			System.out.println("two");
			break;
		case 3: 
			System.out.println("three");
			break;
		default: 
			System.out.println("other");
		}
		
		//******************�p�U����ر��p�sĶ�����q�L***********************
		// ���p�@:
		// boolean isHandsome = true;
		// switch(isHandsome){
		// case true:
		// 	System.out.println("�ڦn�Ӱ�");
		// 	break;
		// case false:
		// 	System.out.println("�ڦn���");
		// 	break;
		// default:
		// 	System.out.println("��J���~");
		// 	break;
		// }
		
		// ���p�G:
		// int age = 10;
		// switch(age){
		// case age > 18:
		// 	System.out.println("���~");
		//  	break;
		// default:
		// 	System.out.println("�����~");
		//  	break;
		// }	
	}
}