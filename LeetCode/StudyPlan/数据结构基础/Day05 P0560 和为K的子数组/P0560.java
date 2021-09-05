package leetcodePlan.Base;
 
import java.util.HashMap;

public class P0560 {

	public static void main(String[] args) {

		int [] nums = {1,1,1} ;
		int k = 2 ;
		System.out.println(fun(nums,k));
	}
	
	
	public static int fun(int [] nums,int k ) {
		int count = 0 ;
		int pre = 0 ;   // 记录前面数字相加之和
		
		// 用于记录前几个数字之和为 K 出现相同和的次数为 V
		HashMap<Integer,Integer> map = new HashMap<>() ; 
		// 初始化
		map.put(0, 1) ;
		 
		for(int i = 0 ; i <nums.length ;i++) {
			pre+= nums[i] ;  // 前缀 和
			
			if(map.containsKey(pre-k)) {
				count += map.get(pre-k) ;
			}
			map.put(pre, map.getOrDefault(pre, 0)+1) ;
		}
		return count ;
	}

}
