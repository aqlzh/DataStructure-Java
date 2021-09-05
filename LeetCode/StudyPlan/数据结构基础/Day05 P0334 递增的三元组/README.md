@[toc]
# [题目](https://leetcode-cn.com/problems/increasing-triplet-subsequence/)
- 给你一个整数数组 nums ，判断这个数组中是否存在长度为 3 的递增子序列。

- 如果存在这样的三元组下标 (i, j, k) 且满足 i < j < k ，使得 `nums[i] < nums[j] < nums[k]` ，返回 true ；否则，返回 false 。


示例 1：

```bash
输入：nums = [1,2,3,4,5]
输出：true
解释：任何 i < j < k 的三元组都满足题意
```

示例 2：

```bash
输入：nums = [5,4,3,2,1]
输出：false
解释：不存在满足题意的三元组
```


# 题解
- 首先，新建两个变量 small 和 mid ，分别用来保存题目要我们求的长度为 3 的递增子序列的最小值和中间值。

- 接着，我们遍历数组，每遇到一个数字，我们将它和 small 和 mid 相比，若小于等于 small ，则替换 small；否则，若小于等于 mid，则替换 mid；否则，若大于 mid，则说明我们找到了长度为 3 的递增数组！

==注意 :==
- 上面的求解过程中有个问题：当已经找到了长度为 2 的递增序列，这时又来了一个比 small 还小的数字，为什么可以直接替换 small 呢，这样 small 和 mid 在原数组中并不是按照索引递增的关系呀？

- 假如当前的 small 和 mid 为 [3, 5]，这时又来了个 1。假如我们不将 small 替换为 1，那么，当下一个数字是 2，后面再接上一个 3 的时候，我们就没有办法发现这个 [1,2,3] 的递增数组了！也就是说，我们替换最小值，是为了后续能够更好地更新中间值！

- 另外，即使我们更新了 small ，这个 small 在 mid 后面，没有严格遵守递增顺序，但它隐含着的真相是，有一个比 small 大比 mid 小的前·最小值出现在 mid 之前。因此，当后续出现比 mid 大的值的时候，我们一样可以通过当前 small 和 mid 推断的确存在着长度为 3 的递增序列。 所以，这样的替换并不会干扰我们后续的计算！

 ![在这里插入图片描述](https://img-blog.csdnimg.cn/65f9b6f7ff5c4dbcb554ddadc46864bc.png)

```java
package leetcodePlan.Base;

public class P0334 {

	public static void main(String[] args) {

		int [] nums = {1,2,3,4,5} ;
		System.out.println(fun(nums));
	}
	
	public static boolean fun(int [] nums) {
		int len = nums.length ;
		if(len < 3) return false ;
		int small = Integer.MIN_VALUE ,mid = Integer.MAX_VALUE ;
		
		for(int i = 0 ; i < len ;i++) {
			if(nums[i] <= small) {
				small = nums[i] ;
			} else if(nums[i] <= mid) {
				mid = nums[i] ;
			}else if(nums[i] > mid){
				return true ;
			}
		}
		return false ;
	}
}

```
例子2如下所示：

```bash
[2,1,5,0,4,6]  a = INT_MAX, b = INT_MAX;
1. nums[0] == 2, nums[0] <= a, a = 2, b = INT_MAX
2. nums[1] == 1, nums[1] <= a, a = 1, b = INT_MAX
3. nums[2] == 5, nums[2] > a and nums[2] < b, a = 1, b = 5
4. nums[3] == 0, nums[3] <= a, a = 0, b = 5
5. nums[4] == 4, nums[4] > a and nums[4] < b, a = 0, b = 4
6. nums[5] == 6, nums[5] > b return true;
```

