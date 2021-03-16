package Sort;


import java.util.Arrays;


/**
 * @author LZH.create
 *  Date : 2021.3.14
 *    �ú�ѧϰ����������
 *    lo --> low   hi  --. high
 */
public class MergeSort {

	
	// ��������
	private static int [] assets ; 
	
	
	
	//  �������ڵ�Ԫ�ؽ�������  
	public static void sort(int [] a) {

		// ��ʼ����������
		assets = new int[a.length] ;
		// ��ȡ lo �� hi
		int lo = 0;
		int hi = a.length - 1 ;
		
		// ��������
		sort(a,lo,hi) ;
		
	}
	
	
	
	// ������ a  ������lo �� ����hi  ֮���Ԫ�ؽ������� ( �������ڵ�Ԫ�ؽ������� )
	private static void sort(int [] a,int lo ,int hi) {
		
		if( hi <= lo) {
			return ;
		}
		
	   int mid = lo + (hi - lo) / 2   ;   // int mid = (hi + lo) / 2 ;  
		sort(a,lo,mid) ;
		sort(a,mid + 1 , hi) ;
		merge(a ,lo ,mid ,hi ) ;
	}
	
	
	
	// ������ lo �� mid  Ϊһ�� ���� ������ mid + 1 �� hi  Ϊһ������  ��������a ����������ϲ�Ϊһ������Ĵ���
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
		
		
		// ѭ���������ж���Ĵ���
		
		while( p1 <= mid) {
			// ������ûѭ����
			assets[i++] = a[p1++] ;
		} 
		
		
		while(p2 <= hi) {
			// ������ûѭ����
			assets[i++] = a[p2++]  ;
		}
		
		// �����������ֵ���Ƶ� ԭ������
		
		for (int j = lo ; j <= hi ; j++ ) {
			a[j] = assets[j] ;
	 	}
		
	}
	
	
	
	
	// �ж� v �Ƿ� С��  w
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
		  
		    MergeSort.sort(a) ;      // ע�������  ������
		     System.out.println(Arrays.toString(a));
		      
	}
}
