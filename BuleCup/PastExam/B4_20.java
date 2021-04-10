package PastExam;

public class B4_20 {
     

		public static long res=Long.MAX_VALUE;
		
		public static long num[]={9090400, 8499400, 5926800, 8547000, 4958200,
				   				  4422600, 5751200, 4175600, 6309600, 5865200, 
				   				  6604400, 4635000, 10663400, 8087200, 4554000
								}; 
	    public static void main(String[] args){
	    	dfs(0, 0, 0);
	    	System.out.println(res);
		}
	    public static void dfs(int k,long sum1,long sum2 ) {
	    	if(k==15) {
	    		res=res<Math.abs(sum1-sum2)?res:Math.abs(sum1-sum2);
	    		return;
	    	}
	    	dfs(k+1, sum1+num[k], sum2);
	    	dfs(k+1, sum1, sum2+num[k]);
	    }
	

}
