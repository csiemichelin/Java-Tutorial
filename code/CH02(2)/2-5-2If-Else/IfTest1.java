/*
岳小鵬參加
Java考試，他和父親岳不群達成承諾：
如果：
成績為100分時，獎勵一輛BMW
成績為(80, 99]時，獎勵一台iphone xs max
當成績為[60, 80]時，獎勵一台iPad
其它，什麼獎勵也沒有。
請從鍵盤輸入岳小鵬的期末成績，並加以判斷

說明:
1. else結構是可選得
2. 對於條件表達式
	> 如果多個條件表達式之間是"互斥"關係(或沒有交集的關係)，哪個判斷和執行語句宣告在上面還式下面，無所謂
	> 如果多個條件表達式之間有"交集"關係，需要根據實際情況，考慮清楚應該在哪個結構宣告在上面
	> 如果多個條件表達式之間有"包含"關係，通常情況下，需要將範為小的宣告在範為大的上面。否則，範為小的會沒機會執行
*/

import java.util.Scanner;
class IfTest1{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入岳小鵬的期末成績: (0-100)");
		int score = scanner.nextInt();
		
		if(score == 100){
			System.out.println("獎勵一輛BMW");
		}else if(score > 80 && score <= 99){
			System.out.println("獎勵一台iphone xs max");
		}else if(score >= 60 && score <= 80){
			System.out.println("獎勵一台iPad");
		}// else{
		//	System.out.println("什麼獎勵也沒有");
		// }
	}
}