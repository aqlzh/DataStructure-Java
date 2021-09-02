> 加油！当自己的实力不能满足自己的目标时，**就静下心去学习**！

@[toc]

- 总结多数之和问题（两数、三数、四数等）

# [题目](https://leetcode-cn.com/problems/3sum/)
- 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。

- 注意：答案中不可以包含重复的三元组。

示例 1：

```bash
输入：nums = [-1,0,1,2,-1,-4]
输出：[[-1,-1,2],[-1,0,1]]
```


# 题解
## 解法一（哈希表）

- 首先将数组排序，并将其存人哈希表中
- 使用两层遍历确定三位数字的前两位数字
- 暴力解法，根据哈希表判断第三个数字
- ==值得注意的是==，要学会去重，如 [-2,1,1 ] 和 [ 1 , 1, -2] 
- 解决方法，当第三个数的索引大于第二个数才存入

```java
package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P0015 {

	public static void main(String[] args) {

		int [] nums = {-1,0,1,2,-1,-4} ;
		System.out.println(fun(nums));
	}

	public static List<List<Integer>> fun(int [] nums){
		if(nums.length < 3) {
			return new ArrayList<>() ;
		}
		List<List<Integer>> res = new ArrayList<>() ;
		// 排序
		Arrays.sort(nums); 
		// 构造哈希表
		Integer  tmp ;
		HashMap<Integer,Integer> map = new HashMap<>() ;
		for(int i =0 ; i < nums.length ;i++) { 
			map.put(nums[i], i) ;
		}
		
		for(int i = 0 ; i < nums.length ;i++ ) {
			int target = - nums[i] ;   // 此处 target 为另外两个数之和   
			if( i > 0 && nums[i] == nums[i-1]) {
			    continue ;	
			}
			   for(int j = i+1 ; j <nums.length ;j++) {
				   if(j > i+1 && nums[j] == nums[j-1]) {
					   continue ;
				   }
				   
				   if( (tmp = map.get(target - nums[j])) != null) {   // map.get()   获取 value
					   // 符合要求   最后一个数的序号 大于第二个
					   if(tmp > j) {
						   res.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[tmp]))) ;
					   } else {
						   break ;
					   }
				   }
			   }
		}


		return res ;
	}
	
}

```

## 解法二（三指针）

- 类似于双指针（一前一后一个指针）
- 首先对数组进行排序
- 设置前，中、后三个指针（两个在前，一个在后）
- 假设当三个数之和小于零时，向右移动中指针，只到找到等于零的情况，并将结果保存下来
- 假设三数字之和大于零的情况下，向左移动后指针，知道中指针和后指针相遇跳出循环。
- 关于去重问题，我们使用 while 循环，将中指针移动到和之前不同的位置上，前指针同理。如下图

![在这里插入图片描述](https://img-blog.csdnimg.cn/f7872a09d3fa4952aea49b76b321ec82.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)


```java
public static List<List<Integer>> fun2(int [] nums){
		
		List<List<Integer>> res =  new ArrayList<List<Integer>>() ;
		
		if(nums.length < 3) {
			return res ;
		}
		
		Arrays.sort(nums);
		for(int i =0 ; i < nums.length  ; i++) {
			int target = - nums[i] ;
			if( i > 0 && nums[i] == nums[i-1]) continue ;
			
			int l = i+1 ;  // 中指针
			int r = nums.length - 1;
			
			while(l < r) {
				if(nums[l] + nums[r] == target) {
					res.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r]))) ;
					
					//  去重
					while(l < r && nums[l] == nums[l+1]) l++ ;
					while(l < r && nums[r] == nums[r-1]) r-- ;
					
					l++ ;
					r-- ;
				} else if(nums[l] + nums[r] > target) {
					r-- ;
				} else {
					l++ ;
				}
			}
		}
		
		return res ;
	}
```

