package luoguArray;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date : 2021.3.27    
 * ������ά����    ע���и�����������ظ� 
 *  ����  0 1  ����  
 *  0  ��ʾδ�Ƴ�   1  ��ʾ�Ƴ�  
 *  ���� ˼· ͬ P1047
 */
public class P5729 {

	public static void main(String[] args) {
		
		int [][][] A = new int[30][30][30] ;
		
		int count = 0 ;

		Scanner sc = new Scanner(System.in) ;
		
		
		int w = sc.nextInt() ;
		int x = sc.nextInt() ;
		int h = sc.nextInt() ;
		int n = sc.nextInt() ;

		for(int ii = 0 ; ii < n ;ii++) {
			int a = sc.nextInt() ;
			int b = sc.nextInt() ;
			int c = sc.nextInt() ;
			int d = sc.nextInt() ;
			int e = sc.nextInt() ;
			int f = sc.nextInt() ;
			
			for(int i = a ; i <= d ;i++) {
				for(int j = b ; j <= e ; j++) {
					for(int k = c ; k <= f ; k++) {
						A[i][j][k] = 1 ;
					}
				}
			}
		}
		
		
		// ��Ԫ����  ������
		
		for(int i = 1 ; i <= w ;i++) {
			for(int j = 1 ; j <=x ; j++) {
				for(int k = 1 ; k <= h ; k++) {
					if(A[i][j][k] == 0) 
						count ++ ;
				}
			}
		}
		
		
		System.out.println(count);
		
		
//		int [] arr = new int[3] ;   // ���������
//		int [] xyz = new int [6] ;   // �Խ��߲���
//		int sum = 0 ;
//		
//		
//		for(int i = 0 ; i < 3 ; i++) {
//			arr[i] = sc.nextInt() ;
//		}
//		
//		int v = arr[0] * arr[1] * arr[2] ;
//		
//		int n = sc.nextInt() ;
//		
//		int [] result = new int [n] ;
//		
//		for(int i = 0 ; i< n ;i++) {
//			for(int j = 0 ; j < 6 ; j++) {
//				xyz[j] = sc.nextInt() ;
//			}
//			result[i] =(xyz[3] - xyz[0] + 1)* (xyz[4] - xyz[1] + 1) * (xyz[5] - xyz[2]+ 1) ;
//		}
//		
//		for(int i =0 ; i< n ; i++) {
//			sum += result[i] ; 
//		}
//		
//		System.out.println(v - sum);
//		
  }

}
