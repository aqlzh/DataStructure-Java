> 当你足够努力 幸运总会与你不期而遇

@[toc]
# 题目

- 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。

- 返回同样按升序排列的结果链表。


示例 1：
![在这里插入图片描述](https://img-blog.csdnimg.cn/d40c2a7dfb864b24ad3baa43fa56fb77.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

```bash
输入：head = [1,2,3,3,4,4,5]
输出：[1,2,5]
```


# 题解

## 解法一 递归
- 如果`head.val==head.next.val`,说明头节点的值等于下ー个节点的值，所以当前的`head`节点必须删除，并且`head`之后所有与`head.val`相等的节点也都需要删除；删除到哪个节点为止呢？需要用`tmp`指针一直向后遍历寻找到与`head.val`不等的节点。此时`tmp`之前的节点都不保留了，因此返回 `deleteduplicates(move)`
![在这里插入图片描述](https://img-blog.csdnimg.cn/ed81aa15adfb4090ba96b54f794dadfb.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_20,color_FFFFFF,t_70,g_se,x_16)

```java
    public static ListNode deleteDuplicates(ListNode head) {

    	if(head == null || head.next == null)    return head ;
    	
    	if(head.next.val != head.val) {
    		head.next =  deleteDuplicates(head.next) ;
    	} else {
    		ListNode tmp = head.next ;
    		while(tmp != null && head.val == tmp.val ) tmp = tmp.next ;
    		return deleteDuplicates(tmp) ;
    	}
    	
    	return head ;
    }
```

## 解法二 一次遍历

```java
    public static ListNode fun(ListNode head) {
    	
    	if(head == null || head.next == null) return head ;
    	//   维护一个不变的节点   哑节点
    	ListNode  tmp = new ListNode() ;
    	tmp.next = head ;
    	
    	ListNode pre = tmp ;
    	ListNode cur = head ;
    	
    	
    	while(cur != null) {
    		while(cur.next != null && cur.next.val == cur.val ) cur = cur.next ;
    		
    		if(pre.next == cur) {
    			pre=pre.next ;
    		} else {
    			pre.next = cur.next ;
    			cur=cur.next ;
    		}
    		
    	}
    	
    	return tmp.next ;
    }
```

# Tips ： 递归与迭代的区别
- `递归（recursion）`：递归常被用来描述以自相似方法重复事物的过程，在数学和计算机科学中，指的是在函数定义中使用函数自身的方法。（==A调用A==）

- `迭代（iteration）`：重复反馈过程的活动，每一次迭代的结果会作为下一次迭代的初始值。（==A重复调用B==）

- 迭代可以转换为递归，但递归不一定能转换为迭代。

[参考链接](https://www.jianshu.com/p/32bcc45efd32) 

