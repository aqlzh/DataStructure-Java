package Algorithm;

/**
 * @author LZH.create
 *     �����Ʊ����   ��̬�滮
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
		
		// dp[i][0] �±�Ϊ i ���������ʱ�򣬲��ֹɣ�����ӵ�е��ֽ���
        // dp[i][1] �±�Ϊ i ���������ʱ�򣬳ֹɣ�����ӵ�е��ֽ���
		
		// ��һ��
		dp[0][0] = 0 ;  // û�����
		dp[0][1] = - prices[0] ;
		
		//  �ӵڶ��쿪ʼ����
		for(int i = 1 ; i < len ;i++) {
			dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]) ;
			dp[i][1] = Math.max(dp[i-1][1], - prices[i]) ;
		}
		return dp[len-1][0] ; 
	}

}
