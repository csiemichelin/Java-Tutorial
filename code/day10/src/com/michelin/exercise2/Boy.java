package com.michelin.exercise2;
/*
 * 自動產生建構子快捷鍵: Alt + Shift + s > Generate Constructors Using Fields
 * 自動產生get, set方法快捷鍵: Alt + Shift + s > Generate Getters and Setters
 */
public class Boy {
	private String name;
	private int age;
	
	public Boy() {
		
	}
	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Girl girl) {
		System.out.println("我想娶: " + girl.getName());
	}
	public void shout() {
		if(this.age >= 22) {
			System.out.println("你可去登記結婚了!");
		} else {
			System.out.println("先多談談戀愛~~");
		}
	}
}
