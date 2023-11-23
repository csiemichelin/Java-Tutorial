/*
分支結構中的if-else (條件判斷語句)
一、三種結構
	第一種:
	if(條件語句){
		執行表達式
	}
	
	第二種: 二選一
	if(條件語句){
		執行表達式1
	}else{
		執行表達式2
	}
	
	第三種: n選一
	if(條件語句1){
		執行表達式1
	}else if(條件語句2){
		執行表達式2
	}else if(條件語句3){
		執行表達式3
	}
	...
	else{
		執行表達式n
	}
*/
class FlowControl1{
	public static void main(String[] arg){
		// 舉例1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("需要進一步檢查");
		}
		System.out.println("檢查結束");
		
		// 舉例2
		int age = 23;
		if(age < 18){
			System.out.println("您還可以看動畫片");
		}else{
			System.out.println("您可以看成人電影了");
		}
		
		// 舉例3
		if(age < 0){
			System.out.println("您輸入的數據非法");
		}else if(age < 18){
			System.out.println("青少年時期");
		}else if(age < 35){
			System.out.println("青壯年時期");
		}else if(age < 60){
			System.out.println("中年時期");
		}else if(age < 120){
			System.out.println("老年時期");
		}else{
			System.out.println("您是要成仙嗄");
		}
	}
}