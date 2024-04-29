package com.michelin.java2;
/*
 * this關鍵字的使用:
 * 1. this可以用來修飾: 屬性、方法、建構子 
 * 2. this修飾屬性和方法:
 * 	  ① this理解為: 當前物件或當前正在創建的物件
 * 	  ② 在類的方法中，我們可以使用"this.屬性"或"this.方法"的方式，調用當前物件的屬性或方法。
 *      但是，通常情況下我們都選擇省略"this."。
 * 		特殊情況下，如果方法的形參和類的屬性同名時，我們必須使用"this.變量"的方式，表明此變量是屬性，而非形參。
 *    ③ 在類的建構子中，我們可以使用"this.屬性"或"this.方法"的方式，調用當前正在創建的物件的屬性或方法。
 *      但是，通常情況下我們都選擇省略"this."。
 * 		特殊情況下，如果建構子的形參和類的屬性同名時，我們必須使用"this.變量"的方式，表明此變量是屬性，而非形參。
 * 3. this修飾建構子: 
 * 	  ① 我們在類的建構子中，可以使用"this(形參列表)"的方式，調用本類中指定的其他建構子，減少冗員代碼
 *    ② 建構子中不能通過"this(形參列表)"方式調用自己
 *    ③ 如果一個類中有n個建構子，則最多有n - 1建構子中使用了"this(形參列表)"，否則會形成一個遞迴環
 *    ④ 規定: "this(形參列表)"必須宣告在當前建構子的首行
 *    ⑤ 建構子內部，最多只能宣告一個"this(形參列表)"，用來調用其他建構子
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setAge(1);
		System.out.println(p1.getAge());
		
		p1.eat();
		
		System.out.println();
		
		Person p2 = new Person("Jerry", 20);
		System.out.println(p2.getAge());
	}
}

class Person{
	private String name;
	private int age;
	
	public Person() {
		this.eat();
		String info = "Person初始化時，需要考慮如下的1, 2 ,3, 4, ...(共40行程式)";
		System.out.println(info);
	}
	public Person(String name) {
		this(); 	// 相當於: Person()建構子的初始化內容
		this.name = name;
		
	}
	public Person(int age) {
		this(); 	// 相當於: Person()建構子的初始化內容
		this.age = age;
	}
	public Person(String name, int age) {
		this(age);	// 相當於: 執行了Person(int age)建構子的初始化內容
		this.name = name;
		// this.age = age;	// Person(int age)就已經做過了
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;	// 默認為this.name
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;		// 默認為this.age
	}
	
	public void eat() {
		System.out.println("人吃飯");
//		this.study();
		study();	// 默認為this.study()
	}
	public void study() {
		System.out.println("人學習");
	}
	
}