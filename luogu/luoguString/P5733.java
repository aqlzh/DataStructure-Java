package luoguString;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date : 2021.3.31
 * 65  A  97 a  ;    129  
 */
public class P5733 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		String str = sc.next() ;
		char [] a = new char[str.length()] ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			a[i] = str.charAt(i) ;
		}
		
		for(int i = 0 ; i < str.length() ; i++) {
			if((int)str.charAt(i) >= 97 &&(int)str.charAt(i) <= 129) a[i] = (char)(str.charAt(i) -32) ;
		}
		
	
		for(char i : a) {
			System.out.print(i);
		}
        System.out.println();
		System.out.println(str.toUpperCase());
		
	}

}
