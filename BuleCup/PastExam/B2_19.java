package PastExam;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LZH.create
 *     第十届 蓝桥杯 第二题 不同子串
 *      题解  利用 集合存储 与 subString 用来截取   
 */
public class B2_19 {

	
	public static void main(String[] args) {
      
		Set<String> set= new HashSet<String>() ;
		
		String str = "0100110001010001";
		
		for(int i = 0 ; i < str.length() ;i++) {
			for(int j = i+1 ; j <= str.length() ;j++) {  // 为什么 j<=  我们可以这样思考 当 i=0 j=1 ,明显 j<=
				String temp = str.substring(i, j) ;
				set.add(temp) ;
			}
		}
		System.out.println(set.size());
		
		
//		String s ="0100110001010001";
//		Set<String> set = new HashSet<String>();
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i+1; j <= s.length(); j++) {
//				String a = s.substring(i,j);
//				set.add(a);
//			}
//		}
//		System.out.println(set.size());

	}

}
