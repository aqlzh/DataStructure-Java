package SimulationGame11;

import java.util.Scanner;

public class Themultiple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		
		int ans = 0 ;
		
		for(int i = 1 ; i <= n ;i++) {
			if(i%a!=0 && i%b!=0 &&i%c!=0) ans++ ;
		}
		
		System.out.println(ans);
	}

}
