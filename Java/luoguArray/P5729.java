package luoguArray;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date : 2021.3.27    
 * 运用三维数组    注意切割体积可能有重复 
 *  运用  0 1  方法  
 *  0  表示未移除   1  表示移除  
 *  解题 思路 同 P1047
 */
public class P5729 {

	public static void main(String[] args) {
		
		int [][][] A = new int[30][30][30] ;
		
		int count = 0 ;

		Scanner sc = new Scanner(System.in) ;
		
		
		int w = sc.nextInt() ;
		int x = sc.nextInt() ;
		int h = sc.nextInt() ;
		int n = sc.nextInt() ;

		for(int ii = 0 ; ii < n ;ii++) {
			int a = sc.nextInt() ;
			int b = sc.nextInt() ;
			int c = sc.nextInt() ;
			int d = sc.nextInt() ;
			int e = sc.nextInt() ;
			int f = sc.nextInt() ;
			
			for(int i = a ; i <= d ;i++) {
				for(int j = b ; j <= e ; j++) {
					for(int k = c ; k <= f ; k++) {
						A[i][j][k] = 1 ;
					}
				}
			}
		}
		
		
		// 三元遍历  长方体
		
		for(int i = 1 ; i <= w ;i++) {
			for(int j = 1 ; j <=x ; j++) {
				for(int k = 1 ; k <= h ; k++) {
					if(A[i][j][k] == 0) 
						count ++ ;
				}
			}
		}
		
		
		System.out.println(count);
		
		
//		int [] arr = new int[3] ;   // 长方体参数
//		int [] xyz = new int [6] ;   // 对角线参数
//		int sum = 0 ;
//		
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			arr[i] = sc.nextInt() ;
//		}
//		
//		int v = arr[0] * arr[1] * arr[2] ;
//		
//		int n = sc.nextInt() ;
//		
//		int [] result = new int [n] ;
//		
//		for(int i = 0 ; i< n ;i++) {
//			for(int j = 0 ; j < 6 ; j++) {
//				xyz[j] = sc.nextInt() ;
//			}
//			result[i] =(xyz[3] - xyz[0] + 1)* (xyz[4] - xyz[1] + 1) * (xyz[5] - xyz[2]+ 1) ;
//		}
//		
//		for(int i =0 ; i< n ; i++) {
//			sum += result[i] ; 
//		}
//		
//		System.out.println(v - sum);
//		
  }

}
