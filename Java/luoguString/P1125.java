package luoguString;

import java.util.Arrays;
import java.util.Scanner;

public class P1125 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		String str = sc.next() ;
	
		char [] a = new char[str.length()] ;
		int [] res = new int[100] ;
		int [] res2 = new int[100] ;
		
		
		for(int i = 0 ; i < str.length() ;i++) {
			a[i] = str.charAt(i) ;
		}
		
        for(int i = 0 ; i < str.length() ;i++) {
			int index  = (int)(a[i]-64) ;
			res[index] ++ ;
		}
        
        Arrays.sort(res);
        
//        System.out.println(res[res.length-1]);
        
        int j = 0 ;
        for(int i : res) {
        	
     	  if(i!=0)  {
     		  res2[j] = i ;
     		  j++ ;
     	  }
        }
        

//      System.out.println(res2[0]);


		if(ss(res[res.length-1] - res2[0])) {
			System.out.println("Lucky Word");
			System.out.println(res[res.length-1] - res2[0]);
		} else {
			System.out.println("No Answer");
			System.out.println(res[res.length-1] - res2[0]);
		}
		
		
	//System.out.println(ss(0));
        
	}
	
	
	// ÅÐ¶ÏÖÊÊý
	public static Boolean ss(int n) {
		if(n==1 || n==0) return false ;  
		for(int i = 2 ; i <= Math.sqrt(n);i++) 
			if(n%i==0) return false ;
			  return true ;	
	}

}
