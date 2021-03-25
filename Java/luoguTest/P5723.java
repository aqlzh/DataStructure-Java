package luoguTest;

import java.util.Scanner;

public class P5723 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in)  ;
		
		int l = sc.nextInt() ;
		
		int sum = 0 ;
		int count = 0;
		
		
		 int i = 0;
		 
		 for( i = 2; i < l ;i++) {
		  	int j = 2 ;
		  	
		  	while(i % j != 0) {
		  		j ++ ;
		  	}
		  	
		  	if(i == j ) {
		  		count ++ ;
		  		
		  		
		  		sum += i ;
		  		
		  		if(sum > l) break ;
		  		
		  		System.out.println(i);
		  	}
		  	
		
		}
		
		
		System.out.println(count - 1);

	}

}
