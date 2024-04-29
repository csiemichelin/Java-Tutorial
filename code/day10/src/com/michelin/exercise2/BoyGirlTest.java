package com.michelin.exercise2;

public class BoyGirlTest {
	public static void main(String[] args) {
		Boy boy = new Boy("羅密歐", 21); 
		boy.shout();
		
		Girl girl = new Girl("茱麗葉", 18);
		girl.marry(boy);
		
		Girl girl1 = new Girl("祝英台", 19);
		int compare = girl.compare(girl1);
		System.out.println(compare);
		if (compare > 0) {
			System.out.println(girl.getName() + "大");
		} else if (compare < 0) {
			System.out.println(girl1.getName() + "大");
		} else {
			System.out.println("一樣大");
		}
	}
}
