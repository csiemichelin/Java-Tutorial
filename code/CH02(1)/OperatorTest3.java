/*
�B��l�T: ����B��l 
== != > < >= <= instanceof

����:
1. ����B��l�����G���Oboolean���A
2. �Ϥ� == �M =
*/
class OperatorTest3{
	public static void main(String[] args){
		int i = 10;
		int j = 20;
		System.out.println(i == j);	//��X���G: false
		System.out.println(i = j);	//��X���G: 20
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool2 == bool1);	//��X���G: false
		System.out.println(bool2 = bool1);	//��X���G: true
	}
}