package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author LZH.create
 *    贪心算法之分配饼干问题
  */
public class FindContentChildren {

	public static void main(String[] args) {
       	int [] children = {1,2} ;  //  分别表示孩子的饥饿度
       	int [] cookies = {1,2,3} ;
       	
		System.out.println(fun(children,cookies));
	}
	
	
	public static int fun(int [] children ,int [] cookies) {
		Arrays.sort(children);
		Arrays.sort(cookies);
		
		// 定义两个指针
		int child =  0 ;
		int cookie = 0 ;
		
		while(child < children.length && cookie < cookies.length) {
			if(children[child] < cookies[cookie++]) child++ ;
		}
		
		return child ;
	}
	
	

}
