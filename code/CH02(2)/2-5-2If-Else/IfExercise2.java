/*
�p������@���H����: 10 ~ 99(�]�t10�M99)
*/

import java.lang.Object;
class IfExercise2{
	public static void main(String[] args){
		double value = Math.random();	// [0.0, 1.0]
		value*=90;	// [0.0, 90.)�A90���d��99 - 10 + 1
		value+=10;	// [10.0, 100.0)
		int valueInt = (int)value;	// [10, 99]
		System.out.println(valueInt);
		
		// ����: [a, b] = (int)(Math.random() * (b - a + 1) + a)
	}
}