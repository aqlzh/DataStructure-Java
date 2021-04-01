package luoguArray;

import java.util.Scanner;

public class P1554 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int M = sc.nextInt() ;
		int N = sc.nextInt() ;
		
	
		int [] arr = new int [10] ;
		int s0=0,s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0,s8=0,s9=0 ;
		
	
		
		for(int i = M ; i <= N ;i++) {
		
			 int temp = i ;
			while(temp >0) {   // 一定要重新定义 temp  而不是  i(i一直不变 没有% 与 i)
				
//				temp = i%10 ;  错误   -->   i在这里不变   (x)
//				temp  = temp%10 ;   发现异常（与预期不对    鸭子法（跟着程序走一遍））   
				
				if(temp%10 == 0) {   
					arr[0]++ ;
			
				}else if(temp%10 ==1) {
					arr[1]++ ;
				}else if(temp%10 == 2) {
					arr[2]++ ;
				}else if(temp%10 == 3) {
					arr[3]++ ;
				}else if(temp%10 == 4) {
					arr[4]++ ;
				}else if(temp%10 == 5) {
					arr[5]++ ;
				}else if(temp%10 == 6) {
					arr[6]++ ;
				}else if(temp%10 == 7) {
					arr[7]++ ;
				}else if(temp%10 == 8) {
					arr[8]++ ;
				}else if(temp%10 == 9) {
					arr[9]++ ;
				}
		
				
				temp/=10 ;
			}	
		}
		
		
		for(int i = 0 ; i <10 ;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
