package luoguArray;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author LZH.create
  * 注意要输出数量而不是几种。。。
  * 比如1+4=5与2+3=5是一种不是两种！！！！    0  1  思想判重   v[k]
 */
public class P2141 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		int [] arr = new int[n] ;
		int [] v = new int[n] ;
		
		for(int i = 0 ; i< n ;i++) {
			arr[i] = sc.nextInt() ;
		}
		
		Arrays.sort(arr);
		
		// 类冒泡排序  握手
		int count = 0 ;
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = i + 1 ; j < arr.length  ; j++) {
				for(int k = arr.length -1 ; k >= 0 ; k--) {
					if(arr[i] + arr[j] == arr[k] && v[k] ==0&& k!=i && k!=j) {
						count++ ; 
					    v[k] = 1 ;
					}
//					System.out.println("======");
//					System.out.println(arr[i]);
//					System.out.println(arr[j]);
//					System.out.println(arr[k]);
//					System.out.println("--------");
					
				}
			}
		}
		System.out.println(count);
	}

}
