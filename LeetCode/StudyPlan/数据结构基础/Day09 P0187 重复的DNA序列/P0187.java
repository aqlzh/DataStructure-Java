package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P0187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"   ;
		System.out.println(findRepeatedDnaSequences(s));
	}
	public static  List<String> findRepeatedDnaSequences(String s) {
		int L = 10 , n = s.length() ;
		
		HashSet<String> seen = new HashSet() , output = new HashSet() ;
		
		for(int start = 0 ; start < n - L +1 ;start ++) {
			String tmp = s.substring(start ,start + L) ;
			if(seen.contains(tmp)) output.add(tmp) ;
			   seen.add(tmp) ;
		}
		
		return new ArrayList<String>(output) ;
	}
}
