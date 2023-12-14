class FamilyAccount{
	public static void main(String[] args){
		String details = new String();	// �����Τ᪺���J�M��X�Ա�
		int balance = 0;	// �����Τ᪺�`�l�B
		boolean isFlag = true;
		
		while(isFlag){
			System.out.println("\n-----------------�a�x����O��n��-----------------\n");
            System.out.println("                   1 �������");
            System.out.println("                   2 �n�O���J");
            System.out.println("                   3 �n�O��X");
            System.out.println("                   4 �h    �X\n");
            System.out.print("                   �п��(1-4)�G ");
			
			// ����Τ᪺���
			char selection = Utility.readMenuSelection();
			switch(selection){
			case '1':
				// System.out.println("1. �������");
				System.out.println("-----------------��e������ӰO��-----------------");
				System.out.println("����\t�����B\t������B\t��    ��\n");
				System.out.println(details);
				System.out.println("--------------------------------------------------");
				break;
			case '2':
				// System.out.println("2. �n�O���J");
				System.out.print("�������J���B�G ");
				int money = Utility.readNumber();
				System.out.print("�������J�����G ");
				String description = Utility.readString();
				balance += money;
				details += "���J\t" + balance + "\t\t" + money + "\t\t" + description + "\n";
                System.out.println("---------------------�n�O����---------------------\n");
				break;
			case '3':
				// System.out.println("3. �n�O��X");
				System.out.print("������X���B�G ");
				money = Utility.readNumber();
				System.out.print("������X�����G ");
				description = Utility.readString();
				if(balance >= money){
					balance -= money;
					details += "��X\t" + balance + "\t\t" + money + "\t\t" + description + "\n";
					System.out.println("---------------------�n�O����---------------------\n");
				} else{
					System.out.println("��X�W�X�b���B�סC��I����");
				}				
				break;
			case '4':
				// System.out.println("4. �h    �X");
				System.out.print("�T�{�O�_�h�X(Y/N)�G ");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
			}
		}
	}
}