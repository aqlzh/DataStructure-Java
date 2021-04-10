package luoguString;

import java.util.Scanner;

/**
 * @author LZH.create
 *Date : 2021.4.3
 *   首先 穷举 打表思路
  *注意不能写  else  因为   '\n' , '\r'  
 */
public class P1765 {

	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in) ;
        
		//  打表
		int [] num = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4}   ;
		int ans = 0 ;
		
		
		String str = sc.nextLine() ;
		
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') ans+=num[str.charAt(i) -'a'] ;  
			if(str.charAt(i) == ' ') ans++ ;
		}

		System.out.println(ans);
	}

}
