package luoguTest;

import java.util.Scanner;

public class P5720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in) ;
       
      double a = sc.nextInt() ;
      int count = 0 ;
       
       while(a >= 1) {
    	   a = Math.floor(a/2) ;
    	   count ++ ;
       }
       System.out.println(count);
       
	}

}
