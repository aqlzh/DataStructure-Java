package PastExam;

import java.util.HashSet;
import java.util.Set;

/**
 * @author LZH.create
 *     ��ʮ�� ���ű� �ڶ��� ��ͬ�Ӵ�
 *      ���  ���� ���ϴ洢 �� subString ������ȡ   
 */
public class B2_19 {

	
	public static void main(String[] args) {
      
		Set<String> set= new HashSet<String>() ;
		
		String str = "0100110001010001";
		
		for(int i = 0 ; i < str.length() ;i++) {
			for(int j = i+1 ; j <= str.length() ;j++) {  // Ϊʲô j<=  ���ǿ�������˼�� �� i=0 j=1 ,���� j<=
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
