package luoguArray;

import java.util.Scanner;

/**
 * @author LZH.create
 *  �÷�  ���ɣ� 
 *  ����1�ڵ�һ��n/2+1��λ��
 *  ������ÿ��������Ϊǰһ�������ϵ�һ��
 *  ÿ��n�ı�����������һ��
 *  ֱ��n*nֹͣ
 */
public class P2615 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt() ;
		
		int [][] arr= new int[N][N] ;
		int sum = 1 ;
		
		// ��ʼ 1  ֵ
		int i = 0 ; 
		int j = (N+1)/2-1 ;
		
		int k = 0 ;
		
		while(sum <= N * N) {
			
			// ��ֵ 
			arr[i][j] = sum ;
			
		   if(sum%N ==0) {
			   ++i ;
			   if(i==N) {
				   i = 0 ;
			   }
		   } else {   //����
			   --i ;
			   ++j ;
		   }
		   
		   if(i ==-1) i = N -1 ;
		   if(j ==N) j=0 ;  //����  �ұߵ�ͷ
		   
		   sum++ ;
		}
		
		for( i = 0 ; i < N ; i++) {
			for( j = 0 ; j < N; j++) {
				System.out.print(arr[i][j]+ " ");
				k++ ;
				if(k%N== 0) {
					System.out.println();
				}
			}
		}
	}

}
