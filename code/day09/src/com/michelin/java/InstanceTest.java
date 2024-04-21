package com.michelin.java;
/*
 * 一、理解"萬事萬物皆物件"
 * 1. 在Java的語言範疇中，我們都將功能、結構等封裝到類中，通過類的實例化，來調用具體的功能結構。
 * 		> Scanner, String等
 * 		> 文件: File
 * 		> 網路資源: URL
 * 2. 涉及到Java語言與前端Html、後端的數據庫交互時，前後端的結構在Java層面交互時，都體現為類、物件。
 * 
 * 二、記憶體解析的說明
 * 1. 引用類型的變量，只可能儲存兩類值: null 或 地址值(含變量的類型)
 * 
 * 三、匿名物件的使用
 * 1. 理解: 我們創建的物件，沒有顯示的賦給一個變量名。即為匿名物件
 * 2. 特徵: 匿名物件只能調用一次
 * 3. 使用: 如下
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
//		p = null;
		System.out.println(p);
		
		p.sendEmail();
		p.playGame();
		
		// 匿名
//		new Phone().sendEmail();
//		new Phone().playGame();
		
		new Phone().price = 1999;
		new Phone().showPrice();	// 0.0
		
		//******************************************
		PhoneMall mall = new PhoneMall();
//		mall.show(p);
		// 匿名物件的使用
		mall.show(new Phone());
		
	}
}

class PhoneMall{
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;	// 價格
	
	public void sendEmail() {
		System.out.println("發送郵件");
	}
	
	public void playGame() {
		System.out.println("玩遊戲");
	}
	
	public void showPrice() {
		System.out.println("手機價格為: " + price);
	}
}
