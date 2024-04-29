package com.michelin.java2;

import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
import java.util.*;

import com.michelin.exercise4.Account;
//import com.michelin.exercise3.Account;
import com.michelin.exercise4.Bank;
import com.michelin.java2.java3.Dog;

import static java.lang.System.*;
import static java.lang.Math.*;

/*
 * 一、package關鍵字的使用
 * 1. 為了更好的實現項目中類的管理，提供包的概念
 * 2. 使用package宣告類或接口所屬的包，宣告在源文件的首行
 * 3. 包，屬於標識符，遵循標識符的命名規則、規範(都小寫: xxxyyyzzz)、"見名知意"
 * 4. 每"."一次，就代表一層文件目錄
 * 
 * 補充: 同一個包下，不能命名同名的接口、類
 *      不同的包下，可以命名同名的接口、類
 * 
 * 二、import(導入)關鍵字的使用
 * 1. 在源文件中使用import結構導入指定包下的類、接口
 * 2. 聲明在包的聲明和類的聲明之間
 * 3. 如果需要導入多個結構，則並列寫出即可
 * 4. 可以使用"xxx.*"的方式，表示可以導入xxx包下的所有結構
 * 5. 如果使用的類或接口是java.lang包下定義的(eg. String、System)，則可以省略import結構
 * 6. 如果使用的類或接口是本包下定義的，則可以省略import結構
 * 7. 如果在源文件中，使用了不同包下同名的類，則必須至少有一個類需要以全類名的方式顯示
 * 8. 使用"xxx.*"方式來表明可以調用xxx包下的所有結構。但是如果使用的是xxx子包下的結構，則仍需要顯示導入
 * 9. import static: 導入指定類或接口中的靜態結構: 屬性或方法
 * 
 */
public class PackageImportTest {
	public static void main(String[] args) {
		String info = Arrays.toString(new int[] {1, 2, 3});
		
		Bank bank = new Bank();
		
		ArrayList list = new ArrayList();
		
		HashMap map = new HashMap();
		
		Scanner s = null;
		
		System.out.println("hello!");
		
		Person p = new Person();
		
		Account acct = new Account(1000);
		// 全類名的方式顯示
		com.michelin.exercise3.Account acct1 = new com.michelin.exercise3.Account(1000, 200, 0.0123);
		
		Date date = new Date();
		java.sql.Date date1 = new java.sql.Date(524352352533L);
		
		Dog dog = new Dog();
		
		Field field = null;
		
		out.println("hello!");
		long num = round(123.44); 
	}
}
