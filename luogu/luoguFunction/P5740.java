package luoguFunction;

import java.util.Scanner;

/**
 * @author LZH.create
 * Date： 2021.4.5
 * Java  将字符串数字 转化为 整型数字   int num =  Integer.parseInt(str) ;
   */
public class P5740 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		
		String [][] strs = new String[n][4] ;
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < 4 ;j++) {
				strs[i][j] = sc.next() ;
			}
		}
		
	
		 // 定义存储  总分 数组
		double [] sum =new double[n] ; 
		for(int i = 0 ; i < n ;i++) {
			for(int j = 1 ; j < 4 ;j++) {
				sum[i] += Double.parseDouble(strs[i][j]) ;
			}
		}
		
		for(int i = 0 ; i < 4 ;i++) { 
			System.out.print(strs[fun(sum)][i]+ " ");
		}
      		
 	}
	
	
	// 传入一个数组 求最大数下标
	public static  int fun(double [] arr) {
		int n = arr.length ;
		double max = arr[0] ;
		int j = 0;
		
		for(int i = 1 ; i < n ;i++) {
			if(arr[i] > max) {
				max=arr[i] ;
				j = i ;
			}
		}
		
		return j ;
	}
}
