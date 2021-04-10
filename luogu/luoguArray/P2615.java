package luoguArray;

import java.util.Scanner;

/**
 * @author LZH.create
 *  幻方  规律： 
 *  首先1在第一行n/2+1的位置
 *  接下来每个数依次为前一个数右上的一个
 *  每逢n的倍数就往下走一个
 *  直到n*n停止
 */
public class P2615 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int N = sc.nextInt() ;
		
		int [][] arr= new int[N][N] ;
		int sum = 1 ;
		
		// 初始 1  值
		int i = 0 ; 
		int j = (N+1)/2-1 ;
		
		int k = 0 ;
		
		while(sum <= N * N) {
			
			// 赋值 
			arr[i][j] = sum ;
			
		   if(sum%N ==0) {
			   ++i ;
			   if(i==N) {
				   i = 0 ;
			   }
		   } else {   //右上
			   --i ;
			   ++j ;
		   }
		   
		   if(i ==-1) i = N -1 ;
		   if(j ==N) j=0 ;  //仅会  右边到头
		   
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
