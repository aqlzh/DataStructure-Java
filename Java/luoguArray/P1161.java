package luoguArray;

import java.util.Scanner;

/**
 * @author LZH.create
 * Date : 2021.3.31
 *    编号  从  1  开始
 *    运用  覆盖思想  把 之前 的 a t  覆盖
 */
public class P1161 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in)  ;
		
		int n = sc.nextInt() ;
		
		int [] arr = new int [2000001] ;
		
		for(int i = 1; i<=2000000 ;i++) {
			arr[i] = -1 ;
		} 
		
		
		for(int i = 1 ; i <= n ;i++) {
			double  a = sc.nextDouble() ;
			int t = sc.nextInt() ;
			
			for(int j = 1 ; j <= t ;j++) {
				arr[(int)(a*j)] *= - 1;
			}
		}
		
		for(int i =1 ; i < 2000000 ; i++) {
			if(arr[i] == 1) System.out.println(i);
		}
		
		
		
		
		
		
		
//		double [][] arr = new double[n][2] ;
//		int [] sum = new int [2000000] ;
//		
//		for(int i = 1 ; i <=2000000 ;i++ ) {
//			sum[i] = 0 ;
//		}
//		
//		for(int i = 0 ; i < n ; i++) {
//			arr[i][0] = sc.nextDouble() ;
//			arr[i][1] = sc.nextDouble() ;
//		}
//		
//		
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = 1 ; j <= arr[i][1] ; j++) {
//				System.out.println(arr[i][1]);
//				System.out.println("---------");
//				System.out.println(j);
//				System.out.println("===");
//				if(sum[ (int)Math.floor(arr[i][0]*j) ] ==0 ) sum[ (int)Math.floor(arr[i][0]*j) ] = 1 ;
//				if(sum[ (int)Math.floor(arr[i][0]*j) ] ==1 ) sum[ (int)Math.floor(arr[i][0]*j) ] = 0 ;
				
				//System.out.println((int)Math.floor(arr[i][0]*j));
				
//				int temp = (int)Math.floor(arr[i][0]*j) ;
//				if(sum[temp] ==0 ) {
//					sum[temp] = 1  ;
//				} 	else {
//					sum[temp] = 0;
//				}
//			
//			}
//		}
//		
//		for(int i =1 ; i <= 2000000 ; i++) {
//			if(sum[i] == 1) System.out.println(i);
//			break ;
//		}
		
 	}

}
