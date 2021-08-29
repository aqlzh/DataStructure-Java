package leetcodePlan;

public class P0191 {

	public static void main(String[] args) {

		int n = 00000000000000000000000000001011 ;
		System.out.println(fun(n));
	}
	
	public static int fun(int n) {
		
		int ans = 0 ;
		for(int i = 0 ; i < 32 ;i++) {
			ans += ( (n >> i) & 1) ;   // 从 0 开始 依次右移 
		}
		
		return ans ;
	}

}
