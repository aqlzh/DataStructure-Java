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
	      SelectionSort.sort(a) ;      // ע�������  ������
	      System.out.println(Arrays.toString(a));
	      
	      
	      
	      System.out.println("=======������======");
	      
	      for(int i = 0; i < a.length - 1; i++) {// ����i������
              int k = i;
              for(int j = k + 1; j < a.length; j++){// ѡ��С�ļ�¼
                  if(a[j] < a[k]){
                      k = j; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
                  }
              }
              //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
              if(i != k){  //����a[i]��a[k]
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
