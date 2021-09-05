package leetcodePlan.Base;

import java.util.LinkedList;
import java.util.List;

public class P0763 {

	public static void main(String[] args) {
		String S = "ababcbacadefegdehijhklij" ;
		System.out.println(fun(S));
	}
	
	public static List<Integer> fun(String s){
		List<Integer> list = new LinkedList<>() ;
		int [] edge = new int[666] ;
		char [] chars = s.toCharArray() ;
		
		for(int i = 0 ; i < chars.length ;i++) {
			edge[chars[i] - 0 ] = i ;
		}
		
		int idx = 0 ;
		int last = -1 ;
		
		for(int i = 0 ; i < chars.length ;i++) {
			idx = Math.max(idx, edge[chars[i] - 0]) ;
			if( i == idx) {
				list.add(i - last) ;
				last = i ;
			}
		}
	
		return list ;
		
	}
	
	

}
