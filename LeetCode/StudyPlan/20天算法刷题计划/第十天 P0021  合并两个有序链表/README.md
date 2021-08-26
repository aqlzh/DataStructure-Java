@[toc]

# [题目](https://leetcode-cn.com/problems/merge-two-sorted-lists/)

- 将`两个升序链表`合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 


示例 1：
![在这里插入图片描述](https://img-blog.csdnimg.cn/4f1acbe2ea8e48b2b677b7b4ba6e792a.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_24,color_FFFFFF,t_70,g_se,x_16)


```bash
输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]
```

# 题解

## 实现思路
- **解法一**：常规解法，运用`迭代`，当 L1 和 L2 都不是空链表时，判断 L1 和 L2 哪一个链表的头节点的值更小，将较小值的节点添加到结果里，当一个节点被添加到结果里之后，将对应链表中的节点向后移一位。
- **解法二**：运用`递归`，递归定义合并操作

## 代码实现
解法一 ：
```java
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
          if(l1 == null){
              return l2 ;
          }else if(l2 == null){
              return l1 ;
          }else if(l1.val < l2.val){
              l1.next = mergeTwoLists(l1.next,l2) ;
              return l1 ;
          } else {
              l2.next = mergeTwoLists(l1, l2.next);
              return l2 ;
          }
    }
}
```



解法二：

```java
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}
```


