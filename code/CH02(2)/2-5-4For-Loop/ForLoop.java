/*
For Loop結構的使用
1. 循環結構的4個要素
	(1) 初始化條件
	(2) 循環條件 -> (boolean型態)
	(3) 循環體
	(4) 迭代部分
	
2. for循環的結構
	for((1); (2); (4)){
		(3)
	}

3. 循環過程: (1) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> ...... -> (2)
*/
class ForLoop{
	public static void main(String[] args){
		for(int i = 1; i < 5; i++){
			System.out.println("Hello World!");
		}
		// i: 在For Loop中有效，出了For Loop就失效
		// System.out.println(i);
		
		// 練習
		int num = 1;
		for(System.out.print('a'); num <= 3; System.out.print('c'), num++){
			System.out.print('b');
		}
		System.out.println();
		// 輸出結果: abcbcbc
		
		// 例題: 遍歷100以內的偶數，輸出所有偶數的和，輸出所有偶數的個數
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println("總和為: " + sum);
		System.out.println("個數為: " + count);
	}
}