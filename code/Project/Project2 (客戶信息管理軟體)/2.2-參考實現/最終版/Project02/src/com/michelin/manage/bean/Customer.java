package com.michelin.manage.bean;
/**
 * @Description Customer為實體物件，用來封裝客戶資訊，可視為JavaBean
 * @author michelin
 * @date 2024年5月7日 下午10:57:08
 */
public class Customer {
	private String name;	// 客戶性名
	private char gender;	// 姓名
	private int age;		// 年齡
	private String phone;	// 電話號碼
	private String email;	// 電子郵件
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer() {
	}
	public Customer(String name, char gender, int age, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
}
