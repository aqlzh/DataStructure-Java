@[toc]
# [题目](https://leetcode-cn.com/problems/partition-labels/)

- 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。返回一个表示每个字符串片段的长度的列表。

示例：

```bash
输入：S = "ababcbacadefegdehijhklij"
输出：[9,7,8]
解释：
划分结果为 "ababcbaca", "defegde", "hijhklij"。
每个字母最多出现在一个片段中。
像 "ababcbacadefegde", "hijhklij" 的划分是错误的，因为划分的片段数较少。 
```


# 题解
- 求出最先，最后出现的下标，就是一个贪心算法的区间问题。
- 在遍历的过程中相当于是要找每一个字母的边界，如果找到之前遍历过的所有字母的**最远边界**，说明这个边界就是分割点了。此时前面出现过所有字母，最远也就到这个边界了。

![在这里插入图片描述](https://img-blog.csdnimg.cn/27ee4fff1ccb43ee9fd3cec67f4216c3.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

- 在遍历的过程中相当于是要找每一个字母的边界，如果找到之前遍历过的所有字母的最远边界，说明这个边界就是分割点了。此时前面出现过所有字母，最远也就到这个边界了。

可以分为如下两步：

- 统计每一个字符最后出现的位置
- 从头遍历字符，并更新字符的最远出现下标，如果找到字符最远出现位置下标和当前下标相等了，则找到了分割点

 

![在这里插入图片描述](https://img-blog.csdnimg.cn/9b74f4d202124ddd8d15de3996916e54.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)
# 代码
```java
package leetcodePlan.Base;

import java.util.LinkedList;
import java.util.List;

public class P0763 {

	public static void main(String[] args) {
		String S = "ababcbacadefegdehijhklij" ;
		System.out.println(fun(S));
	}
	
	public static List<Integer> fun(String s){
		List<Integer> list = new LinkedList<>() ;
		int [] edge = new int[666] ;
		char [] chars = s.toCharArray() ;
		
		for(int i = 0 ; i < chars.length ;i++) {
			edge[chars[i] - 0 ] = i ;
		}
		
		int idx = 0 ;
		int last = -1 ;
		
		for(int i = 0 ; i < chars.length ;i++) {
			idx = Math.max(idx, edge[chars[i] - 0]) ;
			if( i == idx) {
				list.add(i - last) ;
				last = i ;
			}
		}
	
		return list ;
		
	}
}

```

