package leetcodePlan.Base;

public class P0059 {

/**
 * Date:2021.9.2	
 * Author:LZH.create
 *  题解： 直接暴力模拟 
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int [][] res = fun(3)  ;
		for(int i =0 ; i < res.length ;i++) {
			for(int j =0 ; j < res[0].length ;j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public  static int[][] fun(int n){
		int [][] res = new int[n][n] ;
		int num = 1 , tar = n*n ;
		int left = 0 , right = n-1 ,top = 0 ,bottom = n-1;
		
		while(num <= tar) {
			for(int i = left ; i <=right ;i++ )   res[top][i] = num++ ;
			top ++ ;
			for(int i = top ; i <=bottom ;i++) res[i][right] = num++ ;
			right -- ;
			for(int i = right ; i >= left ;i--)res[bottom][i] = num++ ;
			bottom-- ;
			for(int i = bottom ; i>= top ;i--) res[i][left] = num++ ;
			left++ ;
		}
		
		return res ;
	}
	
 

 

}
