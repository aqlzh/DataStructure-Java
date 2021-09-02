@[toc]

# [题目](https://leetcode-cn.com/problems/majority-element/solution/)
- 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。

- 你可以假设数组是非空的，并且给定的数组总是存在多数元素。

 示例 1：

```bash
输入：[3,2,3]
输出：3
```

示例 2：

```bash
输入：[2,2,1,1,1,2,2]
输出：2
```

# 题解

## 解法一  （哈希法）
- 使用哈希映射（HashMap）来存储`每个元素`以及出现的次数。对于哈希映射中的每个键值对，键表示一个元素，值表示该元素出现的次数。

- 我们用一个循环遍历数组 nums 并将数组中的每个元素加入哈希映射中。在这之后，我们遍历哈希映射中的所有键值对，返回值最大的键。 
 
关于HashMap  API  的使用方法如下，[跳转链接](https://blog.csdn.net/QuantumYou/article/details/107340972?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163037393116780357241480%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fblog.%2522%257D&request_id=163037393116780357241480&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~blog~first_rank_v2~rank_v29-1-107340972.pc_v2_rank_blog_default&utm_term=HashMap&spm=1018.2226.3001.4450)

![在这里插入图片描述](https://img-blog.csdnimg.cn/e697de1b1374478eb0b81a3c79eb7b36.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

**代码：**

```java
package leetcodePlan.Base;

import java.util.HashMap;
import java.util.Map;

public class P0169 {

	public static void main(String[] args) {

		int []  nums =  {2,2,1,1,1,2,2} ;
		System.out.println(fun(nums));
				
		}
	
	public static Map<Integer,Integer> countNums(int [] nums){
		Map<Integer,Integer> counts = new HashMap<Integer,Integer>() ;
		for(int num :nums) {
			if(!counts.containsKey(num))  { // 判断哈希表中是否已有值
				counts.put(num,1) ;
			} else {
				counts.put(num, counts.get(num) + 1) ;
			}
		}
		return counts ;
	}
	
	
	public static int fun(int [] nums) {
		Map<Integer,Integer> counts = countNums(nums) ;
		
		// 根据哈希表得出所求
		Map.Entry<Integer, Integer> majorityEntry = null ;
		
		for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
			if(majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
				majorityEntry = entry ;
			}
		}
		
		// 类似于打擂台的方式返回
		
		return majorityEntry.getKey() ;
	}

}

```

## 解法二 （排序法）
- 既然数组中有出现次数 > `⌊ n/2 ⌋`的元素，那排好序之后的数组中，相同元素总是相邻的。
- 即存在长度  `> ⌊ n/2 ⌋` 的一长串 由相同元素构成的连续子数组。

- 无论是`1 1 1 2 3`，`0 1 1 1 2`还是`-1 0 1 1 1`，数组中间的元素总是“多数元素”，毕竟它长度`> ⌊ n/2 ⌋`。

**代码：**

```java
	public static int fun2(int [] nums) {
		Arrays.sort(nums);
		return nums[nums.length >> 1] ;    // length / 2
	}
```



## 解法三（摩尔投票）
- 候选人(`cand_num`)初始化为`nums[0]`，票数`count`初始化为1。
- 当遇到与`cand_num`相同的数，则票数`count = count + 1`，否则票数`count = count - 1`。
- 当票数`count`为0时，更换候选人，并将票数`count`重置为1。
遍历完数组后，`cand_num`即为最终答案。

原因在于：

- 投票法是遇到相同的则票数 + 1，遇到不同的则票数 - 1。且“多数元素”的个数 `> ⌊ n/2 ⌋`，其余元素的个数总和 `<= ⌊ n/2 ⌋`。
因此“多数元素”的个数 - 其余元素的个数总和 的结果 肯定 `>= 1`。
这就相当于每个“多数元素”和其他元素 两两相互抵消，抵消到最后肯定还剩余至少1个“多数元素”。

- 无论数组是`1 2 1 2 1`，亦或是`1 2 2 1 1`，总能得到正确的候选人。

 
**代码：**

```java
	public static int fun3(int [] nums) {
		
		int cand_num = nums[0] ,count = 1 ;
		for(int i = 1 ; i < nums.length ; i++) {
			if(cand_num == nums[i]) {
				count ++ ;
			} else if(--count ==0) {
				cand_num = nums[i] ;
				count = 1;
			}
		}
		
		return cand_num ;
	}
```

