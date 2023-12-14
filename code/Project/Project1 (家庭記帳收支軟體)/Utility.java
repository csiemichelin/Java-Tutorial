import java.util.Scanner;
/**
Utility工具類：
將不同的功能封裝為函數，就是可以直接通過調用函數使用它的功能，而無需考慮具體的功能實現細節。
*/
public class Utility {
    private static Scanner scanner = new Scanner(System.in);
    /**
	用於界面菜單的選擇。該函數讀取鍵盤，如果用戶鍵入’1’-’4’中的任意字符，則函數返回。返回值為用戶鍵入字符。
	*/
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("選擇錯誤，請重新輸入：");
            } else break;
        }
        return c;
    }
	/**
	用於收入和支出金額的輸入。該函數從鍵盤讀取一個不超過4位長度的整數，並將其作為函數的返回值。
	*/
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(6);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("數字輸入錯誤，請重新輸入：");
            }
        }
        return n;
    }
	/**
	用於收入和支出說明的輸入。該函數從鍵盤讀取一個不超過8位長度的字符串，並將其作為函數的返回值。
	*/
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }
	
	/**
	用於確認選擇的輸入。該函數從鍵盤讀取‘Y’或’N’，並將其作為函數的返回值。
	*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();	// 輸入小寫也OK
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("選擇錯誤，請重新輸入：");
            }
        }
        return c;
    }
	
	
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("輸入長度（不大於" + limit + "）錯誤，請重新輸入：");
                continue;
            }
            break;
        }

        return line;
    }
}