package luoguTest;

import java.util.Scanner;

public class P1425 {

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in) ;
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		int d = sc.nextInt() ;
		int e, f ;
		
		
	     if( d < b ) {
	    	 f = 60 + d - b ;
	    	 e =  c- a - 1 ;
	     } else {
	    	 f = d  - b ;
	    	 e = c - a  ;
	     }
	     
		
		System.out.format("%d %d",e,f);

	}

}
