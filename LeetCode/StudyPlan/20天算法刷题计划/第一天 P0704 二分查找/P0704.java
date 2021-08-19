package leetcodePlan;

public class P0704 {

	public static void main(String[] args) {
		 //   1 day
         // ÊäÈë  nums = [-1,0,3,5,9,12], target = 9
		int [] nums = {-1,0,3,5,9,12} ;
		int target = 9 ;
		
		System.out.println(search(nums,target));
	}
	
	 public static int search(int[] nums, int target) {
         for(int i =0 ; i <nums.length ;i++){
               if(nums[i]==target) return i ;
         }
          
               return -1  ;
    }

}
