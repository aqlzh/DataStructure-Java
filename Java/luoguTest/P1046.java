package luoguTest;

import java.util.Scanner;

public class P1046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		
		int[] arr = new int [10] ;
		int count = 0 ;
		
		for(int i = 0 ; i < 10 ;i++) {
			
			int temp = sc.nextInt() ; 
			
			if(temp >= 100 && temp <= 200) {
				arr[i] = temp ;
			}
			
		    // arr[i] = sc.nextInt() ;
		
		     
		}
		System.out.println();
		
		
		int temp2 = sc.nextInt() ; 
		int b = 0 ;
		
		if(temp2 >= 100 && temp2 <= 120) {
			b = temp2 ;
		}
		
		
		// int b = sc.nextInt() ;
		
	   for(int j = 0 ; j < 10 ; j++) {
			if(b + 30 >= arr[j]) {
				count ++ ;
			}
	   }
		
		System.out.println(count);
	}

}
