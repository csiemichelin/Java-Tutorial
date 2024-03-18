package com.michelin.exercise;
/*
使用二維陣列列印一個 10 行楊輝三角。
【提示】
1. 第一行有 1 個元素, 第 n 行有 n 個元素
2. 每一行的第一個元素和最後一個元素都是 1
3. 從第三行開始, 對於非第一個元素和最後一個元素的元素。 即：
   yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */
public class YangHuiTest {
	public static void main(String[] args) {
		// 1. 聲明初始化二維陣列
		int[][] yangHui = new int[10][]; 
		// 2. 給陣列的元素賦值
		for(int i = 0; i < yangHui.length; i++) {
			yangHui[i] = new int[i + 1];
			
			// 2.1 給首末元素賦值
			yangHui[i][0] = yangHui[i][i] = 1;
			
			// 2.2 給每行的非首末元素賦值
			if(i >= 2) {	// 可省
				for (int j = 1; j < yangHui[i].length - 1; j++) {
					yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
				}
			}
		}
		// 3. 遍歷二維陣列
		for(int i = 0; i < yangHui.length; i++) {
			for(int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
