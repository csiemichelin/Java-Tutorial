package com.michelin.java;
/*
 * 類中方法的宣告與使用
 * 
 * 一、方法(Method): 描述類應該具有的功能
 * 比如: Math類: sqrt()、random()...
 * 		Scanner類: nextXxx()...
 * 		Array類: sort()、binarySearch()、toString()、equals()...
 * 
 * 二、舉例:
 * public void eat()
 * public void sleep(int hour)
 * public String getName()
 * public String getNation(String nation)
 * 
 * 三、方法的宣告: 
 * 權限修飾符 回傳類型 方法名(參數列表){
 * 		方法體
 * }
 * 注意: static、final、abstract來修飾的方法，後面再講
 * 
 * 四、說明:
 * 1. 關於權限修飾符: 默認方法的權限修飾符先都使用public
 * 		> Java規定的4種權限修飾符: private、public、缺省、protected	--> 封裝性再細說
 * 2. 回傳值類型: 有回傳值 VS 沒有回傳值
 * 		2.1 如果方法有回傳值，則必須在方法宣告時，指定回傳值的類型。
 * 			同時，方法中需要使用return關鍵字來返回指定類型的變量或常量: "return 數據"。
 * 		2.2 如果方法沒有回傳值，則方法宣告時，使用void來表示。
 * 			通常，沒有回傳值的方法中，就不使用return。
 * 			但是，如果使用的話，只能"return;"表示結束此方法的意思。
 * 		2.3 我們定義方法該不該有的回傳值?
 * 			① 題目要求
 * 			② 憑經驗: 具體問題具體分析
 * 3. 方法名: 屬於標示符: 遵循標示符的規則和規範，"見名知意"
 * 4. 參數列表: 方法可以宣告0個, 1個, 或多個參數
 * 		4.1 格式: 數據類型1 參數1, 數據類型2 參數2, ...
 * 		4.2 我們定義方法時，該不該定義參數?
 * 			① 題目要求
 * 			② 憑經驗: 具體問題具體分析
 * 5. 方法體: 方法功能的實現
 * 
 * 五、return關鍵字的使用
 * 1. 使用範圍: 使用在方法體中
 * 2. 作用: 
 * 		① 結束方法
 * 		② 針對於有回傳值的方法，使用"return 數據"方法回傳所要的數據
 * 3. 注意點: return 關鍵字後面不可以聲明執行語句
 * 
 * 六、方法的使用，可以調用當前類的屬性或方法
 * 1. 特殊的: 方法A又調用了方法A: 遞迴方法(但要有終止條件)
 * 2. 方法中，不可以定義方法
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.eat();
		
		cust1.sleep(8);
	}
}

// 客戶類
class Customer{
	// 屬性
	String name;
	int age;
	boolean isMaile;
	
	// 方法
	public void eat() {
		System.out.println("客戶吃飯");
		return;
		// return後不能聲明表達式
//		System.out.println("hello");
	}
	
	public void sleep(int hour) {
		System.out.println("休息了" + hour + "個小時");
		eat();	// 調用類中的其他方法
//		sleep(10);	// 沒有終止條件的遞迴方法，會導致stackOverflow，不斷宣告hour局部變量導致stack爆掉
	}
	
	public String getName() {
		if(age > 18) {	// 調用類中的其他屬性
			return name;
		} else {
			return "Tom";	
		}
	}
	
	public String getNation(String nation) {
		String info = "我的國籍是: " + nation;
		return info;
	}
	
	public void info() {
		// 錯誤
//		public void swim() {
//			
//		}
	}
}