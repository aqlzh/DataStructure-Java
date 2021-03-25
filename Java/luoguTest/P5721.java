package luoguTest;

import java.util.Scanner;


/**
 * @author LZH.create
 *  双重   for 循环
 *  
 *  
 *  
 *  外层循环控制行数   内层循环打印 *
 *  
 *  
 *            *
 *            * *   
 *            * * *
 *            * * * *
 *            * * * * * 
 *            * * * * * *
 *            * * * * * * *
 */
public class P5721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int a = sc.nextInt() ;
		int n = 0 ;
		
		for(int i = 0 ; i < a ; i++) {
			for(int j = i ; j < a ; j++ ) {
				n  ++ ;
				if (n < 10) {
					System.out.print("0");
				} 
				System.out.print(n);
			}
			System.out.println();
		}

	}

}
