package leetcodePlan;

public class P0070 {

	public static void main(String[] args) {
              System.out.println(climbStairs(2));
              System.out.println(fun(2));
              System.out.println(fun1(2));
	}
	
	
	//   解法一 ： 动态规划
    public static int climbStairs(int n) {
           if( n==1) {
        	   return 1 ;
           } 
           int [] dp = new int[n+1] ;
           dp[1] = 1 ;
           dp[2] = 2 ;
    	
           for(int i = 3 ; i <= n ;i++) {
        	   dp[i] = dp[i-1] + dp[i-2] ; 
           }
    	return dp[n]  ;
    }
    
    
    // 解法二 ： 滚动数组   斐波那契数列
    
    public static int fun(int n) {
    	
    	if( n==1) {
    		return 1 ;
    	} 
    	
    	int first = 1 ;
    	int second = 2 ;
    	
    	for(int i = 3 ; i <= n ;i++) {
    		int third = first + second ;
    		first = second  ;
    		second = third ;
    	}
    	
    	return second ;
    }
    
    // 解法三：  递归
    
    public  static int fun1(int n) {
    	if( n==1) {
    		return 1 ;
    	}
    	
    	if(n==2) {
    		return 2 ;
    	}
    	
    	return  fun1(n-1) + fun1(n-2);
    }
    
 

}
