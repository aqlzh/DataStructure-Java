package luoguArray;

import java.util.Arrays;
import java.util.Scanner;

public class P1614 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in)  ;
		
		int n = sc.nextInt() ;
		int m = sc.nextInt() ;
		
		int [] arr = new int[n] ;
		int [] result = new int [n-(m-1)] ;
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
	
		
		for(int i = 0 ; i < n-(m-1) ; i++) {

           int j = i ; 	
		   for(int k = m ; k > 0 ; k--) {
			
		      result[i] += arr[j] ;

		      j++ ;
		   }
			
		}
		
		Arrays.sort(result); 

		System.out.println(result[0]);
	}
	
	

	
	
}
