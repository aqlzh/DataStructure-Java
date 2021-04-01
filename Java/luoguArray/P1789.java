package luoguArray;


import java.util.Scanner;

/**
 * @author LZH.create
 * Date 2021.3.31
 * 二维数组的横纵向  运用
 * 要习惯在 循环内  进行输入
 * 注意 一个符号  的差别    i <= m
 * 
 */
public class P1789 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		int m = sc.nextInt() ;
		int k = sc.nextInt() ;
		
		
		
		int [][] a = new int[500][500] ; 
		int count = 0 ;
		
		
		// 火柴
		int x  = sc.nextInt() ;
		int y = sc.nextInt() ;
		
		for(int i = 1 ; i <= m ; i++) {
			
			for(int j = x- 2 ; j <=  x+2 ; j++) 	a[j][y] = 1;
			for(int j = y- 2 ; j <=  y+2 ; j++) 	a[x][j] = 1;
			
			for(int j = x- 1; j <= x+1;j++ ) {
				for(int kk = y-1 ;kk <= y+1 ;kk++ ) {
					a[j][kk] = 1 ;
				}
			}
		
		}
		
		
		// 荧石  
		
      
		
		
			
			for(int i = 1 ; i <= k ; i++) {
				int x1  = sc.nextInt() ;
				int y1 = sc.nextInt() ;
				for(int j = x1- 2; j <= x1+2;j++ ) {
					for(int kk = y1-2 ;kk <= y1+2 ;kk++ ) {
						a[j][kk] = 1 ;
					}
				}			
				
			}
			
		
		
		
		
		for(int i = 1; i <=n;i++ ) {
			for(int j = 1 ;j <= n ;j++ ) {
				if(a[i][j] == 0) count ++ ;
 			}
		}
		
		
		
		System.out.println(count);

				
	}

}
