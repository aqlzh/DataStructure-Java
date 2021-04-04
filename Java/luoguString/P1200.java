package luoguString;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date : 2021.4.4
 * A 65
 */
public class P1200 {

 	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		String str = sc.nextLine() ;
		String temp = sc.nextLine() ;
		int sum = 1;
		int sum2 = 1;
		
		for(int i = 0 ; i < str.length() ; i++) {
			sum *= (str.charAt(i) - 64) ;
		}
		
		for(int i = 0 ; i < temp.length() ; i++) {
			sum2 *= (temp.charAt(i) - 64) ;
		}
		
		if(sum%47 == sum2%47) {
			System.out.println("GO");
		}else {
			System.out.println("STAY");
		}
	}

}
