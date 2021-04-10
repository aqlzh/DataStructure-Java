package luoguArray;

import java.util.Scanner;



/**
 * @author LZH.create
 *  注意数组 的临界点
 */
public class P1428 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		int [] arr = new int [n] ;
		int [] r = new int [n] ; 
		
		//初始化数组
		for(int i = 0 ; i < n ; i++) {
			r[i] = 0 ;
		}
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		for(int i = 0 ;i < n ;i++) {
			for(int j = i ; j >= 0 ; j--) {    // j>= 0
				if(arr[i] >arr[j]) {
					r[i] ++ ;
				}
			}
		}
		
		for(int i : r) {
			System.out.print(i +" " );
		}
	}

}
