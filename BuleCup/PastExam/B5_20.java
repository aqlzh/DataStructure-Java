package PastExam;

import java.math.BigInteger;

/**
 * @author LZH.create
 *  由于处理的数据太大   递归不动了
 */
public class B5_20 {
	
	 public static void main(String[] args) {
	        BigInteger F520 = BigInteger.ZERO;
	        BigInteger F1 = BigInteger.ONE, F2 = BigInteger.ONE, F3 = BigInteger.ZERO;
	        for (int i = 3; i <= 2020; i++) {
	            F3 = F1.add(F2);
	            F1 = F2;
	            F2 = F3;
	            if (i == 520) F520 = F3;
	        }
	        System.out.println(gcd(F3, F520));
	    }

	    static BigInteger gcd (BigInteger a, BigInteger b) { return b.compareTo(BigInteger.ZERO) == 0? a: gcd(b, a.mod(b)); }

	

//	public static void main(String[] args) {
//
////		 System.out.println(fbnq(5));
////		 System.out.println(fbnq(6));
//		 
////		 long a  = fbnq(2020) ;
////		 long b  = fbnq(520) ;
//		 System.out.println(fbnq(30));
////		 
////		 System.out.println(gcd(a,b));
//	
//	}
//	
//	
//	// 最大公约数
//	public static long gcd(long a, long b) { 
//		if(b == 0) return a ;
//		 return gcd(b,a%b) ;
//	}
//	
//	// 斐波那契数列  1 1 2 3 5 8
//	public static long fbnq(long n) {
//		if( n==1 || n==2 ) return 1 ;
//		 else return fbnq(n-1) + fbnq(n-2) ;  
//	}

}
