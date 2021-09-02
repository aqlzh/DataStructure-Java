@[toc]
# [题目](https://leetcode-cn.com/problems/single-number/)
- 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。


示例 1:

```bash
输入: [2,2,1]
输出: 1
```


# 题解
- 采用集合的方法（遍历集合如果没有则添加，有则删除该元素）
- 采用散列表的方法（遍历数组，添加到散列表，然后遍历散列表，只出现一次即为所求）
- 采用异或运算，结合异或运算的结合律 （异或的规则位 相同为0，相异为1）


```java
package leetcodePlan;

public class P0136 {

	public static void main(String[] args) {

		int [] nums = {4,1,2,1,2} ;
		System.out.println(fun(nums));
	}
	
	public static int fun(int [] nums) {
		int single = 0 ;
		for(int num : nums) {   // 高级for循环 
			single ^= num ;
		}
		
		return single ;
	}

}

```

