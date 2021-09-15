@[toc]
# 题目
- 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。

- 图示两个链表在节点 c1 开始相交：
![在这里插入图片描述](https://img-blog.csdnimg.cn/48646ed296cc49e3bc54c5d6aff77084.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

- 题目数据 保证 整个链式结构中不存在环。

> 注意，函数返回结果后，链表必须 保持其原始结构 。

 
# 题解
- 一般链表类型题目， 双指针，哈希表
## 解法一  哈希表
- 首先遍历链表 headA ，并将其每个值存于哈希中，然后遍历 haedB，判断该节点是否在哈希集合中

```java
package leetcodePlan.Base;

import java.util.HashSet;
import java.util.Set;

public class P0160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<ListNode>() ;
    	ListNode tmp = headA ;
    	while(tmp != null) {
    		visited.add(tmp) ;
    		tmp=tmp.next ;
    	}
    	
    	tmp = headB;
    	while(tmp != null) {
    		if(visited.contains(tmp)) {
    			return tmp ;
    		}
    		tmp = tmp.next ;
    	}
    	return null ;
    }
    
    
     public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) {
    	          val = x;
    	          next = null;
    	      }
    	  }

}

```
## 解法二  双指针
分情况讨论
链表 headA 和 headB 的长度分别是 m 和 n。假设链表 headA 的不相交部分有 a 个节点，链表 headB 的不相交部分有 b 个节点，两个链表相交的部分有 c 个节点，则有 a+c=m  ，b+c=n。

 
- 若两者相交  ① `a = b` 的情况下，同时到达   ② `a != b`  二轮循环同时到达 
- 若两者不相交，同理
```java
public ListNode fun(ListNode headA, ListNode headB) {
    	if(headA == null || headB ==null) {
    		return null ;
    	}
    	
    	ListNode pA = headA, pB = headB ;
    	while(pA != pB) {
    		pA = pA == null ? headB : pA.next ;
    		pB = pB == null ? headA : pB.next ;
    	}
    	
    	return pA ;
    }
```

