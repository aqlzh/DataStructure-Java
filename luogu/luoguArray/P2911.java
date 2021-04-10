package luoguArray;

import java.util.Arrays;
import java.util.Scanner;

public class P2911 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int a = sc.nextInt() ;
		int b = sc.nextInt()  ;
		int c  = sc.nextInt() ;
		
	
		int [] r = new int[a * b *c ] ;
		int [] res = new int[a * b *c ] ;
		int [] res2 = new int[a * b *c ] ;
		int count = 0 ;
		int num = 0 ;
		
		for(int i = 1 ; i <= a ; i++) {
			for(int j = 1 ; j <= b ; j++) {
				for(int k = 1 ; k <= c ; k++) {
					r[count] = i + j + k ;
					count ++ ;
				}
			}
		}
		

//        for(int k : r) {
//        	System.out.println(k);
//        }
		
		
		for(int i = 0 ; i < a*b*c ;i++) {
			int index = r[i] ;
			res[index] ++ ;
		}
		
//		for(int i =0 ; i < res.length ; i++) {
//			System.out.println(i + "³öÏÖ" + res[i] + "´Î");
//		}
//		
		for(int i =0 ; i < res.length ; i++) {
			res2[i] = res[i] ; 
		}
		
		
		
		Arrays.sort(res);
//		System.out.println(res[a*b*c-1]);
		
		for(int i =0 ; i < res.length ; i++) {
			if(res2[i] ==res[a*b*c-1] ) {
				System.out.println(i);
				break ;
			}
		}
		
	}

}
