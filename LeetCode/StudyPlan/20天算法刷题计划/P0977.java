package leetcodePlan;

public class P0977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {-4,-1,0,3,10} ;
		
		int [] res = sortedSquares(nums) ;
		
		for(int i : res) {
			System.out.println(i +" ");
		}
        
	}
	

	    public static int[] sortedSquares(int[] nums) {
	        int [] temp = new int [nums.length] ;
	        for(int i =0 ; i < nums.length ;i++){
	            temp[i] = nums[i] * nums[i] ;
	        } 
	        
	        // ц╟ещ
	        for(int i =0 ; i < temp.length -1  ;i++){
	            for(int j = 0 ; j < temp.length - i -1 ; j++){
	                if(temp[j] > temp[j+1]){
	                    int t = temp[j] ;
	                    temp[j] = temp[j+1] ;
	                    temp[j+1] = t ;
	                }
	            }
	        }

	        return temp ;
	    }


}
