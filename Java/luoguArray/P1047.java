package luoguArray;


import java.util.Scanner;

/**
 * @author LZH.create
 *    ˼·  ����  0 1  ��� ���Ƴ��� δ�Ƴ�
 */
public class P1047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
	    int [] a = new int[2] ; // �ֱ� �洢 �������յ�
	    int [] b = new int[10001] ;
	    int L = 0, M = 0 ;  //  �ֱ�Ϊ ���᳤�� �������
	    int count = 0 ;
	    
    	 L = sc.nextInt() ;
    	 M = sc.nextInt() ;
    	 
    	 for(int i = 0 ; i <= L ; i++) {
    		 b[i] = 0 ;
    	 } 
    	 
    	 for(int i = 1 ; i <= M ; i++) {
    		 for(int j = 0 ; j < 2 ; j++) {
    			a[j] = sc.nextInt() ;   // ���� 
    		 } 
    		 for(int j = 0 ; j <= L ; j++) {
    			 if(j >= a[0] && j <= a[1]) {
    				 b[j] = 1 ;
    			 }
    		 }
    	 }
	 
	    
    	 for(int i = 0 ; i <= L ; i++) {
    		 if(b[i] == 0) {
    			 count ++ ;
    		 }
    	 }
	    
		
		System.out.println(count);
		
	}

}
