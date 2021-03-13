package luoguTest;

import java.util.Scanner;

public class P1055 {


		public static void main(String args[]) {
			
//			Scanner input = new Scanner(System.in);
//			String s = input.nextLine();
//			int sum=0;
//			char c;
//			sum=(s.charAt(0)-'0')*1+(s.charAt(2)-'0')*2+(s.charAt(3)-'0')*3+(s.charAt(4)-'0')*4+(s.charAt(6)-'0')*5+(s.charAt(7)-'0')*6+(s.charAt(8)-'0')*7+(s.charAt(9)-'0')*8+(s.charAt(10)-'0')*9;
//			if(sum%11<10)
//				c=(char)(sum%11+'0');
//			else
//				c='X';
//			if(s.charAt(12)==c)
//				System.out.println("Right");
//			else {
//				String r=s.substring(0, 12)+c;
//				System.out.println(r);
//			}
			
			
			//  x-xxx-xxxxx-x
			
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine() ;
			
			int sum = 0 ;
			int j =1 ;
			char c ;
			for(int i = 0 ; i <= 10 ; i++) {    // -  的阻碍
				
//				if(i !=1 || i != 5  ) {
//					if(i>1 ) {
//						i++ ;
//						sum +=  (str.charAt(i) - '0' ) * (i+1) ;   //处理
//					}
//					if(i>5 ) {
//						i++ ;
//						sum +=  (str.charAt(i) - '0' ) * (i+1) ;   //处理
//					}
//				}
				
				if(str.charAt(i) == '-') {
					
					continue ; 
				}
				
				sum +=  (str.charAt(i) - '0' ) * j++ ;   //处理
				
				
			}
			
			if(sum%11 < 10) {
				// 字符串   字符  因为后续需要拼接
				c = (char) (sum%11+'0') ;   // 数字 + 48 再转换
			} else {
				c = 'X' ;
			}
			
			
			if(str.charAt(12) == c) {   // 注意 -  也是字符串一员
				System.out.println("Right");
			} else {
				String res = str.substring(0,12) + c ; 
				System.out.println(res);
			}
			
		}
	

}
