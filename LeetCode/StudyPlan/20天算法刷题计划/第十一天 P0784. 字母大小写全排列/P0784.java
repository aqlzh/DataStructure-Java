package leetcodePlan;

import java.util.ArrayList;
import java.util.List;

public class P0784 {

	public static void main(String[] args) {

		String S = "a1b2"  ;
		
		List<String> lists = P0784.fun(S);
	    System.out.println(lists);
		
	}
	
	static List<String> res = new ArrayList<>() ;
	public static List<String> fun(String s){
		char[] chs = s.toCharArray() ;
		int n = chs.length ;
		dfs(chs,n,0) ;
		
		return res ;
	}
	
	public static void dfs(char[] chs ,int n ,int begin) {
		res.add(new String(chs)) ;
		for(int i = begin ; i< n ;i++) {
			if(!Character.isDigit(chs[i])) {
				char tmp = chs[i] ;    // 记录用于回溯
				System.out.println("递归前"+ res);
				chs[i] = (char)(chs[i] - 'a' >= 0 ? chs[i] -32 : chs[i] + 32) ;   // 大小写转换
				dfs(chs,n,i+1) ;
				chs[i] = tmp ;   // 回溯
				System.out.println("递归后"+ res);
			}
		}
	}
	

}
