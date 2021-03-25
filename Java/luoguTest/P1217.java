package luoguTest;

import java.util.Scanner;



/**
 * @author LZH.create
 * solution:  先确定  素数  然后  确定回文数
 */
public class P1217 {

	public static void main(String[] args) {
   
		Scanner sc = new Scanner(System.in) ;
		
		long a = sc.nextLong() ;
		long b = sc.nextLong() ;
		
		
		
		
		if(b>10000000) {
			for (long i=a; i<=10000000; i++)
				if ((hws(i))&&(ss(i))) {
					System.out.println(i);
				}
					
		} else {
			for(long j = a ; j < b ;j++) {
				if(ss(j) && hws(j)) {
					System.out.println(j);
				}
			}
		}
		
		
		
//		
//		for(int i = a ; i <= b ;i++) {
//			int j = 2 ;
//			
//			while(i % j != 0) {
//				j ++ ;
//			} 
//			
//			if(i==j) {   // 素数
//				if(i/10 == 0) {
//					System.out.println(i);
//				} 
//				
//				String s = ""+i ;
//				double l = s.length() ;  //数字长度
//				int d = (int)(Math.ceil(l/2)) ;
//				
//				int [] ds = new int[d]  ; // 存储位数的数组
//				
//				// 初始化 数组
//				
//				for(int c = 0 ; c < d ;c++) {
//					ds[c] = c ;
//				}
				
				// 关键  for  循环的个数 
//				for (d = 1; d1 <= 9; d1+=2) {    // 只有奇数才会是素数
//				     for (d2 = 0; d2 <= 9; d2++) {
//				         for (d3 = 0; d3 <= 9; d3++) {
//				           palindrome = 10000*d1 + 1000*d2 +100*d3 + 10*d2 + d1;//(处理回文数...)
//				         }
//				     }
//				 }
				
				
//			}
//		}
//		
	}
	
	
	public static Boolean ss(long  n) {
		for(int i = 2 ; i < Math.sqrt(n) ; i++)
			 if (n%i==0) return false;
			return true ;
	}
	
	public static Boolean hws(long n) {
		long num = 0 ;
		long y = n ;
		
		while(y!=0) {
			num = num*10+y%10 ;
			y/=10;
		}
		
		if(num == n) return true ;
		else return false ;
	}

}
