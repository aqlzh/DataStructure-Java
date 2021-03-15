package Sort;


import java.util.Arrays;

public class ShellSort {

	
	public static void sort(int [] arr) {

		// ����  h  
		int n = arr.length ;
		int h = 1 ;
		while( h < n/2) {
			h = 2*h + 1;
		}
		
		// ��ʼ����
		while (h >= 1) {
			for (int i = h ; i < n ; i++) {
				// ���� arr[i] Ϊ�������Ԫ��
				for( int j = i ; j >= h ; j = j - h) {
					// ���� arr[j] Ϊ�������Ԫ��
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
		  
		     SelectionSort.sort(a) ;      // ע�������  ������
		     System.out.println(Arrays.toString(a));
		      
	}
}
