package luoguTest;


import java.util.Arrays;
import java.util.Scanner;

public class P1420 {

	public static void main(String[] args) {
   
		 Scanner sc = new Scanner(System.in)  ;
		 
		 int n = sc.nextInt() ;
		 
		 int [] arr = new int [n] ;
		
		 int num = 0 ;   // ����
		 int max = 1  ;  // max  ������Ϊ �ж϶��  �������ֵ
		 
		 for(int i = 0 ; i < n ;i++) {
			 arr[i] = sc.nextInt() ;
		 }
		 
//		 for(int i = 0 ; i < n-1 ; i++) {
//			 if(arr[i] == arr[i+1] +1) {
//				 count[num] ++ ;				 
//			 }
//			 num++ ;
//		 }
		 
		
		 for(int i = 0 ; i < n- 1 ; i++) {
			 if( arr[i] == arr[i+1] - 1) {  // ������ + 1
				 num ++ ;
			 } else {
				 // û���� ����Ϊ 1
				 num = 1 ;
			 }
			 
			 if(num > max) max = num ;
		 }
		 
		 
		 System.out.println(max);
		
 	}

}
