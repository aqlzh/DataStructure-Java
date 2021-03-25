package luoguTest;

import java.util.Scanner;


/**
 * @author LZH.create
 *  2021.3.20
  */
public class P5718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in) ;
        
        int n = sc.nextInt() ;
//        System.out.println();
        int [] arr = new int [n] ;  
        
        for(int i = 0 ; i < n ; i++) {
        	arr[i] = sc.nextInt() ;
        }
        
        for(int i =1 ;i < n ;i++) {
        	if(arr[0] > arr[i]) {
        		int temp = arr[0] ;
        		arr[0] = arr[i] ;
        		arr[i] = temp ;
        	}
        }
        
        System.out.println(arr[0]);
	}

}
