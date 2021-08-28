> 重铸国一荣光，省二义不容辞

@[toc]
# [题目](https://leetcode-cn.com/problems/letter-case-permutation/)
- 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。

 
示例1：

```bash
输入：S = "a1b2"
输出：["a1b2", "a1B2", "A1b2", "A1B2"]
```
示例2：
```bash
输入：S = "3z4"
输出：["3z4", "3Z4"]
```
示例3：
```bash
输入：S = "12345"
输出：["12345"]
```

# 题解
 - 采取深度优先算法，DFS  遍历

- Java `Character.isDigit()` 方法,判断字符是否为数字

![在这里插入图片描述](https://img-blog.csdnimg.cn/64bde33e4d6d4524ae0afe7377f67f3a.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)
# 代码

```java
package leetcodePlan;

import java.util.ArrayList;
import java.util.List;

public class P0784 {

	public static void main(String[] args) {

		String S = "a1b2"  ;
		
		List<String> lists = P0784.fun(S);
	    System.out.println(lists);
		
	}
	
	static List<String> res = new ArrayList<>() ;
	public static List<String> fun(String s){
		char[] chs = s.toCharArray() ;
		int n = chs.length ;
		dfs(chs,n,0) ;
		
		return res ;
	}
	
	public static void dfs(char[] chs ,int n ,int begin) {
		res.add(new String(chs)) ;
		for(int i = begin ; i< n ;i++) {
			if(!Character.isDigit(chs[i])) {
				char tmp = chs[i] ;    // 记录用于回溯
				System.out.println("递归前"+ res);
				chs[i] = (char)(chs[i] - 'a' >= 0 ? chs[i] -32 : chs[i] + 32) ;   // 大小写转换
				dfs(chs,n,i+1) ;
				chs[i] = tmp ;   // 回溯
				System.out.println("递归后"+ res);
			}
		}
	}
}

```

- 精彩之处在于，使用 tmp  记录，用于回溯。
