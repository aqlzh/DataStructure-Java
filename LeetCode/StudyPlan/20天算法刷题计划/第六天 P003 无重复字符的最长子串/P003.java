package leetcodePlan;

import java.util.HashSet;
import java.util.Set;

public class P003 {

	
	public static void main(String args[]) {
		String s = s = "abcabcbb" ;
		String s1 =  "pwwkew" ;
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstring(s1));
	}
	
	
	
    public static int lengthOfLongestSubstring(String s) {
    	Set<Character> set = new HashSet<Character>() ;
    	int n = s.length() ;
    	int r = -1 ,ans = 0 ;
    	for(int i =0 ; i < n ;++i) {
    		if(i!=0) {
    			set.remove(s.charAt(i-1)) ;    // ����ǰ��
    		}
    		
    		while(r+1 < n && !set.contains(s.charAt(r+1))) {
    			// ����������������
    			set.add(s.charAt(r+1)) ;
    			++r ;
    		}
    		
    		ans = Math.max(ans, r-i+1) ;  // ÿ���� ans �ȽϷ�������
    	}
    	
          return ans ;
    }
}
