package com.michelin.exercise;
/*
 * 2. 從鍵盤讀入學生成績，找出最高分，
		並輸出學生成績等級。
		成績>=最高分-10 等級為’A’
		成績>=最高分-20 等級為’B’
		成績>=最高分-30 等級為’C’
		其餘 等級為’D’
		提示：先讀入學生人數，依人數建立int數組，存放學生成績。
 * 
 */

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		// 1. 使用Scanner，讀取學生個數
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入學生人數: ");
		int number = scanner.nextInt();
		
		// 2. 創建陣列，儲存學生成績: 動態初始化
		int[] scores = new int[number];
		
 		// 3. 給陣列中的元素赋值
		System.out.println("請輸入" + number + "個學生成績: ");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		
		// 4. 獲取陣列中元素的最大值: 最高分
		int maxScore = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		
		// 5. 根據每個學生成績與最高分的差異，得到每個學生的等級，並輸出等級和成績
		char level;
		for(int i = 0; i < scores.length; i++) {
			if(maxScore - scores[i] <= 10) {
				level = 'A';
			} else if(maxScore - scores[i] <= 20) {
				level = 'B';
			} else if(maxScore - scores[i] <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("student " + i + " score is " + scores[i] + ", grade is " + level);
		}
	}
}
