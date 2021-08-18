package leetcodePlan;

public class P0035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 int [] nums = {1,3,5,6}  ;
		 int target = 5 ;
		 
		 System.out.println(searchInsert(nums,target));
	}
	
	
    public static int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1 ;
        int ans = nums.length;

        while(left <= right){
            int mid = left + (right - left)/2 ;
            if(nums[mid] >= target)  {
                ans = mid ;
                right = mid - 1 ;
            } else{
                left = mid + 1 ;
            }
                
        }
          return ans ;
       
  }

}
