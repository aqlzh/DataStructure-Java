package leetcodePlan.Base;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P0169 {

	public static void main(String[] args) {

		int []  nums =  {2,2,1,1,1,2,2} ;
		System.out.println(fun(nums));
		System.out.println(fun2(nums));
		System.out.println(fun3(nums));
				
		}
	
	public static Map<Integer,Integer> countNums(int [] nums){
		Map<Integer,Integer> counts = new HashMap<Integer,Integer>() ;
		for(int num :nums) {
			if(!counts.containsKey(num))  { // �жϹ�ϣ�����Ƿ�����ֵ
				counts.put(num,1) ;
			} else {
				counts.put(num, counts.get(num) + 1) ;
			}
		}
		return counts ;
	}
	
	
	public static int fun(int [] nums) {
		Map<Integer,Integer> counts = countNums(nums) ;
		
		// ���ݹ�ϣ��ó�����
		Map.Entry<Integer, Integer> majorityEntry = null ;
		
		for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
			if(majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
				majorityEntry = entry ;
			}
		}
		
		// �����ڴ���̨�ķ�ʽ����
		
		return majorityEntry.getKey() ;
	}
	
	
	public static int fun2(int [] nums) {
		Arrays.sort(nums);
		return nums[nums.length >> 1] ;    // length / 2
	}
	
	
	public static int fun3(int [] nums) {
		
		int cand_num = nums[0] ,count = 1 ;
		for(int i = 1 ; i < nums.length ; i++) {
			if(cand_num == nums[i]) {
				count ++ ;
			} else if(--count ==0) {
				cand_num = nums[i] ;
				count = 1;
			}
		}
		
		return cand_num ;
	}

}
