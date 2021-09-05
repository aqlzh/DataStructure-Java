package leetcodePlan.Base;

public class P0415 {

	
	//   双指针 模拟人工加法
	public static void main(String[] args) {

	    String num1 ="12" ;
	    String num2 = "12" ;
	    System.out.println(fun(num1,num2));
	}
	
	public static String fun(String num1, String num2) {
		StringBuilder res = new StringBuilder("") ;
		// 记录双指针 以及进位 
		int i = num1.length() - 1 , j = num2.length() - 1  , carry = 0 ;
		
		while(i >= 0 || j >= 0 ) {    // 只要一个还有值
			int n1 = i >=0  ? num1.charAt(i) - '0' : 0 ;
			int n2 = j >=0  ? num2.charAt(j) - '0' : 0 ;
			
			int tmp = n1+n2 + carry ;
			carry = tmp/10 ;
			res.append(tmp%10) ;
			i-- ; 
			j-- ;
		}
		if(carry == 1) res.append(1) ; //   注意考虑最后一位进位
		return  res.reverse().toString() ;
	}

}
