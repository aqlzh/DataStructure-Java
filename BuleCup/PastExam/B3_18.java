package PastExam;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @author LZH.create
 *    µÚ¾Å½ì À¶ÇÅ±­ ÌâÄ¿3  ¸´ÊýÃÝ
 */
public class B3_18 {

	
//	public static void main(String[] args) {
//		BigInteger a=new BigInteger("2");
//		BigInteger b=new BigInteger("3");
//		BigInteger a1=new BigInteger("2");
//		BigInteger b1=new BigInteger("3");
//		for(int i=1;i<123456;i++) {
//			BigInteger ta=a;
//			a=a.multiply(a1).subtract(b.multiply(b1));
//			b=ta.multiply(b1).add(b.multiply(a1));
//		}
//		if(b.compareTo(BigInteger.ZERO)>0) {
//			System.out.println(a+"+"+b+"i");
//		}else if(b.compareTo(BigInteger.ZERO)==0) {
//			System.out.println(a);
//		}else {
//			System.out.println(a+String.valueOf(b)+"i");
//		}
//
//
//	}
	
	  public static void main(String[] args) {
	        BigInteger a = new BigInteger("2");
	        BigInteger b = new BigInteger("3");
	        BigInteger c = new BigInteger("2");
	        BigInteger d = new BigInteger("3");
	        for (int i = 1; i < 123456; i++) {
	            BigInteger A = a.multiply(c).subtract(b.multiply(d));
	            BigInteger B = b.multiply(c).add(a.multiply(d));
	            a = A;
	            b = B;
	        }
	        System.out.println(a.toString()+b.toString()+"i");
	    }

}
