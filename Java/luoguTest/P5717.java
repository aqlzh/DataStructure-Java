package luoguTest;

import java.util.Scanner;

public class P5717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		int x = sc.nextInt() ;
		int y = sc.nextInt() ;
		int z = sc.nextInt() ;
		
		
		//可以考虑 排序API   求最大边
	
			
		int m = Max(x,y,z) ;
		if(x == m) {
			int t = x ;
			x = z  ;
			z = t ;
		} else if (y == m) {
			int t = y ;
			y = z  ;
			z = t ;
		} else {
			z = m ;
		}
		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		if(x + y < z) {
			System.out.println("Not triangle");
		} else if (x*x + y*y == z*z) {
		System.out.println("Right triangle");
		} else if (x*x + y*y > z*z ) {
		System.out.println("Acute triangle");
		} else if (x*x + y*y < z*z ) {
			System.out.println("Obtuse triangle");
		}
		
		
		if(x == y) {
			System.out.println("Isosceles triangle");
		}
         if(x==y && x ==z) {
        	 System.out.println("Equilateral triangle");
         }
	}
	
	// 求最大边 c 
	private static int  Max(int a, int b ,int c) {
		if(a > b && a >c) {
			int t = a ;
			a = c ;
			c = t ;
		} else if(b > a && b >c ) {
			int t = b ;
			b = c ;
			c = t ;
		} 
		
		return c ;
	}

}
