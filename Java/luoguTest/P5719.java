package luoguTest;

import java.util.Scanner;

/**
 * @author LZH.create
 * 2021.3.20
 */
public class P5719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in) ;
        
        int n = sc.nextInt() ;
        int k = sc.nextInt() ;
        
        double sum1 = 0,sum2 = 0 ;
        int count1 = 0,count2 = 0 ;
        
        
        for(int i = 1 ; i <= n ; i++) {
        	if( i%k == 0) {
        		sum1 += i ;
        		count1++ ;
        	} else {
        		sum2 += i ;
        		count2++ ;
        	}
        }
        
       // System.out.println(sum1/count1 + " " + sum2/count2);
        System.out.format("%.1f %.1f",sum1/count1,sum2/count2);
	}

}
