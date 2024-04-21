package com.michelin.exercise;

public class Student {
	int number;	// 學號
	int state;	// 年級
	int score;	// 成績
	
	// 顯示學生信息的方法
	public String info() {
		return "學號: " + number + ", 年級: " + state + ", 成績: " + score;
	}
}
