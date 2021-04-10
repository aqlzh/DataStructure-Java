package BaseFunction;

public class islands_DFS {

	
	public static void main(String [] args) {
		
		char [][] grid = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','1'}
		} ;

		
		
		System.out.println(numIslands(grid));
	}
	
    public static int numIslands(char[][] grid) {
        int res = 0 ;
        for(int i = 0 ; i < grid.length ; i ++)
        {
            for(int j = 0 ; j < grid[0].length ; j++)
            	
            	// 有点类似于  无向连通图
            {
                if(grid[i][j] == '1') //找到为1的陆地，调用DFS使之变成大海
                {
                    res ++ ; //记录调用的次数
                    dfs(i,j,grid) ;
                }
            }
        }
        
        return res ;
       
       
        
    }
    
    
    public static void dfs(int i , int j ,char[][] grid) //grid为输入的二维数组，i，j为小蛇的位置
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') //“撞南墙”
            return ;
        grid[i][j] = '0' ; //记录节点轨迹，这里的记录方法非常巧妙，将访问之后的陆地变成水，小蛇自然不会再去访问了
        dfs(i+1,j,grid); //递归调用，来控制小蛇的方向：左右上下
        System.out.println(i);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }

}
