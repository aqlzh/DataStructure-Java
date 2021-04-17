package Algorithm;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @author LZH.create
 *       无重叠区间问题
 *       贪心算法
 */
public class eraseOverlapIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		//  测试数据
		int [][] arr1 = {{1,2},{2,4},{1,3}} ;
		System.out.println(fun(arr1));
		
		int [][] arr2 = {{1,2},{1,2},{1,2}} ;
		System.out.println(fun(arr2));
		
		int [][] arr3 = {{1,2},{2,3}} ;
		System.out.println(fun(arr3));
	}
	
	
	public static int fun(int [][] arr) {
		
		
		if(arr.length == 0) {
			return 0 ;
		}
		
		Arrays.sort(arr ,new Comparator<int []>(){
			@Override 
			public int compare(int [] o1,int [] o2) {
				return o1[1]-o2[1] ;
			}
		});
		
		
		int count = 1 ;
		int pre = arr[0][1] ;
		
		for(int i =1 ; i < arr.length ;i++) {
			if(arr[i][0] >= pre) {
				count ++ ;
				pre = arr[i][1] ;
			}
		}
     return arr.length - count ;	
}
	
}
