/*
大家都知道，男大當婚，女大當嫁。 那麼女方家長要嫁女兒，當然要提出
一定的條件：高： 180cm 以上；富：財富 1 千萬以上；帥：是。
��
如果這三個條件同時滿足，則：我一定要嫁給他
��
如果三個條件有為真的情況，則：嫁吧，比上不足，比下有餘
��
如果三個條件都不滿足，則：不嫁！
*/

import java.util.Scanner;
class IfExercise3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入您的身高: (cm)");
		int height = scanner.nextInt();
		System.out.println("請輸入您的財富: (千萬)");
		double wealth = scanner.nextDouble();
		// 方法一:
		// System.out.println("請輸入您是否帥: (true/false)");
		// boolean isHandsome = scanner.nextBoolean();
		
		// if(height >= 180 && wealth >= 1 && isHandsome){
		// 	System.out.println("我一定要嫁給他");
		// }else if(height >= 180 || wealth >= 1 || isHandsome){
		// 	System.out.println("嫁吧，比上不足，比下有餘");
		// }else{
		// 	System.out.println("不嫁！");
		// }
		
		// 方法二:
		System.out.println("請輸入您是否帥: (是/否)");
		String isHandsome = scanner.next();
		
		if(height >= 180 && wealth >= 1 && isHandsome.equals('是')){
		System.out.println("我一定要嫁給他");
		}else if(height >= 180 || wealth >= 1 || isHandsome.equals('是')){
		System.out.println("嫁吧，比上不足，比下有餘");
		}else{
		System.out.println("不嫁！");
		}
		
	}
}