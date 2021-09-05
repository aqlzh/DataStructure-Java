package leetcodePlan.Base;

public class P0334 {

	public static void main(String[] args) {

		int [] nums = {1,2,3,4,5} ;
		System.out.println(fun(nums));
	}
	
	public static boolean fun(int [] nums) {
		int len = nums.length ;
		if(len < 3) return false ;
		int small = Integer.MIN_VALUE ,mid = Integer.MAX_VALUE ;
		
		for(int i = 0 ; i < len ;i++) {
			if(nums[i] <= small) {
				small = nums[i] ;
			} else if(nums[i] <= mid) {
				mid = nums[i] ;
			}else if(nums[i] > mid){
				return true ;
			}
		}
		
		return false ;
	}
}
