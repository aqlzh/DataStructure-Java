> 一研为定，万山无阻

# [题目](https://leetcode-cn.com/problems/climbing-stairs/)
- 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

- 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

```bash
输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
```

示例 2：

```bash
输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
```

 
# 题解
- **解法一**：这题为典型的`动态规划`问题，关键在于爬到第 x 级台阶的方案数是爬到第 x−1 级台阶的方案数和爬到第 x−2 级台阶的方案数的和。     ==有点类似于斐波那契数列==

```java
package leetcodePlan;

public class P0070 {

	public static void main(String[] args) {
              System.out.println(climbStairs(2));
	}
	
    public static int climbStairs(int n) {
           if( n==1) {
        	   return 1 ;
           } 
           int [] dp = new int[n+1] ;
           dp[1] = 1 ;
           dp[2] = 2 ;
    	
           for(int i = 3 ; i <= n ;i++) {
        	   dp[i] = dp[i-1] + dp[i-2] ; 
           }
    	return dp[n]  ;
    }
}
```

- **解法二**：滚动数组法，如下图所示，图源于LeetCode

![](https://img-blog.csdnimg.cn/img_convert/0b0c79ea6c91d340ef6765c79ae03a26.gif)


```java
    public static int fun(int n) {
    	
    	if( n==1) {
    		return 1 ;
    	} 
    	
    	int first = 1 ;
    	int second = 2 ;
    	
    	for(int i = 3 ; i <= n ;i++) {
    		int third = first + second ;
    		first = second  ;
    		second = third ;
    	}
    	return second ;
    }
```

- **解法三**：采取迭代（递归）的策略

```java
    public  static int fun1(int n) {
    	if( n==1) {
    		return 1 ;
    	}
    	
    	if(n==2) {
    		return 2 ;
    	}
    	
    	return  fun1(n-1) + fun1(n-2);
    }
```

