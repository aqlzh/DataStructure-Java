package Sort;


import java.util.Arrays;

public class ShellSort {

	
	public static void sort(int [] arr) {

		// 计算  h  
		int n = arr.length ;
		int h = 1 ;
		while( h < n/2) {
			h = 2*h + 1;
		}
		
		// 开始排序
		while (h >= 1) {
			for (int i = h ; i < n ; i++) {
				// 这里 arr[i] 为待插入的元素
				for( int j = i ; j >= h ; j = j - h) {
					// 这里 arr[j] 为待插入的元素
					if( greater(arr[j - h],arr[j])) {
						exch(arr, j, j-h ) ;
					} else {
						break ;
					}
				}
			}
		}
		
	}
	
	
	private static boolean greater(int v ,int w) {
		
		return v > w ;
		
	}
	
	private static void exch(int[] a, int i , int j) {
		int temp = a[i] ;
		a[i] = a[j] ;
		a[j] = temp ;
	}

}


class Test4{
	
	public static void main(String [] args) {
		  int a [] = {9,1,2,5,7,4,8,6,3,5} ;
		  
		     SelectionSort.sort(a) ;      // 注意外层有  主函数
		     System.out.println(Arrays.toString(a));
		      
	}
}
