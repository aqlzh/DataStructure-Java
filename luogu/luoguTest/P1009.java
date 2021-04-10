package luoguTest;

import java.util.Scanner;

public class P1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in) ;
        
        int x = sc.nextInt() ;
        int sum = 0 ;
        
        for (int i = 1 ; i <= x ; i++) {
        	sum += Fun(i)  ;
        }
        
        System.out.println(sum);
	}
	
	public static int Fun(int n) {
		if( n == 1) {
			return 1 ;
		}
		return n * (n - 1) ;
	}

}
