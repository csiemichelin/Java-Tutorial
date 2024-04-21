package com.michelin.exercise;
/*
 * 定義類別Student，包含三個屬性：學號number(int)，年級state(int)，成績score(int)。 
 * 創建20個學生物件，學號為1到20，年級和成績都由隨機數決定。
	> 問題一：列印出3年級(state值為3）的學生資料。
	> 問題二：使用冒泡排序依學生成績排序，並遍歷所有學生資訊
提示：
1) 產生隨機數：Math.random()，回傳值型別double;
2) 四捨五入取整：Math.round(double d)，回傳值類型long
 * 
 * 此程式是對StudentTest.java的改進: 將操作陣列的功能封裝到方法中
 */
public class StudentTest1 {
	public static void main(String[] args) {
		// 宣告Student 類型的陣列
		Student1[] stus = new Student1[20];	// String[] arr = new String[10];
		
		for(int i = 0; i < stus.length; i++) {
			// 給陣列元素賦值
			stus[i] = new Student1();
			// 給Student物件的屬性賦值
			stus[i].number = i + 1;
			// 年級假設範圍為: [1, 6]
			stus[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			// 成績假設範圍為: [0, 100]
			stus[i].score = (int)(Math.random() * (100 - 0 + 1) + 0);
		}
		
		StudentTest1 test = new StudentTest1();
		// 遍歷學生陣列
		test.print(stus);
		
		System.out.println("*******************************");
		
		// 問題一：列印出3年級(state值為3）的學生資料。
		test.searchStudent(stus, 3);
		
		System.out.println("*******************************");
		
		// 問題二：使用冒泡排序依學生成績排序，並遍歷所有學生資訊
		test.sort(stus);
		
		// 遍歷學生陣列
		test.print(stus);
	}
	
	/**
	 * 
	 * @Description 遍歷Student1[]陣列的操作
	 * @author michelin
	 * @date 2024年4月15日 下午11:39:23
	 * @param stus
	 */
	public void print(Student1[] stus) {
		for(int i = 0; i < stus.length; i++) {
			System.out.println(stus[i].info());
		}
	}
	
	/**
	 * 
	 * @Description 查找Student1陣列中指定年級的學生資料。
	 * @author michelin
	 * @date 2024年4月15日 下午11:41:26
	 * @param stus 要查找的陣列
	 * @param state 要查找的年級
	 */
	public void searchStudent(Student1[] stus, int state) {
		for(int i = 0; i < stus.length; i++) {
			if (stus[i].state == state) {
				System.out.println(stus[i].info());
			}
		}
	}
	
	/**
	 * 
	 * @Description 給Student1陣列排序
	 * @author michelin
	 * @date 2024年4月15日 下午11:48:10
	 * @param stus
	 */
	public void sort(Student1[] stus) {
		for(int i = 0; i < stus.length - 1; i++) {
			for(int j = 0; j < stus.length - i - 1; j++) {
				if(stus[j].score > stus[j + 1].score) {
					// 如果需要換序，交換的是陣列的元素: Student物件!!!!!!!!!
					Student1 temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
	}
}
