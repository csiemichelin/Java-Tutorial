package com.michelin.exercise;

//import javax.management.RuntimeErrorException;

/*
 * 1.建立程式，在其中定義兩個類別：Person和PersonTest類別。 定義如下：
 * 用setAge()設定人的合法年齡(0~130)，用getAge()回傳人的年齡。
 * 
 * 2. 練習9: 
 *    2.1. 在前面定義的Person類別中加入建構子，利用建構子設定所有人的age屬性初始值都為18。
 *    2.2. 修改上題中類別與建構子，增加name屬性，使得每次建立Person物件的同時初始化物件的age屬性值和name屬性值。
 */
public class Person {
	private int age;
	private String name;
	
	public Person() {
		age = 18;
	}
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setAge(int a) {
		if(a < 0 || a > 130) {
//			throw new RuntimeErrorException("傳入的數據非法!");
			System.out.println("傳入的數據非法!");
		} else {
			age = a;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	// 絕對不要這樣寫!!方法定義太模糊不明確
	public int doAge(int a) {
		age = a;
		return age;
	}
}
