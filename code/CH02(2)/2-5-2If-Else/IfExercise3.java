/*
¤j®a³£ª¾¹D¡A¨k¤j·í±B¡A¤k¤j·í¶ù¡C ¨º»ò¤k¤è®aªø­n¶ù¤k¨à¡A·íµM­n´£¥X
¤@©wªº±ø¥ó¡G°ª¡G 180cm ¥H¤W¡F´I¡G°]´I 1 ¤d¸U¥H¤W¡F«Ó¡G¬O¡C
„«
¦pªG³o¤T­Ó±ø¥ó¦P®Éº¡¨¬¡A«h¡G§Ú¤@©w­n¶ùµ¹¥L
„«
¦pªG¤T­Ó±ø¥ó¦³¬°¯uªº±¡ªp¡A«h¡G¶ù§a¡A¤ñ¤W¤£¨¬¡A¤ñ¤U¦³¾l
„«
¦pªG¤T­Ó±ø¥ó³£¤£º¡¨¬¡A«h¡G¤£¶ù¡I
*/

import java.util.Scanner;
class IfExercise3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("½Ð¿é¤J±zªº¨­°ª: (cm)");
		int height = scanner.nextInt();
		System.out.println("½Ð¿é¤J±zªº°]´I: (¤d¸U)");
		double wealth = scanner.nextDouble();
		// ¤èªk¤@:
		// System.out.println("½Ð¿é¤J±z¬O§_«Ó: (true/false)");
		// boolean isHandsome = scanner.nextBoolean();
		
		// if(height >= 180 && wealth >= 1 && isHandsome){
		// 	System.out.println("§Ú¤@©w­n¶ùµ¹¥L");
		// }else if(height >= 180 || wealth >= 1 || isHandsome){
		// 	System.out.println("¶ù§a¡A¤ñ¤W¤£¨¬¡A¤ñ¤U¦³¾l");
		// }else{
		// 	System.out.println("¤£¶ù¡I");
		// }
		
		// ¤èªk¤G:
		System.out.println("½Ð¿é¤J±z¬O§_«Ó: (¬O/§_)");
		String isHandsome = scanner.next();
		
		if(height >= 180 && wealth >= 1 && isHandsome.equals('¬O')){
		System.out.println("§Ú¤@©w­n¶ùµ¹¥L");
		}else if(height >= 180 || wealth >= 1 || isHandsome.equals('¬O')){
		System.out.println("¶ù§a¡A¤ñ¤W¤£¨¬¡A¤ñ¤U¦³¾l");
		}else{
		System.out.println("¤£¶ù¡I");
		}
		
	}
}