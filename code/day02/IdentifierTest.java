/*
一. Ibdentifier命名規則: 不遵守, 編譯不通過
1. 數字不能開頭
2. 不可使用keyworld, 但可以包含keyworld
3. Java嚴格區分大小寫, keyworld變大寫就可以包含

二. Ibdentifier命名規範: 不遵守, 編譯會通過
1. 包名: 多單詞組成時, 所有單詞的首字母都小寫: xxxyyyzzz
2. class名, 接口名, 檔名: 多單詞組成時, 所有單詞的首字母都大寫: XxxYyyZzz
3. 變數名, 函數名: 多單詞組成時, 第一個單詞首字母小寫, 第二個單詞開始每個首字母大寫: xxxYyyZzz
4. 常數名: 所有單詞都大寫, 且每個單詞用下劃線連接: XXX_YYY_ZZZ

三. 注意文件編碼
若註解有中文不要用UTF-8，請用ANSI編碼
*/
class IdentifierTest {
	public static void main(String[] args){
		int myNumber = 100;
		System.out.println(myNumber);
		
	}
}