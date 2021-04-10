package SimulationGame11;

import java.util.Scanner;

public class wigglingInteger {

	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in) ;
		
		int m = sc.nextInt() ;
		int n = sc.nextInt() ;
		
		int [] a = new int[m] ;
		
		for(int i = 0 ; i < m ; i++) {
			a[i] = i+1 ;
		}
		
		
		int ans = 0 ;
		for(int i = 1 ; i <= n/2-1 ;i++) {
			if(a[2*i] < a[2*i-1] && a[2*i+1]>a[2*i] ) ans ++ ; 
		}
		
		System.out.println(ans);
	}
}
