package luoguFunction;

import java.util.Scanner;

/**
 * @author LZH.create
 *   集合求和 性质与规律  
 *   
 */

// eg : 1 2 3 4
//子集[] [1] [2] [3] [4] [1 2] [1 3] [1 4] [2 3] [2 4] [3 4] [1 2 3] [1 2 4] [1 3 4] [2 3 4] [1 2 3 4]
//1*8+2*8+3*8+4*8=(1+2+3+4)*2^(4-1) 
//规律 : 输入元素和*2^(n-1) 
public class P2415 {

	
	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in) ;
		
		String str =  sc.nextLine() ;
		
		long sum = 0 ;
		String [] a = new String[35] ;
		a = str.split(" ");
		int n  = a.length ;
		for(int i = 0 ; i < a.length ;i++) {
			sum += Integer.parseInt(a[i]) ;
		}
		
		System.out.println((long)(sum * Math.pow(2, n-1)));
	}

}
