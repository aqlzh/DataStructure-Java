> 所有热爱的事情都要不遗余力   


# [题目](https://leetcode-cn.com/problems/triangle/)
- 给定一个三角形 triangle ，找出自顶向下的最小路径和。

- 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 

 
示例 1：

```bash
输入：triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
输出：11
解释：如下面简图所示：
   2
  3 4
 6 5 7
4 1 8 3
自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
```

# 题解
- 分析得。采取动态规划 , `至低向上递推` 

- 状态定义  `dp[i][j]`表示从点`(i,j)`到底边的最小路径和。
- ==状态转移== ：   `dp[i][j]=min (dp[i+1][j], dp[i+1][j+1])     + triangle[i][j]`


# 代码

```java
package leetcodePlan;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P0120 {

	public static void main(String[] args) {

		    //List<List<Integer>> triangle = [[2],[3,4],[6,5,7],[4,1,8,3]] ;
			// {{2},{3,4},{6,5,7},{4,1,8,3}} ;
		
		//  初始化
		List<List<Integer>> triangle = new ArrayList<>();
		Deque<Integer> row1 = new ArrayDeque<>(1);
		Deque<Integer> row2 = new ArrayDeque<>(2);
		Deque<Integer> row3 = new ArrayDeque<>(3);
		Deque<Integer> row4 = new ArrayDeque<>(4);
		row1.addLast(2);
		
		row2.addLast(3) ;
		row2.addLast(4) ;
		
		row3.addLast(6);
		row3.addLast(5);
		row3.addLast(7);
		
		row4.addLast(4);
		row4.addLast(1);
		row4.addLast(8);
		row4.addLast(3);
		
		
		triangle.add(new ArrayList<>(row1)) ;
		triangle.add(new ArrayList<>(row2)) ;
		triangle.add(new ArrayList<>(row3)) ;
		triangle.add(new ArrayList<>(row4)) ;
		
		
		System.out.println(fun(triangle));
	}
	
	public static int fun(List<List<Integer>> triangle) {
		int n = triangle.size() ;    // 有点类似于  二维数组
		
		int [][] dp = new int[n+1][n+1] ;
		
		
		//  从三角形得最后一行  开始递归
		
		for(int i = n -1 ; i >= 0 ; i-- ) {    // 行
			for(int j = 0 ; j <= i ;j++) {     // 列
				dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1] )+ triangle.get(i).get(j) ;
			}
		}
		
		return dp[0][0] ;
	}

}

```



 
