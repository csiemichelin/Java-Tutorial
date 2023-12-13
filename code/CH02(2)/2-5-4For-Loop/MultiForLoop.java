/*
嵌套循環的使用
1.嵌套循環:將一個循環結構A聲明在另一個循環結構B的循環體中,就構成了嵌套循環
2. 
內層循環：循環結構A
外層循環：循環結構B
3. 說明:
	(1)內層循環結構遍歷一遍，只相當於外層循環循環體執行了一次
	(2)假設外層循環需要執行m次，內層循環需要執行n次。此時內層循環的循環體一共執行了m * n次
4. 技巧:
	(1)外層循環控制列數，內層循環控制行數
*/
class MultiForLoop{
	public static void main(String[] args){
		// ******
		// System.out.println("******");
		for(int i = 1; i <= 6; i++){
			System.out.print('*');
		}
		System.out.println();
		/*
		******
		******
		******
		******
		*/
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 6; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		/*			i(列數)			j(行數)
		*			1				1
		**			2				2
		***			3				3
		****		4				4
		*****		5				5
		*/
		for(int i = 1; i <= 5; i++){	//控制列數
			for(int j = 1; j <= i; j++){	// 控制行數
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		/*			i(列數)			j(行數)
		*****		1				5
		****		2				4
		***			3				3
		**			4				2
		*			5				1
		*/
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j <=  6 - i; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}