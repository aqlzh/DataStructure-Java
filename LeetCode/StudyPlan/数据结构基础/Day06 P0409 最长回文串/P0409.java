package leetcodePlan.Base;

public class P0409 {

	
	  // ��� ��  ̰���㷨 , ʹ���е���ĸ�����ܳ���ż����  + 1
	public static void main(String[] args) {

		String  str = "abccccdd" ;
		System.out.println(fun(str));
	}
	
	public static int fun(String s) {
		
		
		//    ������ϣ���˼·
		int [] count = new int[120] ;
		int length = s.length() ;
		
		for(int i = 0 ;i < length ;i++) {
			char c  = s.charAt(i) ;
			count[c]++ ;
		}
		
		int ans = 0 ;
		for(int v : count) {
			ans += v /2 * 2 ;
			if(v % 2 ==1 && ans % 2 == 0) {
				ans ++ ;
			}
		}
		
		return ans ;
	}

}
