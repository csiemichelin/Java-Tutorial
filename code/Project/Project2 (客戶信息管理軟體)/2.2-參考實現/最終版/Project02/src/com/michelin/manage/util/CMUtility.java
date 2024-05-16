package com.michelin.manage.util;


import java.util.*;
/**
CMUtility工具類：
將不同的功能封裝為方法，就是可以直接通過調用方法使用它的功能，而無需考慮具體的功能實現細節。
*/
public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);
    /**
	用於界面菜單的選擇。該方法讀取鍵盤，如果用戶鍵入’1’-’5’中的任意字符，則方法回傳。回傳值為用戶鍵入字符。
	*/
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && 
                c != '3' && c != '4' && c != '5') {
                System.out.print("選擇錯誤，請重新輸入：");
            } else break;
        }
        return c;
    }
	/**
	從鍵盤讀取一個字符，並將其作為方法的回傳值。
	*/
    public static char readChar() {
        String str = readKeyBoard(1, false);
        return str.charAt(0);
    }
	/**
	從鍵盤讀取一個字符，並將其作為方法的回傳值。
	如果用戶不輸入字符而直接回車，方法將以defaultValue 作為回傳值。
	*/
    public static char readChar(char defaultValue) {
        String str = readKeyBoard(1, true);
        return (str.length() == 0) ? defaultValue : str.charAt(0);
    }
	/**
	從鍵盤讀取一個長度不超過2位的整數，並將其作為方法的回傳值。
	*/
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
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
	從鍵盤讀取一個長度不超過2位的整數，並將其作為方法的回傳值。
	如果用戶不輸入字符而直接回車，方法將以defaultValue 作為回傳值。
	*/
    public static int readInt(int defaultValue) {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, true);
            if (str.equals("")) {
                return defaultValue;
            }

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
	從鍵盤讀取一個長度不超過limit的字符串，並將其作為方法的回傳值。
	*/
    public static String readString(int limit) {
        return readKeyBoard(limit, false);
    }
	/**
	從鍵盤讀取一個長度不超過limit的字符串，並將其作為方法的回傳值。
	如果用戶不輸入字符而直接回車，方法將以defaultValue 作為回傳值。
	*/
    public static String readString(int limit, String defaultValue) {
        String str = readKeyBoard(limit, true);
        return str.equals("")? defaultValue : str;
    }
	/**
	用於確認選擇的輸入。該方法從鍵盤讀取‘Y’或’N’，並將其作為方法的回傳值。
	*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("選擇錯誤，請重新輸入：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("輸入長度（不大於" + limit + "）錯誤，請重新輸入：");
                continue;
            }
            break;
        }

        return line;
    }
}
