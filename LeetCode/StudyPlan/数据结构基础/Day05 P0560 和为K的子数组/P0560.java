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
		int pre = 0 ;   // ��¼ǰ���������֮��
		
		// ���ڼ�¼ǰ��������֮��Ϊ K ������ͬ�͵Ĵ���Ϊ V
		HashMap<Integer,Integer> map = new HashMap<>() ; 
		// ��ʼ��
		map.put(0, 1) ;
		 
		for(int i = 0 ; i <nums.length ;i++) {
			pre+= nums[i] ;  // ǰ׺ ��
			
			if(map.containsKey(pre-k)) {
				count += map.get(pre-k) ;
			}
			map.put(pre, map.getOrDefault(pre, 0)+1) ;
		}
		return count ;
	}

}
