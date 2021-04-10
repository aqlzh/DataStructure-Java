package luoguFunction;

import java.util.Arrays;
import java.util.Scanner;

public class P5738 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		int m = sc.nextInt() ;
		
		
		
		// 二维矩阵
		int [][] a = new int[n][m] ;
		
		for(int i = 0 ; i <a.length ;i++) {
			for(int j = 0 ; j < a[0].length ; j++) {
				a[i][j] = sc.nextInt() ;
			}
		}
		
		
		//定义 存储每位同学  成绩矩阵
		double [] r = new double[n] ;
		
		
        for(int i = 0 ; i < n ; i++) {
               r[i] = fun(a,i,m) ;
        }

		Arrays.sort(r) ;
		System.out.format("%.2f",r[r.length-1]);
	}
	
	public static double fun(int [][] arr ,int x,int m) {  // x 为二维矩阵 的当时行   m为整体列
		int [] temp = new int[m] ;
		for(int i = 0 ; i < m ; i++) {
			temp[i] = arr[x][i] ;
 		}
		
		Arrays.sort(temp);
		
		int length = m - 2;
		double sum = 0 ;
		double result = 0 ;
		
		for(int i = 1 ; i < temp.length -1 ; i++) {
			sum += temp[i] ;
		}
		result = sum/length ;
		return result ;
	}

}
