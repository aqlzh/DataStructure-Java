package BaseFunction;

import java.util.Scanner;

public class yuefen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in)  ;
		
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		
		
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
