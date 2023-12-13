/*
編寫程式從 1 循環到 150 ，並在每行列印一個值，另外在每個 3 的倍數行上印出 "foo ",
在每個 5 的倍數行上列印 "biz ", 
在每個 7 的倍數行上列印輸出 "baz "
*/
class ForLoopTest1{
	public static void main(String[] args){
		for(int i = 1; i <= 150; i++){
			System.out.print(i + " ");
			if(i % 3 == 0){
				System.out.print("foo ");
			}
			if(i % 5 == 0){
				System.out.print("biz ");
			}
			if(i % 7 == 0){
				System.out.print("baz ");
			}
			System.out.println();
		}
	}
}