package luoguEnumViolence;

import java.util.Scanner;


/**
 * @author LZH.create
 *    ������ ���ǲ�����С��
 */
public class P1618 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in) ;
           
           int a = sc.nextInt() ;
           int b = sc.nextInt() ;
           int c = sc.nextInt() ;
           
           int b1 = 0 ;
           int b2 = 0 ;
           
           // int sum = 0 ;
           int sum ;
           int flag = 1;    // �����ж��Ƿ����  No!!!
           
           for(int i = 123 ; i <= 987 ;i++) {  // i Ϊ  a(��һ������) 
        	    sum = 0 ;   // һ��֮����Ҫ��ʼ�� 0
        	    b1 = (i/a)* b ;
        	    b2 = (i/a)* c ;
        	    
        	    if(b1 >987 || b2 >987) break ;
        	    // �������� ͳ��ȥ��
        	    fun(i) ;
        	    fun(b1) ;
        	    fun(b2) ;
        	    
        	    for(int j = 1 ; j<= 9 ;j++) {
        	    	sum += use[j] ; 
        	    }
        	    
        	    if(sum==9) {
        	    	flag = 1 ;
        	    	System.out.println(i + " " + b1 + " " +b2 );
        	    }
        	    
        	    //�����һ���ʼ��� 
        	    for(int j =1; j<= 9 ;j++) {
        	    	use[j] = 0 ;
        	    }
           } 
           
           
           if(flag == 0) {
        	   System.out.println("No!!!");
           }
           
           
	}
	
	// ���������¼�Ƿ��ظ�  �м�¼Ϊ1
	public static int [] use = new int [10] ;
	
	// дһ�����غ���
	public static void fun(int num) {
	   
		while(num!= 0) {
			if( use[num%10] != 1) {  
				use[num%10] = 1 ;
			}
			num/= 10 ;
		}
	}

}
