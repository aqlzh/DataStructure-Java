@[toc]
# 题目
- 给你一个字符串数组，请你将 `字母异位词` 组合在一起。可以按任意顺序返回结果列表。

- 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母都恰好只用一次。

示例 1:

```bash
输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

# 题解

- 利用哈希表 ，遍历元素及其个数相同

- **解法一**： 排序 + 哈希

两个字符串互为字母异位词   < == > 两个字符串包含的字母( 个数以及元素 )相同
- 一旦需要根据特征进行归类，就应该利用散列表


![在这里插入图片描述](https://img-blog.csdnimg.cn/bb5442936f8d416eb44f8d9818e3dd01.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_18,color_FFFFFF,t_70,g_se,x_16)


# 代码

```java
package leetcodePlan.Base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0049 {

	public static void main(String[] args) {

		String [] strs = {"eat", "tea", "tan", "ate", "nat", "bat"} ;
		
		System.out.println(fun(strs));
	}
	
    public static List<List<String>> fun(String[] strs) {

    	Map<String,List<String>> map = new HashMap<String,List<String>>() ;
    	
    	for(String str : strs) {
    		char[] array = str.toCharArray() ;
    		Arrays.sort(array);
    		
    		String key = new String(array) ;
    		List<String> list = map.getOrDefault(key, new ArrayList<String>()) ;
    		list.add(str) ;
    		map.put(key, list) ;   		
    	}
           return new ArrayList<List<String>>(map.values()) ;         	
    }

}

```

