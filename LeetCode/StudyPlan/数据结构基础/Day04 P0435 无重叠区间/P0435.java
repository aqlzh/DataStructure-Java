package leetcodePlan.Base;

import java.util.Arrays;
import java.util.Comparator;

public class P0435 {

/**
 * Date : 2021/9/2	
 *   此题，在贪心试题集 已经分析过
 *    
 */
	
	public static void main(String[] args) {

		int [][] arr = {{1,2}, {2,3}, {3,4}, {1,3}} ;
		System.out.println(fun(arr));
	}
	
	
	public static int fun(int[][] arr) {
		if(arr.length ==0) {
			return 0 ;
		}
		
		//  按照尾区间  进行增序   
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int [] o1,int [] o2) {
				return o1[1] - o2[1] ;
			}
			
		});
		
		int count = 1 ;   // 设置保留的个数
		int  pre = arr[0][1] ;
 		
		
		for(int i =0 ; i < arr.length ;i++) {
			if(arr[i][0] >= pre) {
				count++ ;
				pre = arr[i][1] ;
			}
		}
		
		return arr.length - count ;
	}

}
