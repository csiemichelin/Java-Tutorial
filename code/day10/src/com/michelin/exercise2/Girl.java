package com.michelin.exercise2;
/*
 * 自動產生建構子快捷鍵: Alt + Shift + s > Generate Constructors Using Fields
 * 自動產生get, set方法快捷鍵: Alt + Shift + s > Generate Getters and Setters
 */

public class Girl {
	private String name;
	private int age;
	
	public Girl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy) {
		System.out.println("我想嫁給: " + boy.getName());
		boy.marry(this);	// this代表當前物件
	}
	/**
	 * 
	 * @Description 比較兩個物件的大小
	 * @author michelin
	 * @date 2024年4月28日 下午6:05:42
	 * @param girl
	 * @return 正數: 當前物件大; 負數: 當前物件小; 0: 當前物件與形參物件相等
	 */
	public int compare(Girl girl) {
//		if (this.age > girl.age) {
//			return 1;
//		} else if (this.age < girl.age) {
//			return -1;
//		} else {
//			return 0;
//		}
		return this.age - girl.age;
	}
}
