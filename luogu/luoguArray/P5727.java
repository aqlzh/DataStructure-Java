package luoguArray;

import java.util.Scanner;

public class P5727 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int [] arr = new int[100] ;
		int i = 1 ;
		int a = sc.nextInt() ;
		
		arr[0] = a  ;
		
		while(a != 1) {
			if(a%2==0) {
				arr[i] = a/2 ;
				a= arr[i] ;
				i++ ;
			} else { 
				a = a * 3 + 1 ;
				arr[i] =  a;
				i++ ;
			}
		}
	 for(int j = i -1  ; j >= 0 ; j--) {
		 System.out.print(arr[j]+ " ");
	 }
		
	}

}
