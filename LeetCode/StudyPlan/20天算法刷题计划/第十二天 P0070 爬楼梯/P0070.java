package leetcodePlan;

public class P0070 {

	public static void main(String[] args) {
              System.out.println(climbStairs(2));
              System.out.println(fun(2));
              System.out.println(fun1(2));
	}
	
	
	//   �ⷨһ �� ��̬�滮
    public static int climbStairs(int n) {
           if( n==1) {
        	   return 1 ;
           } 
           int [] dp = new int[n+1] ;
           dp[1] = 1 ;
           dp[2] = 2 ;
    	
           for(int i = 3 ; i <= n ;i++) {
        	   dp[i] = dp[i-1] + dp[i-2] ; 
           }
    	return dp[n]  ;
    }
    
    
    // �ⷨ�� �� ��������   쳲���������
    
    public static int fun(int n) {
    	
    	if( n==1) {
    		return 1 ;
    	} 
    	
    	int first = 1 ;
    	int second = 2 ;
    	
    	for(int i = 3 ; i <= n ;i++) {
    		int third = first + second ;
    		first = second  ;
    		second = third ;
    	}
    	
    	return second ;
    }
    
    // �ⷨ����  �ݹ�
    
    public  static int fun1(int n) {
    	if( n==1) {
    		return 1 ;
    	}
    	
    	if(n==2) {
    		return 2 ;
    	}
    	
    	return  fun1(n-1) + fun1(n-2);
    }
    
 

}
