/*
���䵲�c����if-else (����P�_�y�y)
�@�B�T�ص��c
	�Ĥ@��:
	if(����y�y){
		�����F��
	}
	
	�ĤG��: �G��@
	if(����y�y){
		�����F��1
	}else{
		�����F��2
	}
	
	�ĤT��: n��@
	if(����y�y1){
		�����F��1
	}else if(����y�y2){
		�����F��2
	}else if(����y�y3){
		�����F��3
	}
	...
	else{
		�����F��n
	}
*/
class FlowControl1{
	public static void main(String[] arg){
		// �|��1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("�ݭn�i�@�B�ˬd");
		}
		System.out.println("�ˬd����");
		
		// �|��2
		int age = 23;
		if(age < 18){
			System.out.println("�z�٥i�H�ݰʵe��");
		}else{
			System.out.println("�z�i�H�ݦ��H�q�v�F");
		}
		
		// �|��3
		if(age < 0){
			System.out.println("�z��J���ƾګD�k");
		}else if(age < 18){
			System.out.println("�C�֦~�ɴ�");
		}else if(age < 35){
			System.out.println("�C���~�ɴ�");
		}else if(age < 60){
			System.out.println("���~�ɴ�");
		}else if(age < 120){
			System.out.println("�Ѧ~�ɴ�");
		}else{
			System.out.println("�z�O�n���P��");
		}
	}
}