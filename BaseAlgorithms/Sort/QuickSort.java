package Sort;


import java.util.Arrays;


/**
 * @author LZH.create
 *  Date : 2021.3.16
 *    静心学习
 *   
 */
public class QuickSort {


	
	//  对数组内的元素进行排序  
	public static void sort(int [] a) {

         //  获取  lo 与  hi
		int lo = 0 ;
		int hi = a.length - 1 ;
		
		sort(a,lo,hi) ;
		
	}
	
	
	
	// 对数组 a  从索引lo 到 索引hi  之间的元素进行排序 ( 对区间内的元素进行排序 )
	private static void sort(int [] a,int lo ,int hi) {
	    
		
		//  递归的终止条件
		if( hi < lo) {
			return ;
		}   
		
		// 对 a 数组中 从 lo 到 hi 进行切分
		
		int p = partition(a,lo,hi) ;
		
		// 对左边分组的元素进行排序
		sort(a,lo,p-1) ;
		sort(a,p + 1,hi) ;
	}
	
	
	
	//   核心代码
	private static int partition(int [] a , int lo , int hi) {
		// 定义基准  左右 指针
		int key = a[lo] ;
		int left = lo ;
		int right = hi + 1 ;
		
		while(true) {
			// 从右往左扫描
			while(less(key,a[--right])) {
				if(right == lo) {
					break ;
				}
			}
			
			// 从左往右扫描
			while(less(key,a[++left])) {
				if(left == hi) {
					break ;
				}
			}
			
			if(left >= right) {
				// 扫描完所有元素，结束循环
				break ;
			} else {
				exch(a,left ,right) ;
			}
		}
	
		// 最后交换 right 和 基准处
		exch(a,lo,right) ;
	  return right  ;
	}
	
	
	
	// 判断 v 是否 小于  w
	private static boolean less(int v ,int w) {
		
		return v < w ;
		
	}
	
	private static void exch(int[] a, int i , int j) {
		int temp = a[i] ;
		a[i] = a[j] ;
		a[j] = temp ;
	}
	
	
	

}


class Test6{
	
	public static void main(String [] args) {
		  int a [] = {6,1,2,7,9,3,4,5,8} ;
		  
		    MergeSort.sort(a) ;      // 注意外层有  主函数
		     System.out.println(Arrays.toString(a));
		      
	}
}
