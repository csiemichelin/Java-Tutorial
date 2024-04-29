package com.michelin.java;
/*
 * 物件導向的特徵一: 封裝(Encapsulation)與隱藏 3W: What? Why? How?
 * 一、 問題的引入
 * 		當我們創建一個類的物件以後，我們可以透過"物件.屬性"的方式，對物件的屬性進行賦值。
 * 		這裡賦值操作要受到屬性的數據類型和儲存範圍的制約，除此之外沒有其他制約條件。
 * 	    但是，在實際問題中，需要給屬性賦值加入額外的限制條件，此條件就不能在屬性宣告時體現。
 * 		可以透過方法進行限制條件的添加(比如: setLegs())。
 * 		同時，需要避免用戶再使用"物件.屬性"的方式對屬性進行賦值，則需要將屬性宣告為私有的(private)。
 * 		--> 此時，針對於屬性就體現了封裝性
 * 
 * 二、 封裝性的體現
 * 		① 我們將累的屬性xxx私有化(private)，同時提供公共的(public)方法來獲取(getXxx)和設置(setXxx)此屬性的值。
 * 		② 不對外暴露的私有方法
 * 		③ 單例模式 Singleton(後面會講)
 * 		④ 還有很多...
 * 
 * 三、 封裝性的體現，需要權限修飾符來配合
 * 		① Java規定的4種權限(從小到大排列): private、缺省(default都沒寫)、protected、public
 * 		② 4種權限可以用來修飾類及類的內部結構: 屬性、方法、建構子(Constructor)、內部類(Inner class)
 * 			* 修飾類的化，只能使用缺省(default都沒寫)、public
 * 
 * 四、 總結封裝性: Java提供了4種權限修飾符來修飾類以及類的內部結構，體現類以及類的內部結構在被調用時的可見性大小
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "小魚";
//		a.age = 1;
//		a.legs = 4;		// The field Animal.legs is not visible
		a.show();

//		a.legs = -4;	//但腿的個數不能是負的，The field Animal.legs is not visible
//		a.setLegs(6);
		a.setLegs(-6);
		a.show();
		
//		System.out.println(a.name);		// 被私有化，無法透過"物件.屬性"的方式取值
		System.out.println(a.getLegs());
	}
}

class Animal{
	String name;
	private int age;
	private int legs;	// 腿的個數
	
	// 對屬性的設置
	public void setLegs(int l) {
		if(l >= 0 && l % 2 == 0) {
			legs = l;
		} else {
			legs = 0;
			// 拋出異常(暫時沒有講)
		}
	}
	
	// 對屬性的獲取
	public int getLegs() {
		return legs;
	}
	
	// 提供關於屬性age的get和set方法
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("動物進食");
	}
	
	public void show() {
		System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
	}
}