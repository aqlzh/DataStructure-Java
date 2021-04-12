package luoguEnumViolence;

import java.util.Scanner;

/**
 * @author LZH.create
 *     直接暴力枚举
 */
public class P2089_faile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in) ;
		
		int n = sc.nextInt() ; 
		long  m = 0 ;    // 记录方案总数
		
        for(int a = 1 ; a <= 3 ;a++)
        	for(int b = 1 ; b <= 3 ;b++)
        		for(int c = 1 ; c <= 3 ;c++)
        			for(int d = 1 ; d <= 3 ;d++)
        				for(int e = 1 ; e <= 3 ;e++)
        					for(int f = 1 ; f <= 3 ;f++)
        						for(int g = 1 ; g <= 3 ;g++)
        						   for(int h = 1 ; h <= 3 ;h++)
        						 	  for(int i = 1 ; i <= 3 ;i++)
        								 for(int j = 1 ; j <= 3 ;j++) {
        									if(a+b+c+d+e+f+g+h+i+j == n) m++ ;
        								}
        
        System.out.println(m);
        
        for(int a = 1 ; a <= 3 ;a++)
        	for(int b = 1 ; b <= 3 ;b++)
        		for(int c = 1 ; c <= 3 ;c++)
        			for(int d = 1 ; d <= 3 ;d++)
        				for(int e = 1 ; e <= 3 ;e++)
        					for(int f = 1 ; f <= 3 ;f++)
        						for(int g = 1 ; g <= 3 ;g++)
        						   for(int h = 1 ; h <= 3 ;h++)
        						 	  for(int i = 1 ; i <= 3 ;i++)
        								 for(int j = 1 ; j <= 3 ;j++) {
        									if(a+b+c+d+e+f+g+h+i+j == n) 
        										System.out.print(a+"");
        									    System.out.print(b+"");
        									    System.out.print(c+"");
        									    System.out.print(d+"");
        									    System.out.print(e+"");
        									    System.out.print(f+"");
        									    System.out.print(g+"");
        									    System.out.print(h+"");
        									    System.out.print(i+"");
        									    System.out.print(j+"");
        								}
        
        
        
	}

}
