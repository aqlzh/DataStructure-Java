package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author LZH.create
 *   翻转数组   (2种方式)
 * Data： 2021.3.7 
 * 思考 API 的调用
 */ 
public class ReversalArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5} ;
		int [] arr2 = {3,6,9,12}  ;
	
		
		
		
	    int [] res =  fun(arr) ;
	      
	    System.out.println("方法一");
	    
	    for(int i =0 ;i<res.length ; i++) {
	    	System.out.println(res[i]);
	    }
		
	    
	    
	   
	    
	    System.out.println("方法二"); 
	    
	    int [] res2 = fun2(arr2) ;
	        
	    //  高级for 循环   输出
	    for (int i : res2 ) {
	    	System.out.println(i); 
	    }
	    
	    
	    

	}
	
	
	
	
	
	private  static int [] fun(int [] arr ) {
		
		for(int i = 0 ,j = arr.length-1 ; i<j ; i++ ,j--) {
			int temp ;
			temp = arr[i] ;
			arr[i] = arr[j] ;
			arr[j] = temp ;
			
		}
		
		return  arr ;
	}
	
	
	
	private static int [] fun2(int [] arr ) {
		
		for(int i = 0 ; i < arr.length / 2 ; i++) {
			int temp ;
			temp = arr[i] ;
			arr[i] = arr[arr.length -1 - i] ;
			arr[arr.length -1 - i] = temp ;
		}
		return arr ;
	}
	
	
        
}
