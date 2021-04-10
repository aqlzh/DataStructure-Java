package luoguFunction;

import java.util.Scanner;

public class P5736 {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		
		int [] arr = new int[n] ;
		
		int ans = 0 ;
		
		for(int i = 0 ; i < n ;i++) {
			arr[i] = sc.nextInt() ;
		}
		
	

		for(int i = 0 ; i < n ;i++) {
			if( ss(arr[i]) ) {
//				ans++ ; 
				System.out.print(arr[i]+ " ");
			}
		}
		
		
//		int [] r  = new int[ans] ;
//		System.out.println(ans);
//		System.out.println("----");
//		for(int i = 0 ; i < ans ;i++) {
//			if(ss(arr[i])) {
//				System.out.println(arr[i]);
//				r[i] = arr[i] ; 
//			}
//		}       错误原因   i<ans  arr[i] 中的 7  超出此范围所以遍历不到
		
		
//		for(int i = 0 ; i < n ; i++) {
//			
//			if(ss(arr[i])) {
//				System.out.println(arr[i]);
//				r[0] = arr[i] ; 
//				
//			}
//		}
		
//		for(int i : r) {
//			System.out.print(i + " ");
//		}
	

	}
	
	public static Boolean ss(int n) {
		
		if(n==0 || n==1) return false ;
		for(int i = 2 ; i<= Math.sqrt(n);i++) 
		    if(n%i == 0) return false ;
		       return true ;		
	}

	
}
