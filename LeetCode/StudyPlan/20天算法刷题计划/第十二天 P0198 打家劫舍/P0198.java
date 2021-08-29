package leetcodePlan;

public class P0198 {

	public static void main(String[] args) {

		int [] num = {2,7,9,3,1} ;
		System.out.println(fun(num));
		System.out.println(fun1(num));
	}
	

	//   解法一  ： 动态规划
	public static int fun(int [] num) {
		if(num == null || num.length ==0) {
			return 0  ;
		}
		
		int length = num.length ;
		if(length == 1) {
			return num[0] ;
		}
			
		int [] dp = new int[length] ;
		dp[0] = num[0] ;
		dp[1] = Math.max(num[0], num[1]) ;
		
		for(int i = 2 ; i < length ;i++) {
			dp[i] = Math.max(dp[i-2] + num[i], dp[i-1]) ;
		}
		
		return dp[length -1] ;    // 返回最后一个值
		
	}
	
	
	// 解法二  ： 动态规划 + 滚动数组
	
	public static int fun1(int [] num) {
		if(num == null || num.length ==0) {
			return 0  ;
		}
		
		int length = num.length ;
		if(length == 1) {
			return num[0] ;
		}
			
	    int  first = num[0] ;
	    int second = Math.max(num[0], num[1]) ;
		
		for(int i = 2 ; i < length ;i++) {
			 int tmp = second ;
			 second = Math.max(first + num[i], second) ;
			 first = tmp ;
		}
		
		return second ;    // 返回最后一个值
		
	}
}
