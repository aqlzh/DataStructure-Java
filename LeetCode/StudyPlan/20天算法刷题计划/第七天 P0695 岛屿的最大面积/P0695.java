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
	                if(grid[i][j] == 1) //�ҵ�Ϊ1��½�أ�����DFSʹ֮��ɴ�
	                {
	                    
	                    res = Math.max(res, dfs(i,j,grid,0) );
	                }
	            }
	        }
	        
	
	        return res ;

	    }
	  
	  
	  public static int dfs(int i ,int j ,int[][] grid,int size) {
		  if(i < 0 || j <0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
			  return size;            // �ݹ�߽�  ���� 
		  }
		  
	        grid[i][j] = 0 ; //��¼�ڵ�켣������ļ�¼�����ǳ����������֮���½�ر��ˮ�� 
	        size ++ ;
	        size = dfs(i+1,j,grid,size);  
	        size = dfs(i-1,j,grid,size);
	        size = dfs(i,j+1,grid,size);
	        size = dfs(i,j-1,grid,size);
	        return size ;

	  }
	  
}
