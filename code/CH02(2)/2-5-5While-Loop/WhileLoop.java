/*
While Loop結構的使用
1. 循環結構的4個要素
	(1) 初始化條件
	(2) 循環條件 -> (boolean型態)
	(3) 循環體
	(4) 迭代部分
	
2. While循環的結構
	(1)
	while((2)){
		(3);
		(4);
	}
3. 循環過程: (1) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> (2) -> (3) -> (4) -> ...... -> (2)
4. 說明:
	(1) 寫while循環千萬小心不要丟了迭代條件，就可能導致死循環!
	(2) 我們寫程式，要避免死循環
	(3) for循環和while循環，是可以相互轉換的!
		區別: for循環和while循環的初始化條件部分的作用範圍不同
	
5. 演算法: 有限性
*/
class WhileLoop{
	public static void main(String[] args){
		// 遍歷100以內的所有偶數
		int i = 1;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
		// 出了while循環仍可以調用
		System.out.println(i);	// 101
	}
}