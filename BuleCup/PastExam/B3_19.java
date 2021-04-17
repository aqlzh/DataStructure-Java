package PastExam;

import java.math.BigInteger;

/**
 * @author LZH.create
 *     ��ʮ�����ű� 2019 ������   �������   
 *      ע��һ��Ҫ�� �� a+b+c ��ʱ����� ��Ϊ ���� ��ȡģ������̫��
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
//		// Ҫ����������i < 4, ͬ���Ƶ���20190324����i < 20190324��
//		for (int i = 3; i < 20190324; i++) {
//			int temp = (a + b + c) % 10000;
//			a = b;
//			b = c;
//			c = temp;
//		}
//		System.out.println(c);
	}

	

}
