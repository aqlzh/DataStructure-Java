@[toc]
# [题目](https://leetcode-cn.com/problems/linked-list-cycle-ii/)
- 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。

- 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。

说明：不允许修改给定的链表。

进阶：

你是否可以使用 O(1) 空间解决此题？

实例1：
![在这里插入图片描述](https://img-blog.csdnimg.cn/a829438e363d4bf38fa5ff1bc86007f0.png)

```bash
输入：head = [3,2,0,-4], pos = 1
输出：返回索引为 1 的链表节点
解释：链表中有一个环，其尾部连接到第二个节点。
```

# 题解
## 解法一：哈希表
- 因为有环则遍历的时候，会再次出现遍历的节点
- 链表有环  -->  再次遍历   （出现重复）

```java
package leetcodePlan.Base;

import java.util.HashSet;
import java.util.Set;

public class P0142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public ListNode detectCycle(ListNode head) {
		 
		 ListNode pos = head ;
		 Set<ListNode> visited = new HashSet<ListNode>() ;
		 
		 while(pos != null) {
			 if(visited.contains(pos))   {
				 return pos ;
			 } else {
				 visited.add(pos) ;
			 }
			 pos = pos.next ;
		 } 
		 return null ;
	 }
	 
	 
	 
	 class ListNode {
		 
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		          }
		  }
}

```

## 解法二： 快慢指针

- 一般链表类题目，使用双指针较为便捷

- 公式推导：如下图所示，环外长度为 `a` ,slow  指针在环上走过 `b`距离，环剩余 `c` 距离。
- fast 指针 走过的距离：`a + n(b+c) +b`  
- slow  指针走过的距离  ： `a+b`
- 根据两倍速关系： `a + n(b+c) +b = 2(a+b)`
- 化简得 ： `a= c + (n-1)(b+c)`,因为一定在第一圈相遇(可自行推导)，则n=1   ，则 `a=c`
- 额外使用一个指针`ptr`。起始，它指向链表头部；随后，它和  slow 每次向后移动一个位置。最终，它们会在入环点相遇。

 
![在这里插入图片描述](https://img-blog.csdnimg.cn/b3a69bea82614cfbbe75417375692160.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

```java
package leetcodePlan.Base;

import leetcodePlan.Base.P0142.ListNode;

public class P0142_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode fun(ListNode head) {
		ListNode fast = head ,slow = head ;
		while(true) {
			if(fast == null || fast.next == null) return null ;
			fast = fast.next.next ;
			slow = slow.next ;
			
			if(fast == slow) break ;
		}
		
		fast = head ;
		while(slow != fast) {
			slow=slow.next ;
			fast=fast.next ;
		}
		
		return fast ;
	}
	 class ListNode {
		 
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	          }
	  }
}

```




