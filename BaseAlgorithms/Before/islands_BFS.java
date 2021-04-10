package BaseFunction;

import java.util.LinkedList;
import java.util.Queue;

public class islands_BFS {

	// 层序遍历   --->  队列
	
	public static void main(String [] args) {
		
		char [][] grid = {
				{'1','1','1','1','0'},    // 4 x 5 
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','1'}
		} ;

		
		
		System.out.println(numIslands(grid));
	}
	
    public static  int numIslands(char [][] grid) {
    	Queue<Integer> queue = new LinkedList<Integer>() ;
        int num = 0 ;
        for(int i = 0 ; i < grid.length ; i ++)
        {
            for(int j = 0 ; j < grid[0].length ; j ++)
            {
                if(grid[i][j] == '1')
                {
                    bfs(i,j,queue,grid) ;
                    num ++ ;
                }
            }
        }
        return num ;
    	
    }
    
    
    // #  46  55，56   编码与解码
    public static void bfs(int p , int q , Queue<Integer> queue,char[][] grid){
    	int m  = grid.length ;
    	int n  = grid[0].length ;
    	
    	int t  = Math.max(m, n) ;
    	int w  = p*t + q ;   // 将二维数组编译为 一维数组  将其连为一串     
    	
    	queue.offer(w) ;  // 添加
    	grid[p][q] = '0' ;
    	
    	while(!queue.isEmpty()) {
    		int s  = queue.poll() ;   // 检索头  由于所需要解决的问题不在于求最短路径，而在于遍历，使用没有记录步数
    		int i = s/t ;
    		int j = s%t ;
    		
    		if(i + 1 < m && grid[i+1][j] != '0') {    // 上
    			 queue.offer((i+1)*t + j);
                 grid[i+1][j] = '0';
    		}
    		
    		
    		if(i - 1 >= 0 && grid[i-1][j] != '0') {   // 下
   			 queue.offer((i-1)*t + j);
                grid[i-1][j] = '0';
   		    }
    		
    		
    		if(j - 1 >= 0 && grid[i][j-1] != '0')  // 　　　　　　//左
            {
                queue.offer(i*t + j-1);
                grid[i][j-1] = '0';
            }
            if(j + 1 < n && grid[i][j+1] != '0')    // 　　　　　　//右
            {
                queue.offer(i*t + j+1);
                grid[i][j+1] = '0';
            }
    			  	
         
      }


    }
    
 }
    	
