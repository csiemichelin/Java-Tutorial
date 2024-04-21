package com.michelin.exercise1;
/* 
 * 考察參數的值傳遞 
 * 
 * （2）定義一個類別PassObject，在類別中定義一個方法printAreas()
 *      該方法的定義如下：public void printAreas(Circle c, int time)
 *      在printAreas方法中列印輸出1到time之間的每個整數半徑值，以及對應的面積。
 *      例如，times為5，則輸出半徑1，2，3，4，5，以及對應的圓面積。
 * （3）在main方法中呼叫printAreas()方法，調用完畢後輸出當前半徑值。 
 */
public class PassObject {
	public static void main(String[] args) {
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		
		test.printAreas(c, 5);
		
		System.out.println("now radius is " + c.radius);
	}
	
	public void printAreas(Circle c, int time) {
		System.out.println("Radius\t\tArea");
		
		for(int i = 1; i <= time; i++){
			// 設置圓的半徑
			c.radius = i;
			double area = c.findArea();
			System.out.println(c.radius + "\t\t" + area);
		}
		
		c.radius = time + 1;
	}
}
