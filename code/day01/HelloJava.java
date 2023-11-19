/*
JAVA的註釋類型:
1. 單行註釋 (不參與編譯，生成的.class文件不包含註釋的訊息)
2. 多行註釋 (不參與編譯，生成的.class文件不包含註釋的訊息)
3. 文檔註釋 (JAVA特有)
*/

/**
文檔註釋: 註釋的內容可以被jdk提供的工具javadoc所解析(class前要加上public)，生成一套以網頁形式該程式的說明文檔(index.html)
@author michelin
@version v1.0
這是我的第一個JAVA程式!非常開心
*/

/*
1. 在一個JAVA源文件中可以宣告多個class，但只能最多宣告一個為public的
而且宣告public的class名要與文件名相同
2. 編譯的過程: 編譯以後，會生成一個或多個.class文件。.class文件名與JAVA源文件中的class名相同
*/
public class HelloJava{	// 執行用java HelloJava
	/* 
	多行註釋: 如下main函數為程式的入口
	main的格式是固定的
	*/
	public static void main(String[] args){
		// 單行註釋
		System.out.println("Hello, World!");
	}
}
class Person{	// 執行用java Person
	public static void main(String[] args){
		System.out.println("Hello, Person!");
	}
}