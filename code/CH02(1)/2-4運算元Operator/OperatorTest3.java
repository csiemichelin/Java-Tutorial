/*
運算子三: 比較運算子 
== != > < >= <= instanceof

結論:
1. 比較運算子的結果都是boolean型態
2. 區分 == 和 =
*/
class OperatorTest3{
	public static void main(String[] args){
		int i = 10;
		int j = 20;
		System.out.println(i == j);	//輸出結果: false
		System.out.println(i = j);	//輸出結果: 20
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool2 == bool1);	//輸出結果: false
		System.out.println(bool2 = bool1);	//輸出結果: true
	}
}