package luoguTest;

import java.util.Scanner;

public class P1307 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in) ;
		
		long a = sc.nextLong() ;
		
		
		//str.indexOf("1")   返回第一次 出现 "1"  的次数
		String str = ""+a ;
		
		int l = str.length() ;
		
		//System.out.println(l);
		
		if(a < 0) {
			a = -1 * a ;
			 System.out.print("-");
			 while( a != 0) {				
				 if(a%10!=0) System.out.print(a%10); 
				 a=a/10;
			 }
		} else if(a == 0) {
			System.out.println(0);
		} else {
			 while( a != 0 ) {		 // 10001
				 if(a%10!=0 ) {
					 System.out.print(a%10); 	
					 l-- ;	
				 } 
				 
				 if(a%10==0 && l < str.length()) {
					 System.out.print(0);
					
				 }
				 a=a/10;
				
			
			 }
		}
		
	
		
		 
		 
		 
		 
		
		
	}

}
