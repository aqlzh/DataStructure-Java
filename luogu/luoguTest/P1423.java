package luoguTest;

import java.util.Scanner;

public class P1423 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		double a = sc.nextDouble() ;
		
		
		double sum = 0.0 ;
		int count = 1 ; 
		
		
	
//			while(sum < a) {
//				// sum += sum*0.98 ;    �ݺ���Ѽ
//				int i = 0;
//				//sum += 2 * Math.pow(0.98,i) ;
//				sum += (double)(2.0 * (Math.pow(0.98, i))) ;
//				i++ ;
//				count++ ;
//				
//				// ע��  ����  �ı�  count ++  λ��
////				System.out.println(sum);
////				System.out.println(count);
//		
//			
//			System.out.println(sum);
//			
//		}
//			System.out.println(count);
		
		
		double temp = 2 ;
		while(sum <= a) {
			sum += temp ;
			temp *= 0.98 ;
			count++ ;
		 }
		
		System.out.println(count);
		
		
		}

}
