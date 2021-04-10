package PastExam;

import java.util.Scanner;

/**
 * @author LZH.create
 * A 65  Z 90        a 97   z 122
 */
public class B6_20 {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in) ;
		
		 String str =  sc.nextLine() ;
		 
		 int num1 = 0 ;   // ´óÐ´
		 int num2 = 0 ;   // Ð¡Ð´
		 int num3 = 0 ;   // Êý×Ö
		 
		 for(int i = 0 ; i< str.length() ; i++) {
			 if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ) num1 ++ ;
			 if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) num2 ++ ;
			 if(str.charAt(i) >= '0' && str.charAt(i) <= '9' ) num3 ++ ;
              
		 }
		 
		 System.out.println(num1);
		 System.out.println(num2);
		 System.out.println(num3);
		
		
	}

}
