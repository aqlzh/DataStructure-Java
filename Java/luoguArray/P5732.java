package luoguArray;

import java.util.Scanner;

public class P5732 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		int [][] a = new int[n+1][n+1] ;
	    	
	    for(int i = 1 ; i <= n ; i++) {
	    	for(int j = 1 ; j <= i ; j++) {
	    		a[i][1] = 1; 
	    		if(i ==j) a[i][j] = 1 ;
	    		if(i!=1 && a[i][j] != 1 ) a[i][j] = a[i-1][j]+a[i-1][j-1] ;
	    	}
	    }
	    
	    for(int i = 1 ; i <= n ;i++) {
	    	for(int j = 1 ; j<= i ;j++) {
	    		System.out.print(a[i][j]+ " ");
	    		if(j==i) System.out.println();
	    	}
	    }
	}

}
