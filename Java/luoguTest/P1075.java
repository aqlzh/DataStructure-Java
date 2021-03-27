package luoguTest;

import java.util.Scanner;

public class P1075 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		
		int [] arr = new int [n] ;
		int j = 0 ;  // arr 索引
		
		for(int i = 2 ; i <= n ; i++) {
		 
			if(ss(i)) {
				arr[j] = i ;
				j++ ;
			}
		}
		
		
		for(int x = 0 ; x < arr.length ; x++) {
			for(int y = 0 ; y< arr.length ; y++) {
				if(arr[x] * arr[y] == n) {
					if(arr[x] >= arr[y]) {
						System.out.println(arr[x]);
					}
				}
			}
		}
		
		
	}
	
	// 质数算法
	public static Boolean ss(int n) {
		for(int i = 2 ; i <= Math.sqrt(n) ; i++) 		  
		   if(n % i == 0) return false ;
		
		return true ;
		}
	

}
