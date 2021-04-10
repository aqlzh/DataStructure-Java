package luoguTest;

import java.util.Scanner;


/**
 * @author LZH.create
 * Date : 2021.3.25  
 *  多位数 所包含 数字 几何    
 *  解法 ： 运用数组  存储  0~9 
 */
public class P1980 {

	
	   static int [] num =new int [10] ;  
     
  
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in) ;
        
        // 初始化   for  循环再主函数内
        for(int i = 0 ; i <= 9 ; i++) {
       	     num[i] = 0 ;
        }
        
        
        int n = sc.nextInt() ;
        int x = sc.nextInt() ;
        
        for(int i = 1 ; i <= n ; i++ ) {
        	if( i/10 == 0) {   // 个位数
        		num[i] ++ ;
        	} else {    // 多位数
        		 breakUp(i) ;
        	}
        }
        System.out.println(num[x]);
	}
	
	
	// 拆分多位数方法
	public static void breakUp(int nums) {
		while(nums != 0) {
			num[nums%10]++ ;
			nums=nums/10 ;
		}
	}

}
