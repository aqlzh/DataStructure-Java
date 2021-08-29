package leetcodePlan;

public class P0231 {

	public static void main(String[] args) {

		System.out.println(fun(16));
		System.out.println(fun(12));
	}
	
	public static boolean fun(int n) {
		return n > 0 && (n & (n-1) ) ==0 ;
	}

}
