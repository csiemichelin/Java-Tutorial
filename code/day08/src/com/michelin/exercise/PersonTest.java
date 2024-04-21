package com.michelin.exercise;
/*
 * 要求：
 * (1)建立Person類別的物件，設定該物件的name、age和sex屬性，呼叫study方法，輸出字串“studying”，呼叫showAge()方法顯示age值，呼叫addAge()方法增加物件的age屬性值2歲。
 * (2)建立第二個物件，執行上述操作，體會同一個類別的不同物件之間的關係。
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Tom";
		p1.age = 18;
		p1.sex = 1;
		
		p1.study();
		p1.showAge();
		
		int newAge = p1.addAge(2);
		System.out.println(p1.name + "的新年齡為: " + newAge);
		
		System.out.println(p1.age);	// 20
		
		//****************************
		Person p2 = new Person();
		p2.showAge(); 	// 0
		p2.addAge(10);
		p2.showAge();	// 10
		
		p1.showAge();	// 20
	}
}
