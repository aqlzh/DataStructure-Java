# [题目](https://leetcode-cn.com/problems/repeated-dna-sequences/)
- 所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。

- 编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。


示例 1：

```bash
输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
输出：["AAAAACCCCC","CCCCCAAAAA"]
```

# 题解

- 沿长度为 N的字符串移动长度为 L 的滑动窗口。
- 检查滑动窗口中的序列是否在 Hashset seen 中。
- 如果是，则找到了重复的序列。更新输出。否则，将序列添加到 HashSet seen 中。

 
![在这里插入图片描述](https://img-blog.csdnimg.cn/c3ea4e49698b48bcafe68e10a0d614b3.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)
# 代码
```java
package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P0187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"   ;
		System.out.println(findRepeatedDnaSequences(s));
	}
	public static  List<String> findRepeatedDnaSequences(String s) {
		int L = 10 , n = s.length() ;
		
		HashSet<String> seen = new HashSet() , output = new HashSet() ;
		
		for(int start = 0 ; start < n - L +1 ;start ++) {
			String tmp = s.substring(start ,start + L) ;
			if(seen.contains(tmp)) output.add(tmp) ;
			   seen.add(tmp) ;
		}
		
		return new ArrayList<String>(output) ;
	}
}
```

