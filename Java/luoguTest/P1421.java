package luoguTest;

import java.util.Scanner;

public class P1421 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		
		int t = a*10+ b ;
		double  s = t/19 ;
		int s1 = (int) s ;
		
		System.out.format("%d",s1);
	}

}
