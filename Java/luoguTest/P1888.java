package luoguTest;

import java.util.Scanner;

public class P1888 {

	public static void main(String[] args) {

		Scanner  sc = new Scanner(System.in) ;
		
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		
		

        //double r = Min(a,b,c) / Max(a,b,c)  ;
		yuefen(Min(a,b,c),Max(a,b,c)) ;
		
		
	}
	
	
	public  static  int  Max(int a, int b ,int c) {
		int max = 0 ;
		if(a > c  && a > b) {
			 max = a ;
		} else if ( b > c  && b > a ) {
			 max = b ;
		} else {
		      max = c ;
		}  
		
		return max ; 
			
	}  
	
	
	public  static  int  Min(int a, int b ,int c) {
		int min = 0 ;
		if(a < c  && a < b) {
			 min = a ;
		} else if ( b < c  && b < a ) {
			 min = b ;
		} else {
		      min = c ;
		}  
		
		return min ; 
			
	}
	
	
	public static void yuefen(int a , int b) {
		
		int max = a > b ? a : b ;
		
		for(int i = max ; i >= 2 ; i--){
			if(a%i==0 && b%i == 0) {
				a =a / i ;
				b = b / i ;
			}
			
		}
		System.out.println(a +"/"+ b);
	}

}
