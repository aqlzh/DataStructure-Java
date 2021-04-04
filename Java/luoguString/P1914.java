package luoguString;

import java.util.Scanner;



/**
 * @author LZH.create
 * Date: 2021/4/1
 * 97+26-1  --> 122
 */
public class P1914 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		String str = sc.next() ;
		
		char [] a = new char[str.length()] ;
		for(int i =0 ; i < str.length() ; i++) {
			a[i] = str.charAt(i) ;
		}
		
		for(int i = 0 ; i < str.length() ; i++) {
		  if(str.charAt(i) + n <= 122)  a[i] = (char)(str.charAt(i) + n) ;
		  if(str.charAt(i) + n > 122)   a[i] = (char)(str.charAt(i) + n -123 + 'a') ;
		}
		
		for(char i : a) {
			System.out.print(i);
		}
	}

}
