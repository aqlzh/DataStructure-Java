package luoguString;

import java.util.Scanner;

/**
  * @author LZH.create
  *Date 2021.4.3 
    *    关键为 识别输入的 数据类型
     *     注意数字中间的 0 的处理  运用  true  fasle   
  */
public class P1553 {
	
	
//	  public static void main(String[] args) {
//	        Scanner in = new Scanner(System.in);
//	        String str = in.nextLine();
//	        String s[] = new String[2] ;
//	        if(str.indexOf('.')!=-1) { // 识别小数
//	        	s = str.split("\\.");
//	        	turn(s[0]);
//	        	System.out.print(".");
//	        	turn(s[1]);
//	        }else if(str.indexOf('/')!=-1) { // 识别分数
//	        	s = str.split("/");
//	        	turn(s[0]);
//	        	System.out.print("/");
//	        	turn(s[1]);
//	        }else if(str.indexOf('%')!=-1) { // 识别百分数
//	        	s = str.split("%");
//	        	turn(s[0]);
//	        	System.out.print("%");
//	        }else { // 识别整数
//	        	turn(str);
//	        }
//	    }
//	    // 字符反倒
//	    public static void turn(String str) {
//	    	boolean flag1 = false; // 标志前面多余的0
//	    	boolean flag2 = false; // 标志后面多余的0
//	    	String s = "";
//	    	// 去除前面多余的0
//	    	for(int i=0;i<=str.length()-1;i++) { 
//	    		if(!flag1 && str.charAt(i)=='0') {
//	    			continue;
//	    		}
//	    		flag1 = true;
//	    		s += str.charAt(i); // 表示已去除前面0的字符串
//	        }
//	    	// 去除后面多余的0
//	    	for(int i=s.length()-1;i>=0;i--) {
//	    		if(!flag2 && s.charAt(i)=='0') {
//	    			continue;
//	    		}
//	    		flag2 = true;
//				System.out.printf("%s",s.charAt(i));
//	        }
//	    	if(str == "" || s == "") {
//	    		System.out.print("0");
//	    		return ;
//	    	}
//	    }
	
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		String str = sc.nextLine() ;
		
		String a [] = new String[2] ;   // 将其分为两部分   运用 split() 方法
		
		if(str.indexOf('.') != -1) {   // 小数 
	        a = str.split("\\.")   ;   // 注意  符号为   \ \
	        turn(a[0]) ;
	        System.out.print(".");
	        turn(a[1]) ;
		}else if(str.indexOf('/') != -1)     // indexOf()  内参数  ' '    
		{    // 分数
			// 覆盖之前 
			a = str.split("/") ;
			turn(a[0]) ;
			System.out.print("/");
			turn(a[1]) ;
 		}
		 else if(str.indexOf('%') != -1) {   // 百分数
			a = str.split("%") ;
			turn(a[0]) ;
			System.out.print("%");
//			turn(a[1]) ;
		} else {
			turn(str) ;
		}
		
	}
	
	// 封装 翻转  字符串函数
	public  static void turn(String str) {
		Boolean flag1 = false ;
		Boolean flag2 = false ;
		
		String s  = "" ;
		
		// 前面的 0
		for(int i = 0 ; i < str.length() ; i++) {
			if(!flag1 && str.charAt(i) == '0') {    // 一定为 '0'  而不是 0
 				continue ;
			}
			flag1 = true ;  // 10001  区分中间的 0
			s += str.charAt(i)  ;
		}
		
		// 后面的  0   注意对  s  处理而不是  str
		for(int i = s.length() -1 ; i>=0 ; i--) {      //   i>= 0 有  等号
			if(!flag2 && s.charAt(i) == '0') {
				continue ;
			}
			flag2 = true ;  // 10100  去掉后面的 0
			System.out.printf("%s",s.charAt(i));
		}
		
		if(str == "" || s == "") {
    		System.out.print("0");
    		return ;
    	}	
	} 

}
