package luoguString;

import java.util.Scanner;




/**
 * @author LZH.create
 * Date: 2021.4.2
 *    空格 nextLine()  可以录入 ；  next()  则不能
 */
public class P5015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		String str = sc.nextLine() ;
		int count = 0 ;
		//System.out.println(str.length());
		
		for(int i = 0; i< str.length() ; i++) {

			if(str.charAt(i)!=' ') count ++ ; 
		}
		System.out.println(count);
	}

}
