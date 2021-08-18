package leetcodePlan;

public class P1089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {1,3,4,9,10} ;
		
		rotate(nums,3) ;
           		
	}
	
    public static void rotate(int[] nums, int k) {
        int n = nums.length ;
        int [] temp = new int[n] ;

        for(int i =0 ; i <n ;i++){
            temp[(i+k)%n] = nums[i] ;
        }

        System.arraycopy(temp,0,nums,0,n) ;
        
        for(int i : temp) {
        	System.out.println(i + " ");
        }
     }

}
