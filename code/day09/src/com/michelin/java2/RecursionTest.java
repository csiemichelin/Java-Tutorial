package com.michelin.java2;
/*
 * 遞迴方法的使用(了解)
 * 
 * 1. 遞迴方法: 一個方法體內調用了它自身
 * 2. 方法遞迴包含了一種隱式的循環，它會重複執行某段程式碼，但這種重複執行無須循環控制。
 * 3. 遞歸一定要向已知方向遞迴，否則這種遞迴就變成了無窮遞迴，類似於死循環。
 * 
 */
public class RecursionTest {
	public static void main(String[] args) {
		// 例1: 計算1-100之間所有自然數的和
		// 方式一:
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 方式二:
		RecursionTest test = new RecursionTest();
		int sum1 = test.getSum(100);
		System.out.println(sum1);
		
		System.out.println("*******************************");
		int value = test.f(10);
		System.out.println(value);
		
		System.out.println("*******************************");
		int value1 = test.fibonacci(2);
		System.out.println(value1);
	}
	
	// 例1: 計算1-n之間所有自然數的和
	public int getSum(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + getSum(n - 1);
		}
	}
	
	// 例2: 計算1-n之間所有自然數的乘積: n!
	public int getMul(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * getSum(n - 1);
		}
	}
	
	// 例3: 已知有一個數列：f(0) = 1, f(1) = 4, f(n+2)=2*f(n+1) + f(n)
	// 其中n是大於0的整數，求f(10)的值。
	public int f(int n) {
		if(n == 0) {
			return 1;
		} else if(n == 1) {
			return 4;
		} else {
			// 錯誤(StackOverflowError): 不能這樣寫因為要算f(10)，就會去找f(12)，以此類推越來越大
//			return f(n + 2) - 2 * f(n + 1);
			// 正確
			return 2 * f(n - 1) + f(n - 2);
		}
	}
	
	// 例4: Fibonacci數列: ：f(0) = 1, f(1) = 4, f(n) = f(n - 1) + f(n - 2)
	// 相當於爬樓梯問題，總共有n階樓梯(f(n))，一次只能爬一階(f(n-1))或兩階(f(n-2))，則有多少種組合可以爬完
	public int fibonacci(int n) {
		if(n == 0) {
			return 1;
		} else if(n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	// 例5: 河內塔問題
	
	// 例6: 快速排序
}
