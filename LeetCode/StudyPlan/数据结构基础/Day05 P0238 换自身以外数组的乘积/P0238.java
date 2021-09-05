package leetcodePlan.Base;

public class P0238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] nums =  {1,2,3,4} ;
        int [] res = fun(nums) ;
        for(int i : res) {
        	System.out.print(i + " ");
        }
	}
	
	public static int[] fun(int [] nums) {
		int [] res = new int[nums.length] ;
		int k = 1 ;
		for(int i =0 ; i < res.length ;i++) {
			res[i] = k ;
			k *= nums[i] ;  // 前缀之积
		}
		k = 1 ; // 初始化
		for(int i = res.length - 1; i >= 0 ;i--) {
			res[i] *= k ;
			k*= nums[i] ;
		}
		return res ;
	}

}
