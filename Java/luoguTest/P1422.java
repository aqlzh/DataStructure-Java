package luoguTest;

import java.util.Scanner;

public class P1422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		
		int a = sc.nextInt() ;
		
		double sum = 0 ;
		if (a <= 150) {
			sum = a * 0.4463 ;
		} else if( a >= 151 && a <=400) { 
			sum = 150 * 0.4463 + (a - 150) *  0.4663 ;
		} else {
			sum = 150 * 0.4463 + (400 - 150) *  0.4663 + (a - 400) * 0.5663;
		}
		
		System.out.format("%.1f",sum);

	}

}
