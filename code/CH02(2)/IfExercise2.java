/*
如何獲取一個隨機數: 10 ~ 99(包含10和99)
*/

import java.lang.Object;
class IfExercise2{
	public static void main(String[] args){
		double value = Math.random();	// [0.0, 1.0]
		value*=90;	// [0.0, 90.)，90為範圍99 - 10 + 1
		value+=10;	// [10.0, 100.0)
		int valueInt = (int)value;	// [10, 99]
		System.out.println(valueInt);
		
		// 公式: [a, b] = (int)(Math.random() * (b - a + 1) + a)
	}
}