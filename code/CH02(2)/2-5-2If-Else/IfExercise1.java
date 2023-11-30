/*
計算狗的年齡
*/

import java.util.Scanner;
class IfExercise1{
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入狗狗的年齡: ");
		int dogAge = scanner.nextInt();
		
		if(dogAge >= 0 && dogAge <= 2){
			System.out.println("相當於人的年齡: " + (dogAge * 10.5));
		}else if(dogAge > 2){
			System.out.println("相當於人的年齡: " + (2 * 10.5 + (dogAge - 2) * 4));
		}else{
			System.out.println("狗狗還沒出生呢");
		}
	}
}