package SimulationGame11;

import java.util.Scanner;

/**
 * @author LZH.create
 *      第十一届蓝桥杯模拟赛  旋转矩阵  打断点测试
  */
public class rotateMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ;
		int m = sc.nextInt() ;
		int x = sc.nextInt() ;
		int y = sc.nextInt()  ;
		
		int [][] arr = new int[m][n] ;
		
		 //System.out.println(array01.length);  // 矩阵行  
	     //System.out.println(array01[0].length);  // 矩阵列 
	        
		int temp = 1 ;
		
		int up = 0 ;
		int down = arr.length-1 ;
		int left = 0 ;	
		int right = arr[0].length - 1 ;
		
        while(true){
       
            for(int i=left; i<=right; ++i)    // 右
                arr[up][i]=temp++;   
            
                if(++up>down) break;  // 上有 up 参数所以这里是 up 约束条件
            for(int i=up; i<=down; ++i)      // 下
            	arr[i][right]=temp++;
            
                if(--right<left)  break;
            for(int i=right; i>=left; --i)   // 左
            	arr[down][i]=temp++;
            
                if(--down<up) break;
            for(int i=down; i>=up; --i)     // 上    这里的 up 变为 1
                arr[i][left]=temp++;
            
                if(++left>right)  break;
        }

			
        System.out.println(arr[x-1][y-1]);
	}

}
