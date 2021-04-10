package BaseFunction;


/**
 * @author LZH.create
 *     排列 程序实现
 */
public class arrangement {

	
	public static void main(String[] args) {

		// 计算 A(3 , 6)
		System.out.println(A(3,6));
		
	}
	
	// A(n , m)
	public static int  A(int m ,int n) {
		int result = 1 ;
		
		// m 控制循环次数
		for(int i = m ; i > 0 ;i--) {
			result *= n ;
			n-- ;
		}
		return result ;
	}

}
