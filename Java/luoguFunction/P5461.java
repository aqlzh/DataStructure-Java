package luoguFunction;

import java.util.Scanner;


/**
 * @author LZH.create
 * Tips:  ��ʽ������� #31 #32    ע������˳��
 */
public class P5461 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;

		
		int n  = sc.nextInt() ;
		
		int num = (int)Math.pow(2, n) ;
//		int [][]  a = new int[num][num] ;
		int [][] a  = new int [1050][1050] ;
		
		for(int i = 0 ; i < num ;i++) {
			for(int j  =0  ; j < num ;j++) {
		         a[i][j] = 1 ;		
			}
		}
		
		fun(num,a,0,0) ;
		for(int i = 0 ; i < num ;i++) {
			for(int j  =0  ; j < num ;j++) {
				System.out.print(a[i][j]+" ");	      
				if(j%(num-1)==0 && j!=0) System.out.println();
		        
			}
		}
	
	}
	
//	public static void fun(int [][] a) { // �ݹ�
//		
//		if(a[0].length == 1) return ;
//		for(int i = 0 ; i < a[0].length/2 ;i++) {
//			for(int j  =0  ; j < a[0].length/2 ;j++) {
//		         a[i][j] = 0 ;		
//			}
//		}
//	}
	
	
	// ���� �߳� ���� �������� ���еݹ� ��������
	 public static void fun(int len ,int [][] a,int x,int y) { 
		 if(len==2) {   // Ϊ len������ x
             a[x][y] = 0 ;    //  ����a[0][0]
             return ;
		 }
		 
			for(int i = x ; i < x+len/2  ;i++) {          // ��ʼΪ  x ������   0
				for(int j  =y  ; j < y+len/2   ;j++) {     // ��ʼΪ  y ������   0
			         a[i][j] = 0 ;		
				}
			}
			
			// �ݹ�������������
			fun(len/2,a,x+len/2,y) ;
			fun(len/2,a,x+len/2,y+len/2) ;
			fun(len/2,a,x,y+len/2) ;
	 }
	

}
