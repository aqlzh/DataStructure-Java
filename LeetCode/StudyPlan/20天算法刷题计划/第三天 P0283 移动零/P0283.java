package leetcodePlan;

import java.util.Arrays;

/*
 * Date : 21.8.19
 * Author: LZH.create
 */

public class P0283 {

	public static void main(String[] args) {

		int [] arr = {0,1,0,3,12} ;
		fun1(arr) ;
		fun2(arr) ;
	}
		
    //  解法一 ：暴力解法  定义一个辅组数组
	
	public static void fun1(int [] arr) { 
		int [] tmp = new int [arr.length] ;
		
		int j = 0 ;
		for(int i =0 ; i < arr.length ; i++) {
			if(arr[i] != 0) {
				tmp[j] = arr[i] ;
				j++ ;
			}
		}
		System.out.println(Arrays.toString(tmp));
	}
	
	
	// 解法二 ：双指针法 （快慢指针）
	public static void fun2(int [] arr) { 
		
		
		int flow = 0 ;
		for(int fast =0 ; fast < arr.length ; fast++) {
		
			if(arr[fast] != 0) {
				int tmp = arr[fast] ;
				arr[fast] = arr[flow] ;
				arr[flow] = tmp ;
				flow++ ;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
