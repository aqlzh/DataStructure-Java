@[toc]

#  [题目](https://leetcode-cn.com/problems/swap-nodes-in-pairs/)
- 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
- 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

![在这里插入图片描述](https://img-blog.csdnimg.cn/325be0d294c54d23b8cb6b933e0c78dd.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

```bash
输入：head = [1,2,3,4]
输出：[2,1,4,3]
```

# 题解
## 解法一 递归

- 用`head`表示原始链表的头节点，新的链表的第二个节点，用 `newhead`表示新的链表的头节点，原始链表的第二个节点，则原始链表中的其余节点的头节点是 `newhead.next`。令`head.next=swappairs( newhead.next)`,表示将其余节点进行两两交換，交換后的新的头节点为`head`的下ー个节点。然后令`newhead.next=head`,即完成了所有节点的交換。最后返回新的链表的头节点 `newhead`。

```java
package leetcodePlan.Base;

import leetcodePlan.Base.P0082.ListNode;

public class P0024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head ;
        }

        ListNode newHead = head.next ;
        head.next = swapPairs(newHead.next) ;
        newHead.next = head ;
        return newHead ;
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

## 解法二  迭代
![在这里插入图片描述](https://img-blog.csdnimg.cn/acefed6b34fa4a72a9513e2b4e8a7f78.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)


```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }
}
```

