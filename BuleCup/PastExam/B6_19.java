package PastExam;

import java.util.Scanner;

/**
 * @author LZH.create
 *    ��ʮ�����ű�ʡ��   19��
 *    Date : 21.4.14
 *     
 */
public class B6_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		
	    int n = sc.nextInt() ;
		int sum = 0 ;
		
		for(int i = 1 ; i <= n ;i++) {
			int b = i ;
			while(b !=0) {  // ����� b  �ǽ�ֹ����Ŷ 
		         int a  = b%10 ;
		         if(a == 2 || a ==0 || a==1 || a==9) {
		        	 sum += i ;
		         }
		    
		         b/=10 ;
			}
		}
	}

}
