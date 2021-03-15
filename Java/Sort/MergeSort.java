package Sort;


import java.util.Arrays;


/**
 * @author LZH.create
 *  Date : 2021.3.14
 *    好好学习，天天向上
 */
public class MergeSort {

	
	public static void sort(int [] arr) {

		
	}
	
	
	private static void sort(int [] a,int lo ,int hi) {
		
	}
	
	
	private static void merge(int [] a,int lo ,int mid ,int hi ) {
		
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


class Test5{
	
	public static void main(String [] args) {
		  int a [] = {9,1,2,5,7,4,8,6,3,5} ;
		  
		     SelectionSort.sort(a) ;      // 注意外层有  主函数
		     System.out.println(Arrays.toString(a));
		      
	}
}
