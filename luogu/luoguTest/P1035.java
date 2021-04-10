package luoguTest;

import java.util.Scanner;

/**
 * @author LZH.create
 *  Date:2021 .3.25
 *  强转  类型  ； while 循环
 */
public class P1035 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
       Scanner sc =new Scanner(System.in) ;
       int k = sc.nextInt() ;
       
       double sum = 1 ;
       double i = 2 ;
       
       while(sum <= k) {
    	   
    	   sum +=  1/i ;
    	   i++ ;
    	   
       }
      
       System.out.printf("%d",(int) (i-1));
	}

}
