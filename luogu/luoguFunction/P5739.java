package luoguFunction;

import java.util.Scanner;

public class P5739 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
        
		int n = sc.nextInt() ;
		
		System.out.println(fun(n));
	}
	
	
	public static int fun(int n) {
		if( n == 1) return 1 ; 
		return   n * fun(n-1) ;    // ×¢Òâ²»ÊÇ fun(n) * fun(n-1)
	}

}
