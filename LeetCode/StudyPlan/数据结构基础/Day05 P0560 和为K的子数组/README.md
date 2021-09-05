> 解题快如CPU , 记忆牢如RROM

@[toc]
# [题目](https://leetcode-cn.com/problems/subarray-sum-equals-k/)

- 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。

示例 1 :

```bash
输入:nums = [1,1,1], k = 2
输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
```
# 题解
- 数组问题擅用 ==前缀和 后缀和==
- **解法一**： 暴力枚举，时间复杂度太高
- **解法二**：利用前缀和 + 哈希表  


- `V getOrDefault(Object key, V defaultValue)`   返回到指定键所映射的值，或 defaultValue如果此映射包含该键的映射。  
 
![在这里插入图片描述](https://img-blog.csdnimg.cn/c389219c8054493d8b42b8e7ec58a4dd.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_18,color_FFFFFF,t_70,g_se,x_16)
- 精彩之处在于， `pre[i] = pre[i-1] + nums[i] ;`   前缀和表达式
- `pre[i] - pre[j-1] = k`   表示  这两个前缀中间的数字相加就是 k

# 代码

```java
package leetcodePlan.Base;
 
import java.util.HashMap;

public class P0560 {

	public static void main(String[] args) {

		int [] nums = {1,1,1} ;
		int k = 2 ;
		System.out.println(fun(nums,k));
	}
	
	
	public static int fun(int [] nums,int k ) {
		int count = 0 ;
		int pre = 0 ;   // 记录前面数字相加之和
		
		// 用于记录前几个数字之和为 K 出现相同和的次数为 V
		HashMap<Integer,Integer> map = new HashMap<>() ; 
		// 初始化
		map.put(0, 1) ;
		 
		for(int i = 0 ; i <nums.length ;i++) {
			pre+= nums[i] ;  // 前缀 和
			
			if(map.containsKey(pre-k)) {
				count += map.get(pre-k) ;
			}
			map.put(pre, map.getOrDefault(pre, 0)+1) ;
		}
		return count ;
	}

}

```

