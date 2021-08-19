package leetcodePlan;

public class P0977_2 {

	
	 //  本例 采用 解法二： 双指针法
	public static void main(String[] args) {

	int [] nums = {-4,-1,0,3,10} ;
		
		int [] res = fun(nums) ;
		
		for(int i : res) {
			System.out.println(i +" ");
		}
	}

	public static int [] fun(int [] num) {
		
		int n = num.length ;
		int [] ans = new int[n] ;
      
       for(int i = 0 , j = n-1, pos = n-1 ; i <= j; ) {
    	   if(num[i]*num[i] > num[j]*num[j]) {
    		   ans[pos]=  num[i]*num[i]  ;
    		   ++i ;
    	   } else {
    		   ans[pos]=  num[j]*num[j]  ;
    		  --j ;
    	   }
    	   --pos ;
       }
        
        
		return ans ;
	}
	
}
