/*
�O�M�`�������Τ@:

�E�E���k��:
1 * 1 = 1 
2 * 1 = 2	2 * 2 = 4
......
9 * 1 = 9 ...... 9 * 9 = 81
*/
class MultiForLoopTest1{
	public static void main(String[] args){
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i + " * " + j + " = " + (i * j) + "	");
			}
			System.out.println();
		}
	}
}