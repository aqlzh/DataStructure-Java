package leetcodePlan.Base;

public class P0048 {

	public static void main(String[] args) {
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}} ;
		fun(matrix) ;
		System.out.println();
		fun2(matrix) ;
		System.out.println();
		fun3(matrix) ;
		
	}

	public static void fun(int[][] matrix) {
		for(int i = matrix[0].length -1 ; i >= 0 ;i--) {
			for(int j = 0 ; j < matrix.length ;j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void fun2(int[][] matrix) {
		for(int i = matrix[0].length -1 ; i >= 0 ;i--) {
			for(int j = matrix.length-1 ; j>=0 ;j--) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void fun3(int[][] matrix) {
		for(int i = 0 ; i < matrix[0].length ;i++) {
			for(int j = matrix.length-1 ; j>=0 ;j--) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
	}
}
