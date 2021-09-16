@[toc]
# [题目](https://leetcode-cn.com/problems/reorder-list/) 

- 给定一个单链表 L 的头节点 head ，单链表 L 表示为：

 - L0 → L1 → … → Ln-1 → Ln 
请将其重新排列后变为：

- L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

# 题解
**寻找链表中点 + 链表逆序 + 合并链表**

- 通过观察给到的示例，其结果是将原链表的前半部分和原链表的后半部分反转之后的链表进行合并得到的。

因此，整体思路就是：

- 首先，找到链表的中间节点， 
- 接着，将链表的后半部分反转 
- 然后，将链表的前半部分和链表的后半部分反转后的结果进行合并。

 
合并链表图示：
![在这里插入图片描述](https://img-blog.csdnimg.cn/73b7c45f612d4e0f8cc966dbf6cceae4.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)
# 代码

```java
package leetcodePlan.Base;

import java.awt.List;

import leetcodePlan.Base.P0024.ListNode;

public class P0143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void reorderList(ListNode head) {

    	if(head == null) {
    		return ;
    	}
    	//  获取中间节点
    	ListNode mid = findMid(head) ;
    	
    	// 中间节点之后进行反转
    	ListNode head2 = mid.next ;
    	mid.next = null ;
    	head2 = reverseList(head2) ;
    	
    	// 合并
    	ListNode head1 = head ;
    	mergeList(head1,head2) ;
    
    }
    
    // LeetCode 876
    public static ListNode findMid(ListNode head) {
    	ListNode slow = head ;
    	ListNode fast = head ;
    	
    	while(fast.next != null && fast.next.next != null) {
    	    slow = slow.next ;
    	    fast = fast.next.next ;
    	}
    	return slow ;
    }
    
    
   
    // Leetcode  206   反转链表
    
    public static ListNode reverseList(ListNode head) {
         
    	ListNode prev = null ;
    	ListNode cur = head ;
    	
    	while(cur != null) {
    		ListNode nextNode = cur.next ;
    		cur.next = prev ;
    		prev = cur ;
    		cur = nextNode;
    	}
         return prev ;
    	
    }
    
    public static void mergeList(ListNode head1,ListNode head2) {
    	ListNode next1 = null ;
    	ListNode next2 = null ;
    	
    	while(head1 != null && head2 != null) {
    		next1 = head1.next ;
    		next2 = head2.next ;
    		
    		head1.next = head2 ;
    		head1 = next1 ;
    		
    		head2.next = head1;
    		head2 = next2 ;
    	}
    }

    
    public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
}

```

