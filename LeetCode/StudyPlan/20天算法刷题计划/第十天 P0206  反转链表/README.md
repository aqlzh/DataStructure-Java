@[toc]

# [题目](https://leetcode-cn.com/problems/reverse-linked-list/)

- 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 

示例 1：
![在这里插入图片描述](https://img-blog.csdnimg.cn/9511b4ade2414385b66a1b81b5e57b50.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_25,color_FFFFFF,t_70,g_se,x_16)

```bash
输入：head = [1,2,3,4,5]
输出：[5,4,3,2,1]
```

# 题解
- 反转链表，将当前节点的 `next` 指向 `prev`, 采用双指针 `prev` , `curr`
- ==注意==： 要采用 nextTmp  临时存放 next  ,以防止丢失
![在这里插入图片描述](https://img-blog.csdnimg.cn/2b204bc2f3c74567a94024381dd999c1.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_44,color_FFFFFF,t_70,g_se,x_16)

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
            ListNode prev = null ;
            ListNode curr = head ;

            while(curr != null){
                ListNode  nextTmp = curr.next ;
                curr.next = prev ;
                prev = curr ;
                curr = nextTmp ;
            }

            return prev ;
    }
}
```

