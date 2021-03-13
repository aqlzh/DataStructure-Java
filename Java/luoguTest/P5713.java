package luoguTest;

import java.util.Scanner;

public class P5713 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int n  = sc.nextInt() ;
		
		int s1 = 5*n ;
		int s2 = 11 + 3*n ;
		
		if(s1 < s2 ) {
			System.out.println("Local");
		} else {
			System.out.println("Luogu");
			
		}
		
	}

}
