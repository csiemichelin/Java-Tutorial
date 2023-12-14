/*
Do While Loop結構的使用
1. 循環結構的4個要素
	(1) 初始化條件
	(2) 循環條件 -> (boolean型態)
	(3) 循環體
	(4) 迭代部分
	
2. Do While循環的結構
	(1)
	do{
		(3);
		(4);
	}while((2));
3. 循環過程: (1) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> ...... -> (2)
4. 說明:
	(1) do-while至少會執行一次循環體
	(2)開發中，使用for和while更多一些，較少使用do-while
*/
class DoWhileLoop{
	public static void main(String[] args){
		// 遍歷100以內的所有偶數，並計算所有偶數的和以及偶數的個數
		int num = 1;
		int sum = 0;	// 紀錄總和
		int count = 0;	// 紀錄個數
		do{
			if(num % 2 == 0){
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}while(num <= 100);
		
		System.out.println("總和為: " + sum);
		System.out.println("個數為: " + count);
		//*******************do-while至少執行一次的例子**************************
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