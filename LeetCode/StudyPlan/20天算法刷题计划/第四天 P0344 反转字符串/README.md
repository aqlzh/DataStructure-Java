@[toc]

> **注意**： Java，JavaScript中 String 类型是一个不可变的类型，不能使用原地解法。

# [题目](https://leetcode-cn.com/problems/reverse-string/)

- 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

- 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

- 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。


示例 1：

```bash
输入：["h","e","l","l","o"]
输出：["o","l","l","e","h"]
```


# 题解
## 实现思路
- 运用双指针进行一前一后，进行交换
- 将 left 指向字符数组首元素，right 指向字符数组尾元素。
- 当 left < right： 交换 s[left] 和 s[right]；
- left 指针右移一位，即 left = left + 1；
- right 指针左移一位，即 right = right - 1。
- 当 left >= right，反转结束，返回字符数组即可。

## 代码实现

```java
package leetcodePlan;

import java.util.Arrays;

public class P0344 {

	
	// 运用双指针
	public static void main(String[] args) {
		char[] s = {'H','e','l','l','o'} ;
		reverseString(s)  ;
		
	}

	
	public static void reverseString(char[] s) {
          int n = s.length - 1 ;
          for(int left = 0 , right = n ; left < right ; left++ ,right--) {
        	  char tmp = s[left] ;
        	  s[left] = s[right] ;
        	  s[right] = tmp ;
          }
          
          System.out.println(Arrays.toString(s));
    }
}

```

