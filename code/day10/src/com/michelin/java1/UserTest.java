package com.michelin.java1;
/*
 * 總結: 屬性賦值的先後順序
 * 
 * ① 默認初始化
 * ② 顯示初始化 
 * ③ 建構子初始化
 * ④ 通過"物件.方法"或"物件.屬性"的方式賦值
 * 
 * 以上操作的先後順序: ① > ② > ③ > ④ 
 * 
 */
public class UserTest {
	public static void main(String[] args) {
		User u = new User();
		System.out.println(u.age);
		
		User u1 = new User(2);
		System.out.println(u1.age);
		
		u1.setAge(3);
		System.out.println(u1.age);
	}
}

class User{
	String name;
	int age = 1;
	
	public User() {
		
	}
	public User(int a) {
		age = a;
	}
	
	public void setAge(int a) {
		age = a;
	}
}
