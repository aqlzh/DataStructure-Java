package luoguFunction;

import java.util.Scanner;


/**
 * @author LZH.create
 * Tips : 2^2  注意不是 平方
  *  题目保留两位小数
 */
public class P5735 {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in) ;
		
		int [] arr1  = new int[2] ;
		int [] arr2  = new int[2] ;
		int [] arr3  = new int[2] ;
		double dis = 0 ;
		
	    for(int i = 0 ; i < 2 ;i++) {
	    	arr1[i] = sc.nextInt() ;
	    }
	    for(int i = 0 ; i < 2 ;i++) {
	    	arr2[i] = sc.nextInt() ;
	    }
	    for(int i = 0 ; i < 2 ;i++) {
	    	arr3[i] = sc.nextInt() ;
	    }
	    
	    dis =sum(arr1,arr2) + sum(arr1,arr3) + sum(arr2,arr3) ;
	    System.out.format("%.2f",dis);
		
	}
	
	
	public static double sum(int [] a ,int [] b) {
		double result = 0 ; 
		result = Math.sqrt((a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]) ) ;
		return result ;
	}

}

