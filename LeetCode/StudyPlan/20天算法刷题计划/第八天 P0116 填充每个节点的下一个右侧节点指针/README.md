@[toc]
 
# [题目](https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/)

- 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：

```bash
struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
```

= 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

==初始状态下，所有 next 指针都被设置为 NULL==。

 
进阶：

- 你只能使用常量级额外空间。
- 使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。
 

示例：

![在这里插入图片描述](https://img-blog.csdnimg.cn/5cb99c573f874b52b3aca96b4b18e1c4.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L1F1YW50dW1Zb3U=,size_16,color_FFFFFF,t_70)

```bash
输入：root = [1,2,3,4,5,6,7]
输出：[1,#,2,3,#,4,5,6,7,#]
```

解释：给定二叉树如图 A 所示，你的函数应该填充它的每个 next 指针，以指向其下一个右侧节点，如图 B 所示。序列化的输出按层序遍历排列，同一层节点由 next 指针连接，'#' 标志着每一层的结束。


# 题解
- 这道题使用层序遍历，借助队列实现，注意条件，一开始`next`  指针都指向 NULL，我们所需要做的就是将具备左右子树的树进行串联起来。

# 代码

```java
class Solution {
   public Node connect(Node root) {
		if(root==null) {
			return root;
		}
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(queue.size()>0) {
			int size = queue.size();
			//将队列中的元素串联起来
			Node tmp = queue.get(0);
			for(int i=1;i<size;++i) {
				tmp.next = queue.get(i);
				tmp = queue.get(i);
			}
			//遍历队列中的每个元素，将每个元素的左右节点也放入队列中
			for(int i=0;i<size;++i) {
				tmp = queue.remove();
				if(tmp.left!=null) {
					queue.add(tmp.left);
				}
				if(tmp.right!=null) {
					queue.add(tmp.right);
				}
			}
		}
		return root;
	}

}
```

