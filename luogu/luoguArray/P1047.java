package luoguArray;


import java.util.Scanner;

/**
 * @author LZH.create
 *    思路  运用  0 1  标记 已移除与 未移除
 */
public class P1047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
	    int [] a = new int[2] ; // 分别 存储 区间起终点
	    int [] b = new int[10001] ;
	    int L = 0, M = 0 ;  //  分别为 数轴长度 区间个数
	    int count = 0 ;
	    
    	 L = sc.nextInt() ;
    	 M = sc.nextInt() ;
    	 
    	 for(int i = 0 ; i <= L ; i++) {
    		 b[i] = 0 ;
    	 } 
    	 
    	 for(int i = 1 ; i <= M ; i++) {
    		 for(int j = 0 ; j < 2 ; j++) {
    			a[j] = sc.nextInt() ;   // 覆盖 
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
