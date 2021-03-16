package Sort;


import java.util.Arrays;


/**
 * @author LZH.create
 *  Date : 2021.3.14
 *    好好学习，天天向上
 *    lo --> low   hi  --. high
 */
public class MergeSort {

	
	// 辅助数组
	private static int [] assets ; 
	
	
	
	//  对数组内的元素进行排序  
	public static void sort(int [] a) {

		// 初始化辅助数组
		assets = new int[a.length] ;
		// 获取 lo 与 hi
		int lo = 0;
		int hi = a.length - 1 ;
		
		// 进行排序
		sort(a,lo,hi) ;
		
	}
	
	
	
	// 对数组 a  从索引lo 到 索引hi  之间的元素进行排序 ( 对区间内的元素进行排序 )
	private static void sort(int [] a,int lo ,int hi) {
		
		if( hi <= lo) {
			return ;
		}
		
	   int mid = lo + (hi - lo) / 2   ;   // int mid = (hi + lo) / 2 ;  
		sort(a,lo,mid) ;
		sort(a,mid + 1 , hi) ;
		merge(a ,lo ,mid ,hi ) ;
	}
	
	
	
	// 从索引 lo 到 mid  为一个 子组 ，索引 mid + 1 到 hi  为一个子组  ，把数组a 这两个子组合并为一个有序的大组
	private static void merge(int [] a,int lo ,int mid ,int hi ) {
		
		int i = lo ;
		int p1 = lo ;
		int p2 = mid + 1 ;
		
		
		while( p1 <= mid && p2 <= hi) {
			if(less(a[p1],a[p2])) {
				assets[i++] = a[p1++] ;
			} else {
				assets[i++] = a[p2++] ;
			}
		}
		
		
		// 循环上述还有多余的处理
		
		while( p1 <= mid) {
			// 左子树没循环完
			assets[i++] = a[p1++] ;
		} 
		
		
		while(p2 <= hi) {
			// 右子树没循环完
			assets[i++] = a[p2++]  ;
		}
		
		// 将辅组数组的值复制到 原数组中
		
		for (int j = lo ; j <= hi ; j++ ) {
			a[j] = assets[j] ;
	 	}
		
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


class Test5{
	
	public static void main(String [] args) {
		  int a [] = {8,4,5,7,1,3,6,2} ;
		  
		    MergeSort.sort(a) ;      // 注意外层有  主函数
		     System.out.println(Arrays.toString(a));
		      
	}
}
