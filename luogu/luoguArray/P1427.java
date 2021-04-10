package luoguArray;

import java.util.Scanner;

public class P1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)   ;
		int [] arr = new int[100] ;

 		int i = 0 ;
		for(i = 0; i < 100 ; i++) {
           arr[i] = sc.nextInt() ;
           if(arr[i] ==0) break ;
		}
		
		// µ¹ÐòÊä³ö
 		for(int j = i -1 ; j > 0 ; j--) {
 			System.out.print(arr[j] + " ");
 		}
	}

}
