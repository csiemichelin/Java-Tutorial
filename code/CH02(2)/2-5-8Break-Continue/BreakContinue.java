/*
break和continue關鍵字的使用

			使用範圍		循環中使用的作用(不同點)		相同點
break:		switch-case			
			循環結構中		結束當前循環					關鍵字後面不能聲明執行語句	

continue:	循環結構中		結束當次循環					關鍵字後面不能聲明執行語句
*/

class BreakContinue{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++){
			if(i % 4 == 0){
				// break;	// 輸出: 123
				continue;	// 輸出: 123567910
				// System.out.print("今晚不用上班!!!");
			}
			System.out.print(i);
		}
		System.out.println("\n");
		//========================================================
		label: for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 10; j++){
				if(j % 4 == 0){
					// break;	// 默認跳出包裹此關鍵字最近的一層循環
					// continue;
					// break label; // 結束指定標識的一層循環結構
					continue label;	// 結束指定標識的一層循環結構的單次循環
				}
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}