package leetcodePlan;

public class P0557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest" ;
		reverseWords(s) ;
	
	}
	
    public static void reverseWords(String s) {
    	
    	StringBuffer  strs = new StringBuffer() ;
    	
    	int length = s.length() ;
    	int i = 0 ;
    	
    	while(i < length) {
    		int start = i ;
    		
    		// ʹ�� i ��¼ һ��������
    		while(i < length && s.charAt(i) != ' ') {
    			i++ ;
    		}
    		
    		// ����׷��
    		for(int j = start ; j < i ;j++) {
    			strs.append(s.charAt(i-1+start-j)) ;	
    		}
    		
    		// �ӿո�
    		while(i < length && s.charAt(i) == ' ') {
    			i++ ;
    			strs.append(' ') ;
    		}
    		
    		
    	}
    	
    	System.out.println(strs);
       
    }

}
