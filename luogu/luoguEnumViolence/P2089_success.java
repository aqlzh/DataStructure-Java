package luoguEnumViolence;

import java.util.Scanner;

public class P2089_success {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in) ;
		
		int n = sc.nextInt() ; 
		long  ans = 0 ;    // 记录方案总数
		int l = 1 ;
        int [] m = new int [10000] ;
		
        for(int a = 1 ; a <= 3 ;a++)
        	for(int b = 1 ; b <= 3 ;b++)
        		for(int c = 1 ; c <= 3 ;c++)
        			for(int d = 1 ; d <= 3 ;d++)
        				for(int e = 1 ; e <= 3 ;e++)
        					for(int f = 1 ; f <= 3 ;f++)
        						for(int g = 1 ; g <= 3 ;g++)
        						   for(int h = 1 ; h <= 3 ;h++)
        						 	  for(int i = 1 ; i <= 3 ;i++)
        								 for(int j = 1 ; j <= 3 ;j++) 
        									if(a+b+c+d+e+f+g+h+i+j == n) {
        										ans++ ;
        										m[l]=a;
                                                l++;
                                                m[l]=b;
                                                l++;
                                                m[l]=c;
                                                l++;
                                                m[l]=d;
                                                l++;
                                                m[l]=e;
                                                l++;
                                                m[l]=f;
                                                l++;
                                                m[l]=g;
                                                l++;
                                                m[l]=h;
                                                l++;
                                                m[l]=i;
                                                l++;
                                                m[l]=j;
                                                l++;//往m数组里倒一种方案中的十个数
        								}
        
           // 因为 m[l]  m[10] --> m[20] -->m[30]  -->m[40] 一直加
          System.out.println(ans);//输出方案数
          
          int j = 0 ;
          for(int i =1 ; i <= ans*10 ;i++) {
        	  System.out.print(m[i]+ " ");
        	  j++ ;
        	  if(j%10==0 ) System.out.println();  // 控制换行 
          }
     
        
    
	}

}
