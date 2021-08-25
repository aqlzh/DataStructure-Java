package leetcodePlan;

import java.util.LinkedList;
import java.util.Queue;

public class P0542 {

	public static void main(String[] args) {

		int [][] mat = {{0,0,0},{0,1,0},{1,1,1}} ;
		
		int [][] res = fun(mat) ;
		for(int i =0 ; i <res.length ; i++) {
			for(int j =0 ; j <res[0].length ;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		
	}
	
	static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	
	//   解法一   广度优先算法 
    public static int[][] fun(int[][] mat) {
    	int m = mat.length ;
    	int n = mat[0].length ;
    	
    	int [][] dist = new int[m][n] ;
    	boolean [][] visted = new boolean[m][n] ;
    	Queue<int[]> queue = new LinkedList<int[]>() ;
    	
    	// 将初始的零 加入队列
    	for(int i =0 ; i < m ;i++) {
    		for(int j = 0 ; j < n ; j++) {
    			if(mat[i][j] ==0) {
    				queue.offer(new int[] {i,j}) ;
    				visted[i][j] = true ;
    			}
    		}
    	}
    	

    	
    	// 开始广度优先
    	while(!queue.isEmpty()) {
    		int [] cell = queue.poll() ;  // 存储下标   且出队
    		int i = cell[0] ;
    		int j = cell[1] ;
    		
    		for(int d =0 ; d < 4 ;d++) {
    			int i1 = i + dirs[d][0] ;
    			int j1 = j + dirs[d][1] ;
    			
    			if(i1 >= 0 && i1 < m && j1 >= 0 && j1 < n && visted[i1][j1]== false) {   // 注意有 = 
    				dist[i1][j1] = dist[i][j] + 1 ;
    				queue.offer(new int[] {i1,j1}) ;
    				visted[i1][j1] = true ; // 标记以访问
    				
    			}
    		}
    	}
    		
       
    	return dist ;
    }
    


}
