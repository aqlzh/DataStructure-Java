package luoguTest;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in) ; 
		String  a = sc.next() ;
		//System.out.println(a.toUpperCase());
		int temp = (a.charAt(0)-32)  ;
//		String s = String.valueOf(temp) ;
//		System.out.println(s);
//		String str = (String) temp ;
		char s  = (char) temp ;
		System.out.println(s);
	}

}
