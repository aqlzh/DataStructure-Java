@[toc]

# [题目](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)

- 给定一个头结点为 head 的非空单链表，返回链表的中间结点。

- 如果有两个中间结点，则返回第二个中间结点。

 
示例 1：

```bash
输入：[1,2,3,4,5]
输出：此列表中的结点 3 (序列化形式：[3,4,5])
返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
注意，我们返回了一个 ListNode 类型的对象 ans，这样：
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
```

示例 2：

```bash
输入：[1,2,3,4,5,6]
输出：此列表中的结点 4 (序列化形式：[4,5,6])
由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
```

> **注意**： 返回的是 以中间结点为初试结点

# 题解
## 实现思路
- **解法一**： 借助辅助数组，返回 A/2
- **解法二**：借助单指针

```java
     while (k < n / 2) {
            ++k;
            cur = cur.next;
        }
        return cur;
```
- **解法三**：借助快慢指针，双指针。

## 代码实现

```java
package leetcodePlan;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = nums[0];
        ListNode curr = this;
        for (int i = 1; i < nums.length; i++) {
            curr.next = new ListNode(nums[i]);
            curr = curr.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            s.append(cur.val);
            s.append(" -> ");
            cur = cur.next;
        }
        s.append("NULL");
        return s.toString();
    }
}

public class Solution {

	
	//  解法一 ： 快慢指针
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    // 解法二 ： 借助数组
    public ListNode middleNode2(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
    
    
    // 解法三 ： 单指针
    
    public ListNode middleNode3(ListNode head) {
        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            ++n;
            cur = cur.next;
        }
        int k = 0;
        cur = head;
        while (k < n / 2) {
            ++k;
            cur = cur.next;
        }
        return cur;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        // int[] arr = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(arr);
        Solution solution = new Solution();
        ListNode res = solution.middleNode(head);
        ListNode res2 = solution.middleNode2(head);
        ListNode res3 = solution.middleNode3(head);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}



```

