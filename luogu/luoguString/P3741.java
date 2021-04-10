package luoguString;

import java.util.Scanner;



/**
 * @author LZH.create
 * Date : 2021.4.3   
  *    穷举所有 排列情况   VV KK VK   然后使用标记思想 X
 */ 
public class P3741 {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in) ;
		
	    int n = sc.nextInt() ;
	    String str = sc.next() ;
	    char [] strs = new char[n] ;
	    
	    int ans  = 0 ;
	    
	    for(int i = 0 ; i < n ; i++) {
	    	strs[i] = str.charAt(i) ;
	    }
	    
        for(int i = 0 ; i < n-1 ; i++) {
        	if(str.charAt(i) == 'V' && str.charAt(i+1) == 'K') {
        		//str.charAt(i) == 'X' ;   // 不能对字符串 部位直接赋值
        		strs[i] = 'X' ;
        		strs[i+1] = 'X' ;
        		ans++ ;        		
        	}
        }
        
        
        for(int i = 0 ; i < n ; i++) {
        	if(str.charAt(i) != 'X' && str.charAt(i) == str.charAt(i+1)) {   // VV  KK
        		ans++ ;
        		break ;     //一定要加  防止连串
        	}
        }
        
        
        System.out.println(ans);
	    
	}

}
