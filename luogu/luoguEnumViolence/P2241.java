package luoguEnumViolence;

import java.util.Scanner;

/**
 * @author LZH.create
 * 
 *    解法一
 *   统计方形   运用排列组合  
 *   n m  分别为 方形的 nxm
 *   C( n+1, 2)  C(m+1 ,2 )
 *     
 */
public class P2241 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		long n = sc.nextInt() ;
		long m = sc.nextInt() ;
		
		
		// 求出所有矩形的个数
		long nums = C(m+1,2) * C(n+1,2) ;
		
		//求出 正方形的个数
		long num1 = 0 ;
		
		for(long i = 1 ; i <= Math.min(m, n) ;i++) { 
			num1 += (n-i+1)*(m-i+1) ;
		}
		
		System.out.print(num1+" ");
		System.out.print(nums-num1);
		
	}
	
	public static long A(long m,long n) {
		long result = 1  ;
		for(long i = n ; i > 0 ; i--) {
			result *= m ;
			m-- ;
		}
		
		return result ;
	}
	
	public static long C(long m,long n) {
		long son = A(m,n) ;
		long mother = A(n,n)  ;
		
		return son/mother ;
				
	}

}
