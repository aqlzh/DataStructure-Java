package luoguTest;

import java.util.Scanner;

public class P5712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int a = sc.nextInt() ;
		
		if(a == 0) {
			System.out.println("Today, I ate 0 apple.");
		} else if( a == 1){
			System.out.println("Today, I ate 1 apple.");
		} else {
			System.out.format("Today, I ate %d apples.",a);
		}
	}

}
