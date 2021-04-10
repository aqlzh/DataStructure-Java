package luoguTest;

import java.util.Scanner;

public class P5710 {

	
	public static void main(String[] args) {
		
      Scanner sc =  new Scanner(System.in) ;
        
      double a = sc.nextDouble() ;
//      double b = sc.nextDouble() ;
//      double c = sc.nextDouble() ;
      
      int t1,t2  ;
      int s1,s2,s3,s4  ;
      
      /**
  	 * @param args
  	 *   符合性质   t1 t2  输出 0 
  	 */
      
      
      if( a%2 == 0) {
    	  t1 = 0 ;
      } else {
    	  t1 = 1 ;
      }
      
      
      if(a > 4 && a <= 12) {
    	  t2 = 0 ;
      } else {
    	  t2 = 1 ;
      }
      
      
      // A
     if( t1 + t2 == 0 ) {
    	 s1 = 1 ;
     } else {
    	 s1 = 0 ;
     }
     
     
     // UIM
     if( t1 + t2 == 1 || t1 + t2 == 0  ) {
    	 s2 = 1 ;
     } else {
    	 s2 = 0 ;
     }
     
     
     //  八尾
     if( t1 + t2 == 1 ) {
    	 s3 = 1 ;
     } else {
    	 s3 = 0 ;
     }
     
     
     // 
     if( t1 + t2 == 2 ) {
    	 s4 = 1 ;
     } else {
    	 s4 = 0 ;
     }
     
     
     System.out.format("%d %d %d %d",s1,s2,s3,s4);
     
     
	}

}
