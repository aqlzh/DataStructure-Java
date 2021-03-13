package luoguTest;

import java.util.Scanner;

public class P5708 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		
		int p = (a+b+c)/2 ;
		double temp =  p*(p-a)*(p-b)*(p-c)  ;
		double s1 = Math.sqrt(temp);
		System.out.format("%.1f",s1);
	}

}
