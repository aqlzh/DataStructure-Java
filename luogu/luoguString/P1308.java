package luoguString;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date : 2021.4.2
 * 关键如何实现   不区分大小写功能     nextLine()   全部用  （不要一下 next() , 一下nextLine() ）
 * split() 使用    全部转化小写    
 */
public class P1308 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
	    
		String temp = sc.nextLine() ;
		String temp1 = temp.toLowerCase() ;
		


		String str = sc.nextLine() ;
		String str1 = str.toLowerCase() ;
	
		
		String [] str2 = new String[str.length()] ;
		int count = 0 ;
		
		
		for(int i = 0 ; i < str.length() ; i++) {
		   str2 = str1.split(" ") ;    	
		}
		for(String i : str2) {
			if(i.equals(temp1)) count ++ ;
			
		}
		
		

		if(str1.indexOf(temp1) != -1 && count != 0)  {
			System.out.println(count + " " + str1.indexOf(temp1));
		} else {
			System.out.println(-1);
		}
		
		
	}

}
