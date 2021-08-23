package leetcodePlan;

public class P0695 {

	public static void main(String[] args) {
         int [][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,1,1,0,1,0,0,0,0,0,0,0,0},
                     {0,1,0,0,1,1,0,0,1,0,1,0,0},
                     {0,1,0,0,1,1,0,0,1,1,1,0,0},
                     {0,0,0,0,0,0,0,0,0,0,1,0,0},
                     {0,0,0,0,0,0,0,1,1,1,0,0,0},
                     {0,0,0,0,0,0,0,1,1,0,0,0,0}} ;
         
         
         System.out.println(maxAreaOfIsland(grid));
             
	}

	
	  public static int maxAreaOfIsland(int[][] grid) {
		  
		    int res = 0 ;
		    
	        for(int i = 0 ; i < grid.length ; i ++)
	        {
	            for(int j = 0 ; j < grid[0].length ; j++)
	            {
	                if(grid[i][j] == 1) //找到为1的陆地，调用DFS使之变成大海
	                {
	                    
	                    res = Math.max(res, dfs(i,j,grid,0) );
	                }
	            }
	        }
	        
	
	        return res ;

	    }
	  
	  
	  public static int dfs(int i ,int j ,int[][] grid,int size) {
		  if(i < 0 || j <0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
			  return size;            // 递归边界  回溯 
		  }
		  
	        grid[i][j] = 0 ; //记录节点轨迹，这里的记录方法非常巧妙，将访问之后的陆地变成水， 
	        size ++ ;
	        size = dfs(i+1,j,grid,size);  
	        size = dfs(i-1,j,grid,size);
	        size = dfs(i,j+1,grid,size);
	        size = dfs(i,j-1,grid,size);
	        return size ;

	  }
	  
}
