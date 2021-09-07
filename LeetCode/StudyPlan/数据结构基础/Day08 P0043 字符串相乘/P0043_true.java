package leetcodePlan.Base;

public class P0043_true {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "2" ;
		String num2 = "3"  ;
		
		
		System.out.println(multiply(num1,num2));
	}
	
    public static String multiply(String num1, String num2) {
    	
    	if(num1.equals("0") || num2.equals("0")) {
    		return "0" ;
    	}
    	
    	int [] res = new int[num1.length() + num2.length()] ;
    	
    	 for (int i = num1.length() - 1; i >= 0; i--) {
             int n1 = num1.charAt(i) - '0';
             for (int j = num2.length() - 1; j >= 0; j--) {
                 int n2 = num2.charAt(j) - '0';
                 int sum = (res[i + j + 1] + n1 * n2);
                 res[i + j + 1] = sum % 10;
                 res[i + j] += sum / 10;
             }
         }

         StringBuilder result = new StringBuilder();
         for (int i = 0; i < res.length; i++) {
             if (i == 0 && res[i] == 0) continue;
             result.append(res[i]);
         }
         return result.toString();

 
    }

}
