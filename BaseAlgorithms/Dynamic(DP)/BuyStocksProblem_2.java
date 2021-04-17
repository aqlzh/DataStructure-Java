package Algorithm;

/**
 * @author LZH.create
 *  Date: 21.4.13
 */
public class BuyStocksProblem_2 {

	public static void main(String[] args) {

		int [] arr = {7,1,5,3,6,4} ;
		System.out.println(fun(arr));
	}
	
	public static int fun(int [] prices) {
		int len = prices.length ;
		if(len < 2) {
			return 0 ;
		}
		
		int res = 0 ;
		for(int i = 1 ; i < len ;i++) {
			int sub = prices[i] - prices[i-1] ;
			if(sub >0) {
				res += sub ;
			}
		}
		
		return res ;
	}

}
