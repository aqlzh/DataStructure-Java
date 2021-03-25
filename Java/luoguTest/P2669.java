package luoguTest;

import java.util.Scanner;

public class P2669 {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in) ;
		
		int k = sc.nextInt() ;
		int sum = 0 ;
		int sum1 = 0 ;
		
		
		int temp = 0;   //记录  1  22 333    中   6  
		int i = 1 ;   // 记录  1  22 33  中    3  
		int y = 0 ;   //记录 多余的余数
		int z = 0 ;   //记录 前缀总和      1 22 333 444   中  6
		
		while(temp <=k ) {
		 temp = ((1+i)*i)/2  ;
		 i++ ;		
	   }  
		
		// input  8    9
//		System.out.println(temp);   // 10 10
//		System.out.println(k);   //8   9
//		System.out.println(i);   // 5  5
//		System.out.println(i-2);   //3   3
		
         z = ((1+(i-2))*(i-2))/2  ;
         
        // System.out.println(z);  // NAN  6
		
		if(temp  > k) {
		  y = k - z ; 
		  
		  sum1 = y * (i-1) ;
		}
		
		//System.out.println(y);   //5   6
		
		 for(int j = 0 ; j <= i-2 ;j++ ) {
			 sum += j * j ;
		 }
	
		System.out.println(sum+sum1);
		
	}
}
