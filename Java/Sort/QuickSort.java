package Sort;


import java.util.Arrays;


/**
 * @author LZH.create
 *  Date : 2021.3.16
 *    ����ѧϰ
 *   
 */
public class QuickSort {


	
	//  �������ڵ�Ԫ�ؽ�������  
	public static void sort(int [] a) {

         //  ��ȡ  lo ��  hi
		int lo = 0 ;
		int hi = a.length - 1 ;
		
		sort(a,lo,hi) ;
		
	}
	
	
	
	// ������ a  ������lo �� ����hi  ֮���Ԫ�ؽ������� ( �������ڵ�Ԫ�ؽ������� )
	private static void sort(int [] a,int lo ,int hi) {
	    
		
		//  �ݹ����ֹ����
		if( hi < lo) {
			return ;
		}   
		
		// �� a ������ �� lo �� hi �����з�
		
		int p = partition(a,lo,hi) ;
		
		// ����߷����Ԫ�ؽ�������
		sort(a,lo,p-1) ;
		sort(a,p + 1,hi) ;
	}
	
	
	
	//   ���Ĵ���
	private static int partition(int [] a , int lo , int hi) {
		// �����׼  ���� ָ��
		int key = a[lo] ;
		int left = lo ;
		int right = hi + 1 ;
		
		while(true) {
			// ��������ɨ��
			while(less(key,a[--right])) {
				if(right == lo) {
					break ;
				}
			}
			
			// ��������ɨ��
			while(less(key,a[++left])) {
				if(left == hi) {
					break ;
				}
			}
			
			if(left >= right) {
				// ɨ��������Ԫ�أ�����ѭ��
				break ;
			} else {
				exch(a,left ,right) ;
			}
		}
	
		// ��󽻻� right �� ��׼��
		exch(a,lo,right) ;
	  return right  ;
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


class Test6{
	
	public static void main(String [] args) {
		  int a [] = {6,1,2,7,9,3,4,5,8} ;
		  
		    MergeSort.sort(a) ;      // ע�������  ������
		     System.out.println(Arrays.toString(a));
		      
	}
}
