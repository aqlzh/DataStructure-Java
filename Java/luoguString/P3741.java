package luoguString;

import java.util.Scanner;



/**
 * @author LZH.create
 * Date : 2021.4.3   
  *    ������� �������   VV KK VK   Ȼ��ʹ�ñ��˼�� X
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
        		//str.charAt(i) == 'X' ;   // ���ܶ��ַ��� ��λֱ�Ӹ�ֵ
        		strs[i] = 'X' ;
        		strs[i+1] = 'X' ;
        		ans++ ;        		
        	}
        }
        
        
        for(int i = 0 ; i < n ; i++) {
        	if(str.charAt(i) != 'X' && str.charAt(i) == str.charAt(i+1)) {   // VV  KK
        		ans++ ;
        		break ;     //һ��Ҫ��  ��ֹ����
        	}
        }
        
        
        System.out.println(ans);
	    
	}

}
