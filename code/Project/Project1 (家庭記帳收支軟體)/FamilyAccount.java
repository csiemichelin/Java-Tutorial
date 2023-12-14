class FamilyAccount{
	public static void main(String[] args){
		String details = new String();	// 紀錄用戶的收入和支出詳情
		int balance = 0;	// 紀錄用戶的總餘額
		boolean isFlag = true;
		
		while(isFlag){
			System.out.println("\n-----------------家庭收支記賬軟件-----------------\n");
            System.out.println("                   1 收支明細");
            System.out.println("                   2 登記收入");
            System.out.println("                   3 登記支出");
            System.out.println("                   4 退    出\n");
            System.out.print("                   請選擇(1-4)： ");
			
			// 獲取用戶的選擇
			char selection = Utility.readMenuSelection();
			switch(selection){
			case '1':
				// System.out.println("1. 收支明細");
				System.out.println("-----------------當前收支明細記錄-----------------");
				System.out.println("收支\t賬戶金額\t收支金額\t說    明\n");
				System.out.println(details);
				System.out.println("--------------------------------------------------");
				break;
			case '2':
				// System.out.println("2. 登記收入");
				System.out.print("本次收入金額： ");
				int money = Utility.readNumber();
				System.out.print("本次收入說明： ");
				String description = Utility.readString();
				balance += money;
				details += "收入\t" + balance + "\t\t" + money + "\t\t" + description + "\n";
                System.out.println("---------------------登記完成---------------------\n");
				break;
			case '3':
				// System.out.println("3. 登記支出");
				System.out.print("本次支出金額： ");
				money = Utility.readNumber();
				System.out.print("本次支出說明： ");
				description = Utility.readString();
				if(balance >= money){
					balance -= money;
					details += "支出\t" + balance + "\t\t" + money + "\t\t" + description + "\n";
					System.out.println("---------------------登記完成---------------------\n");
				} else{
					System.out.println("支出超出帳戶額度。支付失敗");
				}				
				break;
			case '4':
				// System.out.println("4. 退    出");
				System.out.print("確認是否退出(Y/N)： ");
				char isExit = Utility.readConfirmSelection();
				if(isExit == 'Y'){
					isFlag = false;
				}
			}
		}
	}
}