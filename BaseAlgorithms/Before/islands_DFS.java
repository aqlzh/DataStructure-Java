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
            	
            	// �е�������  ������ͨͼ
            {
                if(grid[i][j] == '1') //�ҵ�Ϊ1��½�أ�����DFSʹ֮��ɴ�
                {
                    res ++ ; //��¼���õĴ���
                    dfs(i,j,grid) ;
                }
            }
        }
        
        return res ;
       
       
        
    }
    
    
    public static void dfs(int i , int j ,char[][] grid) //gridΪ����Ķ�ά���飬i��jΪС�ߵ�λ��
    {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') //��ײ��ǽ��
            return ;
        grid[i][j] = '0' ; //��¼�ڵ�켣������ļ�¼�����ǳ����������֮���½�ر��ˮ��С����Ȼ������ȥ������
        dfs(i+1,j,grid); //�ݹ���ã�������С�ߵķ�����������
        System.out.println(i);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
    }

}
