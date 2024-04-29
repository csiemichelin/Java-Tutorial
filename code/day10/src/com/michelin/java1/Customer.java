package com.michelin.java1;
/*
 * 1. JavaBean是一種Java語言寫成的可重複使用元件。
 * 2. 所謂javaBean，是指符合下列標準的Java類別：
 * 	  ① 類別是公共的
 *    ② 有一個無參的公共的建構子 
 *    ③ 有屬性，有對應的get、set方法
 * 
 */
public class Customer {
	private int id;
	private String name;
	
	public Customer() {
		
	}
	
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
}
