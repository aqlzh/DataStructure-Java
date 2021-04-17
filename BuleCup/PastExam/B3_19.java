package PastExam;

import java.math.BigInteger;

/**
 * @author LZH.create
 *     第十届蓝桥杯 2019 第三题   数列求和   
 *      注意一定要在 求 a+b+c 的时候求和 因为 后期 不取模运算数太大
 */
public class B3_19 {

	
	public static void main(String[] args) {

		BigInteger a = BigInteger.valueOf(1) ;
		BigInteger b = BigInteger.valueOf(1) ;
		BigInteger c = BigInteger.valueOf(1) ;
		BigInteger d = BigInteger.ZERO ;
		BigInteger mod = BigInteger.valueOf(10000) ;
		
		for(int i = 4 ; i<= 20190324 ;i++) {
			d = (a.add(b).add(c)).mod(mod) ;
			a = b ;
			b = c ;
			c = d ;
		}
		System.out.println(d);
		
		
//		int a = 1, b = 1, c = 1;
//		// 要是求第四项，则i < 4, 同理推得求20190324，则i < 20190324。
//		for (int i = 3; i < 20190324; i++) {
//			int temp = (a + b + c) % 10000;
//			a = b;
//			b = c;
//			c = temp;
//		}
//		System.out.println(c);
	}

	

}
