package BaseFunction;

import java.util.LinkedList;
import java.util.Queue;

public class islands_BFS {

	// �������   --->  ����
	
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
    
    
    // #  46  55��56   ���������
    public static void bfs(int p , int q , Queue<Integer> queue,char[][] grid){
    	int m  = grid.length ;
    	int n  = grid[0].length ;
    	
    	int t  = Math.max(m, n) ;
    	int w  = p*t + q ;   // ����ά�������Ϊ һά����  ������Ϊһ��     
    	
    	queue.offer(w) ;  // ���
    	grid[p][q] = '0' ;
    	
    	while(!queue.isEmpty()) {
    		int s  = queue.poll() ;   // ����ͷ  ��������Ҫ��������ⲻ���������·���������ڱ�����ʹ��û�м�¼����
    		int i = s/t ;
    		int j = s%t ;
    		
    		if(i + 1 < m && grid[i+1][j] != '0') {    // ��
    			 queue.offer((i+1)*t + j);
                 grid[i+1][j] = '0';
    		}
    		
    		
    		if(i - 1 >= 0 && grid[i-1][j] != '0') {   // ��
   			 queue.offer((i-1)*t + j);
                grid[i-1][j] = '0';
   		    }
    		
    		
    		if(j - 1 >= 0 && grid[i][j-1] != '0')  // ������������//��
            {
                queue.offer(i*t + j-1);
                grid[i][j-1] = '0';
            }
            if(j + 1 < n && grid[i][j+1] != '0')    // ������������//��
            {
                queue.offer(i*t + j+1);
                grid[i][j+1] = '0';
            }
    			  	
         
      }


    }
    
 }
    	
