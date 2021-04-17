package BaseFunction;

/**
 * @author LZH.create
 *     快速幂  算法
 */
public class FastPower {

	public static void main(String[] args) {
   
		
		System.out.println(fun(2,10));
		
	}
	
	
	
	// 如果题目 题目保留  注意 加上 mod
	public static long fun(int a, int b) { // a ^ b
		long res = 1 ;
		while(b != 0) {
			if(( b & 1) == 1) {  //判断二进制 最后一位是 否为 1 也是判奇
				res *= a ;
			}
			a = a * a ;   // 指数加1
			b = b >> 1 ;   // 将 b 右移一位
		}
		
		return res ;
	}

}
