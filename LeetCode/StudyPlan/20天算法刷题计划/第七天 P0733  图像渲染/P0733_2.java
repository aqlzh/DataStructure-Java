package leetcodePlan;

import java.util.LinkedList;
import java.util.Queue;

public class P0733_2 {

	public static void main(String[] args) {
	  int [][] image =  {{1,1,1},{1,1,0},{1,0,1}} ;
		
		int [][] res2 = fun(image,1,1,2) ;
		
		for(int i = 0 ; i < res2.length ;i++) {
			for(int j= 0 ; j < res2[0].length ;j++) {
				System.out.print(res2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
    public static int[][] fun(int[][] image, int sr, int sc, int newColor) {
    	
    	   int[] dx = {1, 0, 0, -1};
    	   int[] dy = {0, 1, -1, 0};
    	    
        int currColor = image[sr][sc];
        if (currColor == newColor) {
            return image;
        }
        int n = image.length, m = image[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;
        
        while (!queue.isEmpty()) {
        	
        	// 对出队的元素操作
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx >= 0 && mx < n && my >= 0 && my < m && image[mx][my] == currColor) {
                    queue.offer(new int[]{mx, my});
                    image[mx][my] = newColor;
                }
            }
        }
        return image;
    }



}
