package leetcodePlan;

import java.util.LinkedList;
import java.util.Queue;

public class P0994 {

	public static void main(String[] args) {
         int [][] grid = {{2,1,1},{1,1,0},{0,1,1}}  ;
         System.out.println(fun(grid));
		
	}

	
	public static int fun(int[][] grid) {
		int m = grid.length ;
		int n = grid[0].length ;
		
		Queue<int[]> queue = new LinkedList<>() ;
		
		// 首先遍历数组，统计新鲜橘子个数，同事将坏橘子放入队列
		
		int count = 0;
		for(int i = 0 ; i < m ;i++) {
			for(int j =0 ; j < n ;j++) {
				if(grid[i][j] == 1) {
					count ++ ;
				} else if(grid[i][j] == 2) {
					queue.add(new int[] {i,j}) ;
				}
			}
		}
		
		
		int round = 0 ;
		while(count > 0 && !queue.isEmpty()) {
			round ++ ;
		    int size = queue.size();
			  
		        for (int i = 0; i < size; i++) {
		        	
		            int[] orange = queue.poll() ;    // 出队
		            int r = orange[0];
		            int c = orange[1];
		            
		            // 上
		            if (r-1 >= 0 && grid[r-1][c] == 1) {
		                grid[r-1][c] = 2;
		                count--;
		                queue.add(new int[]{r-1, c});
		            }
		            
		            // 下
		            if (r+1 < m && grid[r+1][c] == 1) {
		                grid[r+1][c] = 2;
		                count--;
		                queue.add(new int[]{r+1, c});
		            }
		            
		            //左
		            if (c-1 >= 0 && grid[r][c-1] == 1) {
		                grid[r][c-1] = 2;
		                count--;
		                queue.add(new int[]{r, c-1});
		            }
		            
		            // 右
		            if (c+1 < n && grid[r][c+1] == 1) {
		                grid[r][c+1] = 2;
		                count--;
		                queue.add(new int[]{r, c+1});
		            }
		        }
		}
		if(count > 0) {
			return -1 ;
		}else {
			return round ;
		}
	}
}
