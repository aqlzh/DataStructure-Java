package JavaCommonAPI;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author LZH.create
 *  Java Common Use API  -->  BigInteger   
 */
public class BigIntegerTest {

	
	public static void main(String[] args) {

		// ����ת��
		BigInteger a = new BigInteger("111110",2) ;  // ��ת���Ķ���   �ö���Ľ���
		System.out.println(a.toString(16));       // �� a ת��Ϊ  16 ����
		System.out.println(a.toString(10));
		
		System.out.println("===========");
		
		// ����ת��
		BigInteger b = new BigInteger("111") ;
        BigDecimal c = new BigDecimal(2.0) ;
        
        //  b.toBigInteger() ;  
        System.out.println(c.toBigInteger());
		
		
		
	}

}
