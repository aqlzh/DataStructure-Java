package luoguArray;

import java.util.Scanner;

public class P5730 {

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		String str = sc.next() ;
		
		
		for(int i = 0 ; i <= 9 ;i++) {
			String s = str.substring(i, i+1) ;
			
	        if(s.equals(1)) {   // 不能用 == （内含判断地址）
	        	System.out.println("good");      			
	        } 
		}
		
	}

}
