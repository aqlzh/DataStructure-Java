@[toc]
# 题目
- 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。

- 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。

示例1:

```bash
输入: pattern = "abba", str = "dog cat cat dog"
输出: true
```

# 题解
- Java  哈希表的特性 `map.put()`  如果在原先的哈希表中存在此数，返回次数的个数。如果不存在则返回 `null`

- 根据同步性原理
- 如果key不存在，插入成功，返回null；如果key存在，返回之前对应的value。
- 以pattern = "abba", str = "dog cat cat dog"为例，
- 第1次：map.put('a',0)返回null，map.put("dog",0)返回null，两者相等；
 - 第2次：map.put('b',1)返回null，map.put("cat",1)返回null，两者相等；
 - 第3次：map.put('b',2)返回1，map.put("cat",2)返回1，两者相等；
 - 第4次：map.put('a',3)返回0，map.put("dog",3)返回0，两者相等结果为 true。


==注意==： `for (Integer i = 0; i < words.length; i++)` 循环中用的是 `Integer i = 0` ，这里已经提前完成了自动装箱，所以循环体内map两次put操作存的value都是同一个Integer对象，不会受到[-128,127]的限制。如果是这样写 `for (int i = 0; i < words.length; i++)` ，那么在循环体内map两次put操作都会执行自动装箱，会受到[-128,127]的限制。

# 代码

```java
package leetcodePlan.Base;

import java.util.HashMap;
import java.util.Map;

public class P0290 {

	public static void main(String[] args) {
		String pattern = "abba"  ; 
        String str = "dog cat cat dog" ;
        System.out.println(fun(pattern,str));
	}
	
    public static boolean fun(String pattern, String s) {

    	String [] words = s.split(" ") ;
    	
    	if(words.length != pattern.length()){
    		return false ;
    	}
    	
    	Map<Object,Integer> map = new HashMap<>() ;
    	for(int i = 0 ; i < words.length ;i++) {
    		if(map.put(words[i], i) != map.put(pattern.charAt(i), i)) {
    			return false ;
    		}
    	}
    	
    	return true ;
    }

}

```

