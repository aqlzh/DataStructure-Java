package JavaCommonAPI;


/**
 * @author LZH.create
 * Date : 21.4.17  
 *    分解质因数
 */



/**
 * @定义
 *   根据算术基本定理又称唯一分解定理，对于任何一个合数， 
 *   我们都可以用几个质数的幂的乘积来表示。
 * EG :   12 = 2^2 * 3
 *        20 = 2^2 * 5
 *        30 = 2 * 3 * 5     
 */
public class DecomposedPrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(30) ;
	}
	
	public static void prime(int n){
	    for(int i = 2; i <= n / i; i++){  // i < n/i 相当于 i < Math.sqrt(n) 
	        int a = 0, b = 0;
	        while(n % i == 0){
	            a = i;
	            n /= i;
	            b++;
	        }
	        if(b > 0)
	            System.out.println(a + " " + b);
	    }
	    if(n > 1) System.out.println(n + " " + 1);  // 其质因数一定 含有一个与其本身
	    
	}


}
