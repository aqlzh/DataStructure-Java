@[toc]

# [题目](https://leetcode-cn.com/problems/01-matrix/)

- 给定一个由 0 和 1 组成的矩阵 mat ，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。

- 两个相邻元素间的距离为 1 。

 
示例 1：

![在这里插入图片描述](https://img-blog.csdnimg.cn/0d8a33254d9e4435bd78675c2df9e537.png)


```bash
输入：mat = [[0,0,0],[0,1,0],[0,0,0]]
输出：[[0,0,0],[0,1,0],[0,0,0]]
```

示例 2：

![在这里插入图片描述](https://img-blog.csdnimg.cn/63da59d41c514ef49110ac885576c5cb.png)

```bash
输入：mat = [[0,0,0],[0,1,0],[1,1,1]]
输出：[[0,0,0],[0,1,0],[1,2,1]]
```

# 题解
- **解法一**：采用`广度优先算法`，换位思考，从0开始离最近邻居的1的距离，再从次出发，距离加1

```bash
_ _ _ _         _ 1 _ _         2 1 2 _         2 1 2 3         2 1 2 3
_ 0 _ _   ==>   1 0 1 _   ==>   1 0 1 2   ==>   1 0 1 2   ==>   1 0 1 2
_ _ _ _         _ 1 _ _         2 1 2 _         2 1 2 3         2 1 2 3
_ _ _ _         _ _ _ _         _ 2 _ _         3 2 3 _         3 2 3 4


```

代码：

```java
package luoguArray;

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

```
- **解法二**： 动态规划， `f(i, j)` 表示位置 `(i, j)`到最近的 0的距离，可以向上移动一步，再移动 `f(i - 1, j)` 步到达某一个 0，也可以向左移动一步，再移动 `f(i, j - 1)` 步到达某一个 0，其中状态转移方程如下：

![在这里插入图片描述](https://img-blog.csdnimg.cn/02f17f13ae494de2b6c2e450b4afb87f.png)


**Tips:  小知识点**    =>    `Arrays.fill(`）

```java
 for (int i = 0; i <= n; i++) {
            Arrays.fill(f[i], Integer.MAX_VALUE);
        }

```

等价于

```java
for (int i = 0; i <= n; i++) {
            for(int j =0 ;j<=m;j++){
               f[i][j] = Integer.MAX_VALUE;
            }
        }
```


代码：

```java
package luoguArray;

public class P0542_2 {

	
	//  解法二： 采用动态规划算法
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
	
	
	public static int[][] fun(int[][] mat) {
		int m = mat.length ;
		int n = mat[0].length ;
		
		int [][] dist = new int[m][n] ;
		// 初始化动态规划数组
		for(int i = 0 ; i < m ;i++) {
			for(int j =0 ; j < n ;j++) {
				dist[i][j] = Integer.MAX_VALUE /2 ;
			}
		}
		
	     for (int i = 0; i < m; ++i) {
	            for (int j = 0; j < n; ++j) {
	                if (mat[i][j] == 0) {
	                    dist[i][j] = 0;
	                }
	            }
	        }

	     
	     
	      //   i 上下       j 左右
	     // 只有 水平向左移动 和 竖直向上移动，注意动态规划的计算顺序
	        for (int i = 0; i < m; ++i) {
	            for (int j = 0; j < n; ++j) {
	                if (i - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
	                }
	                if (j - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
	                }
	            }
	        }
	        // 只有 水平向左移动 和 竖直向下移动，注意动态规划的计算顺序
	        for (int i = m - 1; i >= 0; --i) {
	            for (int j = 0; j < n; ++j) {
	                if (i + 1 < m) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);
	                }
	                if (j - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
	                }
	            }
	        }
	        // 只有 水平向右移动 和 竖直向上移动，注意动态规划的计算顺序
	        for (int i = 0; i < m; ++i) {
	            for (int j = n - 1; j >= 0; --j) {
	                if (i - 1 >= 0) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
	                }
	                if (j + 1 < n) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
	                }
	            }
	        }
	        // 只有 水平向右移动 和 竖直向下移动，注意动态规划的计算顺序
	        for (int i = m - 1; i >= 0; --i) {
	            for (int j = n - 1; j >= 0; --j) {
	                if (i + 1 < m) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);
	                }
	                if (j + 1 < n) {
	                    dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
	                }
	            }
	        }
	        return dist;

		
	}

}

```

