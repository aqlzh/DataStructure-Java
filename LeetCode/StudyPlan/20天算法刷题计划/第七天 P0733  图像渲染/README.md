@[toc]

# [题目](https://leetcode-cn.com/problems/flood-fill/)

- 有一幅以二维整数数组表示的图画，每一个整数表示该图画的像素值大小，数值在 0 到 65535 之间。

- 给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。

- 为了完成上色工作，从初始坐标开始，记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。

- 最后返回经过上色渲染后的图像。

示例 1:

```bash
输入: 
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2
输出: [[2,2,2],[2,2,0],[2,0,1]]
```

解析: 
在图像的正中间，(坐标(sr,sc)=(1,1)),
在路径上所有符合条件的像素点的颜色都被更改成2。
**注意**：右下角的像素没有更改为2，
因为它不是在上下左右四个方向上与初始点相连的像素点。


![在这里插入图片描述](https://img-blog.csdnimg.cn/957018539177409b8339bc169f9c0fe2.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

# 题解
## 深度优先算法
- 我们采用深度优先算法，我们从给定的起点开始（依次上下左右），进行深度优先搜索。每次搜索到一个方格时，如果其与初始位置的方格颜色相同，就将该方格的颜色更新，以防止重复搜索；如果不相同，则进行回溯。

- ==注意==：因为初始位置的颜色会被修改，所以我们需要保存初始位置的颜色，以便于之后的更新操作。（所以在函数传参时，有 oldColor 用于记录）

**代码一**：  （推荐）
- 调用 dfs  递归时，传入 上下左右的值

```java
package leetcodePlan;

public class P0733 {

	public static void main(String[] args) {

		int [][] image =  {{1,1,1},{1,1,0},{1,0,1}} ;
		
		int [][] res = fun(image,1,1,2) ;
		
		for(int i = 0 ; i < res.length ;i++) {
			for(int j= 0 ; j < res[0].length ;j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
 	}

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
	
}

```

**代码二**：
- 利用数组下标表示上下左右的值

```java
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
```

## 广度优先算法
- 使用队列   

```java
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

```


