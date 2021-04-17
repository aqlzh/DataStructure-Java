package Algorithm;

/**
 * @author LZH.create
 *     购买股票问题   动态规划
 */
public class BuyStocksProblem {

	public static void main(String[] args) {

		int [] arr = {7,1,5,3,6,4} ;
		System.out.println(fun(arr));
	}
	
	
	public static int fun(int [] prices) {
		
		int len = prices.length ; 
		if(len < 2) {
			return 0 ;
		}
		
		int [][] dp = new int [len][2] ;
		
		// dp[i][0] 下标为 i 这天结束的时候，不持股，手上拥有的现金数
        // dp[i][1] 下标为 i 这天结束的时候，持股，手上拥有的现金数
		
		// 第一天
		dp[0][0] = 0 ;  // 没有入股
		dp[0][1] = - prices[0] ;
		
		//  从第二天开始遍历
		for(int i = 1 ; i < len ;i++) {
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]) ;
			dp[i][1] = Math.max(dp[i-1][1], - prices[i]) ;
		}
		return dp[len-1][0] ; 
	}

}
