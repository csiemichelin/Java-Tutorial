package com.michelin.java1;
/*
 * 類的結構之三: 建構子(構造器、Constructor)的使用
 * 
 * 一、建構子的作用
 * 	   1. 創建物件
 * 	   2. 初始化物件的屬性、信息
 * 
 * 二、說明
 *     1. 如果沒有顯示定義類的建構子的話，則系統默認提供一個空參的建構子
 *     2. 定義建構子的格式: 權限修飾符 類名(形參列表){}
 *     3. 一個類中定義的多個建構子，彼此構成重載
 *     4. 一旦我們顯示了定義的建構子之後，系統就不再提供默認的空參建構子
 *     5. 一個類中，至少會有一個建構子
 */
public class PersonTest {
	public static void main(String[] args) {
		// 創建類的物件: new + 建構子
		Person p = new Person();
		p.eat();
		
		Person p1 = new Person("Tom");
		System.out.println(p1.name);
	}
}

class Person {
	// 屬性
	String name;
	int age;
	
	// 建構子
	public Person() {
		System.out.println("Person()....");
	}
	public Person(String n) {
		name = n;
	}
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	// 方法
	public void eat() {
		System.out.println("人吃飯");
	}
	public void study() {
		System.out.println("人可以學習");
	}
}