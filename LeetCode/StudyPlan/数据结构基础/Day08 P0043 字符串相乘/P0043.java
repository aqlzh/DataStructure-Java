package leetcodePlan.Base;

public class P0043 {

	public static void main(String[] args) {

		 String num1 = "2" ;
		 String num2 = "3" ;
		 System.out.println(multiply(num1,num2));
	}
	
	
    public static String multiply(String num1, String num2) {
        
    	int n1 = Integer.valueOf(num1) ;
    	int n2 = Integer.valueOf(num2) ;
    	int tmp = n1 * n2 ;
    	String res = String.valueOf(tmp) ;
    	return  res;
    }

}
