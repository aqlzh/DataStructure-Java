package leetcodePlan;

public class P0733 {

	public static void main(String[] args) {

		int [][] image =  {{1,1,1},{1,1,0},{1,0,1}} ;
		
		int [][] res = fun(image,1,1,2) ;
		int [][] res2 = fun(image,1,1,2) ;
		
		for(int i = 0 ; i < res.length ;i++) {
			for(int j= 0 ; j < res[0].length ;j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < res2.length ;i++) {
			for(int j= 0 ; j < res2[0].length ;j++) {
				System.out.print(res2[i][j] + " ");
			}
			System.out.println();
		}
 	}

	
	
	//   解法一
	public static int[][] fun(int [][] image,int sr,int sc,int newColor){
		
		 dfs(image, sr, sc, newColor, image[sr][sc]);
		
		return image ;
	}
	
	
	public static void dfs(int [][] image, int sr, int sc,  int newColor , int oldColor) {
		if(sr < 0 ||  sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldColor || newColor == oldColor) {
			return ;    //  进行回溯
		}
		
		
		image[sr][sc] = newColor ;  // 标记，也起到记录节点位置的作用
		
		dfs(image,sr-1,sc,newColor,oldColor) ;
		dfs(image,sr+1,sc,newColor,oldColor) ;
		dfs(image,sr,sc-1,newColor,oldColor) ;
		dfs(image,sr,sc+1,newColor,oldColor) ;
	}
	
	
	// 解法二
	
	  public static  int[][] fun2(int[][] image, int sr, int sc, int newColor) {
	        int currColor = image[sr][sc];
	        if (currColor != newColor) {
	            dfs2(image, sr, sc, currColor, newColor);
	        }
	        return image;
	    }

	   public static void dfs2(int[][] image, int x, int y, int color, int newColor) {
		   int[] dx = {1, 0, 0, -1};
		   int[] dy = {0, 1, -1, 0};
		    
	        if (image[x][y] == color) {
	            image[x][y] = newColor;
	            for (int i = 0; i < 4; i++) {
	                int mx = x + dx[i], my = y + dy[i];
	                if (mx >= 0 && mx < image.length && my >= 0 && my < image[0].length) {
	                    dfs(image, mx, my, color, newColor);
	                }
	            }
	        }
	    }


}
