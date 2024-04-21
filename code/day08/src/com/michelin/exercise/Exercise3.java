package com.michelin.exercise;

public class Exercise3 {
	// 3.1
	public void method() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// 3.2
	public int method1() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return 10 * 8;
	}
	
	// 3.3
	public int method2(int m, int n) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m * n;
	}
}
