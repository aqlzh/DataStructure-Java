package luoguFunction;

import java.util.Scanner;


/**
 * @author LZH.create
 *   ���� �ܱ�4 ���� ���ܱ�100 ���� �ܱ�400 ����  
 *    ���� ͬʱ��ֵ����  #32   r[j++] = i ;  ���� j  ��������
 */
public class P5737 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int x = sc.nextInt() ;
		int y = sc.nextInt() ;
		int ans = 0 ;
        int j = 0 ;
		
		for(int i = x ; i <= y ;i++) {
			if(rn(i)) {
				ans++ ;
			}
		}
		
		int [] r = new int[ans] ;
		for(int i = x  ; i <= y ;i++) {
   
			if(rn(i)) {
				r[j++] = i ;
			}
		}
		System.out.println(ans);
		
		for(int i : r) {
			System.out.print(i + " ");
		}
		

	}
	
	
	public static Boolean rn(int x) {
		if(x%4==0 && x%100 != 0 || x%400==0) return true ;
		   return false ;
	}

}
