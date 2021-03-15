package Sort;


import java.util.Arrays;

public class InsertSort {

	
	public static void sort(int [] arr) {
		for (int i = 1 ; i < arr.length ; i++) {
			for(int j = i ; j> 0 ; j--){
				if(greater(arr[j-1],arr[j])) {
					exch(arr,j-1,j) ;
				} else {
					break ;
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


class Test3{
	
	public static void main(String [] args) {
		  int a [] = {4,5,8,7,9,2,1} ;
		  
		     SelectionSort.sort(a) ;      // 注意外层有  主函数
		     System.out.println(Arrays.toString(a));
		      
	}
}
