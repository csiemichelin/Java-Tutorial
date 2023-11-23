/*
運算子四: 邏輯運算子 
& && | || ! ^

說明:
1. 邏輯運算子操作都是boolean型態的變數
*/
class OperatorTest4{
	public static void main(String[] args){
		// 區分 & 與 &&
		// 相同點1:  & 與 && 運算結果相同
		// 相同點2: 當符號左邊是true時，二者都會執行符號右邊的運算
		// 不同點: 當符號左邊是flase時，&繼續執行符號右邊的運算，&&不再執行符號右邊的運算
		// 開發中，推薦使用 &&
		boolean bool1 = true;
		bool1 = false;
		int num1 = 10;
		if(bool1 & (num1++ > 0)){
			System.out.println("我現在在台北");
		}else{
			System.out.println("我現在在高雄");		
		}
		System.out.println("num1 = " + num1);	// 輸出結果: 11
		
		boolean bool2 = true;
		bool2 = false;
		int num2 = 10;
		if(bool2 && (num2++ > 0)){
			System.out.println("我現在在台北");
		}else{
			System.out.println("我現在在高雄");
		}
		System.out.println("num2 = " + num2);	// 輸出結果: 10
		
		// 區分  與 ||
		// 相同點1:  | 與 || 運算結果相同
		// 相同點2: 當符號左邊是false時，二者都會執行符號右邊的運算
		// 不同點: 當符號左邊是true時，|繼續執行符號右邊的運算，||不再執行符號右邊的運算
		// 開發中，推薦使用 ||
		boolean bool3 = false;
		bool3 = true;
		int num3 = 10;
		if(bool3 | (num3++ > 0)){
			System.out.println("我現在在台北");
		}else{
			System.out.println("我現在在高雄");		
		}
		System.out.println("num3 = " + num3);	// 輸出結果: 11
		
		boolean bool4 = false;
		bool4 = true;
		int num4 = 10;
		if(bool4 || (num4++ > 0)){
			System.out.println("我現在在台北");
		}else{
			System.out.println("我現在在高雄");		
		}
		System.out.println("num4 = " + num4);	// 輸出結果: 10
		
		
	}
}