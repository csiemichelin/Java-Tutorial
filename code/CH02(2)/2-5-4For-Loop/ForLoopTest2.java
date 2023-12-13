/*
肈ヘ块ㄢタ俱计 m ㎝ n ―ㄤ程そ计㎝程そ计 
ゑ 12 ㎝ 20 程そ计琌 4 程そ计琌 60 

弧break 闽龄ㄏノ
*/
import java.util.Scanner;
class ForLoopTest2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("叫块材タ俱计: ");
		int m = scanner.nextInt();
		System.out.println("叫块材タ俱计: ");
		int n = scanner.nextInt();
		
		// 莉程そ计
		// 1. 莉ㄢ计程
		int min = (m <= n)? m : n;
		// 2. 筂菌
		for(int i = min; i >= 1; i--){	// 眖┕т程
			if(m % i == 0 && n % i == 0){
				System.out.println("程そ计: " + i);
				break;
			}
		}
		
		// 莉程そ计
		// 1. 莉ㄢ计程
		int max = (m >= n)? m : n;
		// 2. 筂菌
		for(int i = max; i <= m * n; i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("程そ计: " + i);
				break;
			}
		}
	}
}