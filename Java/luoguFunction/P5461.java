package luoguFunction;

import java.util.Scanner;


/**
 * @author LZH.create
 * Tips:  格式控制输出 #31 #32    注意两者顺序
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
	
//	public static void fun(int [][] a) { // 递归
//		
//		if(a[0].length == 1) return ;
//		for(int i = 0 ; i < a[0].length/2 ;i++) {
//			for(int j  =0  ; j < a[0].length/2 ;j++) {
//		         a[i][j] = 0 ;		
//			}
//		}
//	}
	
	
	// 传入 边长 矩阵 横纵坐标 进行递归 类似于树
	 public static void fun(int len ,int [][] a,int x,int y) { 
		 if(len==2) {   // 为 len而不是 x
             a[x][y] = 0 ;    //  不是a[0][0]
             return ;
		 }
		 
			for(int i = x ; i < x+len/2  ;i++) {          // 初始为  x 而不是   0
				for(int j  =y  ; j < y+len/2   ;j++) {     // 初始为  y 而不是   0
			         a[i][j] = 0 ;		
				}
			}
			
			// 递归其余三处矩阵
			fun(len/2,a,x+len/2,y) ;
			fun(len/2,a,x+len/2,y+len/2) ;
			fun(len/2,a,x,y+len/2) ;
	 }
	

}
