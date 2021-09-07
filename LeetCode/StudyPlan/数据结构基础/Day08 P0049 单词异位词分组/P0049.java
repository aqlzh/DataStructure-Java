package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0049 {

	public static void main(String[] args) {

		String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"} ;
		
		System.out.println(fun(strs));
	}
	
    public static List<List<String>> fun(String[] strs) {

    	Map<String,List<String>> map = new HashMap<String,List<String>>() ;
    	
    	for(String str : strs) {
    		char[] array = str.toCharArray() ;
    		Arrays.sort(array);
    		
    		String key = new String(array) ;
    		List<String> list = map.getOrDefault(key, new ArrayList<String>()) ;
    		list.add(str) ;
    		map.put(key, list) ;   		
    	}
           return new ArrayList<List<String>>(map.values()) ;         	
    }

}
