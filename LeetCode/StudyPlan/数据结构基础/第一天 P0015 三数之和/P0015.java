package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P0015 {

	public static void main(String[] args) {

		int [] nums = {-1,0,1,2,-1,-4} ;
		System.out.println(fun(nums));
		System.out.println(fun2(nums));
	}

	public static List<List<Integer>> fun(int [] nums){
		if(nums.length < 3) {
			return new ArrayList<>() ;
		}
		List<List<Integer>> res = new ArrayList<>() ;
		// 排序
		Arrays.sort(nums); 
		// 构造哈希表
		Integer  tmp ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		for(int i =0 ; i < nums.length ;i++) { 
			map.put(nums[i], i) ;
		}
		
		for(int i = 0 ; i < nums.length ;i++ ) {
			int target = - nums[i] ;   // 此处 target 为另外两个数之和   
			if( i > 0 && nums[i] == nums[i-1]) {
			    continue ;	
			}
			   for(int j = i+1 ; j <nums.length ;j++) {
				   if(j > i+1 && nums[j] == nums[j-1]) {
					   continue ;
				   }
				   
				   if( (tmp = map.get(target - nums[j])) != null) {   // map.get()   获取 value
					   // 符合要求   最后一个数的序号 大于第二个
					   if(tmp > j) {
						   res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[tmp]))) ;
					   } else {
						   break ;
					   }
				   }
			   }
		}


		return res ;
	}
	
	public static List<List<Integer>> fun2(int [] nums){
		
		List<List<Integer>> res =  new ArrayList<List<Integer>>() ;
		
		if(nums.length < 3) {
			return res ;
		}
		
		Arrays.sort(nums);
		for(int i =0 ; i < nums.length  ; i++) {
			int target = - nums[i] ;
			if( i > 0 && nums[i] == nums[i-1]) continue ;
			
			int l = i+1 ;  // 中指针
			int r = nums.length - 1;
			
			while(l < r) {
				if(nums[l] + nums[r] == target) {
					res.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r]))) ;
					
					//  去重
					while(l < r && nums[l] == nums[l+1]) l++ ;
					while(l < r && nums[r] == nums[r-1]) r-- ;
					
					l++ ;
					r-- ;
				} else if(nums[l] + nums[r] > target) {
					r-- ;
				} else {
					l++ ;
				}
			}
		}
		
		return res ;
	}
	
	
}
