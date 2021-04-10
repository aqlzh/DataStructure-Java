package luoguArray;

import java.util.Scanner;

public class P5728 {
	
	
	

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in) ;
		int N = sc.nextInt() ;
		
		int[][]  arr = new int [N][3] ;b
		int [] sum = new int [N] ;
		int count = 0;
		
		
	
		
   
	 // 核心业务

		
	
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				arr[i][j] = sc.nextInt() ;
			} 
		}
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = i +1 ; j < N ; j++) {
				if(fu1(arr[i],arr[j]) && fu2(arr[i],arr[j])) {
					count ++ ;
					
				}
			} 
		}
		
		System.out.println(count);
		
		
		
	}
	
//	public static Boolean fun1(int N ,int [] sum) {   //判断  总和 10 以内  
//		for(int i = 0 ; i < N ; i++) 
//			for(int j = i +1  ; j < N ; j++) 
//				if(Math.abs(sum[i]-sum[j])<= 10) return true ;
//				      
//				  return false ;
//					
//	}
//	
//	
//	public static Boolean fun2(int N ,int [][] arr) {   // 判断 个别  5  以内
//		
//		for(int i = 0 ; i < N ; i++) 
//			for(int j = i + 1 ; i < N ;i++) 
//				for(int k = 0 ; k < 3 ; k++) 
//					if(Math.abs(arr[i][k] - arr[j][k]) <= 5) 
//						return true ;		
//		  return false ;
//	}
	
	public static Boolean fu1(int []array1 ,int [] array2 ) { //判断  总和 10 以内  
		    int n = 0 ;
	        int sum1 = 0 ;
	        int sum2 = 0 ;
			for(int j = 0 ; j < 3 ; j++) {
			     sum1 += array1[j] ;
			     sum2 += array2[j] ;
			} 
			
//		
		
			if(Math.abs(sum1 - sum2)<= 10) return true ;	 
		      return false ;
	}
	
	
	public static Boolean fu2(int []array1 ,int [] array2 ) { //判断  个别 5 以内  
		int n = 0 ;
		
		for(int i = 0 ; i < 3 ; i++) {
			if(Math.abs(array1[i] - array2[i]) <= 5) {
				
				n++ ;
				
			}
//			System.out.println(n);
		}
			
			
		
		
	    if(n==3)  return true ;
	      return false ;
	}

}
