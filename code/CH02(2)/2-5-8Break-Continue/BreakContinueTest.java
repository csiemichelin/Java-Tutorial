/*
嵌套循環的應用二:

輸出100000以內的所有質數: 實現方式二
質數為只能被1和它本身整除的自然數	--> 從2開始到這個數-1結束為止，都不能被這個數本身整除
最小的質數: 2
*/
class BreakContinueTest{
	public static void main(String[] args){
		int count = 0;	//紀錄質數的個數
		
		// 獲取當前時間距離1970-01-01 00:00:00的毫秒數
		long start = System.currentTimeMillis();
		label: for(int i = 2; i <= 100000; i++){	// 遍歷100以內的自然數
			// for(int j = 2; j < i; j++){	// j被i去除
			for(int j = 2; j <= Math.sqrt(i); j++){	//優化二: 對本身為質數的自然數有效
				if(i % j == 0){	// i被j除盡
					continue label;
				}
			}
			// 能執行到此步的都是質數
			count++;
		}
		
		// 獲取當前時間距離1970-01-01 00:00:00的毫秒數
		long end = System.currentTimeMillis();
		System.out.println("質數的個數為: " + count);
		System.out.println("所花費的時間為: " + (end - start) + "ms");	// 優化一 + 優化二 : 13ms
	}
}