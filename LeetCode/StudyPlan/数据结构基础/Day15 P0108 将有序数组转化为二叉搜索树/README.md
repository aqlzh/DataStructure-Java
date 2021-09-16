@[toc]

# [题目](https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/)

- 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。

- 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。


![在这里插入图片描述](https://img-blog.csdnimg.cn/2750291d99bd4aa9af9a856ec4b2c848.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAUXVhbnR1bVlvdQ==,size_18,color_FFFFFF,t_70,g_se,x_16)

```bash
输入：nums = [-10,-3,0,5,9]
输出：[0,-3,9,-10,null,5]
```

>  注意： 答案不唯一


# 题解
- 利用性质：BST（二叉搜索树）的中序遍历是升序的
- 因此本题等同于根据中序遍历的序列恢复二叉搜索树。
- 因此我们可以以升序序列中的任一个元素作为根节点，以该元素左边的升序序列构建左子树，以该元素右边的升序序列构建右子树，这样得到的树就是一棵二叉搜索树啦
-  又因为本题要求高度平衡，因此我们需要**选择升序序列的中间元素作为根节点**

# 代码

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
           return dfs(nums,0,nums.length-1) ;
    }
   
   // 思路有点类似于二分查找
    public TreeNode dfs(int[] nums, int low, int high){
        if(low > high){
            return null ;
        }
     int mid = low + (high - low) / 2 ;
     TreeNode root = new TreeNode(nums[mid]) ;
     // 递归构建 root  左右子树
     root.left = dfs(nums,low,mid-1) ;
     root.right = dfs(nums,mid+1,high) ;
    return root ; 
    }
}
```

 
