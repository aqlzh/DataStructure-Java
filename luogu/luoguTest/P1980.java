package luoguTest;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date : 2021.3.25  
 *  ��λ�� ������ ���� ����    
 *  �ⷨ �� ��������  �洢  0~9 
 */
public class P1980 {

	
	   static int [] num =new int [10] ;  
     
  
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in) ;
        
        // ��ʼ��   for  ѭ������������
        for(int i = 0 ; i <= 9 ; i++) {
       	     num[i] = 0 ;
        }
        
        
        int n = sc.nextInt() ;
        int x = sc.nextInt() ;
        
        for(int i = 1 ; i <= n ; i++ ) {
        	if( i/10 == 0) {   // ��λ��
        		num[i] ++ ;
        	} else {    // ��λ��
        		 breakUp(i) ;
        	}
        }
        System.out.println(num[x]);
	}
	
	
	// ��ֶ�λ������
	public static void breakUp(int nums) {
		while(nums != 0) {
			num[nums%10]++ ;
			nums=nums/10 ;
		}
	}

}
