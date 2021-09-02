package leetcodePlan;

public class P0136 {

	public static void main(String[] args) {

		int [] nums = {4,1,2,1,2} ;
		System.out.println(fun(nums));
	}
	
	public static int fun(int [] nums) {
		int single = 0 ;
		for(int num : nums) {   // ∏ﬂº∂for—≠ª∑ 
			single ^= num ;
		}
		
		return single ;
	}

}
