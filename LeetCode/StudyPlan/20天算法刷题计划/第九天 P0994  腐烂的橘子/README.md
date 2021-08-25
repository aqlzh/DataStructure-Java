@[toc]

# [题目](https://leetcode-cn.com/problems/rotting-oranges/)

- 在给定的网格中，每个单元格可以有以下三个值之一：

> 值 0 代表空单元格；
>  值 1 代表新鲜橘子；
>   值 2 代表腐烂的橘子。

- 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。

- 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。



示例 1：

![在这里插入图片描述](https://img-blog.csdnimg.cn/6ee20b60df4344c9adb4ed37da3b8879.png)


```bash
输入：[[2,1,1],[1,1,0],[0,1,1]]
输出：4
示例 2：
```

```bash
输入：[[2,1,1],[0,1,1],[1,0,1]]
输出：-1
解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
```


# 题解
- BFS  通常用于求解最短路径问题，BFS 先搜索到的结点，一定是距离最近的结点。
-  首先遍历数组，统计新鲜橘子个数，同时将坏橘子放入队列
- 分别遍历坏橘子上下左右，同时每一次 新鲜橘子减一   `count--`,并将其加入队列



# 代码

```java
package luoguArray;

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
		
		// 首先遍历数组，统计新鲜橘子个数，同时将坏橘子放入队列
		
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

```

