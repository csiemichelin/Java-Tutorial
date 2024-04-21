package com.michelin.exercise;
/*
 * 此程式是對Student.java的改進: 將操作陣列的功能封裝到方法中
 */
public class Student1 {
	int number;	// 學號
	int state;	// 年級
	int score;	// 成績
	
	// 顯示學生信息的方法
	public String info() {
		return "學號: " + number + ", 年級: " + state + ", 成績: " + score;
	}
}
