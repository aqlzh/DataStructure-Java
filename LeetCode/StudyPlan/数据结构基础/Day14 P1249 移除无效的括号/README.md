@[toc]
# [题目](https://leetcode-cn.com/problems/minimum-remove-to-make-valid-parentheses/)

- 给你一个由 `'('、')'` 和小写字母组成的字符串 s。

你需要从字符串中删除最少数目的 `'('` 或者 `')'` （可以删除任意位置的括号)，使得剩下的「括号字符串」有效。

- 请返回任意一个合法字符串。

- 有效「括号字符串」应当符合以下 任意一条 要求：

- 空字符串或只包含小写字母的字符串
可以被写作 AB（A 连接 B）的字符串，其中 A 和 B 都是有效「括号字符串」
- 可以被写作 (A) 的字符串，其中 A 是一个有效的「括号字符串」
 

示例 1：

```bash
输入：s = "lee(t(c)o)de)"
输出："lee(t(c)o)de"
解释："lee(t(co)de)" , "lee(t(c)ode)" 也是一个可行答案。 
```


# 题解
- 因为左括号比右括号晚闭合
- 所以遇到左括号则将其压入栈中，遇到右括号，则需要判断当前栈中是否存在左括号
- 有左括号的情况，移除当前栈顶的左括号，即为与最近的一个左括号形成闭合
- 无左括号的情况，则说明右括号无法匹配，将其删除
- 在遍历结束之后，需要判断栈中是否还有左括号，有则说明其为多余，要将其删除

> 注意：如果删除元素，会导致字符后的索引发生变化，则需要索引减一，才能确保正确的遍历

# 代码

```java
package leetcodePlan.Base;

import java.util.Stack;

public class P1249 {

	public static void main(String[] args) {
	
		String s = "lee(t(c)o)de)" ;
		
		System.out.println(minRemoveToMakeValid(s));
	}
	
    public static String minRemoveToMakeValid(String s) {
   
    	  StringBuffer st = new StringBuffer(s) ;
    	  Stack<Integer>  stack = new Stack<>() ;
    	  
    	  int m = 0 ;
    	  while(m < st.length()) {
    		  char ch = st.charAt(m) ;
    		  if( ch == '(') {
    			   stack.push(m) ;  
    		  } else if(ch == ')') {
    			if(stack.isEmpty()) {  
    				st.deleteCharAt(m) ;
    				m-- ;
    			} else {
    				stack.pop() ;
    			}
    		  }
    		    m++ ;
    	  }
    	  
    	  if(!stack.isEmpty())
    		  while(!stack.isEmpty())
    			  st.deleteCharAt(stack.pop()) ;
    	 return st.toString() ;
    }
}

```

