/*
分支結構中的switch-case

1. 格式
switch(表達式){
case 常數1:
	執行語句1;
	// break;
	
case 常數2:
	執行語句2;
	// break;

...

default:
	執行語句n;
	// break;
}

2. 說明
	(1) 根據switch表達式中的值，一次匹配各個case中的常數，一旦匹配成功，則進入相應的case結構當中，呼叫其執行語句。
		當呼叫完執行語句以後，則仍然繼續向下執行其他case結構中的執行語句，直到遇到break關鍵字或此switch-case結構末尾結束為止。
	(2) 與if-else不同，不是多選一，若要實現多選一，則每個case結構中都要加入break
	(3) break可以使用在switch-case結構中，表示一旦執行到此關鍵字，就跳出switch-case結構
	(4) switch結構中的表達式，只能是如下的六種數據型態之一: (沒有boolean)
		byte、short、char、int、枚舉型態(JDK5.0新增)、String型態(JDK6.0新增)
	(5) case之後只能聲明常數，不能聲明範圍
	(6) break關鍵字是可選的
	(7) default: 相當於if-else結構中的else，且default結構是可選的，另外位置也是靈活的(像是可以放在最前面)
*/
class SwitchCase{
	public static void main(String[] args){
		int number = 2;
		switch(number){
		case 0: 
			System.out.println("zero");
			break;
		case 1: 
			System.out.println("one");
			break;
		case 2: 
			System.out.println("two");
			break;
		case 3: 
			System.out.println("three");
			break;
		default: 
			System.out.println("other");
		}
		
		//******************如下的兩種情況編譯都不通過***********************
		// 情況一:
		// boolean isHandsome = true;
		// switch(isHandsome){
		// case true:
		// 	System.out.println("我好帥啊");
		// 	break;
		// case false:
		// 	System.out.println("我好醜啊");
		// 	break;
		// default:
		// 	System.out.println("輸入有誤");
		// 	break;
		// }
		
		// 情況二:
		// int age = 10;
		// switch(age){
		// case age > 18:
		// 	System.out.println("成年");
		//  	break;
		// default:
		// 	System.out.println("未成年");
		//  	break;
		// }	
	}
}