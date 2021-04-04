package luoguString;

import java.util.Scanner;

/**
 * @author LZH.create
 * Date 2021.4.3
 *     关键 判断三个连续的字母
 */
public class P1321 {
	
	
	

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in) ;
		
		String str = sc.nextLine() ;
		int boy = 0 ;
		int girl = 0 ; 
		
		for(int i = 0 ; i < str.length() -3 ; i++) {
			if(str.charAt(i) == 'b' || str.charAt(i+1) == 'o' || str.charAt(i+2) == 'y') boy ++ ;
			if(str.charAt(i) == 'g' || str.charAt(i+1) == 'i' || str.charAt(i+2) == 'r' || str.charAt(i+3) == 'l') girl ++ ;
				
		}
		
		System.out.println(boy);
		System.out.println(girl);
		
	}

}
