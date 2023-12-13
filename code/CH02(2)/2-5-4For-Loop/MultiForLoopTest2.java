/*
嵌套循環的應用二:

輸出100以內的所有質數:
質數為只能被1和它本身整除的自然數	--> 從2開始到這個數-1結束為止，都不能被這個數本身整除
最小的質數: 2
*/
class MultiForLoopTest2{
	public static void main(String[] args){
		boolean isFlag = true;	// 標示i是否被j除盡，除盡修改其值
		for(int i = 2; i <= 100; i++){	// 遍歷100以內的自然數
			for(int j = 2; j < i; j++){	// j被i去除
				if(i % j == 0){	// i被j除盡
					isFlag = false;
				}
			}
			if(isFlag == true){
				System.out.println(i);
			}
			// 重置isFlag
			isFlag = true;
		}
	}
}

