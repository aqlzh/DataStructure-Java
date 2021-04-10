package Sort;

import java.util.Arrays;

public class SelectionSort {

	
	public static void sort(int [] arr) {
		
		for(int i = 0 ; i <= arr.length - 1 ; i++ ) {
			int Minindex = i ;
			for (int j = i + 1 ; j <= arr.length-1 ; j++) {
				if(greater(arr[Minindex] ,arr[j])) {
					Minindex = j ;
				}
			}
			exch(arr,i, Minindex) ;
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


class Test2{
	
	public static void main(String [] args) {
		  int a [] = {4,5,8,7,9,2,1} ;
	      SelectionSort.sort(a) ;      // 注意外层有  主函数
	      System.out.println(Arrays.toString(a));
	      
	      
	      
	      System.out.println("=======方法二======");
	      
	      for(int i = 0; i < a.length - 1; i++) {// 做第i趟排序
              int k = i;
              for(int j = k + 1; j < a.length; j++){// 选最小的记录
                  if(a[j] < a[k]){
                      k = j; //记下目前找到的最小值所在的位置
                  }
              }
              //在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
              if(i != k){  //交换a[i]和a[k]
                  int temp = a[i];
                  a[i] = a[k];
                  a[k] = temp;
              }
          }
	      
	      for(int num:a){
              System.out.print(num+" ");
          }
	}
}
