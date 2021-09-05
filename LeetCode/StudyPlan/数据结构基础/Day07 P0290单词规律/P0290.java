package leetcodePlan.Base;

import java.util.HashMap;
import java.util.Map;

public class P0290 {

	public static void main(String[] args) {
		String pattern = "abba"  ; 
        String str = "dog cat cat dog" ;
        System.out.println(fun(pattern,str));
	}
	
    public static boolean fun(String pattern, String s) {

    	String [] words = s.split(" ") ;
    	
    	if(words.length != pattern.length()){
    		return false ;
    	}
    	
    	Map<Object,Integer> map = new HashMap<>() ;
    	for(int i = 0 ; i < words.length ;i++) {
    		if(map.put(words[i], i) != map.put(pattern.charAt(i), i)) {
    			return false ;
    		}
    	}
    	
    	return true ;
    }

}
