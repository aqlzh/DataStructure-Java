@[toc]
# [题目](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)

- 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。


示例 1:

```bash
输入: s = "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
```

示例 2:

```bash
输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
```

# 题解
## 实现思路
- **解法**：运用`滑动窗口`求解，滑动过程如下所示：

![在这里插入图片描述](https://img-blog.csdnimg.cn/8f9812ba2f4d4972ac3fd674969edd61.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

- 依次递增以每个字母为开头有以上解，所以需要求最长子串（不是子序列）
- 不含重复运用 HashSet 求解



## 实现代码

```java
package leetcodePlan;

import java.util.HashSet;
import java.util.Set;

public class P003 {

	
	public static void main(String args[]) {
		String s = s = "abcabcbb" ;
		String s1 =  "pwwkew" ;
		System.out.println(lengthOfLongestSubstring(s));
		System.out.println(lengthOfLongestSubstring(s1));
	}
	
	
	
    public static int lengthOfLongestSubstring(String s) {
    	Set<Character> set = new HashSet<Character>() ;
    	int n = s.length() ;
    	int r = -1 ,ans = 0 ;
    	for(int i =0 ; i < n ;++i) {
    		if(i!=0) {
    			set.remove(s.charAt(i-1)) ;    // 依次前进
    		}
    		
    		while(r+1 < n && !set.contains(s.charAt(r+1))) {
    			// 符合条件不断右移
    			set.add(s.charAt(r+1)) ;
    			++r ;
    		}
    		
    		ans = Math.max(ans, r-i+1) ;  // 每次与 ans 比较返回最大的
    	}
    	
          return ans ;
    }
}

```

