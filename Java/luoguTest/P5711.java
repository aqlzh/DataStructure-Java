package luoguTest;

import java.util.Scanner;

/**
 * @author LZH.create
 *  ����  �ж���������     �ܱ�4 ���� ���ܱ�100 ����  �ܱ�400 ����
 */
public class P5711 {
	

	public static void main(String[] args) {
	  	
      Scanner sc = new Scanner(System.in) ;
      int year = sc.nextInt() ;
      
      if( year%4==0 && year%100 != 0 || year%400 == 0 ) {
    	  System.out.println(1);
      } else {
    	  System.out.println(0);
      }
      
	}

}
