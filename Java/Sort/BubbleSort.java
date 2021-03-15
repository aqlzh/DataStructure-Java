package Sort;

import java.util.Arrays;

/**
 * @author LZH.create
 * Date :  2021.3.11
 * API   ���˼��ʵ��  �봫ͳʵ�֣���ʽ����
 *
 */
public class BubbleSort {

	
	public static void sort(int [] arr) {
		
		for(int i = arr.length - 1 ; i > 0 ;i-- ) {
			
	       for(int j = 0 ; j < i ; j++) {
	    	 
	    	 if(greater(arr[j],arr[j+1])) {
				   exch(arr,j,j+1) ;	
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


class Test{
	
	public static void main(String[] args) {
		
		int [] arr = {4,5,6,3,2,1} ;
		
		
		BubbleSort.sort(arr);
		System.out.println(arr);  //�����ַ
	
		System.out.println("=========");
		System.out.println(Arrays.toString(arr));    //  ����������ַ�����ʽ
		
		
		
		System.out.println("===== ��ʽ�� ====");
		
	     int a [] = {4,2,5,8,1} ;

	        for (int i = 0; i <=a.length-1 ; i++) {
	            for (int j = 0; j <a.length-i-1 ; j++) {
	                if(a[j]>a[j+1]){   //����
	                    int t = a[j] ;
	                    a[j] = a[j+1] ;
	                    a[j+1] = t ;
	                }
	            }
	        }
	        for (int i = 0; i <a.length ; i++) {
	            System.out.print(a[i] + " ");
	        }
	        
		
	}
	
}
