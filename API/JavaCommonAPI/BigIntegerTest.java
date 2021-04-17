package JavaCommonAPI;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author LZH.create
 *  Java Common Use API  -->  BigInteger   
 */
public class BigIntegerTest {

	
	public static void main(String[] args) {

		// 进制转换
		BigInteger a = new BigInteger("111110",2) ;  // 被转换的对象   该对象的进制
		System.out.println(a.toString(16));       // 将 a 转换为  16 进制
		System.out.println(a.toString(10));
		
		System.out.println("===========");
		
		// 类型转换
		BigInteger b = new BigInteger("111") ;
        BigDecimal c = new BigDecimal(2.0) ;
        
        //  b.toBigInteger() ;  
        System.out.println(c.toBigInteger());
		
		
		
	}

}
