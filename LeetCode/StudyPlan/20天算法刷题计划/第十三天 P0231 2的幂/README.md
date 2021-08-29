

# [题目](https://leetcode-cn.com/problems/power-of-two/)
- 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。

- 如果存在一个整数 x 使得 n == 2^x^ ，则认为 n 是 2 的幂次方。



示例 1：

```bash
输入：n = 1
输出：true
解释：2^0 = 1
```

示例 2：

```bash
输入：n = 16
输出：true
解释：2^4 = 16
```


## 题解
[参考链接](https://leetcode-cn.com/problems/power-of-two/solution/2de-mi-by-leetcode-solution-rny3/)

 - 一个数 n 是 2 的幂（注意不是偶数），当且仅当 n 是正整数，并且 n 的二进制表示中仅包含 1 个 1。
 -  技巧： `n & (n-1) == 0`   即为 二进制表示中仅包含 1 个 1


## 代码

```java
package leetcodePlan;

public class P0231 {

	public static void main(String[] args) {

		System.out.println(fun(16));
		System.out.println(fun(12));
	}
	
	public static boolean fun(int n) {
		return n > 0 && (n & (n-1) ) ==0 ;
	}
}

```

