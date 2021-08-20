package leetcodePlan;

import java.util.Arrays;

public class P0344 {

	
	// ‘À”√À´÷∏’Î
	public static void main(String[] args) {
		char[] s = {'H','e','l','l','o'} ;
		reverseString(s)  ;
		
	}

	
	public static void reverseString(char[] s) {
          int n = s.length - 1 ;
          for(int left = 0 , right = n ; left < right ; left++ ,right--) {
        	  char tmp = s[left] ;
        	  s[left] = s[right] ;
        	  s[right] = tmp ;
          }
          
          System.out.println(Arrays.toString(s));
    }
}
