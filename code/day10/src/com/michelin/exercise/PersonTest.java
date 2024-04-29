package com.michelin.exercise;
/*
 * 在PersonTest類別中實例化Person類別的物件b，
 * 調用setAge()和getAge()方法，體會Java的封裝性。
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.age = 1;	// 編譯不通過
		
//		p1.setAge(12);
		System.out.println("年齡為: " + p1.getAge());
		
		Person p2 = new Person("Tom", 21);
		System.out.println("name = " + p2.getName() + ", age = " + p2.getAge());
	}
}
