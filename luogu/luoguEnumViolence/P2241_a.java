package luoguEnumViolence;

import java.util.Scanner;

/**
 * @author LZH.create
 *    �ⷨ��  ����ö��  
 */
public class P2241_a {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		long m = sc.nextLong() ;
		long n = sc.nextLong() ;
		
		long ans  = 0 ;
		
		for(long i = 1 ; i <= m ;i++) {
			for(long j = 1 ; j <= n ;j++) {
				ans += i* j ;  // ö�����п���
			}
		}
		
		int count = 0 ; 
	   // ö��������
		for(int i = 1 ; i <= Math.min(m, n) ; i++) {
			count += (m-i+1)*(n-i+1) ; 
		}
		
		
		System.out.print(count+" ");
		System.out.println(ans-count);
	}

}
