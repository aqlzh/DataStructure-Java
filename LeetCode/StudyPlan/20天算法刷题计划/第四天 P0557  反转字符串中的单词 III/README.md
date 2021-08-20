

> **注意**： Java，JavaScript中 String 类型是一个不可变的类型，不能使用原地解法。

# 

# [题目](https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/)
- 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。


示例：

```css
输入："Let's take LeetCode contest"
输出："s'teL ekat edoCteeL tsetnoc"
```

# 题解
## 实现思路
- 以空格的方式进行寻找第一个单词
- 然后进行倒叙输出，注意最后加上空格
- 再次寻找下一个单词，只到结束

## 代码实现

```java
package leetcodePlan;

public class P0557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest" ;
		reverseWords(s) ;
	
	}
	
    public static void reverseWords(String s) {
    	
    	StringBuffer  strs = new StringBuffer() ;
    	
    	int length = s.length() ;
    	int i = 0 ;
    	
    	while(i < length) {
    		int start = i ;
    		
    		// 使用 i 记录 一个单词书
    		while(i < length && s.charAt(i) != ' ') {
    			i++ ;
    		}
    		
    		// 倒序追加
    		for(int j = start ; j < i ;j++) {
    			strs.append(s.charAt(i-1+start-j)) ;	
    		}
    		
    		// 加空格
    		while(i < length && s.charAt(i) == ' ') {
    			i++ ;
    			strs.append(' ') ;
    		}
    		
    		
    	}
    	
    	System.out.println(strs);
       
    }

}

```

