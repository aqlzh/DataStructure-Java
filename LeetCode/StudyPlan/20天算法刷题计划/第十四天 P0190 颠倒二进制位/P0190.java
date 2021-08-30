package leetcodePlan;

import java.math.BigInteger;

public class P0190 {

	// ����ⷨ
	
	public static void main(String[] args) {

		// long long n =  00000010100101000001111010011100 ;
		
	
		
		BigInteger n = new BigInteger("00000010100101000001111010011100");
		System.out.println(reverseBits(n));
		
		
	}

	   public  static BigInteger reverseBits(BigInteger n) {
	        
		   BigInteger res = new BigInteger("0") ;
		   BigInteger a = new BigInteger("2") ;
		   
		   for(int i =0 ; i <32 ;i++) {
			   res = res.multiply(a).add(n.mod(a)) ;   // 10�������10�Լ�ģ10    �е������ڻ�����
			   n =n.divide(a)  ;
		   }
		   
		   return res ;
	    }
}
