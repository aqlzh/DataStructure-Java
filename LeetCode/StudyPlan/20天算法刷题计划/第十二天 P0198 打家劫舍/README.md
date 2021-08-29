> 一研为定，万山无阻

@[toc]
# [题目](https://leetcode-cn.com/problems/house-robber/)

- 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

- 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。

 

示例 1：

```bash
输入：[1,2,3,1]
输出：4
解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     偷窃到的最高金额 = 1 + 3 = 4 。
```

示例 2：

```bash
输入：[2,7,9,3,1]
输出：12
解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     偷窃到的最高金额 = 2 + 9 + 1 = 12 
```

 
- **题目大意**： 在一个一维数组中如何选取至最大值，注意不能选取两个相邻的元素。

# 题解
 -  采取动态规划解法，首先找出`递推表达式`

-  情况分析
   1. 如果只有一间房子，那么就选取该房子
   2. 如果有两间房子，那么就选取这两间房子最大者
   3. 对于 k 间房子 （K > 2）,判断条件为 是否选取该间房子  ①是，那么总金额为 前 k-2 的最高金额与 k 间房屋的金额总和    ② 否，总金额为 前 k-1 房间的最高金额。


![在这里插入图片描述](https://img-blog.csdnimg.cn/cc5ac028a52441eca10a7555c10fe9e9.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

```java
	public static int fun(int [] num) {
		if(num == null || num.length ==0) {
			return 0  ;
		}
		
		int length = num.length ;
		if(length == 1) {
			return num[0] ;
		}
			
		int [] dp = new int[length] ;
		dp[0] = num[0] ;
		dp[1] = Math.max(num[0], num[1]) ;
		
		for(int i = 2 ; i < length ;i++) {
			dp[i] = Math.max(dp[i-2] + num[i], dp[i-1]) ;
		}
		
		return dp[length -1] ;   // 返回最后一个值
	}
```

- 动态规划结合`滚动数组`

 - 因为所求只依赖于前两个状态，所以可以采用滚动数据的方法降低空间复杂度。

```java
public static int fun1(int [] num) {
		if(num == null || num.length ==0) {
			return 0  ;
		}
		
		int length = num.length ;
		if(length == 1) {
			return num[0] ;
		}
			
	    int  first = num[0] ;
	    int second = Math.max(num[0], num[1]) ;
		
		for(int i = 2 ; i < length ;i++) {
			 int tmp = second ;
			 second = Math.max(first + num[i], second) ;
			 first = tmp ;
		}
		
		return second ;    // 返回最后一个值
		
	}
```

